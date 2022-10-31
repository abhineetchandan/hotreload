package com.example.bug


import io.flutter.embedding.android.FlutterActivity
import android.content.Context
import io.flutter.embedding.engine.FlutterEngine

class MainActivity: FlutterActivity() {
    override fun provideFlutterEngine(context: Context): FlutterEngine? {
        val appData: Bug = applicationContext as Bug
        return appData.engineGroup!!.createAndRunDefaultEngine(context)
    }
}
