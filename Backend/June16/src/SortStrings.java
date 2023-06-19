import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void sortStrings(String[] strings) {
        Arrays.sort(strings, Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)).reversed()));
    }

    public static void main(String[] args) {
        String[] strings = {"harinath", "hitman", "java developer", "texas", "cis", "string"};
        sortStrings(strings);

        for (String s : strings) {
            System.out.println(s);
        }
    }
}
