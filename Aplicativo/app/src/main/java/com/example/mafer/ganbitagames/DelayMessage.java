package com.example.mafer.ganbitagames;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Intent;
import android.content.Context;
import android.content.res.Resources;


public class DelayMessage extends IntentService {

    public static final String EXTRA_MESSAGE = "mensagem";
    public static final int NOTIFICATION_ID = 5453;


    public DelayMessage() {
        super("DelayMessage");
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this) {
            try {
                wait(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        String text = getResources().getString(R.string.mensagem2);
        showText(text);
    }

    private void showText(String text) {


        Notification notification = new Notification.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle("AVISO")
                .setAutoCancel(true)
                .setDefaults(Notification.DEFAULT_VIBRATE)

                .setContentText(text)
                .build();

        //
        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID, notification);

    }
}