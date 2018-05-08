package finalproject.android.uniquindio.co.proyectoandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mainmenu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId){
            R.id.item0->{
                val intento1 = Intent(this, C_servicio::class.java)
                startActivity(intento1)
            }
            R.id.item1->{
                val intento1 = Intent(this, Ccliente::class.java)
                startActivity(intento1)
            }
            R.id.item2->{
                val intento1 = Intent(this, Cencargado::class.java)
                startActivity(intento1)
            }
            R.id.item3->{
                val intento1 = Intent(this, Ccliente::class.java)
                startActivity(intento1)
            }
        }


        return super.onOptionsItemSelected(item)
    }
}
