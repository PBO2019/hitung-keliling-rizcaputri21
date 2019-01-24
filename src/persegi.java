public class persegi {
    public static void main(String[] args) {
        hitung x = new hitung();
        x.hasilKeliling();
    }

    public static class hitung {
        int s = 5;
        double keliling = 4*s;

        void hasilKeliling() {
            System.out.println("Keliling persegi adalah = " + keliling);
        }
    }
}
