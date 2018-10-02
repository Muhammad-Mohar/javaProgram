import java.util.Scanner;


public class Source_code_float {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL 
	float a;
	float b;
	float hasil;
	//INISIALISASI VALUE
	a = 30;
	b = 33000;
	//OPERASI VARIABEL
	hasil = a * b + b - a;
	//MENAMPILKAN NILAI VARIABEL
	System.out.println("----nilai variabel----");
	System.out.println("A : " + a);
	System.out.println("B : " + b);
	System.out.println("hasil : " + hasil );
	//MENGAMBIL INPUT DARI KEYBOARD
	float c;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("C : ");
	c = keyboard.nextFloat();
	System.out.println("c : " + c);
	    
	}

}
