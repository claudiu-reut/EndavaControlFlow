package ro.usv;

import java.util.Arrays;

public class Main {
    public static void method4() throws IllegalMethodException {
        throw new IllegalMethodException("Method 4 exception");
    }
    public static void method3() throws IllegalMethodException {
        method4();
    }
    public static void method2(){
        try {
            method3();
        } catch (IllegalMethodException e) {
            e.printStackTrace();
        }
    }
    public static void method1(){
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static int factorial(int n)
    {
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static int fibonacci(int n)
    {
        int f1=0;
        int f2=1;
        int f3=1;
        for (int i=2;i<=n;i++)
        {
           f3=f1+f2;
           f1=f2;
           f2=f3;
        }
        return f3;
    }
    public static boolean prime(int n)
    {
        for(int i=2;i<=n/2;i++)
            if(n%i==0)
                return false;

        return true;
    }
    public static boolean palindrome(char[] str)
    {
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            stringBuilder.append(str[i]);
        }

        return  (stringBuilder.toString()).equals(String.valueOf(str));
    }
    public static void main(String[] args) {
	// factorial
        System.out.println(factorial(5));
        System.out.println(fibonacci(6));
        System.out.println(prime(13));
        String pal="lupul";
        method1();
        System.out.println(palindrome(pal.toCharArray()));
    }
}
