package com.example.bug

import io.flutter.embedding.engine.FlutterEngineGroup
import android.app.Application

class Bug : Application() {
    var engineGroup: FlutterEngineGroup? = null
    override fun onCreate() {
        engineGroup = FlutterEngineGroup(this)
    }
}