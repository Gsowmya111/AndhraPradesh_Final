package com.example.sowmyaram.andhrapradesh_final;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.sowmyaram.andhrapradesh_final.MainActivity.Placename;

public class DetailedActivity extends AppCompatActivity {
    public static final String EXTRA_POSITION = "position";
    int postion;
    String[] placebestime;
    String[] places;
    String[] placeDetails;
    String[] placeLocations;
    TypedArray placePictures;
  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView maps = (TextView) findViewById(R.id.map_direction);
        TextView placeDetail = (TextView) findViewById(R.id.place_detail);
        TextView placeLocation = (TextView) findViewById(R.id.place_location);
        TextView placebestimes = (TextView) findViewById(R.id.place_besttime);
        ImageView placePicutre = (ImageView) findViewById(R.id.image);
        // Set Collapsing Toolbar layout to the screen
        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        // Set mapdirection

        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   Intent i = new
                        Intent(android.content.Intent.ACTION_VIEW,
                        Uri.parse("geo:37.827500,-122.481670"));
                startActivity(i);

            }
        });

        postion = getIntent().getIntExtra(EXTRA_POSITION, 0);
        Resources resources = getResources();

      switch (Placename) {
          case "Anantapur":

              places = resources.getStringArray(R.array.places_anantapur_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_Anatpur);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_Anatapur);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_Anatapur);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_Anantapur_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Chittor":
              places = resources.getStringArray(R.array.places_chittor_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_chittor);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_chittore);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_chittore);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_Chittoor_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "East Godavari":
              places = resources.getStringArray(R.array.places_east_godavari_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_East);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_east);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_eastgodavari);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_EastGodavari);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Guntur": {
              places = resources.getStringArray(R.array.places_guntur_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_guntur);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_guntur);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_guntur);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              TypedArray placePictures = resources.obtainTypedArray(R.array.places_Guntur_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          }
          case "Cuddapah":
              places = resources.getStringArray(R.array.places_cudapah_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_cudapah);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_cudapah);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_cudapah);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_Cuddapah_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Kurnool": {
              places = resources.getStringArray(R.array.places_kurnool_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_kurnol);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_kurnol);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_kurnol);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              TypedArray placePictures = resources.obtainTypedArray(R.array.places_kurnol_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          }
          case "Nellore": {
              places = resources.getStringArray(R.array.places_nellore_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_nelore);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_nelore);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_nelore);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              TypedArray placePictures = resources.obtainTypedArray(R.array.places_nellore_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          }
          case "Prakasam":
              places = resources.getStringArray(R.array.places_prakasam_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_prakasam);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_pakasam);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_prakasam);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_Prakasam_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Krishna":
              places = resources.getStringArray(R.array.places_krishna_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_krishna);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_krisna);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_krishna);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_Krishna_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "West Godavari":
              places = resources.getStringArray(R.array.places_westgodavari_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_WG);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_WG);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_WG);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_WG_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Vishakhapatnam":
              places = resources.getStringArray(R.array.places_vizag_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_vizag);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_vizag);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_vizag);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_vishaka_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Vizianagarm":
              places = resources.getStringArray(R.array.places_vizinagarm_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_viziyanagaram);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_viziyanagaram);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_viziyanagaram);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_viziya_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
          case "Srikakulam":
              places = resources.getStringArray(R.array.places_srikakulam_collapsingbar_title);
              collapsingToolbar.setTitle(places[postion % places.length]);
              placeDetails = resources.getStringArray(R.array.place_details_srikakulam);
              placeDetail.setText(placeDetails[postion % placeDetails.length]);
              placeLocations = resources.getStringArray(R.array.place_locations_srikakulam);
              placeLocation.setText(placeLocations[postion % placeLocations.length]);
              placebestime = resources.getStringArray(R.array.place_besttime_srikakulam);
              placebestimes.setText(placebestime[postion % placebestime.length]);
              placePictures = resources.obtainTypedArray(R.array.places_srikakulam_images);
              placePicutre.setImageDrawable(placePictures.getDrawable(postion % placePictures.length()));
              placePictures.recycle();
              break;
      }


    }

    private void getGPSInfo() {
        Criteria criteria = new Criteria();
        String provider;
        Location location;
        LocationManager locationmanager = (LocationManager) this
                .getSystemService(Context.LOCATION_SERVICE);

        if (locationmanager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            provider = locationmanager.getBestProvider(criteria, false);
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                return;
            }
            location = locationmanager.getLastKnownLocation(provider);

        } else {
            Intent intent = new Intent(Intent.ACTION_VIEW,
                    Uri.parse("google.navigation:q=an+gooty+city"));
            startActivity(intent);
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
