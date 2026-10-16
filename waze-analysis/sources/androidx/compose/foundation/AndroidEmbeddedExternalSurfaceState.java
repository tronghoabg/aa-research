package androidx.compose.foundation;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.muxer.MuxerUtil;
import h.g.b.x;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends BaseAndroidExternalSurfaceState implements TextureView.SurfaceTextureListener {
    private final Matrix matrix;
    private long surfaceSize;
    private Surface surfaceTextureSurface;

    public AndroidEmbeddedExternalSurfaceState(af afVar) {
        super(afVar);
        this.surfaceSize = IntSize.Companion.m11344getZeroYbymL2g();
        this.matrix = new Matrix();
    }

    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name */
    public final long m1953getSurfaceSizeYbymL2g() {
        return this.surfaceSize;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.m11337equalsimpl0(this.surfaceSize, IntSize.Companion.m11344getZeroYbymL2g())) {
            long j2 = this.surfaceSize;
            int i4 = (int) (j2 >> 32);
            i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            surfaceTexture.setDefaultBufferSize(i4, i3);
            i2 = i4;
        }
        Surface surface = new Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, i2, i3);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.surfaceTextureSurface;
        x.c(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (!IntSize.m11337equalsimpl0(this.surfaceSize, IntSize.Companion.m11344getZeroYbymL2g())) {
            long j2 = this.surfaceSize;
            int i4 = (int) (j2 >> 32);
            i3 = (int) (j2 & MuxerUtil.UNSIGNED_INT_MAX_VALUE);
            surfaceTexture.setDefaultBufferSize(i4, i3);
            i2 = i4;
        }
        Surface surface = this.surfaceTextureSurface;
        x.c(surface);
        dispatchSurfaceChanged(surface, i2, i3);
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m1954setSurfaceSizeozmzZPI(long j2) {
        this.surfaceSize = j2;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
