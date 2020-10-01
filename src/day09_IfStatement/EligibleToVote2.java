package day09_IfStatement;

public class EligibleToVote2 {

    public static void main(String[] args) {
        String name = "Jimmy";
        boolean isUSCitizen = false;
        int age = 25;
        boolean hasCriminalBackground = false;

        boolean isEligible =   isUSCitizen == true  &&  age >= 18 && hasCriminalBackground == false ;
           //                    false == true  &&  25 >= 18  &&  false == false
        //                         false && true && true
        //                          false

        System.out.println(name+" is eligible to vote: "+isEligible);




    }

}
