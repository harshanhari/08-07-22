package fileHomeWork;

import java.io.File;
import java.io.FileReader;

public class Ex12 {

	public static void main(String[] args) {
		try {

			File f10 = new File("doc.txt");
			FileReader fRead = new FileReader(f10);
			System.out.println(fRead);

		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
	}
}
