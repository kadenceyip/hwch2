package wk4;

public class p39 {
	public static void main(String[]args)
	{
		
		int[]test;
		test = new int[8];
		
		test[0] = 55;
		test[1] = 13;
		test[2] = 83;
		test[3] = 70;
		test[4] = 49;
		test[5] = 61;
		test[6] = 96;
		test[7] = 38;
		
		for(int i=0; i<8; i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
			
		}
	}

}
