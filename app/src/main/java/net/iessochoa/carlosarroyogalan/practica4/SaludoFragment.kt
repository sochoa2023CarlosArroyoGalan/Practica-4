package net.iessochoa.carlosarroyogalan.practica4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import net.iessochoa.carlosarroyogalan.practica4.databinding.FragmentSaludoBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SaludoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SaludoFragment : Fragment() {
    private var _binding: FragmentSaludoBinding? = null
    val args:SaludoFragmentArgs by navArgs()
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSaludoBinding.inflate(inflater, container,
            false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)
        //Con esto se sincroniza el nombre escrito en el EditText anterior en la nueva pestaña
        binding.tvSaludo.text="Hola ${args.nombre}"
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}