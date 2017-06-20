import java.util.Scanner;


public class Target {
  public static void main(String []args){
	  Scanner s=new Scanner(System.in);
	  System.out.println("Target source:");
	  int t=s.nextInt();
	  System.out.println("Enter n:");
	  int n=s.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter the elements:");
	  for(int k=0;k<n;k++)
	  {
		  a[k]=s.nextInt();
	  }
	  for(int i=0;i<n;i++){
		  for(int j=i+1;j<n;j++){
			  if(a[i]+a[j]==t){
				  System.out.print(a[i]+","+a[j]);
				 
				 
			  }
		  }
			 
	  }
  }
}
