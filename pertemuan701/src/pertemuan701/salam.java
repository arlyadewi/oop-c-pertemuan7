package pertemuan701;

/**
 *
 * @author arlyadewi
 * tgl 8 mei 2025
 * class overloading
 */
public class salam {
    String tx = "menggunakan method tulissalam tanpa parameter";
    
    public void tulissalam(){
        System.out.println(tx);
    }
    public void tulissalam(String txt){
        System.out.println(txt);
    }
    public void tulissalam(int txt){
        System.out.println(txt);
    }
}
