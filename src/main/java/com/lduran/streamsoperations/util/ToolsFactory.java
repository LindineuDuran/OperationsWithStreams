package com.lduran.streamsoperations.util;

public class ToolsFactory
{
	private static ToolsFactory instance;

	/**
	 * @return the instance
	 */
	public static ToolsFactory getInstance()
	{
		if (instance == null)
		{
			instance = new ToolsFactory();
		}

		return instance;
	}

	/**
	 * Check if a string is numeric [with regex]
	 *
	 * @param str
	 * @return
	 */
	public boolean isNumeric(String str)
	{
		return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional '-' and decimal.
	}
}