package fileHomeWork;

import java.io.File;

public class Ex7 {

	public static void main(String[] args) {

		try {
			File f7 = new File("doc.txt");
			long l = f7.lastModified();
			System.out.println(l);
		} catch (Exception e) {
			e.getStackTrace();// TODO: handle exception
		}

	}

}
