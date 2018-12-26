package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ObjectAnimator

class LaunchRocketObjectAnimatorAnimationActivity : BaseAnimationActivity() {
  override fun onStartAnimation() {
    val objectAnimator = ObjectAnimator.ofFloat(rocket, // object to animate
            "translationY", // changing property
            0f,
            -screenHeight)

    objectAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION
    objectAnimator.start()
  }
}
