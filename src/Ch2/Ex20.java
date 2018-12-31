package Ch2;
import java.util.*;

public class Ex20{
  public static void main(String[] args){
	int n;
	float res=0;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Donner un entier :");
	n = sc.nextInt();
	
	for(int i=1; i<=n; i++){
	 res = (float)1/i + res;
	}
	System.out.println("La somme des "+ n 
	+" premiers termes de la série harmonique est:\n" + res);	
  }
}
