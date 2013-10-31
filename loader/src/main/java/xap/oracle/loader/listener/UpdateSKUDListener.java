package xap.oracle.loader.listener;

import org.openspaces.events.EventTemplate;
import org.openspaces.events.adapter.SpaceDataEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import xap.oracle.skud.entity.SKUD;

public class UpdateSKUDListener {

	static Logger logger = LoggerFactory.getLogger(UpdateSKUDListener.class);

	@EventTemplate
	SKUD unprocessedData() {
		SKUD template = new SKUD();
		return template;
	}

	@SpaceDataEvent
	public SKUD eventListener(SKUD event) {

		if (logger.isDebugEnabled())
			logger.debug("SKUD was updated in space");

		return null;
	}

}
