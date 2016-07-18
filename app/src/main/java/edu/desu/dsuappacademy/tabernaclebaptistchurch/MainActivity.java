package edu.desu.dsuappacademy.tabernaclebaptistchurch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView aboutUs = (TextView) findViewById(R.id.about);
        aboutUs.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutUs.class);

                startActivity(aboutIntent);

            }
        });

        final TextView outreach = (TextView) findViewById(R.id.outreach);
        outreach.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent outreachIntent = new Intent(MainActivity.this, Outreach.class);

                startActivity(outreachIntent);

            }
        });

    }

    public void call(View v) {
        dialContactPhone("16093864785");
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

    public void map(View view) {
        Uri gmmIntentUri = Uri.parse("geo:40.0691,-74.849991");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null)

        {
            startActivity(mapIntent);
        }
    }
}