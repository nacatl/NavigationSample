package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nacatl.sliver.navigationsample.R

class Main2Fragment : Fragment(R.layout.main2_fragment) {

    private val viewModel: Main2ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next3).setOnClickListener {
            findNavController().navigate(R.id.action_main2Fragment_to_main3Fragment)
        }
        view.findViewById<Button>(R.id.next4).setOnClickListener {
            findNavController().navigate(R.id.action_main2Fragment_to_main4Fragment)
        }
    }

    companion object {
        fun newInstance() = Main2Fragment()
    }
}
