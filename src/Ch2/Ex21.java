package Ch2;
import java.util.*;

public class Ex21
{
  public static void main(String[]args){
	int n;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entrez le nombre de lignes");
	n = sc.nextInt();
	
	for(int i=1; i<=n; i++){
	  for(int j=n; j>i; j--){	
		System.out.print(' ');	
	  }
	  for(int j=0; j<2*i-1; j++){
		System.out.print('*');
	  }  
	System.out.println();  
	}
  }
}
