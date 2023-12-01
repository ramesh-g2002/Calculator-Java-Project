package demo;

public class Divide implements Operate{
	public Double getResult(Double... number)
	{
		Double div=number[0];
		for(int i=1;i<number.length;i++)
		{
			div/=number[i];
		}
		return div;
	}

}
