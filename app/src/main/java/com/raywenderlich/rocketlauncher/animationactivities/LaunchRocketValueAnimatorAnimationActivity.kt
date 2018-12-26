package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValueAnimatorAnimationActivity : BaseAnimationActivity() {

    override fun onStartAnimation() {
        // values start at 0f and end with -screenHeight
        // Y from top to bottom. X from right to left
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

            // default delay for update is 10 ms.
            valueAnimator.addUpdateListener {
            // get current value from the animator and cast to float. (because of ofFloat())
            val value = it.animatedValue as Float
            // change the rocket position be settings its translationY value
            rocket.translationY = value
        }

        // set up the animator's duration and interpolator
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION

        valueAnimator.start()
    }

}
