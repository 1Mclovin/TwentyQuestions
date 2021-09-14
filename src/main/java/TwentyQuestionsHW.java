import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    // question 11


    }




