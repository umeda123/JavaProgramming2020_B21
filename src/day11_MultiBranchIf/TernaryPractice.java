package day11_MultiBranchIf;

public class TernaryPractice {

    public static void main(String[] args) {
        int n = 100;
        String result1 = "";

        if(n%2==0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }

        System.out.println(result1);

        System.out.println("======================================");

        String result2 =  (n%2==0) ? "Even" : "Odd" ;

        System.out.println(result2);


    }

}
