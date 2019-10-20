package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.navGraphViewModels
import nacatl.sliver.navigationsample.R
import nacatl.sliver.navigationsample.databinding.Sub2FragmentBinding

class Sub2Fragment : Fragment(R.layout.sub2_fragment) {
    private val viewModel by navGraphViewModels<SubViewModel>(R.id.sub_navigation)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = Sub2FragmentBinding.bind(view)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        viewModel.hoge.value = "次だよ"
    }

    companion object {
        fun newInstance() = Sub2Fragment()
    }
}
