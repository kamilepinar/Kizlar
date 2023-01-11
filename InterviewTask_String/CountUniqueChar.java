package InterviewTask_String;

import java.util.Arrays;
import java.util.Collections;

public class CountUniqueChar {

    public static void main(String[] args) {
        System.out.println(uniqueCharMethod("aaabccd"));//2
    }
    /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */

    //first solution with collection method

    public static int uniqueCharMethod(String str){
        int count = 0;
        for(String each : str.split("") ){
            int freq = Collections.frequency(Arrays.asList(str.split("")), each);
            if(freq == 1 ){
                count++;
            }
        }
        return (count == 0)? -1 : count;
    }
    // To use the string in collection we need to use as list method, and in aslist method we need to put split string
    // if frequency is equal to 1 count will increase by one
    //if count doesnt increase return -1 is it increases return the count
    // count is the unique , it only appears 1 time in the string






    // second solution:


    public static int  countUniqueChars(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int frequency = 0 ;
            for(int  j = 0; j < str.length();j++){
                if(str.charAt(i)== str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency == 1){
                count++;
            }

        }
        if (count == 0){
            return -1;
        }
        return count;

    }

}
