package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nacatl.sliver.navigationsample.R

class Main4Fragment : Fragment(R.layout.main4_fragment) {

    private val viewModel: Main4ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
            findNavController().navigate(R.id.action_main4Fragment_to_main5Fragment)
        }
    }

    companion object {
        fun newInstance() = Main4Fragment()
    }
}
