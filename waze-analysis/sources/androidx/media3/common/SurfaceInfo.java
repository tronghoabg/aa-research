package androidx.media3.common;

import android.view.Surface;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class SurfaceInfo {
    public final int height;
    public final boolean isEncoderInputSurface;
    public final int orientationDegrees;
    public final Surface surface;
    public final int width;

    public SurfaceInfo(Surface surface, int i2, int i3, int i4, boolean z) {
        boolean z2 = true;
        if (i4 != 0 && i4 != 90 && i4 != 180) {
            if (i4 == 270) {
                i4 = 270;
            } else {
                z2 = false;
            }
        }
        an.m(z2, "orientationDegrees must be 0, 90, 180, or 270");
        this.surface = surface;
        this.width = i2;
        this.height = i3;
        this.orientationDegrees = i4;
        this.isEncoderInputSurface = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SurfaceInfo)) {
            return false;
        }
        SurfaceInfo surfaceInfo = (SurfaceInfo) obj;
        return this.width == surfaceInfo.width && this.height == surfaceInfo.height && this.orientationDegrees == surfaceInfo.orientationDegrees && this.isEncoderInputSurface == surfaceInfo.isEncoderInputSurface && this.surface.equals(surfaceInfo.surface);
    }

    public int hashCode() {
        return (((((((this.surface.hashCode() * 31) + this.width) * 31) + this.height) * 31) + this.orientationDegrees) * 31) + (this.isEncoderInputSurface ? 1 : 0);
    }

    public SurfaceInfo(Surface surface, int i2, int i3, int i4) {
        this(surface, i2, i3, i4, false);
    }

    public SurfaceInfo(Surface surface, int i2, int i3) {
        this(surface, i2, i3, 0);
    }
}
