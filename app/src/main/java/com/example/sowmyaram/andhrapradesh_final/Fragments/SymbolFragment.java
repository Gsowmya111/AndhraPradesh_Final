package com.example.sowmyaram.andhrapradesh_final.Fragments;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sowmyaram.andhrapradesh_final.R;
public class SymbolFragment extends Fragment {
    public static final String EXTRA_POSITION = "position";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView = (RecyclerView) inflater.inflate(
                R.layout.recycler_view, container, false);
        ContentAdapter adapter = new ContentAdapter(recyclerView.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        // Set padding for Tiles
        int tilePadding = getResources().getDimensionPixelSize(R.dimen.tile_padding);
        recyclerView.setPadding(tilePadding, tilePadding, tilePadding, tilePadding);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        return recyclerView;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public Integer[] images={R.drawable.kuchipudi,R.drawable.blackbuck,R.drawable.lily,R.drawable.r,
                R.drawable.mangoos,  R.drawable.nemtre,  R.drawable.kabadi,  R.drawable.riv};

        public String[] content_tv={"Kuchipudi is the state dance of AndhraPradesh.It derives its name from the village of Kuchelapuram, in Andhra Pradesh, India. As a classical form of dance, drama and music Kuchipudi enjoys a unique place among the Indian classical idioms.  ",
                "Black Buck is the state animal of AndhraPradesh.They are commonly found in Punjab, Rajasthan, Haryana, Gujrat, and parts of Central India. They live in open plains, grass lands, dry thorn and scrub lands.They are are herbivorous. Lifespan of the Black Buck is about 16 years.",
                "Water lily is the state flower of AndhraPradesh.This mysterious beauty rises from the deep, leaves floating serenely on the surface, exquisite blossoms appearing as if by magic. Once the province of grand palaces and public gardens, the water lily is finding its way to the home garden.",
                "Indian roller is the state bird of AndhraPradesh.It is found in the foot hills of the Himalayas, Southern India and Western India.It is omnivorous.The longevity of Indian Roller exceeds up to 17 years of age.",
                "Mango is the state Fruit of AndhraPradesh.It is one of the most popular fruit in the World.A mango tree can grow as tall as 100 feet.The bark, leaves, skin and pit of the mango have been used in folk remedies for centuries",
                "Neem Tree is the state Tree of AndhraPradesh.It is also known as the' village pharmacy'.Part of the Neem tree can be used as a spermicide .",
                "Kabadi is the state sport of AndhraPradesh.It is a contact sport that originated in ancient India..It is one of the most popular sports in India, played mainly among people in villages.India won the Kabaddi World Championship in 2007, beating Iran 29-19",
               };

        View alertLayout;
            public ImageView picture;
            public TextView name;
        public ViewHolder(LayoutInflater inflater, ViewGroup parent) {
                super(inflater.inflate(R.layout.items_title, parent, false));
                picture = (ImageView) itemView.findViewById(R.id.tile_picture);
                name = (TextView) itemView.findViewById(R.id.tile_title);



            itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(v.getContext());
                        LayoutInflater factory = LayoutInflater.from(v.getContext());
                        final View view = factory.inflate(R.layout.popup_symbols, null);
                        ImageView img = (ImageView) view.findViewById(R.id.imagepop);
                        TextView tv = (TextView) view.findViewById(R.id.pop_text);
                        alertDialog.setView(view);
                        int i = getAdapterPosition();
                      //  titles = v.getResources().getStringArray(R.array.symbols_images);
                        img.setImageResource((images[i]));
                        tv.setText(content_tv[i]);
                        alertDialog.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                      //  alertDialog.show();
                        AlertDialog alert = alertDialog.create();
                        alert.show();
                      //  alert.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
                        int width = (int) (getResources().getDisplayMetrics().widthPixels * 0.80);
                        int height = (int) (getResources().getDisplayMetrics().heightPixels * 0.50);



                        alert.getWindow().setLayout(width, height);
                        alert.show();
                    }
                });
            }
    }

    /**
     * Adapter to display recycler view.
     */
    public class ContentAdapter extends RecyclerView.Adapter<ViewHolder> {
        // Set numbers of Tiles in RecyclerView.
        private  String[] mPlaces;
        private  String[] mPlaceDesc;
        private  Drawable[] mPlacePictures;
        public ContentAdapter(Context context) {
            Resources resources = context.getResources();


                mPlaces = resources.getStringArray(R.array.symbols_desc_names);
                TypedArray a = resources.obtainTypedArray(R.array.symbols_images);
                mPlacePictures = new Drawable[a.length()];
                for (int i = 0; i < mPlacePictures.length; i++) {
                    mPlacePictures[i] = a.getDrawable(i);
                }
                a.recycle();
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new ViewHolder(LayoutInflater.from(parent.getContext()), parent);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.picture.setImageDrawable(mPlacePictures[position % mPlacePictures.length]);
            //    holder.description.setText(mPlaceDesc[position % mPlaceDesc.length]);
            holder.name.setText(mPlaces[position % mPlaces.length]);
        }

        @Override
        public int getItemCount() {
            return mPlacePictures.length;
        }
    }
}