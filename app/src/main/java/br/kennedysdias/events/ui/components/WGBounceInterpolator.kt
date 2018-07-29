package br.kennedysdias.events.ui.components

class WGBounceInterpolator(
		private val mAmplitude: Double = 0.5,
		private val mFrequency: Double = 5.0
) : android.view.animation.Interpolator {

	override fun getInterpolation(time: Float): Float {
		return (-1.0 * Math.pow(Math.E, -time / mAmplitude) * Math.cos(mFrequency * time) + 1).toFloat()
	}
}