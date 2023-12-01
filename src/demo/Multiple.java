package demo;

public class Multiple implements Operate {
public Double getResult(Double... number)
{
	Double mul=1.0;
	for(Double num:number)
	{
		mul*=num;
	}
	return mul;
	
}
}
