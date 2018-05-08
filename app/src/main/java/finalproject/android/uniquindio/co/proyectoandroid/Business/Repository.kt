package finalproject.android.uniquindio.co.proyectoandroid.Business

import finalproject.android.uniquindio.co.proyectoandroid.Dao.Dao
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Cliente
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Encargado
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio

/**
 * Created by str_william on 07/05/2018.
 */
class Repository {

    lateinit var dao : Dao

    constructor(){
        dao = Dao()
    }

    /**
     * Servicios
     */
    //funcion para listar los servicios
    fun getServicios(): ArrayList<Servicio> {
    return dao.getServicio()
    }

    //funcion para agregar un servicio
    fun addServicio(servicio: Servicio){
        dao.addServicio(servicio)
    }

    /**
     * Clientes
     */

    //funcion para listar los clientes
    fun getClientes() : ArrayList<Cliente>{
    return dao.getCliente()
    }
    //funcion para agregar un cliente
    fun addCliente(cliente : Cliente){
        dao.addCliente(cliente)
    }

    /**
     * Encargados
     */

    //funcion para listar los encargados
    fun getEncargados(){

    }

    //funcion para agregar un encargado
    fun addEncargado(encargado : Encargado){

    }
}
