import java.util.Scanner;

public class baseNumber {
	public static void main(String[] args) {
		Scanner numb = new Scanner(System.in);
		Scanner convert = new Scanner(System.in);

		System.out.println("Please enter in a set of numbers: ");
		int num = numb.nextInt();

		System.out.println("The enter in a the conversion value between 2 through 32: ");
		int numSystem = convert.nextInt();

		System.out.println("The entered value: " + num + ". \nIn the" + numSystem + "-number system is "
				+ convertDecimal(num, numSystem));
		
		convert.close();
		numb.close();
	}

	private static String convertDecimal(int num, int test) {
		if (num == 0) {
			return ("");
		} else {
			String testConvert = (convertDecimal(num / test, test));
			switch (num % test) {
			case 10:
				testConvert = (testConvert + "A");
				break;
			case 11:
				testConvert = (testConvert + "B");
				break;
			case 12:
				testConvert = (testConvert + "C");
				break;
			case 13:
				testConvert = (testConvert + "D");
				break;
			case 14:
				testConvert = (testConvert + "E");
				break;
			case 15:
				testConvert = (testConvert + "F");
				break;
			case 16:
				testConvert = (testConvert + "G");
				break;
			case 17:
				testConvert = (testConvert + "H");
				break;
			case 18:
				testConvert = (testConvert + "I");
				break;
			case 19:
				testConvert = (testConvert + "J");
				break;
			case 20:
				testConvert = (testConvert + "K");
				break;
			case 21:
				testConvert = (testConvert + "L");
				break;
			case 22:
				testConvert = (testConvert + "M");
				break;
			case 23:
				testConvert = (testConvert + "N");
				break;
			case 24:
				testConvert = (testConvert + "O");
				break;
			case 25:
				testConvert = (testConvert + "P");
				break;
			case 26:
				testConvert = (testConvert + "Q");
				break;
			case 27:
				testConvert = (testConvert + "R");
				break;
			case 28:
				testConvert = (testConvert + "S");
				break;
			case 29:
				testConvert = (testConvert + "T");
				break;
			case 30:
				testConvert = (testConvert + "U");
				break;
			case 31:
				testConvert = (testConvert + "V");
				break;
			default:
				testConvert = (testConvert + (num % test));
				break;
			}
			return testConvert;
		}
	}
}
