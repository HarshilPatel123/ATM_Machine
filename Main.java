package com.ATMPROJECT;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op=new AtmOperationImpl();
        int atmnumber=12345;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter Atm Card Number : ");
        int atmNumber=sc.nextInt();
        System.out.print("Enter Pin: ");
        int pin=sc.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Ministatement\n5.Exit");
                System.out.println("Enter Choice : ");
                int ch=sc.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=sc.nextDouble();//5000
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect Atm Card Number or pin");
            System.exit(0);
        }


    }
}
