package karpenko.diploma.testnavcomponent.ui.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import karpenko.diploma.testnavcomponent.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            delay(1000)
            val boolean = Random.nextBoolean()
            if (boolean){
                findNavController().navigate(R.id.action_splashFragment_to_activityMain)
            }else{
                findNavController().navigate(R.id.action_splashFragment_to_activityAuth)
            }
        }
    }

}