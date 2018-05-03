package finalproject.android.uniquindio.co.proyectoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import finalproject.android.uniquindio.co.proyectoandroid.Adaptadores.ServicioAdapter
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import kotlinx.android.synthetic.main.activity_lista_servicios.*


class ListaServiciosActivity : AppCompatActivity() {

    lateinit var listaServicios : ArrayList<Servicio>
    lateinit var adaptador : ServicioAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servicios)


        listaServicios = ArrayList<Servicio>()
        listaServicios.add(Servicio("Piscina", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("cancha", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("sendero", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("otra cosa", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("Piscina", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("cancha", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("sendero", "este es un servicio de la universidad", "alguna foto"))
        listaServicios.add(Servicio("otra cosa", "este es un servicio de la universidad", "alguna foto"))
        adaptador = ServicioAdapter(listaServicios, applicationContext)
        listaServiciosRecycler.adapter = adaptador
        listaServiciosRecycler. layoutManager = LinearLayoutManager( this,
                LinearLayoutManager. VERTICAL , false )


    }
}
