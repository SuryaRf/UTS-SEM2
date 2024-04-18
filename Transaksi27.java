public class Transaksi27 {
    private double saldo;
    private double saldoAwal;
    private double saldoAkhir;
     String tanggalTransaksi;
     String nomerRekening;

    public Transaksi27(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
    }

    // Getter methods
    public double getSaldo() {
        return saldo;
    }
    public double getSalldoAwal() {
        return saldoAwal;
    }
    public double getSaldoAkhir() {
        return saldoAkhir;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }
    public String getNomerRekening(){
        return nomerRekening;
    }

    // Override toString() method to display Transaksi information
    @Override
    public String toString() {
        return "Saldo: " + saldo + "\n" +
                "Saldo Awal: " + saldoAwal + "\n" +
                "Saldo Akhir: " + saldoAkhir + "\n" +
                "Tanggal Transaksi: " + tanggalTransaksi + "\n";
    }
}
