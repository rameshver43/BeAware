

package com.omen.acer.rescue.feature

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.omen.acer.rescue.feature.R.id.disaster
import kotlinx.android.synthetic.main.activity_1.*
import kotlinx.android.synthetic.main.list.view.*

class SetAdapter(val context: Context,private val dis: List<Disaster>) : RecyclerView.Adapter<SetAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return dis.size
    }

    override fun onBindViewHolder(holder: ViewHolder, p1: Int) {
        val d=dis[p1]
        holder.setData(d,p1)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view =LayoutInflater.from(context).inflate(R.layout.list ,p0,false)
        return ViewHolder(view)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private var currentD:Disaster? =null
        private var currentPos:Int =0
        init{
            itemView.setOnClickListener{
                Toast.makeText(context,"redirecting",Toast.LENGTH_SHORT).show()
                val intent= Intent()
                intent.action = Intent.ACTION_VIEW
                var link:String = itemView.disaster.text.toString()

                intent.data= Uri.parse("https://en.wikipedia.org/wiki/"+link);

                context.startActivity(intent)
            }
            itemView.imageView.setOnClickListener{

                val intent= Intent(context,MapsActivity1::class.java)
                context.startActivity(intent)

            }
        }

        fun setData(d: Disaster?, pos:Int){
            itemView.disaster.text= d!!.name
            this.currentD= d
            this.currentPos =pos
        }
    }
}