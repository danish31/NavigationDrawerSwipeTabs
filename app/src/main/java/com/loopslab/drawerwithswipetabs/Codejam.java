package com.loopslab.drawerwithswipetabs;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

//import org.weibeld.example.R;

public class Codejam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codejam);
    }
    public void codejam(View view){
        Intent CodejamIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSede-70APY2pGNwpQKG5yDBK68Mi7j-AnxQ9lUJmDTQqKwFcQ/viewform"));
        startActivity(CodejamIntent);
    }



}
