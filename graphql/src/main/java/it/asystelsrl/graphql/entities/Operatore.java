package it.asystelsrl.graphql.entities;

import javax.persistence.*;

@Entity
@Table(name = "operatori")
public class Operatore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private int idOperatore;
    @Column(nullable = false)
    private String nomeOperatore;
    @Column(nullable = false)
    private String cognomeOperatore;
    /*private Date dataDiNascita;
    private String luogoNascita;
    private String citta;
    private String indirizzo;
    private int cap;
    private String provincia;
    private String nazionalita;
    private String codiceFiscale;*/
    @Column(nullable = false)
    private String codiceQualifica;
    /* private String telefono;
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
     //private motivoVisita;*/
    @Column(nullable = false)
    private int numeroCard;
   /* private String azienda;
    private String livelloInquadramento;
    private boolean operatoreEsterno;
    private Boolean inServizio;
    private String codiceGruppo;
    private int idCartaChip;
    private String codiceArea;
    private String codiceOperatore;
    private String tipoContratto;
    private String codiceExtra;*/

    public Operatore(String nomeOperatore, String cognomeOperatore, String codiceQualifica, int numeroCard) {
        this.nomeOperatore = nomeOperatore;
        this.cognomeOperatore = cognomeOperatore;
        this.codiceQualifica = codiceQualifica;
        this.numeroCard = numeroCard;
    }

    public Operatore() {
    }

    public int getIdOperatore() {
        return idOperatore;
    }

    public void setIdOperatore(int id) {
        this.idOperatore = id;
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

    public String getCodiceQualifica() {
        return codiceQualifica;
    }

    public void setCodiceQualifica(String codiceQualifica) {
        this.codiceQualifica = codiceQualifica;
    }

    public int getNumeroCard() {
        return numeroCard;
    }

    public void setNumeroCard(int numeroCard) {
        this.numeroCard = numeroCard;
    }
}
