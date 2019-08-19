class math extends course {
    /*variable
    String jenis;
    
    //constructor
    math (String nm, String jenMatpel, int jmlJam, int c) {
        super (nm,jenMatpel,jmlJam);
        jenis = corbanameURLContextFactory;
    }

    //parameter
    public String print (math d) {
        return "\n Nama Course :" + d.nama+ 
                "\n Jenis Matpel:" + d.jenisMatpel+
                "\n Jumlah Jam :" + d.jumlahJam +
                "\n Jenis :" + jenis;  
    } */

    public math() {
        System.out.println ("Constructor math") ;
    }
    public math(String string) {
	}
	public void exam() {
        System.out.println("Mengambil data exam");
    }
    public void exercise() {
        System.out.println("Mengambil data exercise");
    }
    public void interview() {
        System.out.println("Mengambil data interview");
    }
    public void presentation() {
        System.out.println("Mengambil data presentation");
    }

    @Override
    public void nama() {

    }

    @Override
    public void jenisMatpel() {

    }

    @Override
    public void jumlahJam() {

    }
}