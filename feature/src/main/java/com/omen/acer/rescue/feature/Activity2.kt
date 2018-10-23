package com.omen.acer.rescue.feature

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.omen.acer.rescue.feature.R.id.rview
import kotlinx.android.synthetic.main.activity_2.*

class Activity2: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val bundle: Bundle? =intent.extras
        var user=bundle?.getString("username")

        val layoutmanager = LinearLayoutManager(this)
        layoutmanager.orientation = LinearLayoutManager.VERTICAL
        rview.layoutManager = layoutmanager
        val ada= SetAdapter(this, Set.Dset)
        rview.adapter= ada


    }
}