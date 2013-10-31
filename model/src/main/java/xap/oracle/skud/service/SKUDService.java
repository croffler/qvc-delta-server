package xap.oracle.skud.service;

import org.openspaces.core.GigaSpace;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import xap.oracle.skud.dao.SKUDDAO;
import xap.oracle.skud.entity.SKUD;

import com.gigaspaces.client.WriteModifiers;
import com.j_spaces.core.client.SQLQuery;

public class SKUDService implements ISKUDService {

	static Logger logger = LoggerFactory.getLogger(SKUDService.class);

	@Autowired
	private SKUDDAO dao;

	@Autowired
	@Qualifier("deltaSpace")
	private GigaSpace space;

	public SKUD findById(Long id) {
		return dao.findSKUDById(id);
	}

	public SKUD findByRowId(String id) {
		return dao.findSKUDByRowId(id);

	}

	@Override
	@Transactional(value = "txManager")
	public void insertSpace(String rowId) {

		SKUD skud = dao.findSKUDByRowId(rowId);
		skud.setRowid(rowId);

		if (skud != null) {
			space.write(skud, WriteModifiers.WRITE_ONLY);

			if (logger.isDebugEnabled()) {
				logger.debug("Wrote SKUD to the Space");
			}
		}
	}

	@Override
	@Transactional(value = "txManager")
	public void removeSpace(String rowId) {

		SQLQuery<SKUD> query = new SQLQuery<>(SKUD.class, "rowid = ?");
		query.setParameter(1, rowId);

		SKUD skud = space.take(query);

		if (skud != null) {
			if (logger.isDebugEnabled()) {
				logger.debug("Removed SKUD from Space");
			}
		} else {
			logger.error("Remove SKUD with rowdID " + rowId + "  failed !");
		}
	}

	@Override
	@Transactional(value = "txManager")
	public void updateSpace(String rowId) {
		SKUD skud = dao.findSKUDByRowId(rowId);
		skud.setRowid(rowId);

		if (skud != null) {
			space.write(skud, WriteModifiers.UPDATE_ONLY);
		}
	}

	public GigaSpace getSpace() {
		return space;
	}

	public void setSpace(GigaSpace space) {
		this.space = space;
	}
}
