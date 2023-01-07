package com.example.lab1_android

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ReadQuestionsService : Service() {

    private val binder = SimpleClientServerBinder()
    private val gson = Gson()

    override fun onCreate() {
        super.onCreate()
    }

    override fun onBind(intent: Intent): IBinder? {
        return binder
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        intent.putExtra("questions",readQuestions())
        sendBroadcast(intent)
        return super.onStartCommand(intent, flags, startId)
    }

    fun readQuestions(): MutableList<Question> {
        val inputStream = assets.open("questions.txt")
        val json = inputStream.bufferedReader().use { it.readText() }
        val listType = object : TypeToken<MutableList<Question>>() {}.type
        return gson.fromJson(json, listType)
    }


    inner class SimpleClientServerBinder : Binder() {
        val service: ReadQuestionsService
            get() = this@ReadQuestionsService
    }
}

private fun Intent?.putExtra(s: String, readQuestions: MutableList<Question>) {

}
