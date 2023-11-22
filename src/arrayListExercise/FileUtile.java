package arrayListExercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class FileUtile {
	public static ArrayList<String> readFile(String url){
		ArrayList<String> result = new ArrayList<String>();
		File file = new File(url);
		try {
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader);
			String line = buffer.readLine();
			while (line != null) {
				result.add(line);
				line = buffer.readLine();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(FileUtile.readFile("./src/arrayListExercise/Danhsach.txt"));
	}
}
