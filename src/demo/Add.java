package demo;

import java.lang.management.OperatingSystemMXBean;

public class Add implements Operate{
	public Double getResult(Double... number)
	{
		Double sum=0.0;
		for(Double num:number)
		{
			sum+=num;
		}
		return sum;
		
	}

}
