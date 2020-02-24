package com.example.splashscreen

import android.animation.Animator
import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        av_from_code.setAnimation("screen.json")
        av_from_code.playAnimation()
        av_from_code.loop(true)

        val animation = AnimationUtils.loadAnimation(applicationContext, R.anim.myanimation)
        val imageNewTest = button


        val imageTest = RotateView.generateRotateValueAnimatorVertical(imageRotateTest)
//        imageTest.start()
        imageTest.addListener(object : Animator.AnimatorListener{
            override fun onAnimationRepeat(animation: Animator?) {
            }
            override fun onAnimationEnd(animation: Animator?) {
//                startActivity(Intent(applicationContext,Main2Activity::class.java))
//                finish()
            }
            override fun onAnimationCancel(animation: Animator?) {
            }
            override fun onAnimationStart(animation: Animator?) {
            }
        })

        tvAppTitle.setOnClickListener {
            RotateView.generateRotateValueAnimatorHorizontal(tvAppTitle)
                .start()
            imageTest.start()
        }
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "Paused", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "Stoped", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "Destroied", Toast.LENGTH_SHORT).show()

    }
}

