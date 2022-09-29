package com.marcos.contraintlayout

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.transition.TransitionManager
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet

class MainActivity : AppCompatActivity() {
    val constraintLayout: View? = findViewById(androidx.constraintlayout.widget.R.id.constraint)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.keyframe1)
        val constraintLayout: View? = findViewById(androidx.constraintlayout.widget.R.id.constraint)
    }

    fun animateToKeyframeTwo() {
        val constraintSet = ConstraintSet()
        constraintSet.load(this, R.layout.keyframe2)
        //TransitionManager.beginDelayedTransition()
        constraintSet.applyTo(constraintLayout as ConstraintLayout?)
    }

}