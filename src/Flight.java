import java.util.Date;

public class Flight {
    private String MiejsceDocelowe;
    private String MiejsceWylotu;
    private Date DataWylotu;
    private String CzasTrwaniaLotu;
    private int LiczbaDostepnychMiejsc;

    public Flight(String miejsceDocelowe, String miejsceWylotu, Date dataWylotu, String czasTrwaniaLotu, int liczbaDostepnychMiejsc) {
        MiejsceDocelowe = miejsceDocelowe;
        MiejsceWylotu = miejsceWylotu;
        DataWylotu = dataWylotu;
        CzasTrwaniaLotu = czasTrwaniaLotu;
        LiczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }

    public String getMiejsceDocelowe() {
        return MiejsceDocelowe;
    }

    public void setMiejsceDocelowe(String miejsceDocelowe) {
        MiejsceDocelowe = miejsceDocelowe;
    }

    public String getMiejsceWylotu() {
        return MiejsceWylotu;
    }

    public void setMiejsceWylotu(String miejsceWylotu) {
        MiejsceWylotu = miejsceWylotu;
    }

    public Date getDataWylotu() {
        return DataWylotu;
    }

    public void setDataWylotu(Date dataWylotu) {
        DataWylotu = dataWylotu;
    }

    public String getCzasTrwaniaLotu() {
        return CzasTrwaniaLotu;
    }

    public void setCzasTrwaniaLotu(String czasTrwaniaLotu) {
        CzasTrwaniaLotu = czasTrwaniaLotu;
    }

    public int getLiczbaDostepnychMiejsc() {
        return LiczbaDostepnychMiejsc;
    }

    public void setLiczbaDostepnychMiejsc(int liczbaDostepnychMiejsc) {
        LiczbaDostepnychMiejsc = liczbaDostepnychMiejsc;
    }
}
