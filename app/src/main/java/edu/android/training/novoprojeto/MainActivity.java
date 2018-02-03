package edu.android.training.novoprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("OnCreate","estou acordando!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("OnStart","estou abrindo os Olhos!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("OnStart","acordei!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void apagarActivity(View v){
        Log.i("OnDestroy","Oh, Meu Deus Vou Morrer, Socorro!");
        finish();
    }

}
