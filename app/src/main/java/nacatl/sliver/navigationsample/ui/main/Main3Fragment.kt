package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nacatl.sliver.navigationsample.R

class Main3Fragment : Fragment(R.layout.main3_fragment) {

    private val viewModel: Main3ViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
            findNavController().navigate(R.id.action_main3Fragment_to_main4Fragment)
        }
    }

    companion object {
        fun newInstance() = Main3Fragment()
    }
}
