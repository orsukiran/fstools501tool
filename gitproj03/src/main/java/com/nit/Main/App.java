package com.nit.Main;

import oracle.jdbc.OracleDriver;

/**
 * Hello world!
 */
public class App {
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        System.out.println(" Sum of a and b :: "+sum(2,5));
        
        
        
    }
}


//public class App {
//
//    public int testsun(int a, int b) {
//        return a + b;
//    }
//
//    public static void main(String[] args) {
//        App app = new App();
//        int result = app.testsun(10, 20);
//        System.out.println("Result: " + result);
//    }
//}



//public class App{
//	
//	
//	
//	public static void main(String[] args) {
//		  System.out.println(" hello world ");
//		 OracleDriver d=new OracleDriver();
//		  System.out.println(d.hashCode());
//	}
//}



