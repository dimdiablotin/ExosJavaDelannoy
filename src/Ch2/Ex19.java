package Ch2;
import java.util.*;

public class Ex19
{
  public static void main(String []args)
  {
	double x, res;	
	Scanner sc = new Scanner(System.in);

	do {
	  System.out.println("Donnez un nombre positif :");
	  x = sc.nextDouble();
	  if (x < 0)
	  {
		System.out.println("positif s'il vous plait !");
	  }
	  res = Math.sqrt(x);
	  if (x <= 0) continue ;
	  System.out.println("Sa racine carré est : " + res);
	}while (x != 0);
  }
}
