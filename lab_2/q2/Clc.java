class Clc
{
public static void main(String args[])
{

int input1,input2,result;
char oper;
if(args.length == 0)
{
System.out.println("NO COMMAND LINE ARGUMENT");
}

else
{

// Conversion to int

input1=Integer.valueOf(args[0]);
input2=Integer.valueOf(args[2]);

oper = args[1].charAt(0);  // Conversion to Char

if(oper == '+')
{
result=input1+input2;
System.out.println("Value of " + args[0] + "+" + args[2] + " is "+result);
}

else if(oper == '-')
{
result=input1-input2;
System.out.println("Value of " + args[0] + "-" + args[2] + " is "+result);
}

else if(oper == '*')
{
result=input1*input2;
System.out.println("Value of " + args[0] + "x" + args[2] + " is "+result);
}

else if(oper == '/')
{
result=input1/input2;
System.out.println("Value of " + args[0] + "/" + args[2] + " is "+result);
}

else
{
System.out.println("UNABLE TO CALCULATE");
}

}

}
}