class scientificStudent extends student {

    scientificStudent(String nm, String jenkel, String ns) {
        super(nm, jenkel, ns);
    }

	/*
     * public scientificStudent() { System.out.println ("Constructor") ; }
     */
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