package app.frantic.kotlinstarter.recyclerview

import android.os.Parcel
import android.os.Parcelable
import java.io.Serializable


data class Animal(val name: String,val canfly: Boolean) : Serializable {

}