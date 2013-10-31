package xap.oracle.test;

import java.io.File;
import java.util.Scanner;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import xap.oracle.skud.dao.SKUDDAO;
import xap.oracle.skud.entity.SKUD;

public class LoadRunner {// implements Runnable {

	private String fileName;

	int counter = 0;

	private Scanner sc = null;

	private int lineCounter;

	private SKUDDAO service;

	String path = "/Users/chrisroffler/Documents/Gigaspaces/POC/qvc-delta-server/data/";

	public LoadRunner(final String fileName) {
		this.fileName = path + fileName;

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"classpath:/spring/test-context.xml");

		service = context.getBean(SKUDDAO.class);

	}

	public static void main(String[] args) {
		LoadRunner runner = new LoadRunner("sku_product.csv");

		runner.run();

	}

	public void run() {

	//	int batchSize = 2000;
		lineCounter = 0;
		int counter = 0;
		int lineNumber =0;

		System.out.println("Thread is Starting ");

		try {
			sc = new Scanner(new File(fileName));

			while (sc.hasNext()) {

				String line = sc.nextLine();

				line = this.cleanLine(line);

				String[] split = line.split(",", -1);

				
				System.out.println(split.length);
				
				lineNumber++;
				lineCounter++;

				if (lineCounter > 1) {

					for (int i = 0; i < split.length; i++) {
						split[i] = split[i].replaceAll("\"", "");
					}

					// for (int i = 0; i < split.length; i++) {
					// System.out.println(i + "  " + split[i]);
					// }

					System.out.println(split.length);

					// Create the Entity
					if (split.length > 69) {
						SKUD skud = Utility.createSKUD(split);

						System.out.println(skud);
						// Insert into DB
						service.create(skud);

						// if (lineCounter == 2)
						// break;
						counter++;
					}
				}
			}
		} catch (Exception ex) {

			ex.printStackTrace();
		}

		finally {
			if (sc != null) {
				sc.close();
			}
		}

		System.out.println("Thread loaded " + lineCounter);
		System.out.println("Thread loaded " + counter);
		System.out.println("Line Number   " + lineNumber);
	}

	private String cleanLine(String line) {
		char[] chars = line.toCharArray();

		boolean start = false;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '"') {
				if (start == true) {
					start = false;
				} else {
					start = true;
				}
			} else {
				if ((start == true) && (chars[i] == ',')) {
					chars[i] = ' ';
				}
			}
		}

		return new String(chars);
	}

	// static String[] cleanRecord(String[] split) {
	//
	// for (int i = 0; i < split.length; i++) {
	// if (split[i].contains("\"\"\"")) {
	// String[] line = new String[215];
	//
	// for (int k = 0; k < i; k++) {
	// line[k] = split[k];
	// }
	//
	// line[i] = split[i] + split[i + 1];
	//
	// for (int k = i + 1; k < 215; k++) {
	// line[k] = split[k + 1];
	// }
	//
	// return line;
	// }
	// }
	//
	// return split;
	// }

}
