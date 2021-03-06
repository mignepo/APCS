//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Maze
{
   private int[][] maze;
   private boolean exitFound;

	public Maze()
	{
		exitFound = false;
		maze = new int[0][0];

	}

	public Maze(int size, String line)
	{
		exitFound = false;
		Scanner f = new Scanner(line);
		maze = new int[size][size];
		for (int r = 0;r<size;r++){
			for (int c = 0;c<size;c++){
				maze[r][c] = f.nextInt();
			}
		}
	}

	public boolean hasExitPath(int r, int c)
	{
		
		if (r>=0 && r<maze.length && c>=0 && c< maze[r].length && maze[r][c]==1){
			maze[r][c] = 0;
			if (c==maze.length-1){
				exitFound = true;
			}
			else{
				hasExitPath(r+1,c);
				hasExitPath(r-1,c);
				hasExitPath(r,c+1);
				hasExitPath(r,c-1);
			}
			return exitFound;
		}
		
		
		return false;
	}

	public String toString()
	{
		String m = "";
		for (int r = 0;r<maze.length;r++){
			for (int c = 0;c<maze[r].length;c++){
				m += maze[r][c] + " ";
			}
			m += "\n";
			
		}
			
		String output="";
		if (hasExitPath(0,0)==true){
			output += "exit found";
		}
		else if (hasExitPath(0,0) == false){
			output += "exit not found";
		}
		
		return m + "\n" + output + "\n";
	}
}