package Laundry;
public class AplikasiLaundry {
    public static void main(String[] args) {
        JenisLaundry daftarJenisLaundry = new JenisLaundry();
        Client daftarClient = new Client();
        Petugas petugas1 = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Laporan laporanLaundry = new Laporan();
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        transaksiLaundry.prosesTransaksi(daftarClient, transaksiLaundry, daftarJenisLaundry);
        
        laporanLaundry.laporan(daftarJenisLaundry);
        laporanLaundry.laporan(daftarClient);
        laporanLaundry.laporan(transaksiLaundry, daftarJenisLaundry);
        
        
    }
}
