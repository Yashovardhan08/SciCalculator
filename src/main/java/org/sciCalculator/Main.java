package org.sciCalculator;

import java.util.Scanner;

public class Main {

    public static Long[] factorial = new Long[15];
    public static void main(String[] args){
        Factorial(14);
        Boolean loop = true;
        while(loop){
            PrintMenu();
            Scanner sc = new Scanner(System.in);
            Integer option = sc.nextInt();
            String temp = sc.nextLine();
            switch (option){
                case 1:{
                    System.out.println("\t \t Enter the number : ");
                    Integer a = sc.nextInt();
                    temp = sc.nextLine();
                    if(a<15) System.out.println("Factorial of "+ a + " = "+ factorial[a]);
                    System.out.println();
                    break;
                }
                case 2:{
                    System.out.println("\t \t Enter the number : ");
                    Double a = sc.nextDouble();
                    System.out.println("\t \t Enter the power : ");
                    Double b = sc.nextDouble();
//                    temp = sc.nextLine();
                    System.out.println( a + " power "+ b+ " = "+ power(a,b));
                    System.out.println();
                    break;
                }
                case 3:{
                    System.out.println("\t \t Enter the number : ");
                    Double a = sc.nextDouble();
//                    temp = sc.nextLine();
                    System.out.println("Natural Log of "+ a + " = "+ NatLog(a));
                    System.out.println();
                    break;
                }
                case 4:{
                    System.out.println("\t \t Enter the number : ");
                    Double a = sc.nextDouble();
//                    temp = sc.nextLine();
                    System.out.println("Square root of "+ a + " = "+ Sqrt(a));
                    System.out.println();
                    break;
                }
                case 5:{
                    loop = false;
                    break;
                }
                default: {
                    loop = false;
                }
            }
        }
    }

    public static void PrintMenu(){
        System.out.println("Select the operation : ");
        System.out.println("\t 1) Factorial ");
        System.out.println("\t 2) Power ");
        System.out.println("\t 3) Natural Logarithm ");
        System.out.println("\t 4) Square Root ");
        System.out.println("\t 5) Exit ");
    }
    public static void Factorial(Integer x){ // call as Factorial(14)
        Long a = 1L;
        for(int i=1;i<=x;++i){
            a*=i;
            factorial[i]=a;
        }
    }

    public static Double power(Double a,Double b){
        return Math.pow(a,b);
    }

    public  static Double NatLog(Double a){
        return Math.log(a);
    }

    public static Double Sqrt(Double a){
        return Math.sqrt(a);
    }
}