package xap.oracle.loader.space;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.openspaces.core.GigaSpace;
import org.openspaces.events.notify.SimpleNotifyContainerConfigurer;
import org.openspaces.events.notify.SimpleNotifyEventListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import xap.oracle.loader.listener.InsertSKUDListener;
import xap.oracle.loader.listener.RemoveSKUDListener;
import xap.oracle.loader.listener.UpdateSKUDListener;

@Service
public class Processor {

	@Autowired
	@Qualifier("deltaSpace")
	GigaSpace space;

	SimpleNotifyEventListenerContainer insertNotifier;
	SimpleNotifyEventListenerContainer updateNotifier;
	SimpleNotifyEventListenerContainer removeNotifier;

	@PostConstruct
	private void initListener() {
		insertNotifier = new SimpleNotifyContainerConfigurer(space)
				.notifyAll(false)
				.notifyWrite(true)
				.eventListenerAnnotation(new InsertSKUDListener())
				.notifyContainer();
		insertNotifier.start();

		updateNotifier = new SimpleNotifyContainerConfigurer(space)
				.notifyAll(false)
				.notifyUpdate(true)
				.eventListenerAnnotation(new UpdateSKUDListener())
				.notifyContainer();
		updateNotifier.start();

		removeNotifier = new SimpleNotifyContainerConfigurer(space)
				.notifyAll(false)
				.notifyTake(true)
				.eventListenerAnnotation(new RemoveSKUDListener())
				.notifyContainer();
		removeNotifier.start();

	}

	@PreDestroy
	private void destroy() {
		insertNotifier.shutdown();
		updateNotifier.shutdown();
		removeNotifier.shutdown();
	}
}
