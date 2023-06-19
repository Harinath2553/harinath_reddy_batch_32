public class StringContainsVowels {
    public static void printStringsWithVowels(String[] strings) {
        String vowels = "aeiouAEIOU"; // List of vowels
        for (String s : strings) {
            int vowelCount = 0;
            for (char c : s.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    vowelCount++;
                }
            }
            if (vowelCount > 0) {
                System.out.println("String: " + s + ", Number of vowels: " + vowelCount);
            }
        }
    }

    public static void main(String[] args) {
        String[] strings = {"Rohit", "hitman", "sachin", "sarah", "texas", "harinath"};
        printStringsWithVowels(strings);
    }
}
