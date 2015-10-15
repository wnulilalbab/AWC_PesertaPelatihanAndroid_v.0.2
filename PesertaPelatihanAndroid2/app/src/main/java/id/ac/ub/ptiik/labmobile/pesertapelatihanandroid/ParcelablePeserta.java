package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by ulilalbab on 4/6/2015.
 */
public class ParcelablePeserta implements Parcelable {

    private Peserta peserta;

    public Peserta getPeserta() {
        return peserta;
    }

    public ParcelablePeserta(Peserta peserta) {
        super();
        this.peserta = peserta;
    }

    private ParcelablePeserta(Parcel in) {
        peserta = new Peserta();
        peserta.nama= in.readString();
        peserta.angkatan = in.readString();
        peserta.email = in.readString();
        peserta.bbm = in.readString();
        peserta.line = in.readString();
        peserta.facebook = in.readString();
        peserta.twitter = in.readString();
        peserta.instagram = in.readString();
        peserta.path = in.readString();
        peserta.whatsapp = in.readString();
        peserta.foto = (Bitmap) in.readParcelable(Bitmap.class
                .getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(peserta.nama);
        parcel.writeString(peserta.angkatan);
        parcel.writeString(peserta.email);
        parcel.writeString(peserta.line);
        parcel.writeString(peserta.facebook);
        parcel.writeString(peserta.twitter);
        parcel.writeString(peserta.instagram);
        parcel.writeString(peserta.path);
        parcel.writeString(peserta.whatsapp);
        parcel.writeString(peserta.bbm);
        parcel.writeParcelable(peserta.foto,PARCELABLE_WRITE_RETURN_VALUE);
    }

    public static final Parcelable.Creator<ParcelablePeserta> CREATOR =
            new Parcelable.Creator<ParcelablePeserta>() {
                public ParcelablePeserta createFromParcel(Parcel in) {
                    return new ParcelablePeserta(in);
                }

                public ParcelablePeserta[] newArray(int size) {
                    return new ParcelablePeserta[size];
                }
            };
}
