package app.frantic.kotlinstarter.storage

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

object PreferenceHelper {
    private var sharedPreference:SharedPreferences? = null
    private lateinit var editor: SharedPreferences.Editor

    private val NAME:String = "NAME"

    fun init(context: Context) {
        sharedPreference = context.getSharedPreferences(NAME, Context.MODE_PRIVATE)
        editor = sharedPreference!!.edit()
    }

    fun setName(name: String){
        editor.putString(NAME,name)
        editor.commit()
    }

    fun getName():String{
        return sharedPreference!!.getString(NAME,"killlll")
    }

}