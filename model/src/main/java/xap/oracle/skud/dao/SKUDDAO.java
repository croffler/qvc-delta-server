package xap.oracle.skud.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import xap.model.AbstractJpaDAO;
import xap.oracle.skud.entity.SKUD;

@Service
public class SKUDDAO extends AbstractJpaDAO<SKUD, Long> {

	Logger logger = LoggerFactory.getLogger(SKUDDAO.class);

	public void create(SKUD skud) {
		super.persist(skud);
	}

	public void update(SKUD skud) {
		super.update(skud);
	}

	public void remove(SKUD skud) {
		super.remove(skud);
	}

	public SKUD findSKUDById(Long id) {
		Session session = this.getSession();

		Query query = session.getNamedQuery("findSKUDById").setLong("id", id);

		if (logger.isDebugEnabled())
			logger.debug(query.toString());

		return (SKUD) query.uniqueResult();
	}

	public SKUD findSKUDByRowId(String id) {
		Session session = this.getSession();

		Query query = session.getNamedQuery("findSKUDByRowId").setString(
				"rowId", id);

		if (logger.isDebugEnabled())
			logger.debug(query.toString());

		return (SKUD) query.uniqueResult();
	}

	@Override
	protected Class<?> getKlass() {
		return SKUD.class;
	}
}
