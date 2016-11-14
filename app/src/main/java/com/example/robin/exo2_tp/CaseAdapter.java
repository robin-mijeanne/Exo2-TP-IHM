package com.example.robin.exo2_tp;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by robin on 14/11/16.
 */

public class CaseAdapter extends ArrayAdapter<Case> {

    //tweets est la liste des models à afficher
    public CaseAdapter(Context context, List<Case> mesCases) {
        super(context, 0, mesCases);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layoutperso,parent, false);
        }

        CaseViewHolder viewHolder = (CaseViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new CaseViewHolder();
            viewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            viewHolder.text = (TextView) convertView.findViewById(R.id.text);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Case maCase = getItem(position);

        //il ne reste plus qu'à remplir notre vue
        viewHolder.nom.setText(maCase.getNom());
        viewHolder.text.setText(maCase.getText());
        viewHolder.img.setImageResource(maCase.getImage());

        return convertView;
    }
}