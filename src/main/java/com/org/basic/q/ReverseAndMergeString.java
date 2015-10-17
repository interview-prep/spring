package com.org.basic.q;

/**
 * Created by SMALA on 10/17/2015.
 */
public class ReverseAndMergeString {

    private String name;

    public ReverseAndMergeString(String name) {
        this.name = name;
    }

    public ReverseAndMergeString() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String reverseMe() {
        StringBuilder result = new StringBuilder();
        for (int i = name.length() - 1; i >= 0; i--) {
            result.append(name.charAt(i));
        }
        return result.toString();
    }

    private String mergerMe(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String s[]) {
        ReverseAndMergeString mergeString = new ReverseAndMergeString("sandeep");

        System.out.println("Original String:" + mergeString.getName());
        String reversedString = mergeString.reverseMe();
        System.out.println("Reverse String:" + reversedString);

        String toReverseMerge = mergeString.getName();
        mergeString.setName(toReverseMerge.substring(0, (toReverseMerge.length() / 2) + 1));
        System.out.println("String1:" + mergeString.getName());
        String s1 = mergeString.reverseMe();
        mergeString.setName(toReverseMerge.substring((toReverseMerge.length() / 2) + 1, toReverseMerge.length()));
        System.out.println("String2:" + mergeString.getName());
        String s2 = mergeString.reverseMe();
        System.out.println("Reversed and merged : " + mergeString.mergerMe(s1, s2));
    }
}


/**

 String toReverseMerge = mergeString.getName();
 mergeString.setName(toReverseMerge.substring(0, toReverseMerge.length() / 2));
 System.out.println("Original String:" + mergeString.getName());
 String s1 = mergeString.reverseMe();
 System.out.println("Reverse String:" + s1);
 mergeString.setName(toReverseMerge.substring(toReverseMerge.length() / 2, toReverseMerge.length()));
 System.out.println("Original String:" + mergeString.getName());
 String s2 = mergeString.reverseMe();
 System.out.println("Reverse String:" + s2);
 System.out.println("Reversed and merged : " + mergeString.mergerMe(s1, s2));
 */