package com.shilpa.CodingQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingChallenges {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful";
        countOccurrence(input);
        findSecondHighest();
        containsWord("cat");
        sumOfSquaresOfOddNo();
        findCommon();
    }

    //Common Elements Between Two Lists
    private static void findCommon() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(3, 4, 5, 6);

        List<Integer> common=list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(common);
    }

    private static void sumOfSquaresOfOddNo() {
        List<Integer> nums= List.of(1, 2, 3, 4, 5);
        int res=nums.stream()
                .filter(x->x%2 !=0)
                .map(x->x*x)
                .reduce(0,Integer::sum);

        System.out.println(res);
    }

    private static void containsWord(String input) {
        List<String> list= List.of("apple","bat","dress");
        boolean isPresent= list.stream().anyMatch(x->x==input);
        if (isPresent){
            System.out.println(input+" is present");
        }else{
            System.out.println(input+" Not found");
        }
    }

    private static void findSecondHighest() {
        List<Integer> nums= List.of(9,2,3,4,5,6);
        int result=nums.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .skip(1)
                .findFirst().orElseThrow();
        System.out.println(result);
    }

    public static void countOccurrence(String input ){
        Map<String, Long> count= Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(word->word,Collectors.counting()));
        System.out.println(count);
    }

}
