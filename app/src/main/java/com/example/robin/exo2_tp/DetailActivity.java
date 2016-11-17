package com.example.robin.exo2_tp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robin.exo2_tp.Case;
import com.example.robin.exo2_tp.R;


public class DetailActivity extends Activity {
    private static final String KEY_IMG_ID = "album_cover";
    private static final String KEY_NOM = "album_name";
    private static final String KEY_TEXT = "album_band";

    public static Intent newIntent(Case album, Context context){
        Intent i = new Intent(context, DetailActivity.class);
        i.putExtra(KEY_IMG_ID, album.getImage());
        i.putExtra(KEY_NOM, album.getText());
        i.putExtra(KEY_TEXT, album.getNom());
        return i;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.descro);
        Intent i = getIntent();
        if (!(i.hasExtra(KEY_IMG_ID)&&i.hasExtra(KEY_NOM)&&i.hasExtra(KEY_TEXT)))
            finish();
        int cover = i.getIntExtra(KEY_IMG_ID, 0);
        String name = i.getStringExtra(KEY_NOM);
        String band = i.getStringExtra(KEY_TEXT);

        ((ImageView) findViewById(R.id.img)).setImageResource(cover);
        ((TextView) findViewById(R.id.nom)).setText(name);
        ((TextView) findViewById(R.id.text)).setText(band);

    }
}