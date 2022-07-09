package fileHomeWork;

import java.io.File;

public class Ex2 {

	public static void main(String[] args) {

		try {
			File f2 = new File("doc.txt");
			System.out.println(f2.getAbsoluteFile());
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
