package finalproject.android.uniquindio.co.proyectoandroid.Dao

import finalproject.android.uniquindio.co.proyectoandroid.Entidades.*

/**
 * Created by str_william on 07/05/2018.
 */
class Dao {

    companion object {
        lateinit var instance: Dao
            private set
    }

    lateinit var servicios : ArrayList<Servicio>
    lateinit var encargados : ArrayList<Encargado>
    lateinit var clientes : ArrayList<Cliente>

    constructor(){
        instance = this
        this.servicios = ArrayList()
        this.encargados = ArrayList()
        this.clientes = ArrayList()
        llenadoInicial()
    }

    fun llenadoInicial(){
        //servicios
        servicios.add(Servicio("Piscina", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("cancha", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("sendero", "este es un servicio de la universidad", "alguna foto"))
        servicios.add(Servicio("otra cosa", "este es un servicio de la universidad", "alguna foto"))

        //encargados
        encargados.add(Encargado("Miguel", "123", "322223332"))


        //Clientes
        clientes.add(Cliente("123","MIGUEL","","miguelgao","123", Cliente.tipoCliente.ESTUDIANTE))

    }
    
    fun getServicio(): ArrayList<Servicio> {
        return servicios
    }
    fun addServicio(servicio: Servicio){
        servicios.add(servicio)
    }

    fun getCliente(): ArrayList<Cliente> {
        return clientes
    }
    fun addCliente(cliente: Cliente){
        clientes.add(cliente)
    }


}