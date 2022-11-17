package Praktikum11;

import java.util.ArrayList;

public class ExceptionExample {
    public static void main(String[] args) {


        int i = 0;
        ArrayList<Integer> filtered = new ArrayList<>();
        while (i < args.length){

            try {
                filtered.add(Integer.parseInt(args[i]));
            } catch(NumberFormatException e){
                System.out.println("invalid input : " + args[i]);
            } finally{
                i++;
            }
        }
//mencetak hasil parsing
            for (Integer x : filtered) {
                System.out.print(x + " ");
            }
        }
    }
