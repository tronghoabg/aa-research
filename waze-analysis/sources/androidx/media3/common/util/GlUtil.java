package androidx.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.C;
import com.google.d.b.an;
import com.google.d.d.bi;
import com.google.d.d.bn;
import com.waze.strings.DisplayStrings;
import i.b.l.n;
import j$.util.Objects;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class GlUtil {
    private static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    private static final int EGL_GL_COLORSPACE_KHR = 12445;
    private static final String EXTENSION_COLORSPACE_BT2020_HLG = "EGL_EXT_gl_colorspace_bt2020_hlg";
    private static final String EXTENSION_COLORSPACE_BT2020_PQ = "EGL_EXT_gl_colorspace_bt2020_pq";
    private static final String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    private static final long GL_FENCE_SYNC_FAILED = 0;
    public static final long GL_FENCE_SYNC_UNSET = -1;
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int MAX_BITMAP_DECODING_SIZE = 4096;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int EGL_GL_COLORSPACE_BT2020_PQ_EXT = 13120;
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ = {12445, EGL_GL_COLORSPACE_BT2020_PQ_EXT, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG = {12445, 13632, 12344, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    private GlUtil() {
    }

    private static void assertValidTextureSize(int i2, int i3) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(DisplayStrings.DS_EV_NETWORKS_SETTINGS_DISCLAIMER, iArr, 0);
        int i4 = iArr[0];
        an.v(i4 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i2 < 0 || i3 < 0) {
            throw new GlException("width or height is less than 0");
        }
        if (i2 > i4 || i3 > i4) {
            throw new GlException(a.a(i4, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void awaitSyncObject(long j2) throws GlException {
        if (j2 == -1) {
            return;
        }
        if (j2 == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j2, 0, -1L);
            checkGlError();
        }
    }

    public static void bindTexture(int i2, int i3, int i4) throws GlException {
        GLES20.glBindTexture(i2, i3);
        checkGlError();
        GLES20.glTexParameteri(i2, 10240, i4);
        checkGlError();
        GLES20.glTexParameteri(i2, 10241, i4);
        checkGlError();
        GLES20.glTexParameteri(i2, n.ACQUAINTANCETYPE_FIELD_NUMBER, 33071);
        checkGlError();
        GLES20.glTexParameteri(i2, 10243, 33071);
        checkGlError();
    }

    public static void blitFrameBuffer(int i2, GlRect glRect, int i3, GlRect glRect2) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        GLES30.glBindFramebuffer(36008, i2);
        checkGlError();
        GLES30.glBindFramebuffer(36009, i3);
        checkGlError();
        GLES30.glBlitFramebuffer(glRect.left, glRect.bottom, glRect.right, glRect.top, glRect2.left, glRect2.bottom, glRect2.right, glRect2.top, 16384, C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    public static void checkEglException(String str) throws GlException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new GlException(str + ", error code: 0x" + Integer.toHexString(iEglGetError), bn.q(Integer.valueOf(iEglGetError)));
    }

    public static void checkGlError() throws GlException {
        StringBuilder sb = new StringBuilder();
        bi biVar = new bi();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            biVar.g(Integer.valueOf(iGlGetError));
            z = true;
        }
        if (z) {
            throw new GlException(sb.toString(), biVar.f());
        }
    }

    public static void checkGlException(boolean z, String str) throws GlException {
        if (!z) {
            throw new GlException(str);
        }
    }

    public static void clearFocusedBuffers() throws GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        checkGlError();
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    private static FloatBuffer createBuffer(int i2) {
        return ByteBuffer.allocateDirect(i2 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static EGLContext createEglContext(EGLContext eGLContext, EGLDisplay eGLDisplay, int i2, int[] iArr) throws GlException {
        boolean z = true;
        an.l(Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i2 != 2) {
            if (i2 == 3) {
                i2 = 3;
            } else {
                z = false;
            }
        }
        an.l(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), eGLContext, new int[]{12440, i2, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException(a.a(i2, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        checkEglException("Error in createEglContext");
        return eGLContextEglCreateContext;
    }

    public static EGLSurface createEglSurface(EGLDisplay eGLDisplay, Object obj, int i2, boolean z) throws GlException {
        int[] iArr;
        int[] iArr2;
        if (i2 == 3 || i2 == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
        } else {
            if (i2 != 7 && i2 != 6) {
                throw new IllegalArgumentException(a.a(i2, "Unsupported color transfer: "));
            }
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z) {
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_NONE;
            } else if (i2 == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_PQ;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = EGL_WINDOW_SURFACE_ATTRIBUTES_BT2020_HLG;
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
        checkEglException("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int createExternalTexture() throws GlException {
        int iGenerateTexture = generateTexture();
        bindTexture(36197, iGenerateTexture, C.TEXTURE_MIN_FILTER_LINEAR);
        return iGenerateTexture;
    }

    public static int createFboForTexture(int i2) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        GLES20.glFramebufferTexture2D(36160, 36064, DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, i2, 0);
        checkGlError();
        return iArr[0];
    }

    public static EGLSurface createFocusedPlaceholderEglSurface(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlException {
        EGLSurface eGLSurfaceCreatePbufferSurface = isSurfacelessContextExtensionSupported() ? EGL14.EGL_NO_SURFACE : createPbufferSurface(eGLDisplay, 1, 1, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
        focusEglSurface(eGLDisplay, eGLContext, eGLSurfaceCreatePbufferSurface, 1, 1);
        return eGLSurfaceCreatePbufferSurface;
    }

    public static long createGlSyncFence() throws GlException {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        checkGlError();
        GLES20.glFlush();
        checkGlError();
        return jGlFenceSync;
    }

    private static EGLSurface createPbufferSurface(EGLDisplay eGLDisplay, int i2, int i3, int[] iArr) throws GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), new int[]{12375, i2, 12374, i3, 12344}, 0);
        checkEglException("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static int createPixelBufferObject(int i2) throws GlException {
        int[] iArr = new int[1];
        GLES30.glGenBuffers(1, iArr, 0);
        checkGlError();
        GLES30.glBindBuffer(35051, iArr[0]);
        checkGlError();
        GLES30.glBufferData(35051, i2, null, 35049);
        checkGlError();
        GLES30.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static int createRgb10A2Texture(int i2, int i3) {
        return createTextureUninitialized(i2, i3, 32857, 33640);
    }

    public static int createTexture(int i2, int i3, boolean z) {
        return z ? createTextureUninitialized(i2, i3, 34842, 5131) : createTextureUninitialized(i2, i3, 6408, 5121);
    }

    private static int createTextureUninitialized(int i2, int i3, int i4, int i5) throws GlException {
        assertValidTextureSize(i2, i3);
        int iGenerateTexture = generateTexture();
        bindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, iGenerateTexture, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexImage2D(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 0, i4, i2, i3, 0, 6408, i5, null);
        checkGlError();
        return iGenerateTexture;
    }

    public static float[] createVertexBuffer(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 * 4, 4);
        }
        return fArr;
    }

    public static void deleteBuffer(int i2) throws GlException {
        GLES20.glDeleteBuffers(1, new int[]{i2}, 0);
        checkGlError();
    }

    public static void deleteFbo(int i2) throws GlException {
        GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i2) throws GlException {
        GLES20.glDeleteRenderbuffers(1, new int[]{i2}, 0);
        checkGlError();
    }

    public static void deleteSyncObject(long j2) throws GlException {
        deleteSyncObjectQuietly(j2);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j2) {
        if (j2 == -1) {
            return;
        }
        GLES30.glDeleteSync(j2);
    }

    public static void deleteTexture(int i2) throws GlException {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        checkGlError();
    }

    public static void destroyEglContext(EGLDisplay eGLDisplay, EGLContext eGLContext) throws GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglMakeCurrent(eGLDisplay, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
        checkEglException("Error releasing context");
        if (eGLContext == null || eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        checkEglException("Error destroying context");
    }

    public static void destroyEglSurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        checkEglException("Error destroying surface");
    }

    public static void focusEglSurface(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3) throws GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i2, i3);
    }

    public static void focusFramebuffer(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i4) throws GlException {
        focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i2, i3, i4);
    }

    public static void focusFramebufferUsingCurrentContext(int i2, int i3, int i4) throws GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i2) {
            GLES20.glBindFramebuffer(36160, i2);
        }
        checkGlError();
        GLES20.glViewport(0, 0, i3, i4);
        checkGlError();
    }

    private static void focusRenderTarget(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i2, int i3, int i4) throws GlException {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        checkEglException("Error making context current");
        focusFramebufferUsingCurrentContext(i2, i3, i4);
        if (eGLSurface.equals(EGL14.EGL_NO_SURFACE) || i2 != 0 || getContextMajorVersion() < 3) {
            return;
        }
        GLES30.glDrawBuffers(1, new int[]{1029}, 0);
        checkGlError();
        GLES30.glReadBuffer(1029);
        checkGlError();
    }

    public static int generateTexture() throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static long getContextMajorVersion() throws GlException {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static EGLContext getCurrentContext() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay getDefaultEglDisplay() throws GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        checkGlException(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkEglException("Error in getDefaultEglDisplay");
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig getEglConfig(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlException("eglChooseConfig failed.");
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean isBt2020HlgExtensionSupported() {
        return isExtensionSupported(EXTENSION_COLORSPACE_BT2020_HLG);
    }

    public static boolean isBt2020PqExtensionSupported() {
        return Build.VERSION.SDK_INT >= 33 && isExtensionSupported(EXTENSION_COLORSPACE_BT2020_PQ);
    }

    public static boolean isColorTransferSupported(int i2) {
        if (i2 == 6) {
            return isBt2020PqExtensionSupported();
        }
        if (i2 == 7) {
            return isBt2020HlgExtensionSupported();
        }
        return true;
    }

    private static boolean isExtensionSupported(String str) {
        String strEglQueryString = EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean isProtectedContentExtensionSupported(Context context) {
        return isExtensionSupported(EXTENSION_PROTECTED_CONTENT);
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        return isExtensionSupported(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        String strGlGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                EGLContext eGLContextCreateEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(eGLContextCreateEglContext, defaultEglDisplay);
                strGlGetString = GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, eGLContextCreateEglContext);
            } catch (GlException unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static ByteBuffer mapPixelBufferObject(int i2, int i3) throws GlException {
        GLES20.glBindBuffer(35051, i2);
        checkGlError();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i3, 1);
        checkGlError();
        GLES30.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    public static void schedulePixelBufferRead(int i2, int i3, int i4, int i5) throws GlException {
        focusFramebufferUsingCurrentContext(i2, i3, i4);
        GLES30.glBindBuffer(35051, i5);
        checkGlError();
        GLES30.glReadBuffer(36064);
        GLES30.glReadPixels(0, 0, i3, i4, 6408, 5121, 0);
        checkGlError();
        GLES30.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void setTexture(int i2, Bitmap bitmap) throws GlException {
        assertValidTextureSize(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, i2, C.TEXTURE_MIN_FILTER_LINEAR);
        GLUtils.texImage2D(DisplayStrings.DS_CONVERSATIONAL_REPORTING_BUTTON_GENERAL_ERROR, 0, bitmap, 0);
        checkGlError();
    }

    public static void setToIdentity(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void terminate(EGLDisplay eGLDisplay) throws GlException {
        EGL14.eglReleaseThread();
        checkEglException("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        checkEglException("Error terminating display");
    }

    public static void unmapPixelBufferObject(int i2) throws GlException {
        GLES30.glBindBuffer(35051, i2);
        checkGlError();
        GLES30.glUnmapBuffer(35051);
        checkGlError();
        GLES30.glBindBuffer(35051, 0);
        checkGlError();
    }

    /* compiled from: WazeSource */
    public final class GlException extends Exception {
        public final bn<Integer> errorCodes;

        public GlException(String str, List<Integer> list) {
            super(str);
            this.errorCodes = bn.n(list);
        }

        public GlException(String str) {
            this(str, bn.p());
        }
    }

    public static FloatBuffer createBuffer(float[] fArr) {
        return (FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    public static int createTexture(Bitmap bitmap) throws GlException {
        int iGenerateTexture = generateTexture();
        setTexture(iGenerateTexture, bitmap);
        return iGenerateTexture;
    }

    public static EGLContext createEglContext(EGLDisplay eGLDisplay) {
        return createEglContext(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }
}
