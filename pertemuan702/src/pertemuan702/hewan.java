package pertemuan702;

/**
 *
 * @author arlyadewi
 * tgl 08 mei 2025
 */
public class hewan {
    private String nama = "";
    private String suara;
    
    protected void setnama(String nm){
        this.nama = nm;
    }
    public String getnama(){
        return this.nama;
    }
    public void setsuara (String su){
        this.suara = su;
    }
    public String getsuara(){
        return this.suara;
    }
}
