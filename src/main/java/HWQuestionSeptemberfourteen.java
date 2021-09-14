public class HWQuestionSeptemberfourteen {


    public static void main(String[] args) {

        //HW 9/14/21 question
        System.out.println(discountedProduct(134.99, 0.25));

    }

    //HW 9/14/21 question
    public static String discountedProduct(double price, double discount){
        double discountAmount= price * discount;
        double total = price-discountAmount;
        String  reciept = String.format (" price = %f "+"discount is %f \n" +
                " which means the total for today is %f\n",price,discount,total );
        return reciept;

    }


}
