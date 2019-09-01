package com.lduran.streamsoperations.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

@Component("fh")
public class FileHandler
{
	/**
	 * it reads text files using stream features
	 *
	 * @param filePath
	 * @return
	 * @throws IOException
	 */
	public List<String> readFile(String filePath) throws IOException
	{
		Path path = Paths.get(filePath);
		List<String> listFile = Files.lines(path, StandardCharsets.ISO_8859_1).collect(Collectors.toList());

		return listFile;
	}

	/**
	 * it writes the list using stream()
	 *
	 * @param filePath
	 * @param dados
	 * @throws IOException
	 */
	public void writeStream(String filePath, List<String> dados) throws IOException
	{
		Path path = Paths.get(filePath);

		if (dados.size() > 0)
		{
			try
			{
				Files.write(path, dados);
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
