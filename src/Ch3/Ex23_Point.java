package Ch3;

public class Ex23_Point
{
  char nom;
  double abscisse;
  
  public Ex23_Point(char nom, double abscisse){
	this.nom=nom;
	this.abscisse=abscisse;
  }
 
  public void affiche(){
	System.out.println("Point de nom: "+nom+", d'abscisse: "+abscisse);
  }
  public double translate(double t){
	System.out.println("Après translation:");
	return abscisse += t;	
  }
}
