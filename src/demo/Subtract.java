package demo;

public class Subtract implements Operate{
	public Double getResult(Double... number)
	{
		Double sub=number[0];
		for(int i=1;i<number.length;i++)
		{
			sub-=number[i];
		}
		return sub;
	}

}
