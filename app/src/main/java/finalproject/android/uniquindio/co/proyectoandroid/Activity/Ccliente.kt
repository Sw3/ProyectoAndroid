package finalproject.android.uniquindio.co.proyectoandroid.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import finalproject.android.uniquindio.co.proyectoandroid.Business.Repository
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Cliente
import finalproject.android.uniquindio.co.proyectoandroid.R
import kotlinx.android.synthetic.main.activity_ccliente.*

class Ccliente : AppCompatActivity() {

    lateinit var repo : Repository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ccliente)

        repo = Repository()
        val button = findViewById<Button>(R.id.btn_crearcliente)
        button.setOnClickListener{
            crearCliente()
        }
    }

    fun crearCliente(){
        repo.addCliente(Cliente(cl_ced.text.toString(), cl_nombre.text.toString(), cl_email.text.toString(), cl_tel.text.toString(), cl_tipo.text.toString(), Cliente.tipoCliente.ESTUDIANTE))
        Toast.makeText(applicationContext, "El cliente fue guardado correctamente", Toast.LENGTH_SHORT)
    }


}