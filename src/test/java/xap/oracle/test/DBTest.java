package xap.oracle.test;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import xap.oracle.skud.dao.SKUDDAO;
import xap.oracle.skud.entity.SKUD;

public class DBTest {

	public static void main(String[] args) throws InterruptedException {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:/spring/test-context.xml");

		SKUDDAO service = context.getBean(SKUDDAO.class);

		int timer = 3000;

		SKUD skud = new SKUD();

//		for (int i = 0; i < 10; i++) {

			skud.setSknNbr("00001");
			
//			emp.setAge(10);
//			emp.setFistName("John");
//			emp.setLastName("Dow" + i);
//			emp.setId(new Long(i));
//			emp.setProcessed(Boolean.FALSE);
//			emp.setDepartmentId(i % 5);

			System.out.println("Creating an Employee");
			service.create(skud);
	//		Thread.sleep(timer);

//		}

//		for (int i = 0; i < 10; i++) {
//			emp.setAge(22);
//			emp.setFistName("Fritz");
//			emp.setLastName("Shultz" + i);
//			emp.setId(new Long(i));
//			emp.setProcessed(Boolean.TRUE);
//			emp.setDepartmentId(i % 5);

//			System.out.println("Updating an Employee");
//			service.update(skud);
//			Thread.sleep(timer);

//		}

//		for (int i = 0; i < 10; i++) {
//		//	emp.setId(new Long(i));
//
//			System.out.println("Deleting an Employee");
//			service.remove(skud);
//			Thread.sleep(timer);
//		}
	}

}
