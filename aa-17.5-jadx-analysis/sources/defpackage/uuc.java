package defpackage;

import android.opengl.GLES20;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* loaded from: classes3.dex */
public final class uuc {
    private static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/GlConstantsProvider");
    private static uub b;

    @ResultIgnorabilityUnspecified
    public static synchronized uub a() {
        uub uubVar;
        EGLContext eGLContextEglGetCurrentContext;
        EGLDisplay eGLDisplayEglGetDisplay;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        uubVar = b;
        if (uubVar == null) {
            vaq.d();
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            uubVar = null;
            if (egl10 != null && (eGLContextEglGetCurrentContext = egl10.eglGetCurrentContext()) != null) {
                if (eGLContextEglGetCurrentContext.equals(EGL10.EGL_NO_CONTEXT)) {
                    ((ynz) ((ynz) a.h()).ai(9664)).u("No current context - attempting to create off-screen context");
                    eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                    if (!eGLDisplayEglGetDisplay.equals(EGL10.EGL_NO_DISPLAY)) {
                        egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
                        int[][] iArr = {new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12326, 8, 12325, 8, 12352, 4, 12344}, new int[]{12326, 8, 12325, 8, 12338, 0, 12344}};
                        int[][] iArr2 = {new int[]{12440, 2, 12344}, new int[]{12440, 1, 12344}};
                        EGLSurface eGLSurface = null;
                        EGLContext eGLContext = eGLContextEglGetCurrentContext;
                        int i = 0;
                        while (true) {
                            if (i >= 2) {
                                eGLContextEglGetCurrentContext = eGLContext;
                                eGLSurfaceEglCreatePbufferSurface = eGLSurface;
                                break;
                            }
                            int[] iArr3 = new int[1];
                            EGLDisplay eGLDisplay = eGLDisplayEglGetDisplay;
                            egl10.eglChooseConfig(eGLDisplay, iArr[i], null, 0, iArr3);
                            int i2 = iArr3[0];
                            EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                            egl10.eglChooseConfig(eGLDisplay, iArr[i], eGLConfigArr, i2, iArr3);
                            eGLDisplayEglGetDisplay = eGLDisplay;
                            if (iArr3[0] > 0) {
                                eGLContextEglGetCurrentContext = egl10.eglCreateContext(eGLDisplayEglGetDisplay, eGLConfigArr[0], EGL10.EGL_NO_CONTEXT, iArr2[i]);
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
                if (eGLContextEglGetCurrentContext == null || eGLContextEglGetCurrentContext.equals(EGL10.EGL_NO_CONTEXT)) {
                    ((ynz) ((ynz) ((ynz) a.h()).p(new RuntimeException("Failed to create off-screen context"))).ai(9661)).u("GlConstantsProvider");
                } else {
                    String strGlGetString = GLES20.glGetString(7936);
                    String strGlGetString2 = GLES20.glGetString(7938);
                    String strGlGetString3 = GLES20.glGetString(7937);
                    int[] iArr4 = new int[1];
                    GLES20.glGetIntegerv(3379, iArr4, 0);
                    int i3 = iArr4[0];
                    if (i3 == 0) {
                        i3 = 2048;
                    }
                    int i4 = i3;
                    GLES20.glGetIntegerv(35660, iArr4, 0);
                    int i5 = iArr4[0];
                    GLES20.glGetIntegerv(36347, iArr4, 0);
                    int i6 = iArr4[0];
                    int[] iArr5 = new int[2];
                    GLES20.glGetIntegerv(33902, iArr5, 0);
                    int i7 = iArr5[1];
                    GLES20.glGetIntegerv(34921, iArr5, 0);
                    int i8 = iArr5[0];
                    String strGlGetString4 = GLES20.glGetString(7939);
                    uua uuaVar = uua.NONE;
                    if (strGlGetString4 != null) {
                        Iterator it = xxx.c(' ').g(strGlGetString4).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str = (String) it.next();
                            if (woy.at(str, "GL_OES_TEXTURE_NPOT")) {
                                uuaVar = uua.FULL;
                                break;
                            }
                            if (woy.at(str, "GL_IMG_TEXTURE_NPOT") || woy.at(str, "GL_NV_TEXTURE_NPOT_2D_MIPMAP")) {
                                uuaVar = uua.CLAMP;
                            }
                        }
                    }
                    uua uuaVar2 = uuaVar;
                    if (eGLSurfaceEglCreatePbufferSurface != null && eGLDisplayEglGetDisplay != null) {
                        egl10.eglMakeCurrent(eGLDisplayEglGetDisplay, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT);
                        egl10.eglDestroySurface(eGLDisplayEglGetDisplay, eGLSurfaceEglCreatePbufferSurface);
                        egl10.eglDestroyContext(eGLDisplayEglGetDisplay, eGLContextEglGetCurrentContext);
                    }
                    if (strGlGetString == null && strGlGetString2 == null && strGlGetString3 == null && strGlGetString4 == null) {
                        ((ynz) ((ynz) ((ynz) a.h()).p(new RuntimeException("Failed to get GlConstants"))).ai(9663)).u("GlConstantsProvider");
                    } else {
                        uub uubVar2 = new uub(strGlGetString, strGlGetString2, strGlGetString3, i4, i5, i6, i7, i8, uuaVar2);
                        ((ynz) ((ynz) a.f()).ai(9662)).y("Created GlConstants: %s", uubVar2);
                        uubVar = uubVar2;
                    }
                }
            }
            b = uubVar;
            if (uubVar == null) {
                uub uubVar3 = new uub("invalid", "invalid", "invalid", 2048, 0, 128, 1, 8, uua.NONE);
                b = uubVar3;
                uubVar = uubVar3;
            }
        }
        return uubVar;
    }

    private static void b(EGL10 egl10) {
        int iEglGetError = egl10.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        ((ynz) ((ynz) a.h()).ai(9660)).w("EglError %d", iEglGetError);
    }
}
