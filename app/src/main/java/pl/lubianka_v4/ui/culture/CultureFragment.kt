package pl.lubianka_v4.ui.culture

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import pl.lubianka_v4.R

class CultureFragment : Fragment() {

    companion object {
        fun newInstance() = CultureFragment()
    }

    private lateinit var viewModel: CultureViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.culture_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CultureViewModel::class.java)
        // TODO: Use the ViewModel
    }

}