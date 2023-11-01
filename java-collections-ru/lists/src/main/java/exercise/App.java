package exercise;

import java.util.ArrayList;

// BEGIN
class App {

    public static boolean scrabble(String str1, String str2) {

        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.toLowerCase().substring(i, i + 1));
        }
        for (int j = 0; j < str2.length(); j++) {
            if (list1.contains(str2.toLowerCase().substring(j, j + 1))) {
                list1.remove(str2.substring(j, j + 1));
            } else {
                list2.add(str2.substring(j, j + 1));
            }
        }
        if (list2.size() == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(App.scrabble("rkqodlw", "world")); // true
        System.out.println(App.scrabble("ajv", "java")); // false
        System.out.println(App.scrabble("avjafff", "JaVa")); // true
        System.out.println(App.scrabble("", "hexlet")); // false
    }
}
//END
