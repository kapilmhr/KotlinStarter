package app.frantic.kotlinstarter.storage

import android.app.Application

class MyApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        //if using AppPreferences
//        AppPreferences.init(this)
        PreferenceHelper.init(this)
    }
}