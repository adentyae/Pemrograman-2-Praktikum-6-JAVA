import java.io.*;

public class GetInputReader2{
	public static void main(String[] args) throws IOException{
		BufferedReader dataInput = new BufferedReader(new InputStreamReader(System.in));

		String nim = "", nama = "", tempat="", tgllahir = "";

		System.out.print("Masukkan Nama Anda : ");
		nama = dataInput.readLine();
		System.out.print("Masukkan NIM Anda : ");
		nim = dataInput.readLine();
		System.out.print("Masukkan Tempat Lahir : ");
		tempat = dataInput.readLine();
		System.out.print("Masukkan Tanggal Lahir : ");
		tgllahir = dataInput.readLine();

		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Selamat Datang " + nama);
		System.out.println("NIM 	: " + nim);
		System.out.println("Tempat Lahir 	: " + tempat);
		System.out.println("Tanggal Lahir 	: " + tgllahir);
	}
}
