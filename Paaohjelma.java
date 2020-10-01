
import java.util.Arrays;

public class Paaohjelma {

    public static void main(String[] args) {
        // tee testikoodia tänne
        int[] taulukko = {3, 1, 5, 99, 3, 12};
        System.out.println("Pienin: " + pienin(taulukko));
        System.out.println("Pienemmän indeksi: " + pienimmanIndeksi(taulukko));

        int[] luvut = {8, 3, 7, 9, 1, 2, 4};

        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 1, 0);
        System.out.println(Arrays.toString(luvut));

        Paaohjelma.vaihda(luvut, 0, 3);
        System.out.println(Arrays.toString(luvut));

        System.out.println("\n");
        System.out.println("-------");
        System.out.println("\n");

        Paaohjelma.jarjesta(luvut);
    }

    public static int pienin(int[] taulukko) {
        int pienin = taulukko[0];
        for (int i = 0; i < taulukko.length - 1; i++) {
            if (pienin > taulukko[i + 1]) {
                pienin = taulukko[i + 1];
            }
        }
        return pienin;
    }

    public static int pienimmanIndeksi(int[] taulukko) {
        int indeksi = 0;
        for (int i = 0; i < taulukko.length - 1; i++) {
            if (taulukko[indeksi] > taulukko[i + 1]) {
                indeksi = i + 1;
            }
        }

        return indeksi;
    }

    public static int pienimmanIndeksiAlkaen(int[] taulukko, int aloitusIndeksi) {
        int indeksi = aloitusIndeksi;
        for (int i = aloitusIndeksi; i < taulukko.length - 1; i++) {
            if (taulukko[indeksi] > taulukko[i + 1]) {
                indeksi = i + 1;
            }
        }
        return indeksi;
    }

    public static void vaihda(int[] taulukko, int indeksi1, int indeksi2) {
        int temp = taulukko[indeksi1];
        taulukko[indeksi1] = taulukko[indeksi2];
        taulukko[indeksi2] = temp;
    }

    public static void jarjesta(int[] taulukko) {
        
        for (int i = 0; i < taulukko.length; i++) {
            vaihda(taulukko, pienimmanIndeksiAlkaen(taulukko, i), i);
            System.out.println(Arrays.toString(taulukko));
        }
    }
}
