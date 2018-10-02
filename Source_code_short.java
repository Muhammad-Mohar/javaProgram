import java.util.Scanner;


public class Source_code_short {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	short a;
	short b;
	short c;
	//INISIALISASI VALUE
	a = 1500;
	b = 2000;
	//OPERASI VARIABEL
	c = (short)(a+b);
	//MENAMPILKAN HASIL
	System.out.println("a : " + a);
	System.out.println("b : " + b);
	System.out.println("c : " + c);
	//MENGAMBIL IMPUT DARI KEYBOARD
	Scanner keyboard = new Scanner(System.in);
	System.out.println("tambahkan data");
	float d;
	d = keyboard.nextShort();
	System.out.println("d :" + d);

	}

}
