package com.example.distancetrackerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.example.distancetrackerapp.util.Permissions.hasLocationPermission
import com.example.distancetrackerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = findNavController(R.id.navHostFragment)

        if (hasLocationPermission(this)) {
            navController.navigate(R.id.action_permissionFragment_to_mapsFragment)
        }
    }
}