import java.util.Scanner;

public class Cognome
{
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			default:
				System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		System.out.println("1 - Es n. * - Titolo es. *");
		System.out.println("2 - Es n. * - Titolo es. *");
		System.out.println("3 - Es n. * - Titolo es. *");
		System.out.println("4 - Es n. * - Titolo es. *");
		System.out.println("5 - Es n. * - Titolo es. *");
	}
	public static double[] esarray()
	{
		// scegliere numero da cui è compost' un array
		int a=Integer.parseInt(in.nextLine());;
		//inizializzare array
		double [] array1= new double [a];
		for (int i= array1.length; i<=0;i--)
		{
			// inserire numeri double dentro array
			array1[i] = (double)(Math.random()*a)+1;
		}
		// stampa contenuto array
		System.out.print(array1[a]);
		return array1;
	}

	static void prodottoarray()
	{
		int b = Integer.parseInt(in.nextLine());
        double [] array2 = new double [b];
        for (int i= array2.length;i<=0;i --)
        {
         array2 [i] = (double)(Math.random()*b)+1;	
        }
	}
}
