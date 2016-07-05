package rihoo.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class BarsActivity extends AppCompatActivity {

    // Button
    Button returnButton;

    // Intent
    Intent goBack;

    // ListView
    ListView listView;

    // LocationAdapter
    LocationAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_screen);

        // Button
        returnButton = (Button) findViewById(R.id.Button_Back_To_Main);

        // Intent
        goBack = new Intent(this, MainActivity.class);

        // ListView
        listView = (ListView) findViewById(R.id.ListView);

        // Location Objects
        ArrayList<Location> locations = new ArrayList<Location>();

        // LocationAdapter
        adapter = new LocationAdapter(this, locations, R.color.dallas_navy_gray);

        // OnClickListener
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goBack);
            }
        });

        locations.add(new Location(getResources().getString(R.string.bar_1_name),
                getResources().getString(R.string.bar_1_address),
                getResources().getString(R.string.bar_1_phone)));
        locations.add(new Location(getResources().getString(R.string.bar_2_name),
                getResources().getString(R.string.bar_2_address),
                getResources().getString(R.string.bar_2_phone)));
        locations.add(new Location(getResources().getString(R.string.bar_3_name),
                getResources().getString(R.string.bar_3_address),
                getResources().getString(R.string.bar_3_phone)));
        locations.add(new Location(getResources().getString(R.string.bar_4_name),
                getResources().getString(R.string.bar_4_address),
                getResources().getString(R.string.bar_4_phone)));
        
        listView.setAdapter(adapter);
    }

}
