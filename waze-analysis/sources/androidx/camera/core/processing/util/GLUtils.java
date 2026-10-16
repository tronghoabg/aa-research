package androidx.camera.core.processing.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.processing.ShaderProvider;
import androidx.core.util.Preconditions;
import androidx.media3.common.C;
import i.b.l.n;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GLUtils {
    public static final int PIXEL_STRIDE = 4;
    public static final int SIZEOF_FLOAT = 4;
    public static final String TAG = "GLUtils";
    public static final FloatBuffer TEX_BUF;
    public static final float[] TEX_COORDS;
    public static final String VAR_TEXTURE = "sTexture";
    public static final String VAR_TEXTURE_COORD = "vTextureCoord";
    public static final String VERSION_UNKNOWN = "0.0";
    public static final FloatBuffer VERTEX_BUF;
    public static final float[] VERTEX_COORDS;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] HLG_SURFACE_ATTRIBS = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};
    public static final OutputSurface NO_OUTPUT_SURFACE = OutputSurface.of(EGL14.EGL_NO_SURFACE, 0, 0);

    /* compiled from: WazeSource */
    public class BlankShaderProgram extends Program2D {
        public BlankShaderProgram() {
            super(ShaderProviders.BLANK_VERTEX_SHADER, ShaderProviders.BLANK_FRAGMENT_SHADER);
        }
    }

    /* compiled from: WazeSource */
    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
    }

    private GLUtils() {
    }

    public static void checkEglErrorOrLog(String str) {
        try {
            checkEglErrorOrThrow(str);
        } catch (IllegalStateException e2) {
            Logger.e(TAG, e2.toString(), e2);
        }
    }

    public static void checkEglErrorOrThrow(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void checkGlErrorOrThrow(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void checkGlThreadOrThrow(Thread thread) {
        Preconditions.checkState(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void checkInitializedOrThrow(AtomicBoolean atomicBoolean, boolean z) {
        Preconditions.checkState(z == atomicBoolean.get(), true != z ? "OpenGlRenderer is already initialized" : "OpenGlRenderer is not initialized");
    }

    public static void checkLocationOrThrow(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] chooseSurfaceAttrib(String str, DynamicRange dynamicRange) {
        int[] iArr = EMPTY_ATTRIBS;
        if (dynamicRange.getEncoding() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return HLG_SURFACE_ATTRIBS;
            }
            Logger.w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static EGLSurface createPBufferSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i2, int i3) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i2, 12374, i3, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<InputFormat, Program2D> createPrograms(DynamicRange dynamicRange, Map<InputFormat, ShaderProvider> map, boolean z) {
        Object samplerShaderProgram;
        HashMap map2 = new HashMap();
        InputFormat[] inputFormatArrValues = InputFormat.values();
        int length = inputFormatArrValues.length;
        for (int i2 = 0; i2 < length; i2++) {
            InputFormat inputFormat = inputFormatArrValues[i2];
            ShaderProvider shaderProvider = map.get(inputFormat);
            if (shaderProvider != null) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, shaderProvider, z);
            } else if (inputFormat == InputFormat.YUV || inputFormat == InputFormat.DEFAULT) {
                samplerShaderProgram = new SamplerShaderProgram(dynamicRange, inputFormat, z);
            } else {
                boolean z2 = inputFormat == InputFormat.UNKNOWN;
                Objects.toString(inputFormat);
                Preconditions.checkState(z2, "Unhandled input format: ".concat(String.valueOf(inputFormat)));
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new BlankShaderProgram();
                } else {
                    ShaderProvider shaderProvider2 = map.get(InputFormat.DEFAULT);
                    samplerShaderProgram = shaderProvider2 != null ? new SamplerShaderProgram(dynamicRange, shaderProvider2, z) : new SamplerShaderProgram(dynamicRange, InputFormat.DEFAULT, z);
                }
            }
            Log.d(TAG, "Shader program for input format " + inputFormat + " created: " + samplerShaderProgram);
            map2.put(inputFormat, samplerShaderProgram);
        }
        return map2;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(36197, i2);
        checkGlErrorOrThrow("glBindTexture " + i2);
        GLES20.glTexParameteri(36197, 10241, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(36197, 10240, C.TEXTURE_MIN_FILTER_LINEAR);
        GLES20.glTexParameteri(36197, n.ACQUAINTANCETYPE_FIELD_NUMBER, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i2;
    }

    public static EGLSurface createWindowSurface(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void deleteFbo(int i2) {
        GLES20.glDeleteFramebuffers(1, new int[]{i2}, 0);
        checkGlErrorOrThrow("glDeleteFramebuffers");
    }

    public static void deleteTexture(int i2) {
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        checkGlErrorOrThrow("glDeleteTextures");
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlErrorOrThrow("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        return iArr[0];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getFragmentShaderSource(ShaderProvider shaderProvider) {
        try {
            String strCreateFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (strCreateFragmentShader != null && strCreateFragmentShader.contains(VAR_TEXTURE_COORD) && strCreateFragmentShader.contains(VAR_TEXTURE)) {
                return strCreateFragmentShader;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th) {
            if (th instanceof IllegalArgumentException) {
                throw th;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }

    public static String getGlVersionNumber() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return VERSION_UNKNOWN;
        }
        String strGroup = matcher.group(1);
        Preconditions.checkNotNull(strGroup);
        String strGroup2 = matcher.group(2);
        Preconditions.checkNotNull(strGroup2);
        return strGroup + "." + strGroup2;
    }

    public static Size getSurfaceSize(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(querySurface(eGLDisplay, eGLSurface, 12375), querySurface(eGLDisplay, eGLSurface, 12374));
    }

    public static int loadShader(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        checkGlErrorOrThrow("glCreateShader type=" + i2);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Logger.w(TAG, "Could not compile shader: ".concat(String.valueOf(str)));
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i2 + ":" + strGlGetShaderInfoLog);
    }

    public static int querySurface(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i2) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i2, iArr, 0);
        return iArr[0];
    }

    /* compiled from: WazeSource */
    public class SamplerShaderProgram extends Program2D {
        private int mSamplerLoc;
        private int mTexCoordLoc;
        private int mTexMatrixLoc;

        public SamplerShaderProgram(DynamicRange dynamicRange, ShaderProvider shaderProvider, boolean z) {
            super(dynamicRange.is10BitHdr() ? ShaderProviders.HDR_VERTEX_SHADER : ShaderProviders.DEFAULT_VERTEX_SHADER, GLUtils.getFragmentShaderSource(shaderProvider), z);
            this.mSamplerLoc = -1;
            this.mTexMatrixLoc = -1;
            this.mTexCoordLoc = -1;
            loadLocations();
        }

        private void loadLocations() {
            loadLocations();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, GLUtils.VAR_TEXTURE);
            this.mSamplerLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, GLUtils.VAR_TEXTURE);
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
            this.mTexCoordLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
            this.mTexMatrixLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uTexMatrix");
        }

        public void updateTextureMatrix(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTexMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public void use() {
            super.use();
            GLES20.glUniform1i(this.mSamplerLoc, 0);
            GLES20.glEnableVertexAttribArray(this.mTexCoordLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mTexCoordLoc, 2, 5126, false, 0, (Buffer) GLUtils.TEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        public SamplerShaderProgram(DynamicRange dynamicRange, ShaderProvider shaderProvider) {
            this(dynamicRange, shaderProvider, false);
        }

        public SamplerShaderProgram(DynamicRange dynamicRange, InputFormat inputFormat) {
            this(dynamicRange, inputFormat, false);
        }

        public SamplerShaderProgram(DynamicRange dynamicRange, InputFormat inputFormat, boolean z) {
            this(dynamicRange, ShaderProviders.resolveDefaultShaderProvider(dynamicRange, inputFormat, z), z);
        }
    }

    public static Map<InputFormat, Program2D> createPrograms(DynamicRange dynamicRange, Map<InputFormat, ShaderProvider> map) {
        return createPrograms(dynamicRange, map, false);
    }

    /* compiled from: WazeSource */
    public abstract class Program2D {
        protected int mAlphaScaleLoc;
        protected int mAspectRatioLoc;
        protected int mBorderColorLoc;
        protected int mBorderWidthLoc;
        protected int mCornerRadiusRatioLoc;
        protected final boolean mHasAdvancedStyling;
        protected int mPositionLoc;
        protected int mProgramHandle;
        protected int mTransMatrixLoc;

        /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected Program2D(java.lang.String r7, java.lang.String r8, boolean r9) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r0 = "glAttachShader"
                java.lang.String r1 = "Could not link program: "
                r6.<init>()
                r2 = -1
                r6.mTransMatrixLoc = r2
                r6.mAlphaScaleLoc = r2
                r6.mCornerRadiusRatioLoc = r2
                r6.mAspectRatioLoc = r2
                r6.mBorderWidthLoc = r2
                r6.mBorderColorLoc = r2
                r6.mPositionLoc = r2
                r6.mHasAdvancedStyling = r9
                r9 = 35633(0x8b31, float:4.9932E-41)
                int r7 = androidx.camera.core.processing.util.GLUtils.loadShader(r9, r7)     // Catch: java.lang.IllegalArgumentException -> L76 java.lang.IllegalStateException -> L78
                r9 = 35632(0x8b30, float:4.9931E-41)
                int r8 = androidx.camera.core.processing.util.GLUtils.loadShader(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L71 java.lang.IllegalStateException -> L73
                int r9 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L6c java.lang.IllegalStateException -> L6e
                java.lang.String r3 = "glCreateProgram"
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r3)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                android.opengl.GLES20.glAttachShader(r9, r7)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                android.opengl.GLES20.glAttachShader(r9, r8)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow(r0)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                android.opengl.GLES20.glLinkProgram(r9)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r0 = 1
                int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r4 = 0
                r5 = 35714(0x8b82, float:5.0046E-41)
                android.opengl.GLES20.glGetProgramiv(r9, r5, r3, r4)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r3 = r3[r4]     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                if (r3 != r0) goto L52
                r6.mProgramHandle = r9     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r6.loadLocations()
                return
            L52:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r9)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r0.append(r1)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                r6.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
                throw r6     // Catch: java.lang.IllegalArgumentException -> L68 java.lang.IllegalStateException -> L6a
            L68:
                r6 = move-exception
                goto L7c
            L6a:
                r6 = move-exception
                goto L7c
            L6c:
                r6 = move-exception
                goto L6f
            L6e:
                r6 = move-exception
            L6f:
                r9 = r2
                goto L7c
            L71:
                r6 = move-exception
                goto L74
            L73:
                r6 = move-exception
            L74:
                r8 = r2
                goto L7b
            L76:
                r6 = move-exception
                goto L79
            L78:
                r6 = move-exception
            L79:
                r7 = r2
                r8 = r7
            L7b:
                r9 = r8
            L7c:
                if (r7 == r2) goto L81
                android.opengl.GLES20.glDeleteShader(r7)
            L81:
                if (r8 == r2) goto L86
                android.opengl.GLES20.glDeleteShader(r8)
            L86:
                if (r9 == r2) goto L8b
                android.opengl.GLES20.glDeleteProgram(r9)
            L8b:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.processing.util.GLUtils.Program2D.<init>(java.lang.String, java.lang.String, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void loadLocations() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
            this.mPositionLoc = iGlGetAttribLocation;
            GLUtils.checkLocationOrThrow(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgramHandle, "uTransMatrix");
            this.mTransMatrixLoc = iGlGetUniformLocation;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgramHandle, "uAlphaScale");
            this.mAlphaScaleLoc = iGlGetUniformLocation2;
            GLUtils.checkLocationOrThrow(iGlGetUniformLocation2, "uAlphaScale");
            if (this.mHasAdvancedStyling) {
                int iGlGetUniformLocation3 = GLES20.glGetUniformLocation(this.mProgramHandle, "uCornerRadiusRatio");
                this.mCornerRadiusRatioLoc = iGlGetUniformLocation3;
                GLUtils.checkLocationOrThrow(iGlGetUniformLocation3, "uCornerRadiusRatio");
                int iGlGetUniformLocation4 = GLES20.glGetUniformLocation(this.mProgramHandle, "uAspectRatio");
                this.mAspectRatioLoc = iGlGetUniformLocation4;
                GLUtils.checkLocationOrThrow(iGlGetUniformLocation4, "uAspectRatio");
                int iGlGetUniformLocation5 = GLES20.glGetUniformLocation(this.mProgramHandle, "uBorderWidth");
                this.mBorderWidthLoc = iGlGetUniformLocation5;
                GLUtils.checkLocationOrThrow(iGlGetUniformLocation5, "uBorderWidth");
                int iGlGetUniformLocation6 = GLES20.glGetUniformLocation(this.mProgramHandle, "uBorderColor");
                this.mBorderColorLoc = iGlGetUniformLocation6;
                GLUtils.checkLocationOrThrow(iGlGetUniformLocation6, "uBorderColor");
            }
        }

        public void delete() {
            GLES20.glDeleteProgram(this.mProgramHandle);
        }

        public void updateAlpha(float f2) {
            GLES20.glUniform1f(this.mAlphaScaleLoc, f2);
            GLUtils.checkGlErrorOrThrow("glUniform1f");
        }

        public void updateBorderWidth(float f2, float[] fArr) {
            if (this.mHasAdvancedStyling) {
                GLES20.glUniform1f(this.mBorderWidthLoc, f2);
                GLUtils.checkGlErrorOrThrow("glUniform1f");
                GLES20.glUniform4fv(this.mBorderColorLoc, 1, fArr, 0);
                GLUtils.checkGlErrorOrThrow("glUniform4fv");
            }
        }

        public void updateCornerRadiusRatio(float f2, float f3) {
            if (this.mHasAdvancedStyling) {
                GLES20.glUniform1f(this.mCornerRadiusRatioLoc, f2);
                GLUtils.checkGlErrorOrThrow("glUniform1f");
                GLES20.glUniform1f(this.mAspectRatioLoc, f3);
                GLUtils.checkGlErrorOrThrow("glUniform1f");
            }
        }

        public void updateTransformMatrix(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        public void use() {
            GLES20.glUseProgram(this.mProgramHandle);
            GLUtils.checkGlErrorOrThrow("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (Buffer) GLUtils.VERTEX_BUF);
            GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            updateTransformMatrix(GLUtils.create4x4IdentityMatrix());
            updateAlpha(1.0f);
            if (this.mHasAdvancedStyling) {
                updateCornerRadiusRatio(0.0f, 1.0f);
                updateBorderWidth(0.0f, new float[]{1.0f, 1.0f, 1.0f, 1.0f});
            }
        }

        protected Program2D(String str, String str2) {
            this(str, str2, false);
        }
    }
}
