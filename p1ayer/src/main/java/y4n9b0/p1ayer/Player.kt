package y4n9b0.p1ayer

import android.net.Uri
import android.view.SurfaceView
import android.view.TextureView

interface Player {

    /**
     * local file: Uri.fromFile(file)
     * remote url: Uri.parse(url)
     */
    fun setMediaSource(uri: Uri)

    fun prepare()

    fun play()

    fun setVideoSurfaceView(surfaceView: SurfaceView?)

    fun setVideoTextureView(textureView: TextureView?)
}