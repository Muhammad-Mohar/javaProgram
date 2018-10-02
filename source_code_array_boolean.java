import java.util.Scanner;


public class source_code_array_boolean {

	public static void main(String[] args) {
	//DEKLARASI VARIABEL
	int[] data = new int[4];
	//INISIALISASI VALUE
	data[0] = 10;
	data[1] = 5;
	data[2] = 7;
	data[3] = 8;
	//OPERASI VARIABEL AND & OR
	boolean test_and = false;
	boolean test_or = false;
	test_and = (data[0] < 10) && (data[1] < 9);
	test_or = (data[3] < 10) || (data[4] < 9);
	//MENAMPILKAN HASIL
	System.out.println("Nilai___");
	for(int i=0;i<data.length;i++){System.out.println((data[i]));};
	System.out.println("Logika AND :" + test_and);
	System.out.println("Logika OR : " + test_or);
	//MENGAMBIL IMPUT DARI KEYBOARD
	int[] nilai = new int[4];
	boolean and = false;
	boolean or = false;
	Scanner keyboard = new Scanner(System.in);
	System.out.println("masukkan nilai Variabel");
	System.out.print("nilai 1 : ");
	nilai[0] = keyboard.nextInt();
	System.out.print("nilai 2 : ");
	nilai[1] = keyboard.nextInt();
	System.out.print("nilai 3 : ");
	nilai[2] = keyboard.nextInt();
	System.out.print("nilai 4 : ");
	nilai[3] = keyboard.nextInt();
	and = (nilai[0] < 10) && (nilai[1] < 9);
	or = (nilai[2] < 10) || (nilai[3] < 9);
	for(int i=0;i<nilai.length;i++){System.out.println((nilai[i]));};
	System.out.println("Logika AND : " + and);
	System.out.println("Logika OR : " + or);
	}

}
