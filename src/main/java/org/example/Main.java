package org.example;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        String E [] = {"039", "4", "14", "32", "", "34", "7"};
        String E2 [] = {"1", "2", "3", "4", "5", "6", "8"};
        int maxnumber = solution.solution(E);
        System.out.println(maxnumber);

        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution(E));

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(E2));

    }
}