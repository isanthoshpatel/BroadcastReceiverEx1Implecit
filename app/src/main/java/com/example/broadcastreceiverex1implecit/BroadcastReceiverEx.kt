package com.example.broadcastreceiverex1implecit

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.widget.Toast

class BroadcastReceiverEx : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if( Intent.ACTION_BOOT_COMPLETED.equals(intent?.action)){

            Toast.makeText(context,"boot completed...",Toast.LENGTH_LONG).show()
        }

        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent?.action)){
            Toast.makeText(context,"Connectivity changed",Toast.LENGTH_LONG).show()
        }

    }
}