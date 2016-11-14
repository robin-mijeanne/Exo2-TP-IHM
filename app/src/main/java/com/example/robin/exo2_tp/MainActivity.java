package com.example.robin.exo2_tp;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] noms_onglets= new String[] {"ABC", "DEF", "GHI"};

    ListView myListView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        myListView= (ListView) findViewById(R.id.list);
        List<Case> mesCases= genererCases();
        CaseAdapter adapter= new CaseAdapter(MainActivity.this, mesCases);
        myListView.setAdapter(adapter);
       /* View cellule = ...; //nous verrons plus tard comment la générer

        CaseViewHolder viewHolder = (CaseViewHolder) cellule.getTag();
        //comme nos vues sont réutilisées, notre cellule possède déjà un ViewHolder
        if(viewHolder == null) {
            //si elle n'avait pas encore de ViewHolder
            viewHolder = new CaseViewHolder();

            //récupérer nos sous vues
            viewHolder.pseudo = (TextView) cellule.findViewById(R.id.pseudo);
            viewHolder.text = (TextView) cellule.findViewById(R.id.text);
            viewHolder.avatar = (ImageView) cellule.findViewById(R.id.avatar);

            //puis on sauvegarde le mini-controlleur dans la vue
            cellule.setTag(viewHolder);
        }
        ListView listview= (ListView) findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, noms_onglets);

        listview.setAdapter(adapter);*/
    }

    private List<Case> genererCases()
    {
        List<Case> cases= new ArrayList<Case>();

        cases.add(new Case(Color.BLACK, "Nom1", "commentaire nom 1"));
        cases.add(new Case(Color.BLUE, "Nom2", "commentaire nom 2"));

        return cases;
    }
}
