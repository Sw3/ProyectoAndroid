package finalproject.android.uniquindio.co.proyectoandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import android.widget.Toast
import finalproject.android.uniquindio.co.proyectoandroid.Adaptadores.ServicioAdapter
import finalproject.android.uniquindio.co.proyectoandroid.Business.Repository
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import kotlinx.android.synthetic.main.activity_lista_servicios.*


class ListaServiciosActivity : AppCompatActivity() {

    lateinit var listaServicios : ArrayList<Servicio>
    lateinit var adaptador : ServicioAdapter
    lateinit var repositorio : Repository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servicios)

        repositorio = Repository()
        listaServicios = ArrayList<Servicio>()
        listaServicios = repositorio.getServicios()
        adaptador = ServicioAdapter(listaServicios, applicationContext)
        listaServiciosRecycler.adapter = adaptador
        listaServiciosRecycler. layoutManager = LinearLayoutManager( this,
                LinearLayoutManager. VERTICAL , false )


    }
}
