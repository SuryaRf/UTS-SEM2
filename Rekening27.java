class Rekening {
    private String noRekening;
    private String nama;
    private String namaIbu;
    private String phone;
    private String email;

    public Rekening(String noRekening, String nama, String namaIbu, String phone, String email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.phone = phone;
        this.email = email;
    }

    // Getter methods
    public String getNoRekening() {
        return noRekening;
    }

    public String getNama() {
        return nama;
    }
    public String getNamaIbu() {
        return namaIbu;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }

    // Override toString() method to display Rekening information
    @Override
    public String toString() {
        return "No Rekening: " + noRekening + "\n" +
                "Nama: " + nama + "\n" +
                "Nama Ibu: " + namaIbu + "\n" +
                "Phone: " + phone + "\n" +
                "Email: " + email + "\n";
    }
}