package br.com.etecia.appbirpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import br.com.etecia.appbirpo.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFavorito:
                Toast.makeText(getApplicationContext(), "Click em favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mLocal:
                Toast.makeText(getApplicationContext(), "Click em local", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mRecentes:
                Toast.makeText(getApplicationContext(), "Click em recentes", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}