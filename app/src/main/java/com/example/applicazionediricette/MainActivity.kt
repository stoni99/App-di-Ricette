package com.example.applicazionediricette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.content.Intent
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {
    lateinit var cerca : Button
    lateinit var nuovaRicetta : Button
    lateinit var preferite : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       cerca = findViewById(R.id.cercaActivityButton)
       cerca.setOnClickListener() {
            changeActivityToSearch(it)
        }
        nuovaRicetta = findViewById(R.id.nuovaRicettaButton)
        nuovaRicetta.setOnClickListener() {
            changeActivityToNewRecipe(it)
        }
        preferite = findViewById(R.id.preferiteButton)
        preferite.setOnClickListener() {
            changeActivityToMyRecipes(it)
        }

    }
    private fun changeActivityToSearch(button: View) {
        val intent = Intent(this, CercaActivity.class)
        startActivity(this.intent)
    }
    private fun changeActivityToNewRecipe(button: View) {
        val intent = Intent(this, NuovaRicettaActivity.class)
        startActivity(this.intent)
    }
    private fun changeActivityToMyRecipes(button: View) {
        val intent = Intent(this, Preferite.class)
        startActivity(this.intent)
    }

}