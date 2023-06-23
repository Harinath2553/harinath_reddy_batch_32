package com.Hashmap;


    import java.util.LinkedHashSet;

    public class RemoveDuplicates {
        public static void main(String[] args) {
            String input = "Hello, Welcome to Cis";
            String result = removeDuplicates(input);
            System.out.println(result);
        }

        public static String removeDuplicates(String input) {

            LinkedHashSet<Character> charSet = new LinkedHashSet<>();


            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);

                charSet.add(ch);
            }

            StringBuilder sb = new StringBuilder();
            for (char ch : charSet) {
                sb.append(ch);
            }

            return sb.toString();
        }
    }


