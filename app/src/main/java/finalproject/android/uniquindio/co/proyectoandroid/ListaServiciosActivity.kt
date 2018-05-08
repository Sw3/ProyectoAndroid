package finalproject.android.uniquindio.co.proyectoandroid


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Menu
import finalproject.android.uniquindio.co.proyectoandroid.Business.Repository
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import finalproject.android.uniquindio.co.proyectoandroid.Fragments.DetalleServicioFragment
import finalproject.android.uniquindio.co.proyectoandroid.Fragments.ListaServicioFragment

class ListaServiciosActivity : AppCompatActivity(), ListaServicioFragment.OnPersonajeSeleccionadoListener {

    lateinit var listaServicios : ArrayList<Servicio>
    lateinit var repositorio : Repository
    lateinit var fragmentDetalle:Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servicios)

        repositorio = Repository()
        listaServicios = ArrayList<Servicio>()
        listaServicios = repositorio.getServicios()


        val fragmentLista = supportFragmentManager.findFragmentById(R.id.listaServiciosRecycler) as? ListaServicioFragment
        fragmentLista?.personajes = listaServicios

        fragmentDetalle = supportFragmentManager.findFragmentById(R.id.fragmentoDetallePersonaje)

            (fragmentDetalle as DetalleServicioFragment).darDetalle(listaServicios[0])

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onPersonajeSeleccionado(pos: Int) {
        if (fragmentDetalle != null) {
            (fragmentDetalle as DetalleServicioFragment).darDetalle(listaServicios[pos])
        } else {
            val intent: Intent = Intent(this, DetalleServicioFragment::class.java)
            //intent.putExtra("per", listaServicios[pos])
            startActivity(intent)
        }
    }
}
