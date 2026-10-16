package androidx.car.app;

import android.view.Surface;
import androidx.car.app.annotations.CarProtocol;

/* compiled from: WazeSource */
@CarProtocol
/* loaded from: classes2.dex */
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;
    private final Surface mSurface;
    private final int mWidth;

    private SurfaceContainer() {
        this.mSurface = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDpi = 0;
    }

    public int getDpi() {
        return this.mDpi;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public String toString() {
        return "[" + this.mSurface + ", " + this.mWidth + "x" + this.mHeight + ", dpi: " + this.mDpi + "]";
    }

    public SurfaceContainer(Surface surface, int i2, int i3, int i4) {
        this.mSurface = surface;
        this.mWidth = i2;
        this.mHeight = i3;
        this.mDpi = i4;
    }
}
