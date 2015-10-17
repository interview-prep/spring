package com.org.basic.program;

/**
 * Created by SMALA on 10/17/2015.
 */
public class ReverseAndMergeCharArray {

    private String name;

    public ReverseAndMergeCharArray(String name) {
        this.name = name;
    }

    public ReverseAndMergeCharArray() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String reverseString() {
        char[] arr = new char[name.length()];
/*
        int j = 0;
        for (int i = name.length() - 1; i >= 0; i--) {
            arr[j] += name.charAt(i);
            j++;
        }

        OR
*/


        for (int i = 0; i < name.length(); i++) {
            arr[i] += name.charAt((name.length() - 1 - i));
        }

        return new String(arr);
    }

    private String mergerString(String s1, String s2) {
        return s1 + s2;
    }

    public static void main(String s[]) {
        ReverseAndMergeCharArray mergeString = new ReverseAndMergeCharArray("sandeep");

        System.out.println("Original String:" + mergeString.getName());
        String reversedString = mergeString.reverseString();
        System.out.println("Reverse String:" + reversedString);

        String toReverseMerge = mergeString.getName();
        mergeString.setName(toReverseMerge.substring(0, (toReverseMerge.length() / 2) + 1));
        System.out.println("String1:" + mergeString.getName());
        String s1 = mergeString.reverseString();
        mergeString.setName(toReverseMerge.substring((toReverseMerge.length() / 2) + 1, toReverseMerge.length()));
        System.out.println("String2:" + mergeString.getName());
        String s2 = mergeString.reverseString();
        System.out.println("Reversed and merged : " + mergeString.mergerString(s1, s2));
    }
}