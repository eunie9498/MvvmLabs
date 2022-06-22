package com.mvvm.labs.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.google.gson.Gson
import com.mvvm.labs.R
import com.mvvm.labs.databinding.ActivityMainBinding
import com.mvvm.labs.di.DaggerMainComponent
import com.mvvm.labs.di.MainComponent
import com.mvvm.labs.di.MainModule
import com.mvvm.labs.network.MainAPI
import com.mvvm.labs.repository.MainRepository
import com.mvvm.labs.viewmodel.MainViewModel
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: MainViewModel
    lateinit var component: MainComponent
    lateinit var binding: ActivityMainBinding

    @Inject
    lateinit var api: MainAPI

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        component = DaggerMainComponent.builder().networkModule(MainModule(this)).build()
        component.inject(this)

        api.run {
            getList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    
                }
        }
    }

}