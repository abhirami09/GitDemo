package com.abhi.GitDemo;

/**
 * Hello world!
 *
 */
public class App 
{
	public void addData(String data) {
		System.out.println("data= "+data);
		if(data.equals(Constant.DATA_TYPE)) {
			System.out.println("Welcome");
		}
	}
	
	public void addedMethod(){
		System.out.println("new method");
		
	}
		
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
