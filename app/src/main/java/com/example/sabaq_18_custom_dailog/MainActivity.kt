package com.example.sabaq_18_custom_dailog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.custom.*

class MainActivity : AppCompatActivity() {

    val adapter: com.example.sabaq_18_custom_dailog.ListAdapter = ListAdapter(this)
    var position_1: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageKvartal.setOnClickListener {
            val dialog = Custom_class(this, this)
            dialog.show()
            dialog.btnOk.setOnClickListener {
                val position: Int = position_1
                onClickItemSel(position, "Kvartal:  ", Kvartal)
                dialog.dismiss()
            }
        }

        imageKvartira.setOnClickListener {
            val dialog = Custom_class(this, this)
            dialog.show()
            dialog.btnOk.setOnClickListener {
                val position: Int = position_1
                onClickItemSel(position, "Kvartira:  ", Kvartira)
                dialog.dismiss()
            }
        }

        imageDom.setOnClickListener {
            val dialog = Custom_class(this, this)
            dialog.show()
            dialog.btnOk.setOnClickListener {
                val position: Int = position_1
                onClickItemSel(position, "Dom:  ", Dom)
                dialog.dismiss()
            }
        }

        imageCancel.setOnClickListener {
            finish()
        }

    }

    fun OnClickRecyclerView(position: Int): Int{
        position_1 = position
        return position_1
    }

    fun onItemClick(position: Int){
        val pos: Int = OnClickRecyclerView(position)
        Toast.makeText(this, "Item Clickes ${pos+1}", Toast.LENGTH_SHORT).show()
    }
    fun onClickItemSel(position: Int, text: String, textview: TextView){
        val pos: Int = OnClickRecyclerView(position)
        textview.text = text + (pos+1).toString()
    }
}
