package dev.rajas.apps.modularpoc.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dev.rajas.apps.modularpoc.R
import dev.rajas.apps.utilities.valueOrDefault

class HomeActivity : AppCompatActivity() {

    private val phoneNumber :String?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       Toast.makeText(this, phoneNumber.valueOrDefault(), Toast.LENGTH_SHORT).show()
    }
}