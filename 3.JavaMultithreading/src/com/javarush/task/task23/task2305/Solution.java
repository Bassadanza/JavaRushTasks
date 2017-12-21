package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] two = new Solution[2];
        Solution Solution1 = new Solution();
        Solution Solution2 = new Solution();
        Solution1.innerClasses[0] = Solution1.new InnerClass();
        Solution1.innerClasses[1] = Solution1.new InnerClass();
        Solution2.innerClasses[0] = Solution1.new InnerClass();
        Solution2.innerClasses[1] = Solution1.new InnerClass();
        two[0] = Solution1;
        two[1] = Solution2;
        return two;
    }

    public static void main(String[] args) {

    }
}
