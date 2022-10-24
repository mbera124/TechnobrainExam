package QuestionOne;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Reverse {

        public static void main(String[] args) {
            String str = "Word";
            String reverseStr = Arrays
                    .stream(str.split(" "))
                    .map(word -> new StringBuilder(word).reverse())
                    .collect(Collectors.joining(" "));

            String reversedWord="A ".concat(reverseStr).concat("is defined as a sequence of non-space characters.");
            System.out.println("Reversed order of word" + reversedWord);


        }

    }

    //fix


