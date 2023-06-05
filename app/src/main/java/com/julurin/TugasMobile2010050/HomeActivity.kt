package com.julurin.TugasMobile2010050

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.julurin.TugasMobile2010050.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


    binding.profilSaya.setOnClickListener {
        startActivity(Intent(this, MainActivity::class.java))
        Toast.makeText(this, "Hello Profile", Toast.LENGTH_LONG).show()
    }
    }
}