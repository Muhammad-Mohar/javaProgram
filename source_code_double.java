import java.util.Scanner;


public class source_code_double {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	double r;
	double s;
	//INISIALISASI VALUE
	r  = 27.475;
	s  = 7.22;
	//OPERASI VARIABEL
	double t = r + s;
	//MENAMPILKAN NILAI
	System.out.println("---- operasi matematika------");
	System.out.println(" R : " + r);
	System.out.println(" S : " + s);
	System.out.println(" T : " + t);
	//MENGAMBIL IMPUT DARI KEYBOARD	
	double u;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Tambahkan angka Desimal : ");
	u = keyboard.nextDouble();
	System.out.println(" U : " + u);

	}

}
