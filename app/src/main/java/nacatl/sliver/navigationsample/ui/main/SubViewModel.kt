package nacatl.sliver.navigationsample.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SubViewModel : ViewModel() {
    val hoge = MutableLiveData<String>("最初")
}
