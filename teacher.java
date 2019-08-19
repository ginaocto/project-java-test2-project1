class teacher {
    String nama;
    String bidang;
	String nik;
	
	teacher(String nm, String bdg, String nk) {
		nama = nm;
		bidang = bdg;
		nik = nk;
	}

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getBidang() {
		return this.bidang;
	}

	public void setBidang(String bidang) {
		this.bidang = bidang;
	}

	public String getNik() {
		return this.nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}
}