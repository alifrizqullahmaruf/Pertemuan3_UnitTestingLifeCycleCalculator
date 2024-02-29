public class Kalkulator {
    private int nilai1;
    private int nilai2;

    Kalkulator(int nilai1, int nilai2) {
        this.setNilai1(nilai1);
        this.setNilai2(nilai2);
    }

    public int tambah() {
        return getNilai1() + nilai2;
    }

    public int kurang() {
        return getNilai1() + nilai2;
    }

    public int bagi(){
        return getNilai1() / nilai2;
    }

    public int kali(){
        return getNilai1()*nilai2;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }
}