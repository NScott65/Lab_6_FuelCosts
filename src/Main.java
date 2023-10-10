import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variables
        double galIT = 0;
        double MPG = 0;
        double PPG = 0;
        double CP100 = 0;
        double mLeft = 0;
        boolean done = false;

        do{
            System.out.println("Enter your current amount of gas: ");
            if(scan.hasNextDouble()){
                galIT = scan.nextDouble();
                if(galIT >= 0){
                    System.out.println("Enter Fuel Efficiency in MPG: ");
                    if(scan.hasNextDouble()){
                        MPG = scan.nextDouble();
                        if(MPG > 0){
                            System.out.println("Enter current Price for Gallon of Gas: ");
                            if(scan.hasNextDouble()){
                                PPG = scan.nextDouble();
                                if(PPG > 0) {
                                    CP100 = (PPG / MPG) * 100;
                                    mLeft = galIT * MPG;

                                    System.out.printf("%-26s%6.2f", "Cost per 100 miles in $:", CP100);
                                    System.out.printf("\n%-26s%6.2f", "Distance left in Miles: ", mLeft);

                                    done = true;

                                }else{
                                    System.out.println("Your input was invalid. Try Again.");
                                }

                            }else{
                                scan.nextLine();
                                System.out.println("Your input was invalid. Try Again.");
                            }

                        }else{
                            System.out.println("Your input was invalid. Try Again.");
                        }
                    }else{
                        scan.nextLine();
                        System.out.println("Your input was invalid. Try again.");
                    }
                }else{
                    System.out.println("Your input was invalid. Try again.");
                }
            }else{
                scan.nextLine();
                System.out.println("Your input was invalid. Try again.");
            }
        }while(!done);
    }
}