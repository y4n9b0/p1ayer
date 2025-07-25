package y4n9b0.p1ayer.ui

import android.content.Context
import android.util.AttributeSet
import android.widget.FrameLayout
import y4n9b0.p1ayer.Player

class PlayerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    var player: Player? = null
        set(value) {
            field = value
        }
}