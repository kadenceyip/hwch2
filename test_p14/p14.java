package wk4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14 {
	public static void main(String[]args)throws IOException
	{
		System.out.println("請輸入一個整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		switch(num)
		{
		case 6:
		{
			System.out.println("輸入的是6");
			break;
		}
		case 9:
		{
			System.out.println("輸入的是9");
			break;
		}
		default:
		{
			System.out.println("請輸入6或9");
			break;
		}
		}
	}
}
