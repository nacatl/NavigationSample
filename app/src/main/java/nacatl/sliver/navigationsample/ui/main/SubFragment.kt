package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import nacatl.sliver.navigationsample.R
import nacatl.sliver.navigationsample.databinding.Sub2FragmentBinding
import nacatl.sliver.navigationsample.databinding.SubFragmentBinding

class SubFragment : Fragment(R.layout.sub_fragment) {
    private val viewModel by navGraphViewModels<SubViewModel>(R.id.sub_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = SubFragmentBinding.bind(view)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.action_subFragment_to_sub2Fragment)
        }
    }

    companion object {
        fun newInstance() = SubFragment()
    }
}
