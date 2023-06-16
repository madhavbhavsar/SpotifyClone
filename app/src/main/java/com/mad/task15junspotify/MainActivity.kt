package com.mad.task15junspotify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mad.task15junspotify.adapter.AdapterBig
import com.mad.task15junspotify.adapter.AdapterCircle
import com.mad.task15junspotify.adapter.AdapterSmall
import com.mad.task15junspotify.adapter.AdapterSquare
import com.mad.task15junspotify.model.ModelBig
import com.mad.task15junspotify.model.ModelSmall
import com.mad.task15junspotify.model.ModelSquare

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var s1 :ModelSmall = ModelSmall(R.drawable.img_1,"Liked1")
        var s2 :ModelSmall = ModelSmall(R.drawable.img_2,"Liked2")
        var s3 :ModelSmall = ModelSmall(R.drawable.img_3,"Liked3")
        var s4:ModelSmall = ModelSmall(R.drawable.img_4,"Liked4")
        var s5 :ModelSmall = ModelSmall(R.drawable.img_5,"Liked5")
        var s6 :ModelSmall = ModelSmall(R.drawable.img_6,"Liked6")

        var recyclerViewSmall : RecyclerView = findViewById(R.id.recyclerViewSmall)
        recyclerViewSmall.layoutManager = GridLayoutManager(this,2)
        recyclerViewSmall.adapter = AdapterSmall(listOf(s1,s2,s3,s4,s5,s6))


        var sq1 = ModelSquare(R.drawable.img_1,"Liked1","Shows1")
        var sq2 = ModelSquare(R.drawable.img_2,"Liked2","Shows2")
        var sq3 = ModelSquare(R.drawable.img_3,"Liked3","Shows3")
        var sq4 = ModelSquare(R.drawable.img_4,"Liked4","Shows4")

        var recyclerViewSquare : RecyclerView = findViewById(R.id.recyclerViewSquare)
        recyclerViewSquare.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewSquare.adapter = AdapterSquare(listOf(sq1,sq2,sq3,sq4))



        var c1 :ModelSmall = ModelSmall(R.drawable.img_6,"Hello")
        var c2 :ModelSmall = ModelSmall(R.drawable.img_7,"World")
        var c3 :ModelSmall = ModelSmall(R.drawable.img_8,"Space")
        var c4:ModelSmall = ModelSmall(R.drawable.img_9,"Alien")
        var c5 :ModelSmall = ModelSmall(R.drawable.img_1,"Galaxy")
        var c6 :ModelSmall = ModelSmall(R.drawable.img_2,"Stars")

        var recyclerViewCircle : RecyclerView = findViewById(R.id.recyclerViewCircle)
        recyclerViewCircle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerViewCircle.adapter = AdapterCircle(listOf(c1,c2,c3,c4,c5,c6))


        var b1:ModelBig = ModelBig(R.drawable.img_1,R.drawable.img_6,"Hello Morning","JVKE and more")
        var b2:ModelBig = ModelBig(R.drawable.img_1,R.drawable.img_6,"Hello Morning","JVKE and more")
        var b3:ModelBig = ModelBig(R.drawable.img_1,R.drawable.img_6,"Hello Morning","JVKE and more")
        var b4:ModelBig = ModelBig(R.drawable.img_1,R.drawable.img_6,"Hello Morning","JVKE and more")

        var recyclerViewBig : RecyclerView = findViewById(R.id.recyclerViewBig)
        recyclerViewBig.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerViewBig.adapter = AdapterBig(listOf(b1,b2,b3,b4))


    }
}