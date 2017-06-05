package com.example.mafer.ganbitagames;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class Receiver extends BroadcastReceiver {
    public Receiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        Intent startServiceIntent = new Intent( context, DelayMessage.class);
        context.startService(startServiceIntent);
    }
}
