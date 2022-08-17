package com.mauriciolomba.broadcastreceiverexample

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class ChargerUnpluggedReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Toast.makeText(context,"Carregador Desplugado!!!", Toast.LENGTH_LONG).show()
    }

}