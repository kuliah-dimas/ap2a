public class ACT6 {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("Dimas", "1IA24", "50422430", 100, 100);
        mahasiswa.Biodata();
        mahasiswa.NilauUjian();
        mahasiswa.NilaiHasil();
    }
}

class Mahasiswa {
    String name, kelas, npm;
    int uas, uts;
    int hasil;

    Mahasiswa(String name, String kelas, String npm, int uts, int uas) {
        this.name = name;
        this.kelas = kelas;
        this.npm = npm;
        this.uts = uts;
        this.uas = uas;
    }

    void Biodata() {
        System.out.println("======== BIODATA =======");
        System.out.println("Nama\t:" + this.name);
        System.out.println("Kelas\t:" + this.kelas);
        System.out.println("NPM\t:" + this.npm);
    }

    void NilauUjian() {
        System.out.println("======= NILAI ANDA ======");
        System.out.println("Nilai UTS\t:" + this.uts);
        System.out.println("Nilai UAS\t:" + this.uas);
        System.out.println("Nilai Hasi\t:" + NilaiHasil());
    }

    double NilaiHasil() {
        this.hasil = (this.uts + this.uas) / 2;
        return this.hasil;
    }
}
