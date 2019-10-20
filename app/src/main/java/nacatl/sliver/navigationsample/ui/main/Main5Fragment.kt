package nacatl.sliver.navigationsample.ui.main

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import nacatl.sliver.navigationsample.R

class Main5Fragment : Fragment(R.layout.main5_fragment) {

    private val viewModel: Main5ViewModel by viewModels()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // 遷移animationとpopUpToの組み合わせにバグがあるため個別制御している
//        activity?.onBackPressedDispatcher?.addCallback(
//            viewLifecycleOwner,
//            object : OnBackPressedCallback(true) {
//                override fun handleOnBackPressed() {
//                    val navController = findNavController()
//                    navController.popBackStack(navController.graph.startDestination, false)
//                }
//            }
//        )
    }

    companion object {
        fun newInstance() = Main5Fragment()
    }
}
