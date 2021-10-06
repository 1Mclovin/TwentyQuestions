import java.util.ArrayList;
import java.util.Arrays;

public class TwentyQuestionsHW {



    public static void main(String[] args) {

        String[] names = {"Raul", "Deens", "Luis", "Jake"};
        //Hw question 1
        System.out.println(getLastIndex(names));
        //Hw question 2
        System.out.println(getSecondToLastIndex(names));
        //Hw question 3
        System.out.println(getFirstElement(names));
        //Hw question 4
        System.out.println(getLastElement(names));
        // HW question 5
        System.out.println(getSecondToLastElement(names));

        //HW question 6

        int[] sumArray = {2, 5, 8, 3, 9};
        System.out.println(getSum(sumArray));

        //Hw question 7
        System.out.println(getAverage(sumArray));

        //Hw question 8
        System.out.println(extractAllOddNumbers(sumArray));

        //Hw question 9
        System.out.println(extractAllEvenNumbers(sumArray));

        //Hw question 10
        System.out.println(contains(names,"Darren"));

        //Hw question 11
        System.out.println(getIndexByElement(names,"Deens"));

        //Hw question 12
       // System.out.println(printOddNumbersInRange(2,20));

        // Hw question 13
        System.out.println(printGivenStringTimesNumberGiven("raul",4));

        //Hw question 14
        System.out.println(repeatFirstThreeLetters("Testing",6));

        //Hw question 15
        System.out.println(wordsInAStringCounter("Hi this is a test and should print out 10"));


    }

    // Hw question 1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    // Hw question 2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
// Hw question 3

    public static String getFirstElement(String[] names) {
        return names[0];

    }

    // Hw question 4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }
//Hw question 5

    public static String getSecondToLastElement(String[] names) {
        return names[names.length - 2];
    }

    //Hw question 6
    public static int getSum(int[] sumArray) {
        return Arrays.stream(sumArray).sum();
    }

    //Hw question 7
    public static int getAverage(int[] sumArray) {
        return Arrays.stream(sumArray).sum() / sumArray.length;
    }

    //Hw question 8
    public static String extractAllOddNumbers(int[] sumArray) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int number : sumArray) {
            if (number % 2 != 0) {
                listOfNumbers.add(number);
            }
        }
        return listOfNumbers.toString();
    }
    // Hw question 9

    public static String extractAllEvenNumbers(int[] sumArray) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int number : sumArray) {
            if (number % 2==0) {
                listOfNumbers.add(number);
            }
        }
        return listOfNumbers.toString();
    }
    // Hw question 10
   public static boolean contains(String[] names, String element){
       boolean test = false;

        for (String str : names){
            if(str.contains(element)){
                test = true;
                break;
            }
        }
        return test;
    }

    // Hw question 11
//    Question 11
//    public static int getIndexByElement(String[] names, String element) {
//        return 0;

    public static int getIndexByElement(String[]names, String element){

       ArrayList<String>clist = new ArrayList<>();

       for(String i : names)
           clist.add(i);

       return clist.indexOf(element);

    }
// hw Question 12
//    Question 12
//    public static void printOddNumbersInRange(int start, int end){
//    }

    public static void printOddNumbersInRange(int start, int end){

        for (int i = start; i<=end;start++){
            System.out.println(i %2!=0);

        }
    }
//    Question 13
//    public static String printGivenStringTimesNumberGiven(String str, int n) {
//        return null;
//    }

    public static String printGivenStringTimesNumberGiven(String str, int n){

        String r = str;
        for(int i=0;i< n-1; i++)
            r =r +" "+" "+ str;

        return r;
    }
//    Question 14
//    public static String repeatFirstThreeLetters(String str, int n) {
//        return null;
//    }

    public static String repeatFirstThreeLetters(String str, int n){


        String r = str;
        for(int i=0;i< n-1; i++)
            r =r +" "+" "+ str;

        String onlyFirstThreeLetters = r.substring(0,3);

        return r + System.lineSeparator()+ onlyFirstThreeLetters;

    }

//    Question 15
//    // Write a java method to count all the words in a string
//    public static int WordsInAStringCounter(String str){
//        return null;

    public static int wordsInAStringCounter(String str){

        //this part is not really necessary but its a cool lil add on just in case there are no words typed
        if(str == null|| str.isEmpty()){
            return 0;
        }

        String [] words = str.split("\\s+");
        return words.length;

    }

    }




