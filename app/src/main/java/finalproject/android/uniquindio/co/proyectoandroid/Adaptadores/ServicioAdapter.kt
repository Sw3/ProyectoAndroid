@file:Suppress("DEPRECATION")

package finalproject.android.uniquindio.co.proyectoandroid.Adaptadores

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio
import finalproject.android.uniquindio.co.proyectoandroid.Interfaces.ISerivio
import finalproject.android.uniquindio.co.proyectoandroid.R
import kotlinx.android.synthetic.main.servicioitemlist.view.*


/**
 * Created by str_william on 01/05/2018.
 */
class ServicioAdapter :
        RecyclerView.Adapter<ServicioAdapter.ServicioViewHolder> {


    lateinit var servicios : ArrayList<Servicio>
    lateinit var listener : View.OnClickListener
    var mContext : Context?= null

    constructor(servicios: ArrayList<Servicio>, context: Context){
        this.servicios = servicios
        this.mContext=context
    }

    override fun getItemCount(): Int {
       return servicios.size
    }

    override fun onBindViewHolder(holder: ServicioViewHolder?, position: Int) {
        holder?.bindServicio( servicios.get(position) )
        holder?.setOnClickListener(object : ISerivio{
            override fun onClickServicio(view: View, position: Int) {
              Toast.makeText(mContext, "test", Toast.LENGTH_LONG).show()
            }
        })
    }

    //inflater
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ServicioViewHolder {
        val v = LayoutInflater.from(parent?.context)
                .inflate(R.layout.servicioitemlist , parent , false )
        return ServicioViewHolder(v)
    }

    class ServicioViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView), View.OnClickListener{

        //asigna de acuerdo al id en el servicioItemList.xml
        val nombre : TextView = itemView.idNombre
        val descripcion :TextView = itemView.idDescripcion
        var customListener : ISerivio?=null

        fun setOnClickListener(itemClickListener: ISerivio){
            this.customListener = itemClickListener
        }

        override fun onClick(p0: View?) {
            this.customListener!!.onClickServicio(p0!!,adapterPosition)
        }
        fun bindServicio (servicio: Servicio){
            nombre.text = servicio.nombre
            descripcion.text = servicio.descripcion
            itemView.setOnClickListener(this)
        }
    }

}

