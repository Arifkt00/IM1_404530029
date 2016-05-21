import java.util.ArrayList;

public class GradeAnalyzer {
	ArrayList<String> GradeStoreArray = new ArrayList<String>();
	String str = new String();
	int Aplus = 0;
	int A = 0;
	int Aminus = 0;
	int Bplus = 0;
	int B = 0;
	int Bminus = 0;
	int Cplus = 0;
	int C = 0;
	int Cminus = 0;
	int D = 0;
	int F = 0;
	double sum = 0;
	double count = 0;
	double average = 0;
	double standardDeviation = 0;
	double GradeSquare = 0;
	double AverageSquare = 0;
	double x;

	public void GradeStore(String Grade) {
		try {
			if (Double.parseDouble(Grade) >= 0 && (Double.parseDouble(Grade) <= 100)) {
				GradeStoreArray.add(Grade);
				if (Double.parseDouble(Grade) >= 98) {
					Aplus++;
				}

				if (Double.parseDouble(Grade) >= 92 && Double.parseDouble(Grade) < 98) {
					A++;
				}

				if (Double.parseDouble(Grade) >= 90 && Double.parseDouble(Grade) < 92) {
					Aminus++;
				}

				if (Double.parseDouble(Grade) >= 88 && Double.parseDouble(Grade) < 90) {
					Bplus++;
				}

				if (Double.parseDouble(Grade) >= 82 && Double.parseDouble(Grade) < 88) {
					B++;
				}

				if (Double.parseDouble(Grade) >= 80 && Double.parseDouble(Grade) < 82) {
					Bminus++;
				}

				if (Double.parseDouble(Grade) >= 78 && Double.parseDouble(Grade) < 80) {
					Cplus++;
				}

				if (Double.parseDouble(Grade) >= 72 && Double.parseDouble(Grade) < 78) {
					C++;
				}

				if (Double.parseDouble(Grade) >= 70 && Double.parseDouble(Grade) < 72) {
					Cminus++;
				}

				if (Double.parseDouble(Grade) >= 60 && Double.parseDouble(Grade) < 70) {
					D++;
				}

				if (Double.parseDouble(Grade) < 60) {
					F++;
				}

				sum = sum + Double.parseDouble(Grade);
				count++;
				average = sum / count;
			}

		} catch (Exception e) {
			if (Grade.equals("Q") || Grade.equals("q")) {
				System.out.println(Grade);
			} else {
				System.out.println("Input wrong!!!");
			}
		}
	}

	public String toString() {
		for (String Grade : GradeStoreArray) {
			GradeSquare += Double.parseDouble(Grade) * Double.parseDouble(Grade);
		}
		standardDeviation = Math.sqrt(GradeSquare / count - average * average);

		return "You entered " + count + " valid grades from 0 to 110. Invalid grades are ignored!" + "\nThe average = "
				+ average + " with a standard deviation =" + standardDeviation + "\nThe grade distribution is:"
				+ "\nA+ =" + Aplus + "\nA = " + A + "\nA- =" + Aminus + "\nB+ = " + Bplus + "\nB = " + B + "\nB- = "
				+ Bminus + "\nC+ = " + Cplus + "\nC = " + C + "\nD = " + D + "\nF = " + F;

	}

}