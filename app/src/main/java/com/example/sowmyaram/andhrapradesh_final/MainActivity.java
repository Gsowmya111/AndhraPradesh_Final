package com.example.sowmyaram.andhrapradesh_final;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.sowmyaram.andhrapradesh_final.Fragments.Aboutus_tab;
import com.example.sowmyaram.andhrapradesh_final.Fragments.CardFragment;
import com.example.sowmyaram.andhrapradesh_final.Fragments.FragmentDrawer;

public class MainActivity extends AppCompatActivity implements FragmentDrawer.FragmentDrawerListener {

    private static String TAG = MainActivity.class.getSimpleName();

   Toolbar mToolbar;
    FragmentDrawer drawerFragment;
   public static String Placename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting_scren);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);

        drawerFragment = (FragmentDrawer) getSupportFragmentManager().findFragmentById(R.id.fragment_navigation_drawer);
        drawerFragment.setUp(R.id.fragment_navigation_drawer, (DrawerLayout) findViewById(R.id.drawer_layout), mToolbar);
        drawerFragment.setDrawerListener(this);

        // display the first navigation drawer view on app launch
        displayView(0);

        FragmentTransaction tx = getSupportFragmentManager().beginTransaction();
        tx.replace(R.id.content_frame, new Aboutus_tab());
        tx.commit();




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDrawerItemSelected(View view, int position) {
        displayView(position);
    }

    private void displayView(int position) {
        Fragment fragment = null;
        String title = getString(R.string.app_name);
        switch (position) {
            case 0:
                Placename="About";
                fragment = new Aboutus_tab();

                break;
            case 1:
                Placename="Anantapur";

                fragment = new CardFragment();

                break;
            case 2:
                Placename="Chittor";

                fragment = new CardFragment();

                break;
            case 3:
                Placename="Cuddapah";

                fragment = new CardFragment();

                break;


            case 4:
                Placename="Kurnool";

                fragment = new CardFragment();

                break;
            case 5:
                Placename="Nellore";

                fragment = new CardFragment();

                break;

            case 6:
                Placename="Prakasam";

                fragment = new CardFragment();

                break;
            case 7:
                Placename="Guntur";

                fragment = new CardFragment();

                break;

            case 8:
                Placename="Krishna";

                fragment = new CardFragment();

                break;

            case 9:
                Placename="West Godavari";
                fragment = new CardFragment();
               break;
            case 10:
                Placename="East Godavari";

                fragment = new CardFragment();

                break;
            case 11:
                Placename="Vishakhapatnam";
                fragment = new CardFragment();
                break;

            case 12:
                Placename="Vizianagarm";
                fragment = new CardFragment();
                break;

            case 13:
            Placename="Srikakulam";

            fragment = new CardFragment();
            break;



            default:
                break;
        }

        if (fragment != null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.content_frame, fragment);
            fragmentTransaction.commit();

            // set the toolbar title
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public void onBackPressed() {
     //   super.onBackPressed();
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Do you want to exit Application");
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                finish();
                                System.exit(0);
                            }
                        });

        alertDialogBuilder.setNegativeButton("CANCEL",new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

}
}
