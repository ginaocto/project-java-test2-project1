class economic extends course {
    /*variable
    String jenis;
    
    //constructor
    economic (String nm, String jenMatpel, int jmlJam, int c) {
        super (nm,jenMatpel,jmlJam);
        jenis = corbanameURLContextFactory;
    }

    //parameter
    public String print (economic d) {
        return "\n Nama Course :" + d.nama+ 
                "\n Jenis Matpel:" + d.jenisMatpel+
                "\n Jumlah Jam :" + d.jumlahJam +
                "\n Jenis :" + jenis;  
    } */

    public economic() {
        System.out.println ("Constructor economic") ;
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