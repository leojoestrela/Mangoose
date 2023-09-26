package com.eutropiosaboya.mangoose.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.eutropiosaboya.mangoose.R
import com.eutropiosaboya.mangoose.databinding.ActivityMainBinding
import com.eutropiosaboya.mangoose.webservice.model.ResponseManga
import com.eutropiosaboya.mangoose.webservice.retrofit.Endpoint
import com.eutropiosaboya.mangoose.webservice.retrofit.NetworkUtils
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getData()

        binding.bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.item_feed -> {
                    true
                }

                R.id.item_ajuste -> {
                    true
                }

                R.id.item_favoritos -> {
                    true
                }

                else -> false
            }
        }
    }

    private fun getData() {
        val retrofitClient = NetworkUtils.getRetrofitInstance()
        val callback = retrofitClient.create(Endpoint::class.java).getMangas()

        callback.enqueue(object : Callback<ResponseManga> {
            override fun onResponse(call: Call<ResponseManga>, response: Response<ResponseManga>) {
                Log.i("MangaDexAPI", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<ResponseManga>, t: Throwable) {
                Log.i("MangaDexAPI", "onResponse: ${t.message}")
                Toast.makeText(this@MainActivity, t.message, Toast.LENGTH_SHORT).show()
            }
        })
    }
}