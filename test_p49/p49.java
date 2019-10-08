package wk4;

public class p49 {
	public static void main(String[]args)
	{
		int[][]test;
		test = new int [3][6];
		
		test[0][0] = 55;
		test[0][1] = 13;
		test[0][2] = 83;
		test[0][3] = 70;
		test[0][4] = 49;
		test[1][0] = 61;
		test[1][1] = 96;
		test[1][2] = 38;
		
		for(int i=0; i<test[1].length;i++)
		{
			System.out.println("第"+(i+1)+"個人的中文分數是"+test[0][i]+"分");
			System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]+"分");
			
		}
	}
}
