package com.example.recycleviewwithmultiplebuttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recycleviewwithmultiplebuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            recyle.setLayoutManager(GridLayoutManager(this@MainActivity, 2))
        }
        val data = ArrayList<ItemsViewModel>()
        data.add(ItemsViewModel("Button 1"))
        data.add(ItemsViewModel("Button 2"))
        data.add(ItemsViewModel("Button 3"))
        data.add(ItemsViewModel("Button 4"))
        data.add(ItemsViewModel("Button 5"))
        data.add(ItemsViewModel("Button 6"))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        binding.recyle.adapter = adapter
    }
}