public class Simulator {

    public static void main(String[] args) {
        
        Asdos asdos = new Asdos("asdos", 20, 13);
        Dosen dosen = new Dosen("dosen", 5);
        Asdos asdos2 = new Asdos("asdos1", 20, 4);
        Mahasiswa mahasiswa = new Mahasiswa("mahasiswa1", 20);
        Mahasiswa mahasiswa2 = new Mahasiswa("mahasiswa1", 23);
        Dosen dosen2 = new Dosen("Dosen1", 3);

        System.out.println("Fairuzikun adalah seorang asdos dengan jam sibuk: " + asdos.getJamSibuk());
        System.out.println("Raja OP Damanik adalah seorang dosen dengan jam sibuk :" + dosen.getJamSibuk());
        System.out.println("Angel-chan adalah seorang asdos dengan jam sibuk: " + asdos2.getJamSibuk());
        System.out.println("Firman adalah seorang mahasiswa dengan jam sibuk: " + mahasiswa.getJamSibuk());
        System.out.println("Nid to pass this sem adalah seorang mahasiswa dengan jam sibuk: " + mahasiswa2.getJamSibuk());
        System.out.println("Nivotko adalah seorang dosen dengan jam sibuk: " + dosen2.getJamSibuk());

        Integer totaljamSibuk = asdos.getJamSibuk() + dosen.getJamSibuk() + asdos2.getJamSibuk() + mahasiswa.getJamSibuk() + mahasiswa2.getJamSibuk() + dosen2.getJamSibuk();
        System.out.println("Total jam sibuk elemen Fasilkom adalah "+totaljamSibuk);
        
    

    }
}