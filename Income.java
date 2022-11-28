import java.util.Scanner;
class Income
{
	public static void main(String args[])
	{
	double tax=0,it,at,qt,tt;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	it=sc.nextDouble();
	System.out.println("Enter the advance tax paid:");
	at=sc.nextDouble();
	if(it<=200000)
		tax=0;
	else if(it<=300000)
		tax=0.1*(it-200000);
	else if(it<=500000)
		tax=(0.2*(it-300000))+(0.1*100000);
	else if(it<=1000000)
		tax=(0.3*(it-500000))+(0.2*200000)+(0.1*100000);
	else
		tax=(0.4*(it-1000000))+(0.3*500000)+(0.2*200000)+(0.1*100000);
	qt=tax/4;
	for(int i=0;i<4;i++)
	{
	    if(at>qt)
	    {
	        at=at-qt;
	        tt=0;
	    }
	    else if(at==0)
	    tt=qt;
	    else{
	        tt=qt-at;
	        at=0;
	    }
	    System.out.println("Amount payable for Quarter"+(i+1)+" is:"+tt+" at:"+at);
	}
	if(at>0)
	System.out.println("Refundable tax amount is: "+at);
	}
}