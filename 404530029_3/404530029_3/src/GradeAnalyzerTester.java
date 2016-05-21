
/*
 * [A]98
 * [TA's Advise]
 * 1. i think you asked «³³Í for help, right? there are suggestions, please discuss with him.
 * */

import javax.swing.JOptionPane;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		GradeAnalyzer Gradetool = new GradeAnalyzer();
		String Input;
		int count = 0;

		while (true) {
			Input = JOptionPane.showInputDialog(null, "Please insert one score:");
			Gradetool.GradeStore(Input);
			count++;
			if (count < 3 && Input.toUpperCase().equals("Q")) {

				System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades ");
				count--;
				continue;
			}
			if (Input.toUpperCase().equals("Q")) {
				break;
			}
		}
		System.out.println(Gradetool);
	}

}
