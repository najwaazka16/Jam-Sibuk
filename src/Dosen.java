public class Dosen extends Elemen {
    private Integer jumlahHariKerja;

    public Integer jamSibuk;

    public Dosen(String nama, Integer jumlahHariKerja) {
        super(nama);
        this.jumlahHariKerja = jumlahHariKerja;
        this.jamSibuk = jumlahHariKerja * 8;

    }

    Integer getJamSibuk(){
        return jamSibuk;
        
    }
}
