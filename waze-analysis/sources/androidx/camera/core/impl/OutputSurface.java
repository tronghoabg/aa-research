package androidx.camera.core.impl;

import android.util.Size;
import android.view.Surface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class OutputSurface {
    public static OutputSurface create(Surface surface, Size size, int i2) {
        return new AutoValue_OutputSurface(surface, size, i2);
    }

    public abstract int getImageFormat();

    public abstract Size getSize();

    public abstract Surface getSurface();
}
