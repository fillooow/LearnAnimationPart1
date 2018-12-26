package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class RotateRocketAnimationActivity : BaseAnimationActivity() {

  override fun onStartAnimation() {
      val valueAnimator = ValueAnimator.ofFloat(0f, 360f)

      valueAnimator.addUpdateListener {
          val value = it.animatedValue as Float
          if (value >= 180f) {
              rocket.rotation = value
          } else {
              rocket.rotation = -value
          }
          doge.rotation = value
      }

      valueAnimator.interpolator = LinearInterpolator()
      valueAnimator.duration = BaseAnimationActivity.DEFAULT_ANIMATION_DURATION
      valueAnimator.start()
  }
}
