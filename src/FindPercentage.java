import java.text.DecimalFormat;

public class FindPercentage {

	public static void getCharPercentag(String str) {
		int len = str.length();

		int upperCharCount = 0;
		int lowerCharCount = 0;
		int digits = 0;
		int specialCharCount = 0;

		for (int i = 0; i < len; i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCharCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCharCount++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				specialCharCount++;
			}

		}
		double upperCharPer = upperCharCount * 100.00 / len;
		double lowerCharPer = lowerCharCount * 100.00 / len;
		double digitsPer = digits * 100.00 / len;
		double specialCharPer = specialCharCount * 100.00 / len;

		DecimalFormat formatter = new DecimalFormat("##.##");

		System.out.println("Upper case letter percentage----> " + formatter.format(upperCharPer));
		System.out.println("Lower case letter percentage----> " + formatter.format(lowerCharPer));
		System.out.println("Digits case letter percentage----> " + digitsPer);
		System.out.println("Special Character letter percentage----> " + specialCharPer);

		System.out.println("Total percentage:- "+(upperCharPer + lowerCharPer + digitsPer + specialCharPer));
	}

	public static void main(String[] args) {

		getCharPercentag("Virendra SeLniUm &%^^&% 134134");

	}

}
