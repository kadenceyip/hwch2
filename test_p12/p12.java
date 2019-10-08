package wk4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p12 {
	public static void main(String[]args)throws IOException
	{
	System.out.println("請輸入整數");
	
	BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
	
	int num = Integer.parseInt(br.readLine());
	
	if(num == 8)
	{
		System.out.println("輸入的是8");
	}
	else if(num ==4)
	{
		System.out.println("輸入的是4");
	}
	else
	{
		System.out.println("請輸入8或4");
	}
	}

}
