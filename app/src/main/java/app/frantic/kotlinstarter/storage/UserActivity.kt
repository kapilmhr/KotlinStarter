package app.frantic.kotlinstarter.storage

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import app.frantic.kotlinstarter.R
import kotlinx.android.synthetic.main.activity_user.*

class UserActivity : AppCompatActivity() {
    var NAME = "NAME"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        button_save.setOnClickListener({
            AppPreferences.name = ed_name.text.toString()
            PreferenceHelper.setName(ed_name.text.toString())
        })

        button_load.setOnClickListener {
//            tv_name.text = AppPreferences.name
            tv_name.text = PreferenceHelper.getName()
        }
    }
}
