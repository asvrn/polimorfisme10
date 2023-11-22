public class VirtualDemo {
    public static void main(String[] args) throws Exception {
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);
        Pegawai e = new Gaji ("Buyung", "Samarinda", 2, 2500.00);
        Pegawai p = new Pegawai("Rifqi", "Pessel", 1);

        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        System.out.println(s.message);
        s.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(e.message);
        e.mailCheck();
        
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        System.out.println(p.message);
        p.mailCheck();
    }
}
