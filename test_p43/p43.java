package wk4;

public class p43 {
	public static void main(String[]args)
	{
		int[]test = {55, 13, 83, 70, 49, 61, 96, 38};
		
		for(int i = 0;i< test.length; i++)
		{
			System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
		}
		
		System.out.println("考試的人數共為"+test.length+"人");
	}

}
