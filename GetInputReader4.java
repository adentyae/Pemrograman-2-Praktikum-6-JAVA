import javax.swing.JOptionPane;

public class GetInputReader4{
	public static void main(String[] args) {

		String nim = "", nama = "", tempat="", tgllahir = "";

		nama = JOptionPane.showInputDialog("Masukkan Nama Anda : ");
		nim = JOptionPane.showInputDialog("Masukkan NIM : ");
		tempat = JOptionPane.showInputDialog("Masukkan Tempat Lahir : ");
		tgllahir = JOptionPane.showInputDialog("Masukkan Tanggal Lahir : ");

		String msg = "Selamat Datang \n " + nama + "\n" + nim + "\n" + tempat + "\n" + tgllahir;
		JOptionPane.showMessageDialog(null, msg);

	}
}