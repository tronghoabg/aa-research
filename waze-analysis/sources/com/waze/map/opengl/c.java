package com.waze.map.opengl;

import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements b {
    @Override // com.waze.map.opengl.b
    public final EGL10 a() {
        EGL egl = EGLContext.getEGL();
        h.g.b.x.d(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        return (EGL10) egl;
    }
}
