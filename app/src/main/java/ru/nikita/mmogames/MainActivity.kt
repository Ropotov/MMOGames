package ru.nikita.mmogames

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[MyViewModel::class.java]

        recyclerView = rv_games
        adapter = Adapter()
        recyclerView.adapter = adapter
        viewModel.getMyGames()
        viewModel.myGameList.observe(this, { list ->
            list.body()?.let { adapter.setList(it) }
        })
    }
}
