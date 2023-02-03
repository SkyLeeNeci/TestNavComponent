package karpenko.diploma.testnavcomponent.ui.splash

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import karpenko.diploma.testnavcomponent.R
import karpenko.diploma.testnavcomponent.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
      /*  lifecycleScope.launch {
            delay(1000)
            val boolean = Random.nextBoolean()
            if (boolean){
                findNavController(R.id.nav_host_fragment_activity_splash).navigate(R.id.action_splashFragment_to_activityMain)

            }else{
                findNavController(R.id.nav_host_fragment_activity_splash).navigate(R.id.action_splashFragment_to_activityAuth)
            }
        }*/
    }

}