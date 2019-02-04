package Calculette;
import java.util.*;
/*
public class Calc
{
	public static void main(String[] args)
	{
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.print("Veuillez saisir un chiffre:");
		int value = scanner.nextInt();
		System.out.println("Vous avez saisi : " + value);
		
	}
}
*/

public class Calc
{
	public static void main(String[] args)
	{
		Scanner scanner1, scanner2;
		scanner1 = new Scanner(System.in);
		scanner2 = new Scanner(System.in);
		System.out.print("Veuillez saisir un chiffre:");
		int value1 = scanner1.nextInt();
		System.out.print("Veuillez saisir un chiffre:");
		int value2 = scanner2.nextInt();
		int somme = value1 + value2;
		System.out.println("La somme de vos chiffres est : " + somme);
		int diff = value1 - value2;
		System.out.println("La différence de vos chiffres est : " + diff);
		int prod = value1 * value2;
		System.out.println("Le produit de vos chiffres est : " + prod);
		int quotient = value1 / value2;
		System.out.println("Le quotient de vos chiffres est : " + quotient);
		int reste = value1 % value2;
		System.out.println("Le reste de vos chiffres est : " + reste);
	}
}