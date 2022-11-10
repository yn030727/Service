package com.example.service

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.Service
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Binder
import android.os.Build
import android.os.IBinder
import androidx.core.app.NotificationCompat


class MyService : Service() {


    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }

    override fun onCreate() {
        //创建前台服务，本质上是要让我们用户看到通知
        super.onCreate()
        val manager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val channel= if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel("My Service","前台服务",NotificationManager.IMPORTANCE_HIGH)
        } else {
            TODO("VERSION.SDK_INT < O")
        }
        manager.createNotificationChannel(channel)
        val intent=Intent(this,MainActivity::class.java)
        val pi = PendingIntent.getActivity(this,0,intent,0)
        val notifaction=NotificationCompat.Builder(this,"My Service")
            .setContentTitle("This is content title")
            .setContentText("this is content text")
            .setSmallIcon(R.drawable.ic_launcher_background)
            .setLargeIcon(BitmapFactory.decodeResource(resources,R.drawable.ic_launcher_background))
            .setContentIntent(pi)
            .build()
        startForeground(1,notifaction)
    }
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        return super.onStartCommand(intent, flags, startId)
    }
    override fun onDestroy() {
        super.onDestroy()
    }

}