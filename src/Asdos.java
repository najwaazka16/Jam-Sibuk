public class Asdos extends Mahasiswa {
    private Integer jamNgasdos;


    public Asdos(String nama, Integer SKS, Integer jamNgasdos) {
        super(nama, SKS);
        this.jamNgasdos = jamNgasdos;
    }

    @Override
    public Integer getJamSibuk(){
        return super.getJamSibuk() + jamNgasdos;
        
    }
}