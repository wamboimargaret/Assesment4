package megan.wamboi.assesment

import android.app.Application
import android.content.Context



class MyPostApp: Application() {
    companion object{
        lateinit var appContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

}