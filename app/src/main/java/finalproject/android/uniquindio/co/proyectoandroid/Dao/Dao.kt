package finalproject.android.uniquindio.co.proyectoandroid.Dao

import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio

/**
 * Created by str_william on 07/05/2018.
 */
class Dao {

    lateinit var servicios : ArrayList<Servicio>

    constructor(){
        this.servicios = ArrayList()

        llenadoInicial()
    }

    fun llenadoInicial(){
        //servicios
        servicios.add(Servicio("Piscina", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("cancha", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("sendero", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("otra cosa", "este es un servicio de la universidad", "alguna foto"))
    }
    
    fun getServicio(): ArrayList<Servicio> {
        return servicios
    }
    fun addServicio(servicio: Servicio){
        servicios.add(servicio)
    }


}