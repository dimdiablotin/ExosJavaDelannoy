package Ch3;

public class Ex23_Test
{
  public static void main(String[]args){
	Ex23_Point p1 = new Ex23_Point('A',2.5);
	Ex23_Point p2 = new Ex23_Point('B',8.12);
	
	p1.affiche();
	p2.affiche();
	p1.translate(4);
	p2.translate(4);
	p1.affiche();
	p2.affiche();
  }
}
