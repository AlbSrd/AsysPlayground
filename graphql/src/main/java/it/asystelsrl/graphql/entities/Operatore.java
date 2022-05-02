package it.asystelsrl.graphql.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "operatori")
public class Operatore {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String nomeOperatore;
    @Column(nullable = false)
    private String cognomeOperatore;
    private Date dataDiNascita;
    private String luogoNascita;
    private String citta;
    private String indirizzo;
    private int cap;
    private String provincia;
    private String nazionalita;
    private String codiceFiscale;
    @Column(nullable = false)
    private String codiceQualifica;
    private String telefono;
    private String cellulare;
    private String email;
    private String codiceTitoloStudio;
    private Date dataAssunzione;
    private Date dataCessazione;
    private String codiceSoggetto;
    private String qualificaOperatoreEsterno;
    private boolean cardBloccata;
    //private fotoOperatore;
    private Date dataScadenzaCard;
    private String etichettaCard;
    //private datiOperatore;
    //private motivoVisita;
    @Column(nullable = false)
    private int numeroCard;
    private String azienda;
    private String livelloInquadramento;
    private boolean operatoreEsterno;
    private Boolean inServizio;
    private String codiceGruppo;
    private int idCartaChip;
    private String codiceArea;
    private String codiceOperatore;
    private String tipoContratto;
    private String codiceExtra;

    public Operatore(String nomeOperatore, String cognomeOperatore, String codiceQualifica, int numeroCard) {
        this.nomeOperatore = nomeOperatore;
        this.cognomeOperatore = cognomeOperatore;
        this.codiceQualifica = codiceQualifica;
        this.numeroCard = numeroCard;
    }

    public Operatore() {
    }

    public String getNomeOperatore() {
        return nomeOperatore;
    }

    public void setNomeOperatore(String nomeOperatore) {
        this.nomeOperatore = nomeOperatore;
    }

    public String getCognomeOperatore() {
        return cognomeOperatore;
    }

    public void setCognomeOperatore(String cognomeOperatore) {
        this.cognomeOperatore = cognomeOperatore;
    }

    public Date getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(Date dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    public String getCodiceQualifica() {
        return codiceQualifica;
    }

    public void setCodiceQualifica(String codiceQualifica) {
        this.codiceQualifica = codiceQualifica;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCellulare() {
        return cellulare;
    }

    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCodiceTitoloStudio() {
        return codiceTitoloStudio;
    }

    public void setCodiceTitoloStudio(String codiceTitoloStudio) {
        this.codiceTitoloStudio = codiceTitoloStudio;
    }

    public Date getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(Date dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Date getDataCessazione() {
        return dataCessazione;
    }

    public void setDataCessazione(Date dataCessazione) {
        this.dataCessazione = dataCessazione;
    }

    public String getCodiceSoggetto() {
        return codiceSoggetto;
    }

    public void setCodiceSoggetto(String codiceSoggetto) {
        this.codiceSoggetto = codiceSoggetto;
    }

    public String getQualificaOperatoreEsterno() {
        return qualificaOperatoreEsterno;
    }

    public void setQualificaOperatoreEsterno(String qualificaOperatoreEsterno) {
        this.qualificaOperatoreEsterno = qualificaOperatoreEsterno;
    }

    public boolean isCardBloccata() {
        return cardBloccata;
    }

    public void setCardBloccata(boolean cardBloccata) {
        this.cardBloccata = cardBloccata;
    }

    public Date getDataScadenzaCard() {
        return dataScadenzaCard;
    }

    public void setDataScadenzaCard(Date dataScadenzaCard) {
        this.dataScadenzaCard = dataScadenzaCard;
    }

    public String getEtichettaCard() {
        return etichettaCard;
    }

    public void setEtichettaCard(String etichettaCard) {
        this.etichettaCard = etichettaCard;
    }

    public int getNumeroCard() {
        return numeroCard;
    }

    public void setNumeroCard(int numeroCard) {
        this.numeroCard = numeroCard;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public String getLivelloInquadramento() {
        return livelloInquadramento;
    }

    public void setLivelloInquadramento(String livelloInquadramento) {
        this.livelloInquadramento = livelloInquadramento;
    }

    public boolean isOperatoreEsterno() {
        return operatoreEsterno;
    }

    public void setOperatoreEsterno(boolean operatoreEsterno) {
        this.operatoreEsterno = operatoreEsterno;
    }

    public Boolean getInServizio() {
        return inServizio;
    }

    public void setInServizio(Boolean inServizio) {
        this.inServizio = inServizio;
    }

    public String getCodiceGruppo() {
        return codiceGruppo;
    }

    public void setCodiceGruppo(String codiceGruppo) {
        this.codiceGruppo = codiceGruppo;
    }

    public int getIdCartaChip() {
        return idCartaChip;
    }

    public void setIdCartaChip(int idCartaChip) {
        this.idCartaChip = idCartaChip;
    }

    public String getCodiceArea() {
        return codiceArea;
    }

    public void setCodiceArea(String codiceArea) {
        this.codiceArea = codiceArea;
    }

    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    public void setCodiceOperatore(String codiceOperatore) {
        this.codiceOperatore = codiceOperatore;
    }

    public String getTipoContratto() {
        return tipoContratto;
    }

    public void setTipoContratto(String tipoContratto) {
        this.tipoContratto = tipoContratto;
    }

    public String getCodiceExtra() {
        return codiceExtra;
    }

    public void setCodiceExtra(String codiceExtra) {
        this.codiceExtra = codiceExtra;
    }
}
