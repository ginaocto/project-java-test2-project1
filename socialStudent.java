class socialStudent extends student {

    /*variable
    String mataPelajaran;
    
    //constructor
    socialStudent (String nm, String jenkel, int ns, int a) {
        super (nm,jenkel,ns);
        mataPelajaran = a;
    }

    //parameter
    public String print (socialStudent b) {
        return "\n Nama :" + b.nama+ 
                "\n Jenis Kelamin:" + b.jenisKelamin+
                "\n NIS :" + b.nis +
                "\n Mata Pelajaran :" + mataPelajaran;  
    } */

    socialStudent(String nm, String jenkel, String ns) {
        super(nm, jenkel, ns);
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
    public void jenisKelamin() {

    }

    @Override
    public void nis() {

    }
}