package finalproject.android.uniquindio.co.proyectoandroid.Fragments

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio

import finalproject.android.uniquindio.co.proyectoandroid.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [DetalleServicioFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [DetalleServicioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetalleServicioFragment : Fragment() , View.OnClickListener {

    lateinit var personaje:Servicio

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_detalle_servicio, container, false)
    }

    override fun onClick(p0: View?) {
        var intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=hP3fmnMuZZU"))
        startActivity(intent)
    }

    fun darDetalle(personaje: Servicio) {
        this.personaje = personaje
        /**
        txtTituloDetalle.text = personaje.nombre
        txtFecha.text = "Fecha: ${personaje.fecha.toString()}"
        txtDescripcionDetalle.text = personaje.descripcion
        btnIrATrailes.setOnClickListener(this)
        **/
    }

}// Required empty public constructor
