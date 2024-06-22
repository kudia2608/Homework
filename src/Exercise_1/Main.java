package Exercise_1;

import Exercise_1.WordArray;

public class Main {
    public static void main(String[] args) {
        String[] words = {"red", "blue", "yellow", "green", "blue", "orange", "yellow", "green", "blue", "orange", "yellow", "purple", "pink", "red"};
        WordArray wordArray = new WordArray(words);

        System.out.println("1. Уникальные слова: ");
        System.out.println(wordArray.getFormattedUniqueWords());

        System.out.println("\n2. Подсчет слов: ");
        System.out.println(wordArray.getFormattedWordCounts());
    }
}

