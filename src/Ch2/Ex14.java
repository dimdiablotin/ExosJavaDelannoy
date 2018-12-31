package Ch2;
import java.util.*;

public class Ex14
{
  public static void main(String[] args)
  {
	int i=0, n, som, choix=10;
	som = 0;
	Scanner sc = new Scanner(System.in);

	do{
	  System.out.println("\nUtiliser: \n 1: une boucle for. \n 2: une boucle while.\n 3: une boucle do while. \n 0: pour terminer.");
	  choix = sc.nextInt();

	  switch (choix)
	  {
		case 1:
		  System.out.println("La boucle for");
		  for (i = 0; i < 4; i++)
		  {
			System.out.println("donnez un entier ");
			n = sc.nextInt();
			som += n;
		  }
		  System.out.println("Somme : " + som);
		  break;

		case 2:
		  i = 0; som = 0;
		  System.out.println("La boucle while");
		  while (i < 4)
		  {
			System.out.println("donnez un entier ");
			n = sc.nextInt();
			som += n;  
			i++;
		  }
		  System.out.println("Somme : " + som);
		  break;

		case 3:
		  i = 0; som = 0;
		  System.out.println("La boucle do while");
		  do{
			System.out.println("donnez un entier ");
			n = sc.nextInt();
			som += n;  
			i++;
		  }while( i < 4);
		  System.out.println("Somme : " + som);
		  break;	
	  }
	}
	while(choix != 0);

	System.out.println("Terminé !");
  }
}
