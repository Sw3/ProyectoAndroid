package finalproject.android.uniquindio.co.proyectoandroid.Business

import finalproject.android.uniquindio.co.proyectoandroid.Dao.Dao
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio

/**
 * Created by str_william on 07/05/2018.
 */
class Repository {

    lateinit var dao : Dao

    constructor(){
        dao = Dao()
    }

    fun getServicios(): ArrayList<Servicio> {
    return dao.getServicio()
    }
    fun addServicio(servicio: Servicio){
        dao.addServicio(servicio)
    }
}