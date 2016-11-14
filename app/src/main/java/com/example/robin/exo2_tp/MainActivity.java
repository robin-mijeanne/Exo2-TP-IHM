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

    }

    private List<Case> genererCases()
    {
        List<Case> cases= new ArrayList<Case>();

        cases.add(new Case(R.drawable.yvettehorner, "Yvette Horner", "J\'adrore l\'accordeon"));
        cases.add(new Case(R.drawable.didiersuper, "Didier Super", "BouleyLand"));
        cases.add(new Case(R.drawable.jeanpaulandre, "Jean Paul Andre", "Golfech magazine"));
        cases.add(new Case(R.drawable.mlp, "M.L.P", "BrownieLand"));

        return cases;
        
    }
}
