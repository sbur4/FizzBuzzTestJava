import java.util.ArrayList;
import java.util.List;

public class LeetCode {

    // Given an integer n, return a string array answer (1-indexed) where:
    // answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    // answer[i] == "Fizz" if i is divisible by 3.
    // answer[i] == "Buzz" if i is divisible by 5.
    // answer[i] == i if non of the above conditions are true.

    public static void main(String[] args) {

        int n1 = 3;
        fizzBizz1(n1);

        int n2 = 5;
        fizzBizz1(n2);

        int n3 = 15;
        fizzBizz1(n3);
    }

    public static List<String> fizzBizz1(int n1) {
        List<String> list1 = new ArrayList<>();
        for (int i = 1; i <= n1; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list1.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list1.add("Fizz");
            } else if (i % 5 == 0) {
                list1.add("Buzz");
            } else {
                list1.add(String.valueOf(i));
            }
        }
        System.out.println(list1);
        return list1;
    }

    public static List<String> fizzBizz2(int n2) {
        List<String> list2 = new ArrayList<>();
        for (int i = 1; i <= n2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list2.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list2.add("Fizz");
            } else if (i % 5 == 0) {
                list2.add("Buzz");
            } else {
                list2.add(String.valueOf(i));
            }
        }
        System.out.println(list2);
        return list2;
    }

    public static List<String> fizzBizz3(int n3) {
        List<String> list3 = new ArrayList<>();
        for (int i = 1; i <= n3; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list3.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list3.add("Fizz");
            } else if (i % 5 == 0) {
                list3.add("Buzz");
            } else {
                list3.add(String.valueOf(i));
            }
        }
        System.out.println(list3);
        return list3;
    }
}
