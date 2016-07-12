package re.dnl.restful_losungen;

public class Losung {

    private final String Datum;
    private final String Wtag;
    private final String Sonntag;
    private final String Losungstext;
    private final String Losungsvers;
    private final String Lehrtext;
    private final String Lehrtextvers;
    private final String copyright = "Copyright: Evangelische Brüder-Unität – Herrnhuter Brüdergemeine; Webseite: " +
            "www.herrnhuter.de; Weitere Informationen finden Sie hier: www.losungen.de";
    private String dankbarkeit = "Wenn Sie dankbar für diesen Dienst sind, dann helfen Sie mit Waisenkindern in der " +
            "Elfenbeinküste eine sichere Heimat und eine liebevolle Erziehung zu geben und überweisen Sie einen " +
            "kleinen Betrag an DIV-Kinder e.V. (www.div-kinder.de) Diese Meldung, sowie die Organisation DIV-Kinder " +
            "hat keinen Bezug zu der Evangelischen Brüder-Unität oder der Herrnhuter Brüdergemeine.";

    protected Losung(String datum, String wtag, String sonntag, String losungstext, String losungsvers, String lehrtext, String lehrtextvers) {
        Datum = datum;
        Wtag = wtag;
        Sonntag = sonntag;
        Losungstext = losungstext;
        Losungsvers = losungsvers;
        Lehrtext = lehrtext;
        Lehrtextvers = lehrtextvers;
    }

    public void printLosung(){
        System.out.println(Datum);
        System.out.println(Wtag);
        System.out.println(Sonntag);
        System.out.println(Losungstext);
        System.out.println(Losungsvers);
        System.out.println(Lehrtext);
        System.out.println(Lehrtextvers);
        System.out.println(copyright);
        System.out.println(dankbarkeit);
    }

    public String getDatum() {
        return Datum;
    }

    public String getWtag() {
        return Wtag;
    }

    public String getSonntag() {
        return Sonntag;
    }

    public String getLosungstext() {
        return Losungstext;
    }

    public String getLosungsvers() {
        return Losungsvers;
    }

    public String getLehrtext() {
        return Lehrtext;
    }

    public String getLehrtextvers() {
        return Lehrtextvers;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getDankbarkeit() {
        return dankbarkeit;
    }
}