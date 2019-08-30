package com.example.proyecto1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MensajeRecibido extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Usted ha recibido un Mensaje :)", Toast.LENGTH_SHORT).show();
    }
}
