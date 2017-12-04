package csv;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ";")
public class Resultats {
    @DataField(pos = 1)
    private String Candidatura;
    @DataField(pos = 2)
    private String Resultat;

    public String getCandidatura() {
        return Candidatura;
    }

    public void setCandidatura(String Candidatura) {
        this.Candidatura = Candidatura;
    }

    public String getResultat() {
        return Resultat;
    }

    public void setResultat(String Resultat) {
        this.Resultat = Resultat;
    }
}
