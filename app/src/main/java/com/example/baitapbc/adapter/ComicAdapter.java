package com.example.baitapbc.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import com.example.baitapbc.Comic;
import com.example.baitapbc.DetailComicActivity;
import com.example.baitapbc.R;


public class ComicAdapter<webView> extends ArrayAdapter<Comic> {
    private Context context;
    private ArrayList<Comic> comics;
    public ComicAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Comic> objects) {
        super(context, resource, objects);
        this.comics = objects;
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.comic_item, parent, false);

        }

        TextView textViewName = convertView.findViewById(R.id.textview_name);
        textViewName.setText(comics.get(position).getName());
        TextView textViewDesc = convertView.findViewById(R.id.textview_desc);
        textViewDesc.setText(comics.get(position).getDesc());
        ImageView imageViewPhoto = convertView.findViewById(R.id.imageview_photo);
        Picasso.with(context).load(comics.get(position).getUrlImage()).into(imageViewPhoto);

        final View finalConvertView = convertView;
        convertView.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {

                switch (position){
                    case 0:
                        Intent intent = new Intent(context, DetailComicActivity.class);
                        intent.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(context, DetailComicActivity.class);
                        intent1.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent1.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent1.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, DetailComicActivity.class);
                        intent2.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent2.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent2.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(context, DetailComicActivity.class);
                        intent3.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent3.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent3.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(context, DetailComicActivity.class);
                        intent4.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent4.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent4.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(context, DetailComicActivity.class);
                        intent5.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent5.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent5.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(context, DetailComicActivity.class);
                        intent6.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent6.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent6.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(context, DetailComicActivity.class);
                        intent7.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent7.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent7.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(context, DetailComicActivity.class);
                        intent8.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent8.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent8.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(context, DetailComicActivity.class);
                        intent9.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent9.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent9.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(context, DetailComicActivity.class);
                        intent10.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent10.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent10.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(context, DetailComicActivity.class);
                        intent11.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent11.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent11.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(context, DetailComicActivity.class);
                        intent12.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent12.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent12.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(context, DetailComicActivity.class);
                        intent13.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent13.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent13.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(context, DetailComicActivity.class);
                        intent14.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent14.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent14.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(context, DetailComicActivity.class);
                        intent15.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent15.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent15.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(context, DetailComicActivity.class);
                        intent16.putExtra("LINK_URL_COMIC", comics.get(position).getUrl());
                        intent16.putExtra("NAME_COMIC", comics.get(position).getName());
                        intent16.putExtra("URL_IMAGE_COMIC", comics.get(position).getUrlImage());
                        context.startActivity(intent16);
                        break;

                }

            }
        });

        return convertView;
    }
}
