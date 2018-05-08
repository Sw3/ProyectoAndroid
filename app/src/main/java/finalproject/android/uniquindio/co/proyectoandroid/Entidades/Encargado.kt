package finalproject.android.uniquindio.co.proyectoandroid.Entidades

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by str_william on 08/05/2018.
 */
class Encargado : Parcelable {

    var id : Int = 0
    lateinit var cedula : String
    lateinit var nombre : String
    lateinit var telefono : String
    var servicio : Int = 0

    fun setServicio(idServicio: String){
        this.servicio = idServicio.toInt()
    }

    constructor(cedula : String, nombre : String, telefono : String){
        this.cedula = cedula
        this.nombre = nombre
        this.telefono = telefono
    }
    constructor(){}
    constructor(parcel: Parcel) : this() {
        id = parcel.readInt()
        cedula = parcel.readString()
        nombre = parcel.readString()
        telefono = parcel.readString()
        servicio = parcel.readInt()
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(cedula)
        parcel.writeString(nombre)
        parcel.writeString(telefono)
        parcel.writeInt(servicio)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Encargado> {
        override fun createFromParcel(parcel: Parcel): Encargado {
            return Encargado(parcel)
        }

        override fun newArray(size: Int): Array<Encargado?> {
            return arrayOfNulls(size)
        }
    }


}