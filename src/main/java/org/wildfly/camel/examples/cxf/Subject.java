package org.wildfly.camel.examples.cxf;

import java.util.Date;

/**
 * Created by samuele on 4/27/15.
 */
public class Subject {

    private String codiceSoggetto;
    private String tipoSoggetto;
    private String codiceFiscale;
    private String denominazioneComune;
    private Date dataNascita;
    private String cognomeRagioneSociale;

    public String getCodiceSoggetto() {
        return codiceSoggetto;
    }

    public void setCodiceSoggetto(String codiceSoggetto) {
        this.codiceSoggetto = codiceSoggetto;
    }

    public String getTipoSoggetto() {
        return tipoSoggetto;
    }

    public void setTipoSoggetto(String tipoSoggetto) {
        this.tipoSoggetto = tipoSoggetto;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getDenominazioneComune() {
        return denominazioneComune;
    }

    public void setDenominazioneComune(String denominazioneComune) {
        this.denominazioneComune = denominazioneComune;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getCognomeRagioneSociale() {
        return cognomeRagioneSociale;
    }

    public void setCognomeRagioneSociale(String cognomeRagioneSociale) {
        this.cognomeRagioneSociale = cognomeRagioneSociale;
    }
}
