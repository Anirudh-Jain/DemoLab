class Sample
{
public static void main(String args[])
{
int a=25,b=20,c=32,temp;

//Comparing a,b & c
if(a>=b)
{
temp = a;
}

else
{
temp = b;
}

if(temp>=c)
{
System.out.println("Greatest among "+a+", "+b+" and "+c+" is "+temp);
}

else
{
System.out.println("Greatest among "+a+", "+b+" and "+c+" is "+c);
}

}
}