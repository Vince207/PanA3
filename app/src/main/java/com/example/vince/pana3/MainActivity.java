package com.example.vince.pana3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mesaB = (Button) findViewById(R.id.MesaButton);
        Button yahooB = (Button) findViewById(R.id.YahooButton);

        final Intent webIntent = new Intent(MainActivity.this, WebViewerActivity.class);

        mesaB.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                webIntent.putExtra("URL", "http://www.sdmesa.edu");
                startActivity(webIntent);
            }
        });
        yahooB.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                webIntent.putExtra("URL", "https://www.yahoo.com");
                startActivity(webIntent);
            }
        });
    }

}
