package csv;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ";")
public class resultats {
    @DataField(pos = 1)
    private String idmesa;
    @DataField(pos = 2)
    private String codimesa;
    @DataField(pos = 3)
    private String mesatancada;
    @DataField(pos = 4)
    private String comarca;
    @DataField(pos = 5)
    private String vnuls;
    @DataField(pos = 6)
    private String vblancs;
    @DataField(pos = 7)
    private String verc;
    @DataField(pos = 8)
    private String vjxc;
    @DataField(pos = 9)
    private String vcup;
    @DataField(pos = 10)
    private String vpsc;
    @DataField(pos = 11)
    private String vcs;
    @DataField(pos = 12)
    private String vppc;
    @DataField(pos = 13)
    private String vcom;
    @DataField(pos = 14)
    private String vpacma;
    @DataField(pos = 15)
    private String vdialeg;
    @DataField(pos = 16)
    private String vpumjust;
    @DataField(pos = 17)
    private String vrecortes;
    @DataField(pos = 18)
    private String vfamilia;
    @DataField(pos = 19)
    private String vdn;
    @DataField(pos = 20)
    private String vpfiv;
    @DataField(pos = 21)
    private String vconver;
    @DataField(pos = 22)
    private String vunidos;
    @DataField(pos = 23)
    private String vcilus;
    @DataField(pos = 24)
    private String cens;
    @DataField(pos = 25)
    private String acta;
    @DataField(pos = 26)
    private String hihavots;
    @DataField(pos = 27)
    private String hihaacta;
    @DataField(pos = 28)
    private String origen;
    @DataField(pos = 29)
    private String datetime;
    @DataField(pos = 30)
    private String user;



    public String getidmesa() {
        return idmesa;
    }

    public void setidmesa(String idmesa) {
        this.idmesa = idmesa;
    }

    public String getcodimesa() {
        return codimesa;
    }

    public void setcodimesa(String codimesa) {
        this.codimesa = codimesa;
    }

    public String getmesatancada() {
        return mesatancada;
    }

    public void setmesatancada(String mesatancada) {
        this.mesatancada = mesatancada;
    }

    public String getcomarca() {
        return comarca;
    }

    public void setcomarca(String comarca) {
        this.comarca = comarca;
    }

    public String getvnuls() {
        return vnuls;
    }

    public void setvnuls(String vnuls) {
        this.vnuls = vnuls;
    }

    public String getvblancs() {
        return vblancs;
    }

    public void setvblancs(String vblancs) {
        this.vblancs = vblancs;
    }

    public String getverc() {
        return verc;
    }

    public void setverc(String verc) {
        this.verc = verc;
    }

    public String getvjxc() {
        return vjxc;
    }

    public void setvjxc(String vjxc) {
        this.vjxc = vjxc;
    }

    public String getvcup() {
        return vcup;
    }

    public void setvcup(String vcup) {
        this.vcup = vcup;
    }

    public String getvpsc() {
        return vpsc;
    }

    public void setvpsc(String vpsc) {
        this.vpsc = vpsc;
    }

    public String getvcs() {
        return vcs;
    }

    public void setvcs(String vcs) {
        this.vcs = vcs;
    }

    public String getvppc() {
        return vppc;
    }

    public void setvppc(String vppc) {
        this.vppc = vppc;
    }

    public String getvcom() {
        return vcom;
    }

    public void setvcom(String vcom) {
        this.vcom = vcom;
    }

    public String getvpacma() {
        return vpacma;
    }

    public void setvpacma(String vpacma) {
        this.vpacma = vpacma;
    }

    public String getvdialeg() {
        return vdialeg;
    }

    public void setvdialeg(String vdialeg) {
        this.vdialeg = vdialeg;
    }

    public String getvpumjust() {
        return vpumjust;
    }

    public void setvpumjust(String vpumjust) {
        this.vpumjust = vpumjust;
    }

    public String getvrecortes() {
        return vrecortes;
    }

    public void setvrecortes(String vrecortes) {
        this.vrecortes = vrecortes;
    }

    public String getvfamilia() {
        return vfamilia;
    }

    public void setvfamilia(String vfamilia) {
        this.vfamilia = vfamilia;
    }

    public String getvdn() {
        return vdn;
    }

    public void setvdn(String vdn) {
        this.vdn = vdn;
    }

    public String getvpfiv() {
        return vpfiv;
    }

    public void setvpfiv(String vpfiv) {
        this.vpfiv = vpfiv;
    }

    public String getvconver() {
        return vconver;
    }

    public void setvconver(String vconver) {
        this.vconver = vconver;
    }

    public String getvunidos() {
        return vunidos;
    }

    public void setvunidos(String vunidos) {
        this.vunidos = vunidos;
    }

    public String getvcilus() {
        return vcilus;
    }

    public void setvcilus(String vcilus) {
        this.vcilus = vcilus;
    }

    public String getcens() {
        return cens;
    }

    public void setcens(String cens) {
        this.cens = cens;
    }

    public String getacta() {
        return acta;
    }

    public void setacta(String acta) {
        this.acta = acta;
    }

    public String gethihavots() {
        return hihavots;
    }

    public void sethihavots(String hihavots) {
        this.hihavots = hihavots;
    }

    public String gethihaacta() {
        return hihaacta;
    }

    public void sethihaacta(String hihaacta) {
        this.hihaacta = hihaacta;
    }

    public String getorigen() {
        return origen;
    }

    public void setorigen(String origen) {
        this.origen = origen;
    }

    public String getdatetime() {
        return datetime;
    }

    public void setdatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getuser() {
        return user;
    }

    public void setuser(String user) {
        this.user = user;
    }
}
