package semanticsensors;

import java.io.IOException;
import java.util.Scanner;

public class Run {

	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) throws IOException {
		Reasoner reasoner = new Reasoner();
		System.out.println("SELECT ONE USE CASE");
		reasoner.mediumQuery("UseCase");
		String input = scan.next();

		switch (input) {
		case "IReMHO":
			Queriable technical = new Technical();
			technical.queriable();

		case "Infirmity":
			Queriable queriable = new Ailments();
			queriable.queriable();
		    scan.close();
		}

	}
}
