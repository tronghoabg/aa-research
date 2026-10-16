package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface GlObjectsProvider {
    GlTextureInfo createBuffersForTexture(int i2, int i3, int i4);

    EGLContext createEglContext(EGLDisplay eGLDisplay, int i2, int[] iArr);

    EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i2, boolean z);

    EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay);

    void release(EGLDisplay eGLDisplay);
}
