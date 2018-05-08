package finalproject.android.uniquindio.co.proyectoandroid.Fragments

import android.app.Activity
import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.*
import finalproject.android.uniquindio.co.proyectoandroid.Adaptadores.ServicioAdapter
import finalproject.android.uniquindio.co.proyectoandroid.Entidades.Servicio

import finalproject.android.uniquindio.co.proyectoandroid.R
import kotlinx.android.synthetic.main.activity_lista_servicios.*

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [ListaServicioFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [ListaServicioFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListaServicioFragment : Fragment(),  ServicioAdapter.OnClickAdaptadorDePersonaje {
    lateinit var personajes:ArrayList<Servicio>
    lateinit var adaptador: ServicioAdapter
    private lateinit var listener:OnPersonajeSeleccionadoListener

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_lista_servicio, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        adaptador = ServicioAdapter(this, personajes)
        listaServiciosRecycler.adapter = adaptador
        listaServiciosRecycler.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        // listaPersonajes.layoutManager = GridLayoutManager(this, 2)

        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        /**
        when (item?.itemId){
            R.id.menu_agregar -> {
                mostrarAgregarPersona()
                //personajes.add(0, Personaje("Duffman", Date()) )
                adaptador.notifyItemInserted(0)
            }
            R.id.menu_eliminar -> {
                personajes.removeAt(0 )
                adaptador.notifyItemRemoved(0)
            }
            R.id.menu_modificar -> {
                val aux:Personaje = personajes.get(1)
                personajes.set(1, personajes.get(2) )
                personajes.set(2, aux )
                adaptador.notifyItemMoved(1,2)
            }
        }
        **/
        return super.onOptionsItemSelected(item)
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if( context is Activity){
            try {
                listener = context as OnPersonajeSeleccionadoListener
            }catch (e:ClassCastException){
                throw ClassCastException("${activity.toString()} debe implementar la interfaz OnPersonajeSeleccionadoListener")
            }
        }
    }

    interface OnPersonajeSeleccionadoListener{
        fun onPersonajeSeleccionado(pos:Int)
    }

    override fun onClickPosition(pos: Int) {
        listener.onPersonajeSeleccionado(pos)
    }

    fun mostrarAgregarPersona(){
        /**
        val agregarPersonaje = AgregarPersonajeFragment()
        agregarPersonaje.setStyle(DialogFragment.STYLE_NORMAL, R.style.DialogoTitulo)
        agregarPersonaje.show(fragmentManager,"AgregarPersonaje")
        **/
    }
}// Required empty public constructor
