import java.util.Scanner;


public class source_code_integer {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int i;
	int j;
	int k;
	//INISIALISASI VALUE
	i = 37;
	j = 42;
	k = 42;
	//OPERASI VARIABEL
	int l = j + k / 2 - i * 3;
	//MENAMPILAKAN NILAI VARIABEL
	System.out.println("---Nilai Variabel---");
	System.out.println("i : " + i);
	System.out.println("j : " + j);
	System.out.println("k : " + k);
	System.out.println("l : " + l);
	//MENGAMBIL VARIABEL DARI INPUT KEYBOARD
	int m;
	Scanner keyboard = new Scanner(System.in);
	System.out.print("Masukkan bilangan untuk menambah variabel : ");
	m = keyboard.nextInt();
	System.out.println("m : " + m);
		
	}

}
