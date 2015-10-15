package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class DetailPeserta extends ActionBarActivity implements View.OnClickListener {

    Peserta peserta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_peserta);

        //identification
        ImageView foto = (ImageView) findViewById(R.id.foto1);
        TextView nama = (TextView) findViewById(R.id.nama);
        TextView angkatan = (TextView) findViewById(R.id.angkatan);
        TextView email = (TextView) findViewById(R.id.email);
        TextView facebook = (TextView) findViewById(R.id.facebook);
        TextView instagram = (TextView) findViewById(R.id.instagram);
        TextView twitter = (TextView) findViewById(R.id.twitter);
        TextView path = (TextView) findViewById(R.id.path);
        TextView line = (TextView) findViewById(R.id.line);
        TextView bbm = (TextView) findViewById(R.id.bbm);
        TextView whatsapp = (TextView) findViewById(R.id.whatsapp);

        //get intent Object Parcelable
        Intent intent = getIntent();
        ParcelablePeserta parcelablePeserta = (ParcelablePeserta) intent
                .getParcelableExtra("peserta");
        peserta = parcelablePeserta.getPeserta();

        //modify Ui
        nama.setText(peserta.nama);
        angkatan.setText(peserta.angkatan);
        facebook.setText(peserta.facebook);
        instagram.setText(peserta.instagram);
        twitter.setText(peserta.twitter);
        path.setText(peserta.path);
        line.setText(peserta.line);
        bbm.setText(peserta.bbm);
        whatsapp.setText(peserta.whatsapp);
        email.setText(peserta.email);
        foto.setImageBitmap(peserta.foto);

        //inisialisai LinearLayout sebagai tombol
        LinearLayout btn_email = (LinearLayout) findViewById(R.id.btn_email);
        btn_email.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "hulala", Toast.LENGTH_LONG).show();
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{peserta.email});
        i.putExtra(Intent.EXTRA_SUBJECT, "Percobaan");
        i.putExtra(Intent.EXTRA_TEXT   , "Email ini hanya percobaan menggunakan intent!! :D");
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(getApplicationContext(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
}
