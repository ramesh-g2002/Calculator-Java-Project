package demo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MainApp {
public static void main(String[] args) {
	String input=ReadInput.read();
	String[] numbersArr=input.split("[-+*/]");
	String[] openArr=input.split("[0-9]+");
	Queue<String> number=new LinkedList<String>(Arrays.asList(numbersArr));
	Queue<String> operations=new LinkedList<String>(Arrays.asList(openArr));
	double res = Double.parseDouble(number.poll());
	while(!number.isEmpty())
	{
		String opt=operations.poll();
		Operate operates;
		switch(opt)
		{
		case "+":
			operates=new Add();
			break;
		case "-":
			operates=new Subtract();
			break;
		case "*":
			operates=new Multiple();
			break;
		case "/":
			operates=new Divide();
			break;
			default:
				continue;
			}
		double num = Double.parseDouble(number.poll());
		res=operates.getResult(res,num);
		
}
	System.out.println(res);
}
}