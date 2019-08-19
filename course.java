abstract class course {
    String nama;
    String jenisMatpel;
    int jumlahJam;

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisMatpel() {
		return this.jenisMatpel;
	}

	public void setJenisMatpel(String jenisMatpel) {
		this.jenisMatpel = jenisMatpel;
	}

	public int getJumlahJam() {
		return this.jumlahJam;
	}

	public void setJumlahJam(int jumlahJam) {
		this.jumlahJam = jumlahJam;
	}

    
    abstract public void nama();
    abstract public void jenisMatpel();
    abstract public void jumlahJam();
}