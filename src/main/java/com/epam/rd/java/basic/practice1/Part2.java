package com.epam.rd.java.basic.practice1;

public class Part2 {

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int sum=0;
                for (String arg : args) sum = sum + Integer.parseInt(arg);
                    System.out.println(sum);

            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.exit(1);
            }
        }

    }
	
}
