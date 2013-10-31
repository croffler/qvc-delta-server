package xap.oracle.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import xap.oracle.skud.dao.SKUDDAO;
import xap.oracle.skud.entity.SKUD;

public class DBTest {

	public static void main(String[] args) throws InterruptedException {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:/spring/test-context.xml");

		SKUDDAO service = context.getBean(SKUDDAO.class);

 

		SKUD skud = new SKUD();

		// for (int i = 0; i < 10; i++) {

		skud.setSknNbr("00001");

		System.out.println("Creating an SKUD");
		service.create(skud);
		// Thread.sleep(timer);

		// }

		// for (int i = 0; i < 10; i++) {

		// System.out.println("Updating an SKUD");
		// service.update(skud);
		// Thread.sleep(timer);

		// }

		// for (int i = 0; i < 10; i++) {

		//
		// System.out.println("Deleting an SKUD");
		// service.remove(skud);
		// Thread.sleep(timer);
		// }
	}

}
