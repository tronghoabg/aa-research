package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.Surface;
import com.google.android.gms.car.display.CarRegionId;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import j$.util.Objects;
import java.io.PrintWriter;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jiv implements jix {
    public static final /* synthetic */ int a = 0;
    private static final yph b = yph.c("CAR.WM.GLCOMPOSER");
    private final Context c;
    private final jju d;
    private final jkh e;
    private final int f;
    private final boolean g;
    private final float[] h;
    private final int[] i;
    private boolean j;
    private long k;
    private volatile boolean l;
    private volatile boolean m;
    private final IntBuffer n;
    private ilj o;

    public jiv(Context context, jju jjuVar, jkh jkhVar, int i, boolean z) {
        context.getClass();
        jjuVar.getClass();
        jkhVar.getClass();
        this.c = context;
        this.d = jjuVar;
        this.e = jkhVar;
        this.f = i;
        this.g = z;
        this.h = new float[16];
        this.i = new int[6];
        this.n = IntBuffer.allocate(1);
    }

    private final void q(jhc jhcVar) {
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float f = jhcVar.d;
        double d = f;
        if (d > 1.0d) {
            Matrix.scaleM(fArr3, 0, jhcVar.e, 1.0f, 1.0f);
        } else if (d < 1.0d) {
            Matrix.scaleM(fArr3, 0, 1.0f, f, 1.0f);
        }
        iuw iuwVar = jhcVar.a;
        int i = jhcVar.c;
        int i2 = jhcVar.b;
        float f2 = iuwVar.b / 2.0f;
        float f3 = (-i2) + f2;
        float f4 = iuwVar.c / 2.0f;
        float f5 = (-i) + f4;
        Matrix.setLookAtM(fArr, 0, f3, f5, 20.0f, f3, f5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED);
        Matrix.orthoM(fArr2, 0, -f2, f2, -f4, f4, -50.0f, 50.0f);
        Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr3, 0);
        Matrix.multiplyMM(this.h, 0, fArr2, 0, fArr4, 0);
    }

    private final void r(int i, int i2) throws jjv {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameterf(3553, 10241, 9728.0f);
        GLES20.glTexParameterf(3553, 10240, 9728.0f);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.c.getResources(), i2);
        GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
        jjv.a(b, "texImage2D shadow texture");
        bitmapDecodeResource.recycle();
    }

    public final jiu a(int i, int i2, int i3, int i4) {
        int i5 = fyz.i(i3, i - 1);
        int i6 = fyz.i(i4, i2 - 1);
        IntBuffer intBufferAllocate = IntBuffer.allocate(1);
        GLES20.glReadPixels(i5, i6, 1, 1, 6408, 5121, intBufferAllocate);
        return new jiu(i3, i4, intBufferAllocate.get(0));
    }

    @Override // defpackage.jix
    public final void b(CarRegionId carRegionId, jiw jiwVar, UUID uuid, int i, int i2, SparseArray sparseArray, jhc jhcVar) throws jjv {
        jiwVar.getClass();
        uuid.getClass();
        sparseArray.getClass();
        jhcVar.getClass();
        if (carRegionId == null) {
            f(i, uuid, i2, sparseArray);
            iuw iuwVar = jhcVar.a;
            int i3 = iuwVar.b;
            int i4 = iuwVar.c;
            IntBuffer intBufferAllocate = IntBuffer.allocate(i4 * i3);
            GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, intBufferAllocate);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.getClass();
            executorServiceNewSingleThreadExecutor.execute(new imp(jiwVar, intBufferAllocate, jhcVar, 5));
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        GLES20.glClear(16384);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 771);
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list = (List) sparseArray.valueAt(i5);
            if (list != null) {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    jgz jgzVar = (jgz) list.get(i6);
                    if (affa.f(carRegionId, jgzVar.C())) {
                        jgzVar.w();
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            List list2 = (List) sparseArray.valueAt(i7);
            if (list2 != null) {
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    jgz jgzVar2 = (jgz) list2.get(i8);
                    if (affa.f(carRegionId, jgzVar2.C())) {
                        if (!affa.f(jgzVar2.F(), uuid)) {
                            ((ype) b.h()).M("Window has incorrect configuration id, attempting to dump screenshot anyways. Correct id: %s. Window: %s", uuid, jgzVar2);
                        }
                        if (!jgzVar2.S(this.d, this.h, jgzVar2.a(), i)) {
                            ((ype) b.h()).y("Window not visible %s", jgzVar2);
                        }
                    }
                }
            }
        }
        jjv.a(b, "render single region draw");
        iuw iuwVar2 = jhcVar.a;
        int i9 = iuwVar2.b;
        int i10 = iuwVar2.c;
        IntBuffer intBufferAllocate2 = IntBuffer.allocate(i10 * i9);
        GLES20.glReadPixels(0, 0, i9, i10, 6408, 5121, intBufferAllocate2);
        ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor2.getClass();
        executorServiceNewSingleThreadExecutor2.execute(new jda((Object) jiwVar, (Object) intBufferAllocate2, (Object) jhcVar, 5, (short[]) null));
        executorServiceNewSingleThreadExecutor2.shutdown();
    }

    @Override // defpackage.jix
    public final void c(PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("num renderings per num windows:");
        for (int i = 0; i < 6; i++) {
            printWriter.println(i + ":" + this.i[i]);
        }
    }

    @Override // defpackage.jix
    public final void d(jhc jhcVar) {
        jhcVar.getClass();
        if (this.m) {
            IntBuffer intBuffer = this.n;
            intBuffer.clear();
            GLES20.glReadPixels(jhcVar.b, (r0.c - 1) - jhcVar.a.h, 1, 1, 6408, 5121, intBuffer);
            int i = intBuffer.get(0);
            ((ype) b.f()).w("TopLeft Pixel Color: %x", i);
            int i2 = i >> 16;
            int i3 = i >> 8;
            if ((i & 255) > 10 || (i2 & 255) > 10) {
                return;
            }
            int i4 = i3 & 255;
            if (i4 <= 10) {
                this.j = false;
                return;
            }
            if (i4 <= 240 || this.j) {
                return;
            }
            this.j = true;
            jkf jkfVar = this.e.e;
            if (jkfVar != null) {
                jkfVar.g = SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // defpackage.jix
    public final void e(jhc jhcVar) {
        q(jhcVar);
    }

    @Override // defpackage.jix
    public final void f(int i, UUID uuid, int i2, SparseArray sparseArray) throws jjv {
        UUID uuid2;
        SparseArray sparseArray2;
        uuid.getClass();
        sparseArray.getClass();
        if (this.l) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.k;
            if (j == 0) {
                this.k = jElapsedRealtime;
                j = jElapsedRealtime;
            }
            if ((jElapsedRealtime - j) % 1000 < 500) {
                GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            } else {
                GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
            }
        } else {
            GLES20.glClearColor(Color.red(i2) / 255.0f, Color.green(i2) / 255.0f, Color.blue(i2) / 255.0f, 1.0f);
        }
        GLES20.glClear(16384);
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            List list = (List) sparseArray.valueAt(i3);
            if (list != null) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((jgz) list.get(i4)).w();
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            List list2 = (List) sparseArray.valueAt(i6);
            if (list2 != null) {
                int size3 = list2.size();
                int i7 = 0;
                while (i7 < size3) {
                    jgz jgzVar = (jgz) list2.get(i7);
                    if (affa.f(jgzVar.F(), uuid)) {
                        jhg jhgVarA = jgzVar.a();
                        uuid2 = uuid;
                        sparseArray2 = sparseArray;
                        dsg.H(jgzVar, sparseArray2, uuid2, this.g, jhgVarA, i6);
                        if (jgzVar.S(this.d, this.h, jhgVarA, i)) {
                            i5++;
                        }
                    } else {
                        ((ype) ((ype) ((ype) b.f()).l(5, TimeUnit.SECONDS)).n(jgzVar.E())).M("Window has incorrect configuration id, Skipping draw. Correct id: %s. Window: %s", uuid, jgzVar);
                        uuid2 = uuid;
                        sparseArray2 = sparseArray;
                    }
                    i7++;
                    sparseArray = sparseArray2;
                    uuid = uuid2;
                }
            }
            i6++;
            sparseArray = sparseArray;
            uuid = uuid;
        }
        if (i5 < 6) {
            int[] iArr = this.i;
            iArr[i5] = iArr[i5] + 1;
        }
        jjv.a(b, "window draw");
    }

    @Override // defpackage.jix
    public final void g(boolean z) {
        this.l = z;
    }

    @Override // defpackage.jix
    public final void h(boolean z) {
        this.m = z;
    }

    @Override // defpackage.jix
    public final void i(Surface surface, UUID uuid, jhc jhcVar, boolean z) throws jjv {
        surface.getClass();
        uuid.getClass();
        jhcVar.getClass();
        this.l = z;
        Arrays.fill(this.i, 0, 6, 0);
        this.k = 0L;
        ilj iljVar = new ilj(this.c, surface);
        try {
            iljVar.a(0);
        } catch (RuntimeException e) {
            if (this.f == 0) {
                throw e;
            }
            ((ype) ((ype) ilj.a.f()).ai((char) 289)).u("Creating fallback egl");
            iljVar.a(1);
        }
        this.o = iljVar;
        EGLDisplay eGLDisplay = iljVar.b;
        EGLSurface eGLSurface = iljVar.d;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, iljVar.c)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
        jju jjuVar = this.d;
        jjuVar.b = -1;
        jjw jjwVarE = jju.e("#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", true);
        jjw[] jjwVarArr = jjuVar.a;
        jjwVarArr[0] = jjwVarE;
        jjwVarArr[1] = jju.e("// Android's UI toolkit outputs pre-multiplied alpha, so if we apply additional alpha we need to pre-multiply it as well.\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color * uAlphaMask;\n}\n", true);
        jjwVarArr[2] = jju.e("precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color;\n}\n", true);
        jjwVarArr[3] = jju.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0)\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uHalfSize: Normalize the coordinate position relative to\n  // the top right corner of the window\n  // 3) abs(distanceFromCenter) - uHalfSize + uRadius: This step normalizes the coordinate\n  // relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0): This says we only care\n  // about x or y coords that exist outside of the rendered area, otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)): This gets the\n  // distance to the center. Points inside of the shape will be less than the radius\n  // 6) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - radius: Points in\n  // the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * smoothedAlpha;\n}\n", true);
        jjwVarArr[4] = jju.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0).\n * Unlike {@link #CLIPPING_ROUNDED_CORNERS_FRAGMENT_SHADER} it applies an alpha mask to all pixels\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uHalfSize: Normalize the coordinate position relative to\n  // the top right corner of the window\n  // 3) abs(distanceFromCenter) - uHalfSize + uRadius: This step normalizes the coordinate\n  // relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0): This says we only care\n  // about x or y coords that exist outside of the rendered area, otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)): This gets the\n  // distance to the center. Points inside of the shape will be less than the radius\n  // 6) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - radius: Points in\n  // the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * (uAlphaMask * smoothedAlpha);\n}\n", true);
        jjwVarArr[5] = jju.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0)\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uBorderColor: Color to be used to draw the borders\n *   <li>uCenterToInnerBorderSize: Distance from center to inner border\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec4 uBorderColor;\nuniform vec2 uCenterToInnerBorderSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uCenterToInnerBorderSize: Normalize the coordinate\n  // position relative to the top right corner of the inner border window.\n  // 3) abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius: This step normalizes\n  // the coordinate relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0): This says\n  // we only care about x or y coords that exist outside of the rendered area, otherwise\n  // make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)):\n  // This gets the distance to the center. Points inside of the shape will be less than the\n  // radius\n  // 6) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) -\n  // radius: Points in the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) - uRadius;\n  // Same as distance calculation but with position relative to outer border window.\n  float borderDistance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  float borderMix = smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  vec4 color = mix(textureColor, uBorderColor, borderMix);\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, borderDistance);\n  gl_FragColor = color * smoothedAlpha;\n}\n", true);
        jjwVarArr[6] = jju.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0).\n * Unlike {@link #CLIPPING_ROUNDED_CORNERS_FRAGMENT_SHADER} it applies an alpha mask to all pixels\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uBorderColor: Color to be used to draw the borders\n *   <li>uCenterToInnerBorderSize: Distance from center to inner border\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform vec4 uBorderColor;\nuniform vec2 uCenterToInnerBorderSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the\n  // center, moving all positions to the top right quadrant of a graph centered on\n  // uCenterPosition\n  // 2) abs(distanceFromCenter) - uCenterToInnerBorderSize: Normalize the coordinate\n  // position relative to the top right corner of the inner border window.\n  // 3) abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius: This step\n  // normalizes the coordinate relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0): This\n  // says we only care about x or y coords that exist outside of the rendered area,\n  // otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0))\n  // : This gets the distance to the center. Points inside of the shape will be less\n  // than the radius\n  // 6) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0))\n  // - radius: Points in the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) - uRadius;\n  // Same as distance calculation but with position relative to outer border window.\n  float borderDistance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  float borderMix = smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  vec4 color = mix(textureColor, uBorderColor, borderMix);\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, borderDistance);\n  gl_FragColor = color * (uAlphaMask * smoothedAlpha);\n}\n", true);
        jjwVarArr[7] = jju.e("precision highp float;\nuniform vec4 uColor;\nuniform float uRadius;\nuniform float uShadowRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nvoid main() {\n  // Calculate the distance from the current fragment to the edge of a rounded rectangle.\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n\n  // Use smoothstep to create a soft shadow edge based on the shadow radius.\n  float alpha = 1.0 - smoothstep(0.0, uShadowRadius, distance);\n  gl_FragColor = uColor * alpha;\n}\n", false);
        jjwVarArr[8] = jju.e("/**\n * A shader that will make any pixel outside of a square with rounded corners invisible (alpha 0)\n * and applies a graded alpha fade animation area when dragging on an irregular display.\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uSmoothstepLow: Lower bound for anti-aliasing smoothstep\n *   <li>uSmoothstepHigh: Upper bound for anti-aliasing smoothstep\n *   <li>uMarginAlpha: Animation interpolation alpha [0.0, 1.0]\n *   <li>uOriginalCenterPosition: Original center position of the window\n *   <li>uOriginalHalfSize: Original half size of the window\n *   <li>uFadeMargin: The margin size over which the fade is active (scaled px)\n * </ol>\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform float uMarginAlpha;\nuniform vec2 uOriginalCenterPosition;\nuniform vec2 uOriginalHalfSize;\nuniform float uFadeMargin;\n\n// Returns negative values inside the box, positive outside, and zero on the boundary.\nfloat roundedBoxSDF(vec2 distanceFromCenter, vec2 halfSize, float radius) {\n  return length(max(abs(distanceFromCenter) - halfSize + radius, 0.0)) - radius;\n}\n\nvoid main() {\n  // Distance to current edge for AA\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distEdge = roundedBoxSDF(distanceFromCenter, uHalfSize, uRadius);\n  float aaAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distEdge);\n\n  // Distance to original bounds for fade\n  vec2 distFromOrigCenter = gl_FragCoord.xy - uOriginalCenterPosition;\n  float distOrig = roundedBoxSDF(distFromOrigCenter, uOriginalHalfSize, uRadius);\n\n  float fadeAlpha = 1.0;\n  if (uMarginAlpha > 0.0 && distOrig > 0.0) {\n    fadeAlpha = 1.0 - smoothstep(0.0, uFadeMargin, distOrig);\n    fadeAlpha *= uMarginAlpha;\n  }\n\n  float smoothedAlpha = aaAlpha * fadeAlpha;\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * smoothedAlpha;\n}\n", true);
        jjwVarArr[9] = jju.e("/**\n * A shader that will make any pixel outside of a square with rounded corners invisible (alpha 0),\n * applying an alpha mask, and applying a graded alpha fade animation area when dragging on an irregular display.\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uSmoothstepLow: Lower bound for anti-aliasing smoothstep\n *   <li>uSmoothstepHigh: Upper bound for anti-aliasing smoothstep\n *   <li>uMarginAlpha: Animation interpolation alpha [0.0, 1.0]\n *   <li>uOriginalCenterPosition: Original center position of the window\n *   <li>uOriginalHalfSize: Original half size of the window\n *   <li>uFadeMargin: The margin size over which the fade is active (scaled px)\n * </ol>\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uMarginAlpha;\nuniform vec2 uOriginalCenterPosition;\nuniform vec2 uOriginalHalfSize;\nuniform float uFadeMargin;\n\n// Returns negative values inside the box, positive outside, and zero on the boundary.\nfloat roundedBoxSDF(vec2 distanceFromCenter, vec2 halfSize, float radius) {\n  return length(max(abs(distanceFromCenter) - halfSize + radius, 0.0)) - radius;\n}\n\nvoid main() {\n  // Distance to current edge for AA\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distEdge = roundedBoxSDF(distanceFromCenter, uHalfSize, uRadius);\n  float aaAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distEdge);\n\n  // Distance to original bounds for fade\n  vec2 distFromOrigCenter = gl_FragCoord.xy - uOriginalCenterPosition;\n  float distOrig = roundedBoxSDF(distFromOrigCenter, uOriginalHalfSize, uRadius);\n\n  float fadeAlpha = 1.0;\n  if (uMarginAlpha > 0.0 && distOrig > 0.0) {\n    fadeAlpha = 1.0 - smoothstep(0.0, uFadeMargin, distOrig);\n    fadeAlpha *= uMarginAlpha;\n  }\n\n  float smoothedAlpha = aaAlpha * fadeAlpha;\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * (uAlphaMask * smoothedAlpha);\n}\n", true);
        yop yopVarL = b.l();
        int i = jhcVar.g;
        int i2 = jhcVar.f;
        iuw iuwVar = jhcVar.a;
        int i3 = iuwVar.b;
        Integer numValueOf = Integer.valueOf(i3);
        int i4 = iuwVar.c;
        yopVarL.S("initGl codec w:%d h:%d disp w:%d h:%d", numValueOf, Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i));
        GLES20.glViewport(0, 0, i3, i4);
        q(jhcVar);
        int[] iArr = new int[2];
        GLES20.glGenTextures(2, iArr, 0);
        int i5 = iArr[0];
        jjuVar.c = i5;
        jjuVar.d = iArr[1];
        r(i5, R.drawable.shadow_panel_top);
        r(jjuVar.d, R.drawable.shadow_notification);
    }

    @Override // defpackage.jix
    public final void j() {
        this.d.c();
        ilj iljVar = this.o;
        if (iljVar != null) {
            if (!Objects.equals(iljVar.b, EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglDestroySurface(iljVar.b, iljVar.d);
                EGL14.eglDestroyContext(iljVar.b, iljVar.c);
                EGL14.eglReleaseThread();
                EGL14.eglTerminate(iljVar.b);
            }
            Surface surface = iljVar.f;
            if (surface != null) {
                surface.release();
            }
            iljVar.b = EGL14.EGL_NO_DISPLAY;
            iljVar.c = EGL14.EGL_NO_CONTEXT;
            iljVar.d = EGL14.EGL_NO_SURFACE;
            iljVar.f = null;
            iljVar.e = null;
        }
    }

    @Override // defpackage.jix
    public final void k(long j) {
        ilj iljVar = this.o;
        if (iljVar == null) {
            throw new IllegalStateException("EglHelper is null in submitFrame");
        }
        EGLExt.eglPresentationTimeANDROID(iljVar.b, iljVar.d, j);
        EGL14.eglSwapBuffers(iljVar.b, iljVar.d);
    }

    @Override // defpackage.jix
    public final /* synthetic */ void l(SparseArray sparseArray, int i) {
        sparseArray.getClass();
    }

    @Override // defpackage.jix
    public final /* synthetic */ boolean m() {
        return true;
    }

    @Override // defpackage.jix
    public final boolean n(SparseArray sparseArray) {
        sparseArray.getClass();
        int size = sparseArray.size();
        boolean zAh = false;
        for (int i = 0; i < size; i++) {
            List list = (List) sparseArray.valueAt(i);
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zAh |= ((jgz) list.get(i2)).ah();
                }
            }
        }
        return zAh;
    }

    @Override // defpackage.jix
    public final /* synthetic */ boolean o(iye iyeVar) {
        return false;
    }

    @Override // defpackage.jix
    public final boolean p() {
        return this.l;
    }
}
