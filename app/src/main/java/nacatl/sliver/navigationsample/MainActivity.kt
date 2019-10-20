package nacatl.sliver.navigationsample

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    private val viewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        val toolbar = findViewById(R.id.toolbar) as? Toolbar
        toolbar?.setupWithNavController(findNavController(R.id.nav_host_fragment))

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.let {
            it.setDisplayHomeAsUpEnabled(true)
            it.setHomeButtonEnabled(true)
        }

//
//        toolbar?.setupWithNavController(
//            navController = findNavController(R.id.nav_host_fragment),
//            configuration = AppBarConfiguration.Builder(setOf<Int>())
//                .setFallbackOnNavigateUpListener {
//                    onBackPressed()
//                    true
//                }
//                .build()
//        )
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        android.R.id.home -> {
            onBackPressed()
            true
        }
        R.id.action_go_to_sub -> {
            findNavController(R.id.nav_host_fragment).navigate(
                ActionOnlyNavDirections(R.id.action_global_subFragment)
            )
            true
        }
        else -> super.onOptionsItemSelected(item)
    }
}
