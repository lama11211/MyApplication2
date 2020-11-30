package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class goToPageCode extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_page_code);
    }

    public void goToHumenR(View V){

        Intent i = new Intent(this,humenR.class);
        startActivity(i);
        finish();
    }

    public void goToIOT(View V){

        Intent i = new Intent(this,IOT.class);
        startActivity(i);
        finish();
    }

    public void goToITWork(View V){

        Intent i = new Intent(this,ITWork.class);
        startActivity(i);
        finish();
    }

    public void goToMarketing(View V){

        Intent i = new Intent(this,marketing.class);
        startActivity(i);
        finish();
    }
    public void goToOnlineWork(View V){

        Intent i = new Intent(this,onlineWork.class);
        startActivity(i);
        finish();
    }

    public void goToSecurityIntro(View V){

        Intent i = new Intent(this,securityIntro.class);
        startActivity(i);
        finish();
    }

    public void goToWorkEnviroument(View V){

        Intent i = new Intent(this,workEnviroument.class);
        startActivity(i);
        finish();
    }



    public void goToGeraphic(View V){

        Intent i = new Intent(this,geraphic.class);
        startActivity(i);
        finish();
    }
}