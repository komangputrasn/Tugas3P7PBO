import java.util.Scanner;

public class HitungGaji {
    public static void main(String[] args) {
        System.out.println("--------------- Program Hitung Gaji ---------------\n");
        Scanner input = new Scanner(System.in);

        int golongan;
        int gajiPokok;
        int gajiTotal;
        int tunjangan;
        int lembur;
        int jamKerja;

        do {
            System.out.print("Masukan golongan (1 - 4): ");
            golongan = input.nextInt();

            if (golongan < 1 || golongan > 4) {
                System.out.println("Masukan tidak valid");
            }
        } while (golongan < 1 || golongan > 4); 

        if (golongan == 1) {
            gajiPokok = 1486500;
            tunjangan = 250000;             
        } else if (golongan == 2) {
            gajiPokok = 1926000;
            tunjangan = 300000;
        } else if (golongan == 3) {
            gajiPokok = 2456700;
            tunjangan = 350000;
        } else { // jika golongan == 4
            gajiPokok = 2899500;
            tunjangan = 400000;
        }

        System.out.print("Masukan jam kerja: ");
        jamKerja = input.nextInt();

        lembur = (jamKerja - 173) * 20000;

        System.out.println("\nGaji lembur : " + lembur);
        System.out.println("Gaji pokok  : " + gajiPokok);
        System.out.println("Tunjangan   : " + tunjangan);

        System.out.println("\nPotongan gaji pokok : " + (gajiPokok * 0.005));
        System.out.println("Potongan tunjangan  : " + (tunjangan * 0.005));
        
        // potongan pajak 0.5% untuk gaji pokok dan tunjangan
        gajiPokok -= gajiPokok * 0.005;
        tunjangan -= tunjangan * 0.005;

        // perhitungan gaji total
        gajiTotal = gajiPokok + tunjangan + lembur;

        System.out.println("\nGaji total Anda : Rp" + gajiTotal);
    }
}