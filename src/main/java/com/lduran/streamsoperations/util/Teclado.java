package com.lduran.streamsoperations.util;

import java.util.Scanner;

public class Teclado
{
	public static String le()
	{
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}
}
