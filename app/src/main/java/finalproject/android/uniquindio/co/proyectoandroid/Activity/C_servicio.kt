package finalproject.android.uniquindio.co.proyectoandroid.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import finalproject.android.uniquindio.co.proyectoandroid.Business.Repository
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import finalproject.android.uniquindio.co.proyectoandroid.R
import kotlinx.android.synthetic.main.activity_c_servicio.*

class C_servicio : AppCompatActivity() {

    lateinit var repo : Repository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_servicio)

        repo = Repository()
        btn_crearservicio.setOnClickListener { CrearServicio() }
    }

    fun CrearServicio(){
        repo.addServicio(Servicio(srv_nombre.text.toString(), srv_descripcion.text.toString(), srv_ubicacion.text.toString()))
    }
}
