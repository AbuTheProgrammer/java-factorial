/*
* Author:- Abu ßakar Siddique
* Location:- Bangladesh
* codeCompleteTime:- Tuesday October 5, 2021 {10:3 PM}
* CodeDetails:- This programme will find the factor of any integer
*/
package IntermedietJava;
import java.util.Scanner;
import java.util.ArrayList;

public class JavaPrac1 {

    // The method that find the factor

    ArrayList<Integer> l1 = new ArrayList<>();

    public void factor(int num){
            for (int i=1; i<=num; i++){
                if (num % i == 0){
                    l1.add(i);
                }

            }

        System.out.println(l1);
    }


    public static void main(String[] args) {
        JavaPrac1 lcm = new JavaPrac1();

        Scanner askToNumber = new Scanner(System.in);
        System.out.println("Enter a Number");

        int myNumber = askToNumber.nextInt();
        if(myNumber > 0) {
            lcm.factor(myNumber);
        } else{
            System.out.println("Plz Enter a valid Integer");
        }

    }
}
