package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.graphics.Bitmap;

/**
 * Created by ulilalbab on 4/5/2015.
 */
public class Peserta {

    public String nama;
    public String angkatan;
    public String email;
    public String whatsapp = "085790999056";
    public String facebook = "wnulilalbab";
    public String bbm = "7F211E49";
    public String line = "ulilalbab99";
    public String instagram = "wnulilalbab";
    public String path = "Ulil Albab WN";
    public String twitter = "@uliilalbaab";
    public Bitmap foto;

    public Peserta(String nama, String angkatan, String email, Bitmap foto){
        this.nama = nama;
        this.angkatan = angkatan;
        this.email = email;
        this.foto = foto;
    }

    public Peserta(){}

}