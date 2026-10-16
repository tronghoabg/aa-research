package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jjc implements defpackage.jje {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("CAR.WM.GLCOMPOSER");
    private final android.content.Context c;
    private final defpackage.jkb d;
    private final defpackage.jko e;
    private final int f;
    private final boolean g;
    private final float[] h;
    private final int[] i;
    private boolean j;
    private long k;
    private volatile boolean l;
    private volatile boolean m;
    private final java.nio.IntBuffer n;
    private defpackage.ilt o;

    public jjc(android.content.Context context, defpackage.jkb jkbVar, defpackage.jko jkoVar, int i, boolean z) {
        context.getClass();
        jkbVar.getClass();
        jkoVar.getClass();
        this.c = context;
        this.d = jkbVar;
        this.e = jkoVar;
        this.f = i;
        this.g = z;
        this.h = new float[16];
        this.i = new int[6];
        this.n = java.nio.IntBuffer.allocate(1);
    }

    private final void q(defpackage.jhi jhiVar) {
        float[] fArr = new float[16];
        float[] fArr2 = new float[16];
        float[] fArr3 = new float[16];
        float[] fArr4 = new float[16];
        android.opengl.Matrix.setIdentityM(fArr3, 0);
        float f = jhiVar.d;
        double d = f;
        if (d > 1.0d) {
            android.opengl.Matrix.scaleM(fArr3, 0, jhiVar.e, 1.0f, 1.0f);
        } else if (d < 1.0d) {
            android.opengl.Matrix.scaleM(fArr3, 0, 1.0f, f, 1.0f);
        }
        defpackage.ive iveVar = jhiVar.a;
        int i = jhiVar.c;
        int i2 = jhiVar.b;
        float f2 = iveVar.b / 2.0f;
        float f3 = (-i2) + f2;
        float f4 = iveVar.c / 2.0f;
        float f5 = (-i) + f4;
        android.opengl.Matrix.setLookAtM(fArr, 0, f3, f5, 20.0f, f3, f5, 0.0f, 0.0f, 1.0f, 0.0f);
        android.opengl.Matrix.orthoM(fArr2, 0, -f2, f2, -f4, f4, -50.0f, 50.0f);
        android.opengl.Matrix.multiplyMM(fArr4, 0, fArr, 0, fArr3, 0);
        android.opengl.Matrix.multiplyMM(this.h, 0, fArr2, 0, fArr4, 0);
    }

    private final void r(int i, int i2) throws defpackage.jkc {
        android.opengl.GLES20.glBindTexture(3553, i);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9728.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10240, 9728.0f);
        android.opengl.GLES20.glTexParameteri(3553, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(3553, 10243, 33071);
        android.graphics.Bitmap bitmapDecodeResource = android.graphics.BitmapFactory.decodeResource(this.c.getResources(), i2);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmapDecodeResource, 0);
        defpackage.jkc.a(b, "texImage2D shadow texture");
        bitmapDecodeResource.recycle();
    }

    public final jjb a(int i, int i2, int i3, int i4) {
        int iJ = defpackage.fzj.j(i3, i - 1);
        int iJ2 = defpackage.fzj.j(i4, i2 - 1);
        java.nio.IntBuffer intBufferAllocate = java.nio.IntBuffer.allocate(1);
        android.opengl.GLES20.glReadPixels(iJ, iJ2, 1, 1, 6408, 5121, intBufferAllocate);
        return new jjb(i3, i4, intBufferAllocate.get(0));
    }

    @Override // defpackage.jje
    public final void b(com.google.android.gms.car.display.CarRegionId carRegionId, defpackage.jjd jjdVar, java.util.UUID uuid, int i, int i2, android.util.SparseArray sparseArray, defpackage.jhi jhiVar) throws defpackage.jkc {
        jjdVar.getClass();
        uuid.getClass();
        sparseArray.getClass();
        jhiVar.getClass();
        if (carRegionId == null) {
            f(i, uuid, i2, sparseArray);
            defpackage.ive iveVar = jhiVar.a;
            int i3 = iveVar.b;
            int i4 = iveVar.c;
            java.nio.IntBuffer intBufferAllocate = java.nio.IntBuffer.allocate(i4 * i3);
            android.opengl.GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, intBufferAllocate);
            java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.getClass();
            executorServiceNewSingleThreadExecutor.execute(new defpackage.jdh(jjdVar, intBufferAllocate, jhiVar, 5, (short[]) null));
            executorServiceNewSingleThreadExecutor.shutdown();
            return;
        }
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFunc(1, 771);
        int size = sparseArray.size();
        for (int i5 = 0; i5 < size; i5++) {
            java.util.List list = (java.util.List) sparseArray.valueAt(i5);
            if (list != null) {
                int size2 = list.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    defpackage.jhf jhfVar = (defpackage.jhf) list.get(i6);
                    if (defpackage.afga.f(carRegionId, jhfVar.D())) {
                        jhfVar.T();
                    }
                }
            }
        }
        for (int i7 = 0; i7 < size; i7++) {
            java.util.List list2 = (java.util.List) sparseArray.valueAt(i7);
            if (list2 != null) {
                int size3 = list2.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    defpackage.jhf jhfVar2 = (defpackage.jhf) list2.get(i8);
                    if (defpackage.afga.f(carRegionId, jhfVar2.D())) {
                        if (!defpackage.afga.f(jhfVar2.G(), uuid)) {
                            ((defpackage.yqj) b.h()).M("Window has incorrect configuration id, attempting to dump screenshot anyways. Correct id: %s. Window: %s", uuid, jhfVar2);
                        }
                        if (!jhfVar2.ai(this.d, this.h, jhfVar2.x(), i)) {
                            ((defpackage.yqj) b.h()).y("Window not visible %s", jhfVar2);
                        }
                    }
                }
            }
        }
        defpackage.jkc.a(b, "render single region draw");
        defpackage.ive iveVar2 = jhiVar.a;
        int i9 = iveVar2.b;
        int i10 = iveVar2.c;
        java.nio.IntBuffer intBufferAllocate2 = java.nio.IntBuffer.allocate(i10 * i9);
        android.opengl.GLES20.glReadPixels(0, 0, i9, i10, 6408, 5121, intBufferAllocate2);
        java.util.concurrent.ExecutorService executorServiceNewSingleThreadExecutor2 = java.util.concurrent.Executors.newSingleThreadExecutor();
        executorServiceNewSingleThreadExecutor2.getClass();
        executorServiceNewSingleThreadExecutor2.execute(new defpackage.jdh(jjdVar, intBufferAllocate2, jhiVar, 6, (short[]) null));
        executorServiceNewSingleThreadExecutor2.shutdown();
    }

    @Override // defpackage.jje
    public final void c(java.io.PrintWriter printWriter) {
        printWriter.getClass();
        printWriter.println("num renderings per num windows:");
        for (int i = 0; i < 6; i++) {
            printWriter.println(i + ":" + this.i[i]);
        }
    }

    @Override // defpackage.jje
    public final void d(defpackage.jhi jhiVar) {
        jhiVar.getClass();
        if (this.m) {
            java.nio.IntBuffer intBuffer = this.n;
            intBuffer.clear();
            defpackage.ive iveVar = jhiVar.a;
            android.opengl.GLES20.glReadPixels(jhiVar.b, (iveVar.c - 1) - iveVar.h, 1, 1, 6408, 5121, intBuffer);
            int i = intBuffer.get(0);
            ((defpackage.yqj) b.f()).w("TopLeft Pixel Color: %x", i);
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
            defpackage.jkm jkmVar = this.e.e;
            if (jkmVar != null) {
                jkmVar.g = android.os.SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    @Override // defpackage.jje
    public final void e(defpackage.jhi jhiVar) {
        q(jhiVar);
    }

    @Override // defpackage.jje
    public final void f(int i, java.util.UUID uuid, int i2, android.util.SparseArray sparseArray) throws defpackage.jkc {
        java.util.UUID uuid2;
        android.util.SparseArray sparseArray2;
        uuid.getClass();
        sparseArray.getClass();
        if (this.l) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j = this.k;
            if (j == 0) {
                this.k = jElapsedRealtime;
                j = jElapsedRealtime;
            }
            if ((jElapsedRealtime - j) % 1000 < 500) {
                android.opengl.GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
            } else {
                android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            }
        } else {
            android.opengl.GLES20.glClearColor(android.graphics.Color.red(i2) / 255.0f, android.graphics.Color.green(i2) / 255.0f, android.graphics.Color.blue(i2) / 255.0f, 1.0f);
        }
        android.opengl.GLES20.glClear(16384);
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            java.util.List list = (java.util.List) sparseArray.valueAt(i3);
            if (list != null) {
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((defpackage.jhf) list.get(i4)).T();
                }
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i6 < size) {
            java.util.List list2 = (java.util.List) sparseArray.valueAt(i6);
            if (list2 != null) {
                int size3 = list2.size();
                int i7 = 0;
                while (i7 < size3) {
                    defpackage.jhf jhfVar = (defpackage.jhf) list2.get(i7);
                    if (defpackage.afga.f(jhfVar.G(), uuid)) {
                        defpackage.jhm jhmVarX = jhfVar.x();
                        uuid2 = uuid;
                        sparseArray2 = sparseArray;
                        defpackage.ebm.l(jhfVar, sparseArray2, uuid2, this.g, jhmVarX, i6);
                        if (jhfVar.ai(this.d, this.h, jhmVarX, i)) {
                            i5++;
                        }
                    } else {
                        ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) b.f()).l(5, java.util.concurrent.TimeUnit.SECONDS)).n(jhfVar.F())).M("Window has incorrect configuration id, Skipping draw. Correct id: %s. Window: %s", uuid, jhfVar);
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
        defpackage.jkc.a(b, "window draw");
    }

    @Override // defpackage.jje
    public final void g(boolean z) {
        this.l = z;
    }

    @Override // defpackage.jje
    public final void h(boolean z) {
        this.m = z;
    }

    @Override // defpackage.jje
    public final void i(android.view.Surface surface, java.util.UUID uuid, defpackage.jhi jhiVar, boolean z) throws defpackage.jkc {
        surface.getClass();
        uuid.getClass();
        jhiVar.getClass();
        this.l = z;
        java.util.Arrays.fill(this.i, 0, 6, 0);
        this.k = 0L;
        defpackage.ilt iltVar = new defpackage.ilt(this.c, surface);
        try {
            iltVar.a(0);
        } catch (java.lang.RuntimeException e) {
            if (this.f == 0) {
                throw e;
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.ilt.a.f()).ai((char) 289)).u("Creating fallback egl");
            iltVar.a(1);
        }
        this.o = iltVar;
        android.opengl.EGLDisplay eGLDisplay = iltVar.b;
        android.opengl.EGLSurface eGLSurface = iltVar.d;
        if (!android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, iltVar.c)) {
            throw new java.lang.RuntimeException("eglMakeCurrent failed");
        }
        defpackage.jkb jkbVar = this.d;
        jkbVar.b = -1;
        defpackage.jkd jkdVarE = defpackage.jkb.e("#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", true);
        defpackage.jkd[] jkdVarArr = jkbVar.a;
        jkdVarArr[0] = jkdVarE;
        jkdVarArr[1] = defpackage.jkb.e("// Android's UI toolkit outputs pre-multiplied alpha, so if we apply additional alpha we need to pre-multiply it as well.\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color * uAlphaMask;\n}\n", true);
        jkdVarArr[2] = defpackage.jkb.e("precision highp float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  vec4 color = texture2D(sTexture, vTextureCoord);\n  gl_FragColor = color;\n}\n", true);
        jkdVarArr[3] = defpackage.jkb.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0)\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uHalfSize: Normalize the coordinate position relative to\n  // the top right corner of the window\n  // 3) abs(distanceFromCenter) - uHalfSize + uRadius: This step normalizes the coordinate\n  // relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0): This says we only care\n  // about x or y coords that exist outside of the rendered area, otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)): This gets the\n  // distance to the center. Points inside of the shape will be less than the radius\n  // 6) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - radius: Points in\n  // the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * smoothedAlpha;\n}\n", true);
        jkdVarArr[4] = defpackage.jkb.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0).\n * Unlike {@link #CLIPPING_ROUNDED_CORNERS_FRAGMENT_SHADER} it applies an alpha mask to all pixels\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uHalfSize: Normalize the coordinate position relative to\n  // the top right corner of the window\n  // 3) abs(distanceFromCenter) - uHalfSize + uRadius: This step normalizes the coordinate\n  // relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0): This says we only care\n  // about x or y coords that exist outside of the rendered area, otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)): This gets the\n  // distance to the center. Points inside of the shape will be less than the radius\n  // 6) length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - radius: Points in\n  // the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * (uAlphaMask * smoothedAlpha);\n}\n", true);
        jkdVarArr[5] = defpackage.jkb.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0)\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uBorderColor: Color to be used to draw the borders\n *   <li>uCenterToInnerBorderSize: Distance from center to inner border\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec4 uBorderColor;\nuniform vec2 uCenterToInnerBorderSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the center,\n  // moving all positions to the top right quadrant of a graph centered on uCenterPosition\n  // 2) abs(distanceFromCenter) - uCenterToInnerBorderSize: Normalize the coordinate\n  // position relative to the top right corner of the inner border window.\n  // 3) abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius: This step normalizes\n  // the coordinate relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0): This says\n  // we only care about x or y coords that exist outside of the rendered area, otherwise\n  // make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)):\n  // This gets the distance to the center. Points inside of the shape will be less than the\n  // radius\n  // 6) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) -\n  // radius: Points in the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) - uRadius;\n  // Same as distance calculation but with position relative to outer border window.\n  float borderDistance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  float borderMix = smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  vec4 color = mix(textureColor, uBorderColor, borderMix);\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary.\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, borderDistance);\n  gl_FragColor = color * smoothedAlpha;\n}\n", true);
        jkdVarArr[6] = defpackage.jkb.e("/**\n * A shader what will make any pixel outside of a square with rounded corners invisible (alpha 0).\n * Unlike {@link #CLIPPING_ROUNDED_CORNERS_FRAGMENT_SHADER} it applies an alpha mask to all pixels\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uBorderColor: Color to be used to draw the borders\n *   <li>uCenterToInnerBorderSize: Distance from center to inner border\n * </ol>\n *\n * See go/aa-pwm-shader for diagrams on how this works\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform vec4 uBorderColor;\nuniform vec2 uCenterToInnerBorderSize;\nvoid main() {\n  // Find the vector from the pixel to the center\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  // Few things here:\n  // 1) abs(distanceFromCenter): Normalize the coordinate positions relative to the\n  // center, moving all positions to the top right quadrant of a graph centered on\n  // uCenterPosition\n  // 2) abs(distanceFromCenter) - uCenterToInnerBorderSize: Normalize the coordinate\n  // position relative to the top right corner of the inner border window.\n  // 3) abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius: This step\n  // normalizes the coordinate relative to a circle in the top right of the window\n  // 4) max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0): This\n  // says we only care about x or y coords that exist outside of the rendered area,\n  // otherwise make it 0.\n  // 5) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0))\n  // : This gets the distance to the center. Points inside of the shape will be less\n  // than the radius\n  // 6) length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0))\n  // - radius: Points in the shape are now <= 0, outside are >0\n  float distance = length(max(abs(distanceFromCenter) - uCenterToInnerBorderSize + uRadius, 0.0)) - uRadius;\n  // Same as distance calculation but with position relative to outer border window.\n  float borderDistance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n  vec4 textureColor = texture2D(sTexture, vTextureCoord);\n  float borderMix = smoothstep(uSmoothstepLow, uSmoothstepHigh, distance);\n  vec4 color = mix(textureColor, uBorderColor, borderMix);\n  // Clamp alpha between 0 and 1, with interpolation for pixels close to the boundary\n  float smoothedAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, borderDistance);\n  gl_FragColor = color * (uAlphaMask * smoothedAlpha);\n}\n", true);
        jkdVarArr[7] = defpackage.jkb.e("precision highp float;\nuniform vec4 uColor;\nuniform float uRadius;\nuniform float uShadowRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nvoid main() {\n  // Calculate the distance from the current fragment to the edge of a rounded rectangle.\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distance = length(max(abs(distanceFromCenter) - uHalfSize + uRadius, 0.0)) - uRadius;\n\n  // Use smoothstep to create a soft shadow edge based on the shadow radius.\n  float alpha = 1.0 - smoothstep(0.0, uShadowRadius, distance);\n  gl_FragColor = uColor * alpha;\n}\n", false);
        jkdVarArr[8] = defpackage.jkb.e("/**\n * A shader that will make any pixel outside of a square with rounded corners invisible (alpha 0)\n * and applies a graded alpha fade animation area when dragging on an irregular display.\n *\n * <p>Args:\n *\n * <ol>\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uSmoothstepLow: Lower bound for anti-aliasing smoothstep\n *   <li>uSmoothstepHigh: Upper bound for anti-aliasing smoothstep\n *   <li>uMarginAlpha: Animation interpolation alpha [0.0, 1.0]\n *   <li>uOriginalCenterPosition: Original center position of the window\n *   <li>uOriginalHalfSize: Original half size of the window\n *   <li>uFadeMargin: The margin size over which the fade is active (scaled px)\n * </ol>\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uRadius;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform float uMarginAlpha;\nuniform vec2 uOriginalCenterPosition;\nuniform vec2 uOriginalHalfSize;\nuniform float uFadeMargin;\n\n// Returns negative values inside the box, positive outside, and zero on the boundary.\nfloat roundedBoxSDF(vec2 distanceFromCenter, vec2 halfSize, float radius) {\n  return length(max(abs(distanceFromCenter) - halfSize + radius, 0.0)) - radius;\n}\n\nvoid main() {\n  // Distance to current edge for AA\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distEdge = roundedBoxSDF(distanceFromCenter, uHalfSize, uRadius);\n  float aaAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distEdge);\n\n  // Distance to original bounds for fade\n  vec2 distFromOrigCenter = gl_FragCoord.xy - uOriginalCenterPosition;\n  float distOrig = roundedBoxSDF(distFromOrigCenter, uOriginalHalfSize, uRadius);\n\n  float fadeAlpha = 1.0;\n  if (uMarginAlpha > 0.0 && distOrig > 0.0) {\n    fadeAlpha = 1.0 - smoothstep(0.0, uFadeMargin, distOrig);\n    fadeAlpha *= uMarginAlpha;\n  }\n\n  float smoothedAlpha = aaAlpha * fadeAlpha;\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * smoothedAlpha;\n}\n", true);
        jkdVarArr[9] = defpackage.jkb.e("/**\n * A shader that will make any pixel outside of a square with rounded corners invisible (alpha 0),\n * applying an alpha mask, and applying a graded alpha fade animation area when dragging on an irregular display.\n *\n * <p>Args:\n *\n * <ol>\n *   <li>uAlphaMask: The alpha mask to apply to all pixels\n *   <li>sTexture: The texture to render\n *   <li>uRadius: the radius of the rounded corners\n *   <li>uCenterPosition: The center of the square (x,y)\n *   <li>uHalfSize: A vector of (half the width, half the height) of the square\n *   <li>uSmoothstepLow: Lower bound for anti-aliasing smoothstep\n *   <li>uSmoothstepHigh: Upper bound for anti-aliasing smoothstep\n *   <li>uMarginAlpha: Animation interpolation alpha [0.0, 1.0]\n *   <li>uOriginalCenterPosition: Original center position of the window\n *   <li>uOriginalHalfSize: Original half size of the window\n *   <li>uFadeMargin: The margin size over which the fade is active (scaled px)\n * </ol>\n */\n#extension GL_OES_EGL_image_external : require\nprecision highp float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nuniform float uAlphaMask;\nuniform float uRadius;\nuniform float uSmoothstepLow;\nuniform float uSmoothstepHigh;\nuniform vec2 uCenterPosition;\nuniform vec2 uHalfSize;\nuniform float uMarginAlpha;\nuniform vec2 uOriginalCenterPosition;\nuniform vec2 uOriginalHalfSize;\nuniform float uFadeMargin;\n\n// Returns negative values inside the box, positive outside, and zero on the boundary.\nfloat roundedBoxSDF(vec2 distanceFromCenter, vec2 halfSize, float radius) {\n  return length(max(abs(distanceFromCenter) - halfSize + radius, 0.0)) - radius;\n}\n\nvoid main() {\n  // Distance to current edge for AA\n  vec2 distanceFromCenter = gl_FragCoord.xy - uCenterPosition;\n  float distEdge = roundedBoxSDF(distanceFromCenter, uHalfSize, uRadius);\n  float aaAlpha = 1.0 - smoothstep(uSmoothstepLow, uSmoothstepHigh, distEdge);\n\n  // Distance to original bounds for fade\n  vec2 distFromOrigCenter = gl_FragCoord.xy - uOriginalCenterPosition;\n  float distOrig = roundedBoxSDF(distFromOrigCenter, uOriginalHalfSize, uRadius);\n\n  float fadeAlpha = 1.0;\n  if (uMarginAlpha > 0.0 && distOrig > 0.0) {\n    fadeAlpha = 1.0 - smoothstep(0.0, uFadeMargin, distOrig);\n    fadeAlpha *= uMarginAlpha;\n  }\n\n  float smoothedAlpha = aaAlpha * fadeAlpha;\n  gl_FragColor = texture2D(sTexture, vTextureCoord) * (uAlphaMask * smoothedAlpha);\n}\n", true);
        defpackage.ypu ypuVarL = b.l();
        int i = jhiVar.g;
        int i2 = jhiVar.f;
        defpackage.ive iveVar = jhiVar.a;
        int i3 = iveVar.b;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i3);
        int i4 = iveVar.c;
        ypuVarL.S("initGl codec w:%d h:%d disp w:%d h:%d", numValueOf, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i));
        android.opengl.GLES20.glViewport(0, 0, i3, i4);
        q(jhiVar);
        int[] iArr = new int[2];
        android.opengl.GLES20.glGenTextures(2, iArr, 0);
        int i5 = iArr[0];
        jkbVar.c = i5;
        jkbVar.d = iArr[1];
        r(i5, 2131233801);
        r(jkbVar.d, 2131233800);
    }

    @Override // defpackage.jje
    public final void j() {
        this.d.c();
        defpackage.ilt iltVar = this.o;
        if (iltVar != null) {
            if (!j$.util.Objects.equals(iltVar.b, android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglDestroySurface(iltVar.b, iltVar.d);
                android.opengl.EGL14.eglDestroyContext(iltVar.b, iltVar.c);
                android.opengl.EGL14.eglReleaseThread();
                android.opengl.EGL14.eglTerminate(iltVar.b);
            }
            android.view.Surface surface = iltVar.f;
            if (surface != null) {
                surface.release();
            }
            iltVar.b = android.opengl.EGL14.EGL_NO_DISPLAY;
            iltVar.c = android.opengl.EGL14.EGL_NO_CONTEXT;
            iltVar.d = android.opengl.EGL14.EGL_NO_SURFACE;
            iltVar.f = null;
            iltVar.e = null;
        }
    }

    @Override // defpackage.jje
    public final void k(long j) {
        defpackage.ilt iltVar = this.o;
        if (iltVar == null) {
            throw new java.lang.IllegalStateException("EglHelper is null in submitFrame");
        }
        android.opengl.EGLExt.eglPresentationTimeANDROID(iltVar.b, iltVar.d, j);
        android.opengl.EGL14.eglSwapBuffers(iltVar.b, iltVar.d);
    }

    @Override // defpackage.jje
    public final /* synthetic */ void l(android.util.SparseArray sparseArray, int i) {
        sparseArray.getClass();
    }

    @Override // defpackage.jje
    public final /* synthetic */ boolean m() {
        return true;
    }

    @Override // defpackage.jje
    public final boolean n(android.util.SparseArray sparseArray) {
        sparseArray.getClass();
        int size = sparseArray.size();
        boolean zAs = false;
        for (int i = 0; i < size; i++) {
            java.util.List list = (java.util.List) sparseArray.valueAt(i);
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    zAs |= ((defpackage.jhf) list.get(i2)).as();
                }
            }
        }
        return zAs;
    }

    @Override // defpackage.jje
    public final /* synthetic */ boolean o(defpackage.iyl iylVar) {
        return false;
    }

    @Override // defpackage.jje
    public final boolean p() {
        return this.l;
    }
}
