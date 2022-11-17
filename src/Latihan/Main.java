package Latihan;


import javax.xml.transform.stream.StreamSource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int result = a / b;

            System.out.print(a + " : " + b + " = " + result);

        }catch (InputMismatchException e){
            System.out.print("Tolong inputkan angka");
        }catch (ArithmeticException e){
            System.out.print("pembagian dengan 0");
        }


    }
}