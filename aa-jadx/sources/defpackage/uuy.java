package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uuy {
    private static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/GlConstantsProvider");
    private static defpackage.uux b;

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static synchronized defpackage.uux a() {
        defpackage.uux uuxVar;
        javax.microedition.khronos.egl.EGLContext eGLContextEglGetCurrentContext;
        javax.microedition.khronos.egl.EGLDisplay eGLDisplayEglGetDisplay;
        javax.microedition.khronos.egl.EGLSurface eGLSurfaceEglCreatePbufferSurface;
        uuxVar = b;
        if (uuxVar == null) {
            defpackage.vbn.d();
            javax.microedition.khronos.egl.EGL10 egl10 = (javax.microedition.khronos.egl.EGL10) javax.microedition.khronos.egl.EGLContext.getEGL();
            uuxVar = null;
            if (egl10 != null && (eGLContextEglGetCurrentContext = egl10.eglGetCurrentContext()) != null) {
                if (eGLContextEglGetCurrentContext.equals(javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT)) {
                    ((defpackage.ype) ((defpackage.ype) a.h()).ai(9692)).u("No current context - attempting to create off-screen context");
                    eGLDisplayEglGetDisplay = egl10.eglGetDisplay(javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY);
                    if (!eGLDisplayEglGetDisplay.equals(javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY)) {
                        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
                        int[][] iArr = {new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12326, 8, 12325, 8, 12352, 4, 12344}, new int[]{12326, 8, 12325, 8, 12338, 0, 12344}};
                        int[][] iArr2 = {new int[]{12440, 2, 12344}, new int[]{12440, 1, 12344}};
                        javax.microedition.khronos.egl.EGLSurface eGLSurface = null;
                        javax.microedition.khronos.egl.EGLContext eGLContext = eGLContextEglGetCurrentContext;
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                eGLContextEglGetCurrentContext = eGLContext;
                                eGLSurfaceEglCreatePbufferSurface = eGLSurface;
                                break;
                            }
                            int[] iArr3 = new int[1];
                            javax.microedition.khronos.egl.EGLDisplay eGLDisplay = eGLDisplayEglGetDisplay;
                            egl10.eglChooseConfig(eGLDisplay, iArr[i], null, 0, iArr3);
                            int i2 = iArr3[0];
                            javax.microedition.khronos.egl.EGLConfig[] eGLConfigArr = new javax.microedition.khronos.egl.EGLConfig[i2];
                            egl10.eglChooseConfig(eGLDisplay, iArr[i], eGLConfigArr, i2, iArr3);
                            eGLDisplayEglGetDisplay = eGLDisplay;
                            if (iArr3[0] > 0) {
                                eGLContextEglGetCurrentContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT, iArr2[i]);
                                b(egl10);
                                eGLSurfaceEglCreatePbufferSurface = egl10.eglCreatePbufferSurface(eGLDisplayEglGetDisplay, eGLConfigArr[0], new int[]{12375, 2, 12374, 2, 12344});
                                b(egl10);
                                boolean zEglMakeCurrent = egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglGetCurrentContext);
                                b(egl10);
                                if (zEglMakeCurrent) {
                                    break;
                                }
                                eGLContext = eGLContextEglGetCurrentContext;
                                eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                            }
                            i++;
                        }
                    } else {
                        eGLSurfaceEglCreatePbufferSurface = null;
                    }
                } else {
                    eGLDisplayEglGetDisplay = null;
                    eGLSurfaceEglCreatePbufferSurface = null;
                }
                if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext.equals(javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT)) {
                    ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.h()).p(new java.lang.RuntimeException("Failed to create off-screen context"))).ai(9689)).u("GlConstantsProvider");
                } else {
                    java.lang.String strGlGetString = android.opengl.GLES20.glGetString(7936);
                    java.lang.String strGlGetString2 = android.opengl.GLES20.glGetString(7938);
                    java.lang.String strGlGetString3 = android.opengl.GLES20.glGetString(7937);
                    int[] iArr4 = new int[1];
                    android.opengl.GLES20.glGetIntegerv(3379, iArr4, 0);
                    int i3 = iArr4[0];
                    if (i3 == 0) {
                        i3 = 2048;
                    }
                    int i4 = i3;
                    android.opengl.GLES20.glGetIntegerv(35660, iArr4, 0);
                    int i5 = iArr4[0];
                    android.opengl.GLES20.glGetIntegerv(36347, iArr4, 0);
                    int i6 = iArr4[0];
                    int[] iArr5 = new int[2];
                    android.opengl.GLES20.glGetIntegerv(33902, iArr5, 0);
                    int i7 = iArr5[1];
                    android.opengl.GLES20.glGetIntegerv(34921, iArr5, 0);
                    int i8 = iArr5[0];
                    java.lang.String strGlGetString4 = android.opengl.GLES20.glGetString(7939);
                    defpackage.uuw uuwVar = defpackage.uuw.NONE;
                    if (strGlGetString4 != null) {
                        for (java.lang.String str : defpackage.xzd.c(' ').g(strGlGetString4)) {
                            if (defpackage.ysr.bD(str, "GL_OES_TEXTURE_NPOT")) {
                                uuwVar = defpackage.uuw.FULL;
                                break;
                            }
                            if (defpackage.ysr.bD(str, "GL_IMG_TEXTURE_NPOT") || defpackage.ysr.bD(str, "GL_NV_TEXTURE_NPOT_2D_MIPMAP")) {
                                uuwVar = defpackage.uuw.CLAMP;
                            }
                        }
                    }
                    defpackage.uuw uuwVar2 = uuwVar;
                    if (eGLSurfaceEglCreatePbufferSurface != null && eGLDisplayEglGetDisplay != null) {
                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE, javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT);
                        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglGetCurrentContext);
                    }
                    if (strGlGetString == null && strGlGetString2 == null && strGlGetString3 == null && strGlGetString4 == null) {
                        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.h()).p(new java.lang.RuntimeException("Failed to get GlConstants"))).ai(9691)).u("GlConstantsProvider");
                    } else {
                        defpackage.uux uuxVar2 = new defpackage.uux(strGlGetString, strGlGetString2, strGlGetString3, i4, i5, i6, i7, i8, uuwVar2);
                        ((defpackage.ype) ((defpackage.ype) a.f()).ai(9690)).y("Created GlConstants: %s", uuxVar2);
                        uuxVar = uuxVar2;
                    }
                }
            }
            b = uuxVar;
            if (uuxVar == null) {
                defpackage.uux uuxVar3 = new defpackage.uux("invalid", "invalid", "invalid", 2048, 0, 128, 1, 8, defpackage.uuw.NONE);
                b = uuxVar3;
                uuxVar = uuxVar3;
            }
        }
        return uuxVar;
    }

    private static void b(javax.microedition.khronos.egl.EGL10 egl10) {
        int iEglGetError = egl10.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        ((defpackage.ype) ((defpackage.ype) a.h()).ai(9688)).w("EglError %d", iEglGetError);
    }
}
