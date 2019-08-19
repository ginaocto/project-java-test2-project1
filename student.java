//class abstract
abstract class student implements interfaceSchool {
    String nama;
    String jenisKelamin;
    String nis;

    student (String nm, String jenkel, String ns) {
        nama = nm;
        jenisKelamin = jenkel;
        nis = ns;
    }

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenisKelamin() {
		return this.jenisKelamin;
	}

	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}

	public String getNis() {
		return this.nis;
	}

	public void setNis(String nis) {
		this.nis = nis;
	}
    
    abstract public void nama();
    abstract public void jenisKelamin();
    abstract public void nis();
}