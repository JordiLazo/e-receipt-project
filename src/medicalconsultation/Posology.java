package medicalconsultation;

public class Posology { // A class that represents the posology of amedicine
    private float dose;
    private float freq;
    private FqUnit freqUnit;

    public Posology (float d, float f, FqUnit u){
        this.dose = d;
        this.freq = f;
        this.freqUnit = u;
    }

    public float getDose() {
        return dose;
    }

    public void setDose(float dose) {
        this.dose = dose;
    }

    public float getFreq() {
        return freq;
    }

    public void setFreq(float freq) {
        this.freq = freq;
    }

    public FqUnit getFreqUnit() {
        return freqUnit;
    }

    public void setFreqUnit(FqUnit freqUnit) {
        this.freqUnit = freqUnit;
    }
    @Override
    public String toString() {
        return "Posology{" +
                "dose=" + dose +
                ", freq=" + freq +
                ", freqUnit=" + freqUnit +
                '}';
    }

    public static void main(String[] args) {
        Posology p1 = new Posology((float)1.1,(float)2.2,FqUnit.WEEK);
        System.out.println(p1);
    }
}
