/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hadiah.menurestoran;
import java.util.Scanner;
/**
 *
 * @author Intan
 */
public class HadiahMenuRestoran {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat scanner
        Scanner input = new Scanner (System.in);
        int pilihmakan, pilih;
        //membuat judul
        System.out.print("\n DAFTAR MENU RESTORAN JAVATEN \n");
        //pilih tipe makanan
        System.out.println("Pilihan Tipe");
        String[] paket = {" ", "Paket Aneka Nasi", "Paket Seafood", "Paket JunkFood", "Paket Lalapan"};
        for(int a=1; a<paket.length; a++){
            System.out.println(a+". "+paket[a]);  
        }System.out.print("Pilihan anda : ");
        pilihmakan = input.nextInt();
        //percabangan makanan
        switch(pilihmakan){
            case 1 : 
                //pilihan makan
                System.out.println("<< Makanan >>");
                String[] makan1 = {" ", "Nasi Goreng", "Nasi Uduk", "Nasi Campur", "Nasi kucing", "Nasi Bakar"};
                int[] hargamakan1 = {0, 10000, 12000, 15000, 13000, 17000};
                for(int b=1; b<makan1.length; b++){
                System.out.println(b+". "+makan1[b]+"  => "+hargamakan1[b]);}
                System.out.print("Pilihan anda : ");
                int pilihmakan1 = input.nextInt();
                //pilihan minum
                System.out.println("<< Minuman >>");
                String[] minum1 = {" ", "Es teh", "Es jeruk", "Kopi", "Soda Gembira"};
                int[] hargaminum1 = {0, 3000, 6000, 8000, 10000};
                for(int b=1; b<minum1.length; b++){
                System.out.println(b+". "+minum1[b]+"  => "+hargaminum1[b]);}
                System.out.print("Pilihan anda : ");
                int pilihminum1 = input.nextInt();
                //pembayaran
                System.out.println(" TOTAL PEMBAYARAN ");
                int harga1 = hargaminum1[pilihminum1] + hargamakan1[pilihmakan1];
                System.out.println("Total harga : "+harga1);
                System.out.print("Uang yang dibayarkan : ");
                int bayar1 = input.nextInt();
                if(bayar1==harga1){
                    System.out.println("uang pas, tidak ada kembalian");
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar1>harga1){
                    int kembalian1 = bayar1-harga1;
                    System.out.println("Kembalian anda : "+kembalian1);
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar1<harga1){
                    int kurang1 = harga1-bayar1;
                    System.out.println("uang anda kurang sebesar : "+kurang1);
                    System.out.println("Pesanan Anda Tidak Akan Diproses");
                }
                break;
            case 2 :
                //pilih makanan
                System.out.println("<< Makanan >>");
                String[] makan2 = {" ", "Kepiting", "Kerang", "Udang", "Lobster", "Cumi Cumi"};
                int[] hargamakan2 = {0, 100000, 50000, 30000, 100000, 30000};
                for(int b=1; b<makan2.length; b++){
                System.out.println(b+". "+makan2[b]+"  => "+hargamakan2[b]);}
                System.out.print("Pilihan anda : ");
                int pilihmakan2 = input.nextInt();
                //pilih minum
                System.out.println("<< Minuman >>");
                String[] minum2 = {" ", "Lemon Tea", "Juice jeruk", "Teh Botol", "Soda Gembira"};
                int[] hargaminum2 = {0, 10000, 5000, 8000, 10000};
                for(int b=1; b<minum2.length; b++){
                System.out.println(b+". "+minum2[b]+"  => "+hargaminum2[b]);}
                System.out.print("Pilihan anda : ");
                int pilihminum2 = input.nextInt();
                //pembayaran
                System.out.println(" TOTAL PEMBAYARAN ");
                int harga2 = hargaminum2[pilihminum2] + hargamakan2[pilihmakan2];
                System.out.println("Total harga : "+harga2);
                System.out.print("Uang yang dibayarkan : ");
                int bayar2 = input.nextInt();
                if(bayar2==harga2){
                    System.out.println("uang pas, tidak ada kembalian");
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar2>harga2){
                    int kembalian2 = bayar2-harga2;
                    System.out.println("Kembalian anda : "+kembalian2);
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar2<harga2){
                    int kurang2 = harga2-bayar2;
                    System.out.println("uang anda kurang sebesar : "+kurang2);
                    System.out.println("Pesanan Anda Tidak Akan Diproses");}
                break;
            case 3 :
                //pilih makanan
                System.out.println("<< Makanan >>");
                String[] makan3 = {" ", "Ayam Siap saji", "Burger", "Kentang Goreng", "Spaghetti"};
                int[] hargamakan3 = {0, 30000, 20000, 15000, 20000};
                for(int b=1; b<makan3.length; b++){
                System.out.println(b+". "+makan3[b]+"  => "+hargamakan3[b]);}
                System.out.print("Pilihan anda : ");
                int pilihmakan3 = input.nextInt();
                //pilih minuman
                System.out.println("<< Minuman >>");
                String[] minum3 = {" ", "Lemon Tea", "Coca Cola", "Fanta", "Sprite"};
                int[] hargaminum3 = {0, 10000, 8000, 8000, 8000};
                for(int b=1; b<minum3.length; b++){
                System.out.println(b+". "+minum3[b]+"  => "+hargaminum3[b]);}
                System.out.print("Pilihan anda : ");
                int pilihminum3 = input.nextInt();
                //pembayaran
                System.out.println(" TOTAL PEMBAYARAN ");
                int harga3 = hargaminum3[pilihminum3] + hargamakan3[pilihmakan3];
                System.out.println("Total harga : "+harga3);
                System.out.print("Uang yang dibayarkan : ");
                int bayar3 = input.nextInt();
                if(bayar3==harga3){
                    System.out.println("uang pas, tidak ada kembalian");
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar3>harga3){
                    int kembalian3 = bayar3-harga3;
                    System.out.println("Kembalian anda : "+kembalian3);
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar3<harga3){
                    int kurang3 = harga3-bayar3;
                    System.out.println("uang anda kurang sebesar : "+kurang3);
                    System.out.println("Pesanan Anda Tidak Akan Diproses");
                }
                break;
            case 4 :
                //pilih makanan
                System.out.println("<< Makanan >>");
                String[] makan4 = {" ", "Bebek", "Ayam", "Lele", "Tahu Tempe", "Gurami"};
                int[] hargamakan4 = {0, 23000, 15000, 12000, 7000, 69000};
                for(int b=1; b<makan4.length; b++){
                System.out.println(b+". "+makan4[b]+"  => "+hargamakan4[b]);}
                System.out.print("Pilihan anda : ");
                int pilihmakan4 = input.nextInt();
                //pilih minum
                System.out.println("<< Minuman >>");
                String[] minum4 = {" ", "Es teh", "Es jeruk", "Kopi", "Soda Gembira"};
                int[] hargaminum4 = {0, 3000, 6000, 8000, 10000};
                for(int b=1; b<minum4.length; b++){
                System.out.println(b+". "+minum4[b]+"  => "+hargaminum4[b]);}
                System.out.print("Pilihan anda : ");
                int pilihminum4 = input.nextInt();
                //pembayaran
                System.out.println(" TOTAL PEMBAYARAN ");
                int harga4 = hargaminum4[pilihminum4] + hargamakan4[pilihmakan4];
                System.out.println("Total harga : "+harga4);
                System.out.print("Uang yang dibayarkan : ");
                int bayar4 = input.nextInt();
                if(bayar4==harga4){
                    System.out.println("uang pas, tidak ada kembalian");
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar4>harga4){
                    int kembalian4 = bayar4-harga4;
                    System.out.println("Kembalian anda : "+kembalian4);
                    System.out.println("Tunggu Pesanan Anda");
                }else if(bayar4<harga4){
                    int kurang4 = harga4-bayar4;
                    System.out.println("uang anda kurang sebesar : "+kurang4);
                    System.out.println("Pesanan Anda Tidak Akan Diproses");
                }
                break;
            default :
                System.out.println("Anda salah mmasukkan kode");
        }
    }
}
