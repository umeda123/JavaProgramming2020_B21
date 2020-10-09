package day14_Switch_Recap;

public class If_Practice {

    public static void main(String[] args) {

    // if & else: 2 options
        int n = 10000;

        if(n % 2 != 0 ){ // for odd
            System.out.println(n+" is odd number");
        }else{ // for even
            System.out.println(n+" is even number");
        }


        int age = 14;
        if(age >= 18){
            System.out.println("you are eligible to get license");
        }else{
            System.out.println("you are not eligible to get license");
        }


        char grade = 'A';

        if(grade == 'A' || grade == 'B' || grade =='C'){
            System.out.println("You passed the class");
        }else{
            System.out.println("You did not pass the class");
        }





    }

}
