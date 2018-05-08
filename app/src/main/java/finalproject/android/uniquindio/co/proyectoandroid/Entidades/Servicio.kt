package finalproject.android.uniquindio.co.proyectoandroid.Entidades

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by str_william on 01/05/2018.
 */
class Servicio : Parcelable {

    var id : Int = 0
    lateinit var nombre : String
    lateinit var descripcion : String
    lateinit var foto : String

    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        nombre = parcel.readString()
        descripcion = parcel.readString()
        foto = parcel.readString()
    }
    constructor(){}
    constructor(nombre: String, descripcion: String, foto: String) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.foto = foto
    }
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(nombre)
        parcel.writeString(descripcion)
        parcel.writeString(foto)
    }
    override fun describeContents(): Int {
        return 0
    }
    companion object CREATOR : Parcelable.Creator<Servicio> {
        override fun createFromParcel(parcel: Parcel): Servicio {
            return Servicio(parcel)
        }
        override fun newArray(size: Int): Array<Servicio?> {
            return arrayOfNulls(size)
        }
    }
}