@file:Suppress("DEPRECATION")

package finalproject.android.uniquindio.co.proyectoandroid.Adaptadores


import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import finalproject.android.uniquindio.co.proyectoandroid.Fragments.ListaServicioFragment
import finalproject.android.uniquindio.co.proyectoandroid.R
import kotlinx.android.synthetic.main.servicioitemlist.view.*


/**
 * Created by str_william on 01/05/2018.
 */
class ServicioAdapter (var personajes : ArrayList<Servicio>) :
        RecyclerView.Adapter<ServicioAdapter.ServicioViewHolder>()
    {

        lateinit var listener:OnClickAdaptadorDePersonaje

        constructor(fragmento:ListaServicioFragment, personajes:ArrayList<Servicio>) : this(personajes) {

        this.listener=fragmento as OnClickAdaptadorDePersonaje
    }

        override fun onBindViewHolder(holder: ServicioViewHolder?, position: Int) {
            holder?.bindPersonaje( personajes.get(position) )
        }

        override fun getItemCount(): Int {
            return personajes.size
        }

        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ServicioViewHolder {
            val v = LayoutInflater.from( parent?.context ).inflate(R.layout.fragment_detalle_servicio, parent, false)
            return ServicioViewHolder(v)
        }


        inner class ServicioViewHolder : RecyclerView.ViewHolder, View.OnClickListener {

            constructor(itemView:View) : super(itemView) {

                itemView.setOnClickListener(this)
            }

            override fun onClick(p0: View?) {
                listener.onClickPosition(adapterPosition)
            }

            val nombre:TextView = itemView.idNombre
            //val fechaNacimiento:TextView = itemView.fecha_nacimiento
            fun bindPersonaje(personaje:Servicio){
                nombre.text = personaje.nombre
                //fechaNacimiento.text = personaje.fecha.toString()
                itemView.tag = personaje
            }
        }
        interface OnClickAdaptadorDePersonaje {
            fun onClickPosition(pos: Int)
        }
    }
