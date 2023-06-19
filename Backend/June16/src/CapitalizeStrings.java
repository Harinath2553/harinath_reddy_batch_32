import java.util.Arrays;

public class CapitalizeStrings {
    public static void capitalizeAndSortStrings(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = capitalizeFirstLetter(strings[i]);
        }
        Arrays.sort(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        String[] strings = {"network and security", "devoops", "sales force", "java developer"};
        capitalizeAndSortStrings(strings);
    }
}
