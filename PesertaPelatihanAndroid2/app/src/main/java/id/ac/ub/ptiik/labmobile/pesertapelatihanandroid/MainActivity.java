package id.ac.ub.ptiik.labmobile.pesertapelatihanandroid;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.ArrayList;


public class MainActivity extends ActionBarActivity implements AdapterView.OnItemClickListener {
    Activity activity;
    //Peserta peserta = new Peserta();
    ArrayList<Peserta> newListPeserta = new ArrayList<Peserta>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = this;
        setContentView(R.layout.activity_main);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.user1);
        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.user2);
        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.user3);
        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.user4);

        newListPeserta.add(new Peserta("Jonie Sowinski","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Joana Dunnington","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Lashaunda Seagraves","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Jenny Fulmore","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Lidia Esslinger","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Sarai Diblasi","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Janine Francia","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Lesha Brownlow","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Bobby Gravley","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Miquel Alsup","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Casie Koller","2011","wnulilalbab@gmail.com",bitmap3));
        newListPeserta.add(new Peserta("Cammie Swoope","2011","wnulilalbab@gmail.com",bitmap1));
        newListPeserta.add(new Peserta("Jeramy Bookout","2011","wnulilalbab@gmail.com",bitmap2));
        newListPeserta.add(new Peserta("Steffanie Student","2011","wnulilalbab@gmail.com",bitmap4));
        newListPeserta.add(new Peserta("Tajuana Barcomb","2011","wnulilalbab@gmail.com",bitmap1));

        ListView listPeserta = (ListView) findViewById(R.id.listView);

        PesertaAdapter adapter = new PesertaAdapter(this, newListPeserta);
        listPeserta.setAdapter(adapter);
        listPeserta.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Peserta peserta = newListPeserta.get(position);

        Intent intent = new Intent(getApplicationContext(), DetailPeserta.class);
        ParcelablePeserta parcelablePeserta = new ParcelablePeserta(peserta);
        intent.putExtra("peserta", parcelablePeserta);
        startActivity(intent);
    }
}
