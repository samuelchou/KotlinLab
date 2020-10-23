package studio.ultoolapp.kotlinlab.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list_example.view.*
import studio.ultoolapp.kotlinlab.R
import studio.ultoolapp.kotlinlab.data.SimpleItem
import studio.ultoolapp.kotlinlab.viewmodel.BasicRecAdapter
import java.util.*

class ActivityList : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var recyclerAdapter: RecyclerView.Adapter<*>
    private var items = ArrayList<SimpleItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        items.add(SimpleItem(1, "John", "Director"))
        items.add(SimpleItem(2, "Adam", "Artist"))
        items.add(SimpleItem(3, "Bill", "Programmer"))
        items.add(SimpleItem(4, "Coco", "Manager"))

        // recyclerAdapter = simpleAdapter
        recyclerAdapter = BasicRecAdapter(this).apply {
            submitList(items)
        }

        recyclerView = findViewById<RecyclerView>(R.id.recyclerView).apply {
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = LinearLayoutManager(this@ActivityList)

            adapter = recyclerAdapter
        }
    }

    private val simpleAdapter =
        object : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
            override fun onCreateViewHolder(
                parent: ViewGroup,
                viewType: Int
            ): RecyclerView.ViewHolder {
                val view = LayoutInflater.from(this@ActivityList)
                    .inflate(R.layout.item_list_example, parent, false)
                return object : RecyclerView.ViewHolder(view) {}
            }

            override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
                holder.itemView.itemTitle.text = items[position].name
            }

            override fun getItemCount(): Int {
                return items.size
            }
        }
}