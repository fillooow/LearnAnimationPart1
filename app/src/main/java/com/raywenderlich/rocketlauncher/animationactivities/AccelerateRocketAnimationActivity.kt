package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.AccelerateInterpolator

class AccelerateRocketAnimationActivity : BaseAnimationActivity() {
    var b1 = false

    override fun onStartAnimation() {
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight/4)

        val valueAnimatorDoge = ValueAnimator.ofFloat(0f, screenHeight/8)
        valueAnimatorDoge.addUpdateListener {
            val value = it.animatedValue as Float
            doge.scaleX = value
            doge.scaleY = value
        }
        valueAnimatorDoge.interpolator = AccelerateInterpolator(1.5f)
        valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION*2

        valueAnimator.addUpdateListener {
            val value = it.animatedValue as Float
            rocket.rotationX = value
            rocket.rotationY = value
            if (value < -screenHeight/8){
                b1 = true
            }
            if (b1){
                b1 = false
                valueAnimatorDoge.start()
            }
        }

        valueAnimator.interpolator = AccelerateInterpolator(1.5f)
        valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        valueAnimator.start()
    }
}
