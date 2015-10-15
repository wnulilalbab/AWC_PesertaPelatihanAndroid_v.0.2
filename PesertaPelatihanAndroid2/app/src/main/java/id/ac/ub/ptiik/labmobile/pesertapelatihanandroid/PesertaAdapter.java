package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ulilalbab on 4/5/2015.
 */
public class PesertaAdapter extends ArrayAdapter<Peserta> {

    public Context context;
    public ArrayList<Peserta> listPeserta = null;

    public PesertaAdapter(Context context, ArrayList<Peserta> listPeserta) {
        super(context, R.layout.item_peserta, listPeserta);
        this.context = context;
        this.listPeserta = listPeserta;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.item_peserta, parent, false);
        TextView nama = (TextView) rowView.findViewById(R.id.namaPeserta);
        TextView angkatan = (TextView) rowView.findViewById(R.id.angkatan);
        TextView email = (TextView) rowView.findViewById(R.id.email);
        nama.setText(listPeserta.get(position).nama);
        angkatan.setText(listPeserta.get(position).angkatan);
        email.setText(listPeserta.get(position).email);

        ImageView foto = (ImageView) rowView.findViewById(R.id.foto);
        foto.setImageBitmap(listPeserta.get(position).foto);

        return rowView;
    }
}
