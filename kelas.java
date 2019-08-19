class kelas {
    String nama;
    String jenis;
    int jumlahStudent;

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJenis() {
		return this.jenis;
	}

	public void setJenis(String jenis) {
		this.jenis = jenis;
	}

	public int getJumlahStudent() {
		return this.jumlahStudent;
	}

	public void setJumlahStudent(int jumlahStudent) {
		this.jumlahStudent = jumlahStudent;
	}

    
        kelas(String nm, String jns, int jmlStudent) {
            nama = nm;
            jenis = jns;
            jumlahStudent = jmlStudent;
        }

		public kelas() {
		}
}