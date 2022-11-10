package com.example.service

import android.content.ComponentName
import android.content.Intent
import android.content.ServiceConnection
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
//    //延迟初始化
//    lateinit var downloadBinder:MyService.DownLoadBinder
//    private val connection=object :ServiceConnection{
//        //成功绑定的时候调用
//        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
//            //service向下转型得到了我们的DownLoadBinder实例
//            downloadBinder=service as MyService.DownLoadBinder
//            downloadBinder.getProgress()
//            downloadBinder.startDownload()
//
//        }
//        //进程崩溃或者被杀掉的时候调用
//        override fun onServiceDisconnected(name: ComponentName?) {
//        }
//
//    }

//2.服务
/*
    lateinit var startBtn:Button
    lateinit var stopBtn:Button
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        startBtn=findViewById(R.id.button2)
        stopBtn=findViewById(R.id.button3)
        startBtn.setOnClickListener {
            val intent= Intent(this,MyService::class.java)
            startService(intent)
        }
        stopBtn.setOnClickListener {
            val intent=Intent(this,MyService::class.java)
            stopService(intent)
        }
    }
    //从Android8.0系统开始，应用的后台程序功能被大幅削减
    //现在只有当应用保持在前台可见状态的情况下，Service才能保持稳定运行，一旦进入后台后，Service随时都有可能会被系统回收
    //如果你真的非常需要在后台执行一些任务，可以使用Service和WorkManager
*/



//1.异步消息处理机制
/*
    val changeTextBt:Button=findViewById(R.id.button)
    val textview:TextView = findViewById(R.id.textView)
    val  updatetext=1
    val hander=object:Handler(Looper.getMainLooper()){
        override fun handleMessage(msg: Message) {
            super.handleMessage(msg)
            //在这里进行UI操作
            when(msg.what){
                updatetext->textview.text="Nice to meet you"
            }
        }
    }

   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTextBt.setOnClickListener {
            thread {
                val msg=Message()
                msg.what=updatetext
                hander.sendMessage(msg)//将msg对象发送出去
            }
        }

    }*/
}