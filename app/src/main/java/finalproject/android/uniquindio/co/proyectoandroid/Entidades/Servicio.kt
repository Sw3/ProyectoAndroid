package finalproject.android.uniquindio.co.proyectoandroid.Entidades

/**
 * Created by str_william on 01/05/2018.
 */
class Servicio {

    lateinit var nombre : String
    lateinit var descripcion : String
    lateinit var foto : String

    constructor(){

    }

    constructor(nombre: String, descripcion: String, foto: String) {
        this.nombre = nombre
        this.descripcion = descripcion
        this.foto = foto
    }


}