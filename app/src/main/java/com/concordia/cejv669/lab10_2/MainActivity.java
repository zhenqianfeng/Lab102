package com.concordia.cejv669.lab10_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements BroadcastFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void messageFromBroadcastFragment(String text) {
        ReceiverFragment rf = (ReceiverFragment) getSupportFragmentManager().findFragmentById(R.id.receiver_fragment);
        rf.displayText(text);
    }
}
