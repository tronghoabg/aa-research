package androidx.camera.core.processing.util;

import android.opengl.EGLSurface;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class OutputSurface {
    public static OutputSurface of(EGLSurface eGLSurface, int i2, int i3) {
        return new AutoValue_OutputSurface(eGLSurface, i2, i3);
    }

    public abstract EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}
