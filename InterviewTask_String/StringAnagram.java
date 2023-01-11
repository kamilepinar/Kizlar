package InterviewTask_String;

import java.util.Arrays;
import java.util.TreeSet;

public class StringAnagram {
    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */


    //solution 1:
    //we are creating Tree set because tree sets do sorted order
    // after we split our string we will sort them so we can compare them with equals method
    // to use String arrays in collection we need to use as Array aslist method
    public static boolean same(String a, String b){
        a = new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b= new TreeSet<String>(Arrays.asList(b.split(""))).toString();
        return a.equalsIgnoreCase(b);// we have to give return and if a equals b it will return boolean value of t/f
    }


    // second solution:

    // writing method with char array because we are going to split our string, sort every char and
    // compare them with using temp value

    public static boolean Same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        // after we convert our string to char array( means ever single letter became one element of an array
        Arrays.sort(ch1);// now we sort these element so if they are same they will be in same order
        Arrays.sort(ch2);

        String a1 = "";// giving temp value in order to use them in for loop
        String b1 = "";

        for (char each : ch1) { // when we are looping in har array we are going to add each char to our temp string
            a1 += each;
        }
        for (char each : ch2) {
            b1 += each;
        }

        return a1.equals(b1);// using string equals method to check if giving two string are same or not

    }



}
