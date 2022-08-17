package com.mauriciolomba.broadcastreceiverexample

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    val  airplaneReceiver = AirplaneModeChangeReceiver()
    val chargerPluggedReceiver = ChargerPluggedReceiver()
    val chargerUnpluggedReceiver = ChargerUnpluggedReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED).also {
            registerReceiver(airplaneReceiver,it)
        }

        IntentFilter(Intent.ACTION_POWER_CONNECTED).also {
            registerReceiver(chargerPluggedReceiver,it)
        }

        IntentFilter(Intent.ACTION_POWER_DISCONNECTED).also {
            registerReceiver(chargerUnpluggedReceiver,it)
        }
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airplaneReceiver)
        unregisterReceiver(chargerPluggedReceiver)
        unregisterReceiver(chargerPluggedReceiver)
    }
}