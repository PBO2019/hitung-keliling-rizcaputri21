public class ligkaran {
        public static void main(String[] args) {
            hitung x = new hitung();
            x.hasillingkaran();
        }

        public static class hitung {
            int r = 5;
            double pi = 3.14;
            double keliling = 2 * pi * r;

            void hasillingkaran() {
                System.out.println("Keliling Lingkaran Adalah = " + keliling);
            }
        }
    }
