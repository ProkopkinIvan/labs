package com.epam.rd.java.basic.practice1;

public class Part6 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
            for (int i=(int) (Math.random()); i<n; i++) {
                a[i]=(int) (Math.random()*n);
                System.out.print(" "+ a[i]);
            }
    }
	
}
