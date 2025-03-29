package Src.Basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the given input number");
        int Input = in.nextInt();
        evenOrOddFind(Input);
        in.close();

    }
    public  static void evenOrOddFind(int Input){
        if(Input % 2 == 0){
            System.out.println("Given number is even number");
        }
        else{
            System.out.println("Given number is odd number");
        }
    }
}
