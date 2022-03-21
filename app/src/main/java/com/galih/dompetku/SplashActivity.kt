package com.galih.dompetku

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.galih.dompetku.databinding.ActivitySplashBinding

class SplashActivity : BaseActivity() {

    private val binding by lazy { ActivitySplashBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Handler(Looper.getMainLooper())
            .postDelayed({
                         Intent(this, MainActivity::class.java).also {
                             startActivity(it)
                             finish()
                         }
            }, TIME)
    }

    companion object{
        private const val TIME = 900L
    }
}