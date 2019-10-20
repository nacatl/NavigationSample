package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nacatl.sliver.navigationsample.MainActivityViewModel
import nacatl.sliver.navigationsample.R

class MainFragment : Fragment(R.layout.main_fragment) {

    private val viewModel: MainViewModel by viewModels()
    private val activityViewModel: MainActivityViewModel by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.next).setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_main2Fragment)
        }
    }

    companion object {
        fun newInstance() = MainFragment()
    }
}
