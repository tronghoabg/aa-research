package androidx.car.app;

/* JADX INFO: loaded from: classes2.dex */
@defpackage.rg
public final class SurfaceContainer {
    private final int mDpi;
    private final int mHeight;
    private final android.view.Surface mSurface;
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

    public android.view.Surface getSurface() {
        return this.mSurface;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public java.lang.String toString() {
        return "[" + this.mSurface + ", " + this.mWidth + "x" + this.mHeight + ", dpi: " + this.mDpi + "]";
    }

    public SurfaceContainer(android.view.Surface surface, int i, int i2, int i3) {
        this.mSurface = surface;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDpi = i3;
    }
}
