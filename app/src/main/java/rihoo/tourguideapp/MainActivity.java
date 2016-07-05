package rihoo.tourguideapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    // Buttons
    Button restaurantsButton;
    Button shootingRangesButton;
    Button barsButton;
    Button hookahLoungesButton;

    // Intents
    Intent goToRestaurantsScreen;
    Intent goToShootingRangesScreen;
    Intent goToBarsScreen;
    Intent goToHookahLoungesScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons
        restaurantsButton = (Button) findViewById(R.id.Button_Restaurants);
        shootingRangesButton = (Button) findViewById(R.id.Button_Shooting_Ranges);
        barsButton = (Button) findViewById(R.id.Button_Bars);
        hookahLoungesButton = (Button) findViewById(R.id.Button_Hookah_Lounges);

        // Intents
        goToRestaurantsScreen = new Intent(this, RestaurantsActivity.class);
        goToShootingRangesScreen = new Intent(this, ShootingRangesActivity.class);
        goToBarsScreen = new Intent(this, BarsActivity.class);
        goToHookahLoungesScreen = new Intent(this, HookahLoungesActivity.class);

        // OnClickListeners
        restaurantsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(goToRestaurantsScreen);
            }
        });
        shootingRangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goToShootingRangesScreen);
            }
        });
        barsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goToBarsScreen);
            }
        });
        hookahLoungesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(goToHookahLoungesScreen);
            }
        });
    }

}
