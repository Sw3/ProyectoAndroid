package finalproject.android.uniquindio.co.proyectoandroid.Entidades

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by str_william on 08/05/2018.
 */
class Cliente : Parcelable{

    lateinit var cedula : String
    lateinit var nombre : String
    lateinit var foto : String
    lateinit var email : String
    lateinit var password : String
    lateinit var tipo : tipoCliente

    constructor(cedula : String,nombre : String,  foto : String,email : String, password : String, tipo : tipoCliente){
        this.nombre= nombre
        this.foto= foto
        this.email= email
        this.password = password
        this.tipo = tipo
    }
    constructor(){}
    constructor(parcel: Parcel) : this() {
        cedula = parcel.readString()
        nombre = parcel.readString()
        foto = parcel.readString()
        email = parcel.readString()
        password = parcel.readString()
    }

    enum class tipoCliente{ESTUDIANTE, DOCENTE, ADMINISTRATIVO}

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(cedula)
        parcel.writeString(nombre)
        parcel.writeString(foto)
        parcel.writeString(email)
        parcel.writeString(password)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Cliente> {
        override fun createFromParcel(parcel: Parcel): Cliente {
            return Cliente(parcel)
        }

        override fun newArray(size: Int): Array<Cliente?> {
            return arrayOfNulls(size)
        }
    }
}