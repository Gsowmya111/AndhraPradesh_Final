package com.example.sowmyaram.andhrapradesh_final.Fragments;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sowmyaram.andhrapradesh_final.DetailedActivity;
import com.example.sowmyaram.andhrapradesh_final.R;

import static com.example.sowmyaram.andhrapradesh_final.MainActivity.Placename;


public class CardFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return recyclerView;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView picture;
        public TextView name;
        public TextView description;
        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.items_card, parent, false));
            picture = (ImageView) itemView.findViewById(R.id.card_image);
            name = (TextView) itemView.findViewById(R.id.card_title);
            description = (TextView) itemView.findViewById(R.id.card_text);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Context context = v.getContext();
                    Intent intent = new Intent(context, DetailedActivity.class);
                    intent.putExtra(DetailedActivity.EXTRA_POSITION, getAdapterPosition());
                    context.startActivity(intent);
                }
            });
        }
    }

    /**
     * Adapter to display recycler view.
     */
    public static class ContentAdapter extends RecyclerView.Adapter<ViewHolder> {

        String[] mPlaces;
        String[] mPlaceDesc;
        Drawable[] mPlacePictures;


        public ContentAdapter(Context context) {
            Resources resources = context.getResources();
            if (Placename.equals("Anantapur")) {
                mPlaces = resources.getStringArray(R.array.places_anantapur_collapsingbar_title);
                mPlaceDesc = resources.getStringArray(R.array.place_details_Anatpur);
                TypedArray anata = resources.obtainTypedArray(R.array.places_Anantapur_images);
                mPlacePictures = new Drawable[anata.length()];
                //
                for (int i = 0; i < mPlacePictures.length; i++) {
                    mPlacePictures[i] = anata.getDrawable(i);
                }
                anata.recycle();
            }

            switch (Placename) {
                case "Chittor":
                    mPlaces = resources.getStringArray(R.array.places_chittor_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_chittor);
                    TypedArray chitor = resources.obtainTypedArray(R.array.places_Chittoor_images);
                    mPlacePictures = new Drawable[chitor.length()];
                    //
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = chitor.getDrawable(i);
                    }
                    chitor.recycle();
                    break;
                case "Guntur": {
                    mPlaces = resources.getStringArray(R.array.places_guntur_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_guntur);
                    TypedArray a = resources.obtainTypedArray(R.array.places_Guntur_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "East Godavari": {
                    mPlaces = resources.getStringArray(R.array.places_east_godavari_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_East);
                    TypedArray a = resources.obtainTypedArray(R.array.places_EastGodavari);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Cuddapah": {
                    mPlaces = resources.getStringArray(R.array.places_cudapah_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_cudapah);
                    TypedArray a = resources.obtainTypedArray(R.array.places_Cuddapah_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Krishna": {
                    mPlaces = resources.getStringArray(R.array.places_krishna_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_krishna);
                    TypedArray a = resources.obtainTypedArray(R.array.places_Krishna_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Prakasam": {
                    mPlaces = resources.getStringArray(R.array.places_prakasam_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_prakasam);
                    TypedArray a = resources.obtainTypedArray(R.array.places_Prakasam_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Nellore": {
                    mPlaces = resources.getStringArray(R.array.places_nellore_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_nelore);
                    TypedArray a = resources.obtainTypedArray(R.array.places_nellore_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Vishakhapatnam": {
                    mPlaces = resources.getStringArray(R.array.places_vizag_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_vizag);
                    TypedArray a = resources.obtainTypedArray(R.array.places_vishaka_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Vizianagarm": {
                    mPlaces = resources.getStringArray(R.array.places_vizinagarm_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_viziyanagaram);
                    TypedArray a = resources.obtainTypedArray(R.array.places_viziya_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "West Godavari": {
                    mPlaces = resources.getStringArray(R.array.places_westgodavari_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_WG);
                    TypedArray a = resources.obtainTypedArray(R.array.places_WG_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Kurnool": {
                    mPlaces = resources.getStringArray(R.array.places_kurnool_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_kurnol);
                    TypedArray a = resources.obtainTypedArray(R.array.places_kurnol_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
                case "Srikakulam": {
                    mPlaces = resources.getStringArray(R.array.places_srikakulam_collapsingbar_title);
                    mPlaceDesc = resources.getStringArray(R.array.place_details_srikakulam);
                    TypedArray a = resources.obtainTypedArray(R.array.places_srikakulam_images);
                    mPlacePictures = new Drawable[a.length()];
                    for (int i = 0; i < mPlacePictures.length; i++) {
                        mPlacePictures[i] = a.getDrawable(i);
                    }
                    a.recycle();
                    break;
                }
            }



        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
            holder.name.setText(mPlaces[position % mPlaces.length]);
            holder.description.setText(mPlaceDesc[position % mPlaceDesc.length]);
        }

        @Override
        public int getItemCount() {
            return mPlaces.length;
        }
    }
}
