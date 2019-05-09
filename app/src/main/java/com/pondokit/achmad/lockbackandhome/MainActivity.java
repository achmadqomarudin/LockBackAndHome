package com.pondokit.achmad.lockbackandhome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.i( "Masuk" ,"onStart");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i( "Masuk" ,"onRestart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.i( "Masuk" ,"onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.i( "Masuk" ,"onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        finish();
        Log.i( "Masuk" ,"onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        android.content.Intent launchIntent = getPackageManager().getLaunchIntentForPackage("belajar.kuncibackandhome.id");
        startActivity(launchIntent);
        Log.i( "Masuk" ,"onDestroy");
    }
}
