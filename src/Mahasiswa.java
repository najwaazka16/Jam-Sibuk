public class Mahasiswa extends Elemen {

    private Integer SKS;
    public Integer jamSibuk;

    public Mahasiswa(String nama, Integer SKS) {
        super(nama);  // Memanggil konstruktor kelas induk dengan parameter nama
        this.SKS = SKS;
        this.jamSibuk = SKS * 3;
    }

    public Integer getJamSibuk() {
        return jamSibuk;
    }
}
