package sorucozumu_19_08_23_01;

public class Cember extends Sekil{
    //sekil <--Cember
    public Cember(double yariCap) {
        super(yariCap);
    }
    @Override
    public String toString() {
        return "YARIÇAP=" + yariCap + " ALAN=" + alanHesapla(yariCap) + " ÇEVRE=" + cevreHesaplama(yariCap);
    }
}
