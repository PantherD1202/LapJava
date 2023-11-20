public class SakamotoAlgorithm {
	public static String getDayOfWeek(int year, int month, int day) {
		int[] t = { 0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4 };
		year -= (month < 3) ? 1 : 0;
		int dayOfWeek = (year + year / 4 - year / 100 + year / 400 + t[month - 1] + day) % 7;

		String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		return daysOfWeek[dayOfWeek];
	}

	public static void main(String[] args) {
		// Test the Sakamoto algorithm
		int year = 2023;
		int month = 10;
		int day = 12;

		String dayOfWeek = getDayOfWeek(year, month, day);
		System.out.println("The day of the week for " + year + "-" + month + "-" + day + " is " + dayOfWeek);
	}
}
