package Lesson3;

import java.util.*;

public class Text {

    private static String a = "Ночь, ночь, улица, фонарь, аптека, Бессмысленный и тусклый свет Живи еще хоть четверть века. Все будет так. Исхода нет. Умрешь — начнешь опять опять сначала. И повторится все, как встарь. Ночь, ледяная рябь канала Аптека, улица, фонарь.";
    private static int count = 0;
    private static int c = 0;

    public static void main(String[] args) {
        textToArr(a);
        wordList(a);
        numberOfWord(a);
    }

    public static void textToArr(String t) {
        t = t.replaceAll("[,.]", "");
        String[] arr = t.split(" ");
        ArrayList<String> textArray = new ArrayList<>(Arrays.asList(arr));
        int size = textArray.size();
        System.out.println(size + " " + textArray);
    }

    public static void wordList(String t) {
        String lowerT = t.toLowerCase();
        lowerT = lowerT.replaceAll("[,.]", "");
        String[] arr = lowerT.split(" ");
        Set<String> set = new LinkedHashSet<>(Arrays.asList(arr));
        String[] result = set.toArray(new String[set.size()]);
        int s = set.size();
        set.equals(2);
        System.out.println(s + " " + set);
    }

    public static void numberOfWord(String t) {
        String lowerT = t.toLowerCase();
        lowerT = lowerT.replaceAll("[,.]", "");
        String[] arr = lowerT.split(" ");
        ArrayList<String> Array = new ArrayList<>(Arrays.asList(arr));
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], count);
        }
        for (int i = 0; i < Array.size(); i++) {
            String tempWord = Array.get(i);

            if (!hm.containsKey(tempWord)) {
                hm.put(tempWord, 1);
            } else {
                hm.put(tempWord, hm.get(tempWord) + 1);
            }
        }
        for (Map.Entry<String, Integer> o : hm.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }

    }
}
