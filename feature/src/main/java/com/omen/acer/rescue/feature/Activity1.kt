package com.omen.acer.rescue.feature

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.util.Log
import android.widget.Toast

import com.omen.acer.rescue.feature.R.id.*
import kotlinx.android.synthetic.main.activity_1.*
import java.util.jar.Manifest


class Activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)


        submitButton.setOnClickListener{
            Log.i("Activity1", "clicked")
            var pass: String = Password.text.toString()
            var us: String = user.text.toString()
            if (pass == "abcd") {
                Toast.makeText(this, "correct", Toast.LENGTH_LONG).show()
                val i = Intent(this, Activity2::class.java)
                i.putExtra("username", us)
                startActivity(i)
            } else
                Toast.makeText(this, "Incorrect! Default password is-  abcd", Toast.LENGTH_SHORT).show()
        }


        permission.setOnClickListener{


            val intent= Intent()
            intent.action = Intent.ACTION_SEND
            var pass:String = Password.text.toString()
            var us: String ="HEY! Recommended Rescue app _link_"
            intent.putExtra(Intent.EXTRA_TEXT,us)
            intent.type="text/plain"
            startActivity(Intent.createChooser(intent,"Share with:"))

        }



    }
}
