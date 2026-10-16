package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uuz {
    public static final defpackage.ypg a = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/GlContext");
    public static int b = 0;
    public static final int[] q = {1, 2, 3, 4, 5, 6, 7, 8};
    private final long A;
    private java.nio.ByteBuffer B;
    private final android.util.SparseArray C;
    private int D;
    private int E;
    public float f;
    public defpackage.uva g;
    public defpackage.uva h;
    public final boolean[] i;
    public boolean j;
    public boolean k;
    public final int[] l;
    public defpackage.uva m;
    public defpackage.uxp n;
    public final defpackage.uva[] o;
    public final java.util.HashMap p;
    private final android.content.res.Resources r;
    private float y;
    private float z;
    public int c = -1;
    public int d = -1;
    public int e = -1;
    private int s = -1;
    private int t = -1;
    private boolean u = false;
    private int v = -1;
    private int w = -1;
    private int x = -1;

    public uuz(android.content.res.Resources resources, android.content.res.Resources resources2, long j) {
        defpackage.uva uvaVar = defpackage.uva.a;
        this.g = uvaVar;
        this.h = uvaVar;
        this.j = false;
        this.l = new int[]{0, 0, 0, 0};
        this.B = java.nio.ByteBuffer.allocateDirect(4096).order(java.nio.ByteOrder.nativeOrder());
        this.C = new android.util.SparseArray();
        this.E = 1;
        this.D = -1;
        this.p = new java.util.HashMap();
        resources.getClass();
        this.r = resources2 != null ? resources2 : resources;
        this.i = new boolean[defpackage.uuy.a().f];
        this.o = new defpackage.uva[8];
        for (int i = 0; i < 8; i++) {
            this.o[i] = uvaVar;
        }
        this.A = j;
        U(4096, false);
    }

    public static final void J(int i, int i2, android.graphics.Bitmap bitmap) {
        android.opengl.GLUtils.texSubImage2D(3553, 0, i, i2, bitmap);
    }

    public static final int L(int i, java.lang.String str) {
        int iGlGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i, str);
        if (android.opengl.GLES20.glGetError() != 0) {
            throw new defpackage.uxk("Error while getting uniform location for ".concat(str));
        }
        if (iGlGetUniformLocation != -1) {
            return iGlGetUniformLocation;
        }
        throw new defpackage.uxk("Unable to get uniform location for ".concat(str));
    }

    private static java.lang.String R(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        java.util.Scanner scanner = new java.util.Scanner(str);
        int i = 1;
        while (scanner.hasNextLine()) {
            sb.append(java.lang.String.format(java.util.Locale.US, "%03d", java.lang.Integer.valueOf(i)));
            sb.append(": ");
            sb.append(scanner.nextLine());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    private final java.nio.ByteBuffer S(int i) {
        if (i > this.A) {
            U(i, true);
            return java.nio.ByteBuffer.allocateDirect(i).order(java.nio.ByteOrder.nativeOrder());
        }
        int iCapacity = this.B.capacity();
        if (iCapacity < i) {
            while (i > iCapacity) {
                iCapacity += iCapacity;
            }
            U(iCapacity, false);
            this.B = java.nio.ByteBuffer.allocateDirect(iCapacity).order(java.nio.ByteOrder.nativeOrder());
        }
        return this.B;
    }

    private static void T(java.lang.String str) {
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        java.lang.String strConcat = str.concat("\n");
        while (iGlGetError != 0) {
            strConcat = strConcat + "Error code: " + iGlGetError + "\n";
            iGlGetError = android.opengl.GLES20.glGetError();
        }
        ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.g()).p(new java.lang.RuntimeException(strConcat))).ai((char) 9695)).u("GlContext error");
    }

    private static void U(int i, boolean z) {
        if (!z) {
            java.lang.String[] strArr = defpackage.vbn.a;
            defpackage.fdp.a("GLTransferBuffer-size", i);
        } else {
            java.lang.String[] strArr2 = defpackage.vbn.a;
            defpackage.fdp.a("GLTransferBufferOnceOff-size", i);
            defpackage.fdp.a("GLTransferBufferOnceOff-size", 0);
        }
    }

    private final java.nio.ByteBuffer V(float[] fArr, int i) {
        java.nio.ByteBuffer byteBufferS = S(i * 4);
        byteBufferS.asFloatBuffer().put(fArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final void A(defpackage.uva uvaVar, int i, int i2, int i3, int i4, int i5, java.nio.ByteBuffer byteBuffer) {
        uvaVar.getClass();
        defpackage.uva uvaVar2 = this.o[0];
        x(1, uvaVar);
        android.opengl.GLES20.glTexImage2D(3553, 0, i, i2, i3, 0, i, 5121, byteBuffer);
        y(i4, i5);
        x(1, uvaVar2);
        uvaVar.e = i2 * i3 * 4;
    }

    public final java.nio.ByteBuffer B(byte[] bArr, int i) {
        java.nio.ByteBuffer byteBufferS = S(i);
        byteBufferS.put(bArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final java.nio.ByteBuffer C(int[] iArr, int i) {
        java.nio.ByteBuffer byteBufferS = S(i * 4);
        byteBufferS.asIntBuffer().put(iArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final java.nio.ByteBuffer D(short[] sArr, int i) {
        java.nio.ByteBuffer byteBufferS = S(i + i);
        byteBufferS.asShortBuffer().put(sArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final void E(float[] fArr, int i, int i2) {
        if (!w()) {
            ((defpackage.ype) a.a(defpackage.uzo.a).ai((char) 9696)).u("Started frame before we created our EGL context");
        }
        T("Unknown GL error(s) in frameStart:");
        this.k = false;
        defpackage.ysr.bj(!this.j);
        this.j = true;
        android.opengl.GLES20.glDisable(3089);
        android.opengl.GLES20.glColorMask(true, true, true, true);
        android.opengl.GLES20.glDepthMask(true);
        android.opengl.GLES20.glStencilMask(-1);
        android.opengl.GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        android.opengl.GLES20.glClearDepthf(1.0f);
        android.opengl.GLES20.glClearStencil(0);
        android.opengl.GLES20.glClear(17664);
        android.opengl.GLES20.glViewport(0, 0, i, i2);
        l();
    }

    public final void F(float[] fArr, int i) {
        o(34962, i * 4, V(fArr, i), 35044);
    }

    public final void G(short[] sArr, int i, int i2) {
        o(34963, i + i, D(sArr, i), i2);
    }

    public final void H(int i, int i2, float[] fArr, int i3) {
        android.opengl.GLES20.glBufferSubData(i, i2, i3 * 4, V(fArr, i3));
    }

    public final void I(int i, int i2, int i3, int i4, byte[] bArr) {
        android.opengl.GLES20.glTexSubImage2D(3553, 0, i, i2, i3, i4, 6408, 5121, B(bArr, bArr.length));
    }

    public final defpackage.uva K(int i) {
        defpackage.uva uvaVar = new defpackage.uva(i);
        uvaVar.a(null, this.m);
        this.m = uvaVar;
        return uvaVar;
    }

    public final void M(int[] iArr, int i) {
        o(34962, i * 4, C(iArr, i), 35044);
    }

    public final void N(defpackage.uva uvaVar, int i, int i2, int[] iArr) {
        A(uvaVar, 6408, i, i2, 1, 2, C(iArr, iArr.length));
    }

    public final defpackage.uva O() {
        int[] iArr = this.l;
        iArr[0] = 0;
        android.opengl.GLES20.glGenBuffers(1, iArr, 0);
        return K(iArr[0]);
    }

    public final defpackage.uva P() {
        int[] iArr = this.l;
        iArr[0] = 0;
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        return K(iArr[0]);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.uva Q() {
        int[] iArr = this.l;
        iArr[0] = 0;
        android.opengl.GLES20.glGenBuffers(1, iArr, 0);
        return K(iArr[0]);
    }

    public final int a(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        int iB = b(35633, str);
        int iB2 = b(35632, str2);
        int iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlCreateProgram == 0 || iGlGetError != 0) {
            throw new defpackage.uxk("glCreateProgram failed", "<no info log>", R(str), R(str2));
        }
        android.opengl.GLES20.glAttachShader(iGlCreateProgram, iB);
        int iGlGetError2 = android.opengl.GLES20.glGetError();
        if (iGlGetError2 != 0) {
            throw new defpackage.uxk("glAttachShader(vertShader) failed", defpackage.a.bn(iGlGetError2, iB, "Shader id: ", "\nGL error code: "), R(str), R(str2));
        }
        android.opengl.GLES20.glAttachShader(iGlCreateProgram, iB2);
        if (android.opengl.GLES20.glGetError() != 0) {
            throw new defpackage.uxk("glAttachShader(fragShader) failed", defpackage.a.bo(iB2, "Shader id "), R(str), R(str2));
        }
        for (int i = 0; i < strArr.length; i++) {
            java.lang.String str3 = strArr[i];
            if (!str3.equals("unused")) {
                android.opengl.GLES20.glBindAttribLocation(iGlCreateProgram, i, str3);
                int iGlGetError3 = android.opengl.GLES20.glGetError();
                if (iGlGetError3 != 0) {
                    throw new defpackage.uxk("glBindAttribLocation failed", "Attrib name: " + str3 + "\nAttrib index: " + i + "\nGL error code: " + iGlGetError3, R(str), R(str2));
                }
            }
        }
        android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = this.l;
        iArr[0] = 0;
        android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int iGlGetError4 = android.opengl.GLES20.glGetError();
        if (iArr[0] == 1 && iGlGetError4 == 0) {
            return iGlCreateProgram;
        }
        throw new defpackage.uxk("glLinkProgram failed", android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram), R(str), R(str2));
    }

    final int b(int i, java.lang.String str) {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i);
        int iGlGetError = android.opengl.GLES20.glGetError();
        if (iGlCreateShader == 0 || iGlGetError != 0) {
            throw new defpackage.uxk(defpackage.a.bn(iGlGetError, iGlCreateShader, "glCreateShader failed with return value ", " and GL error code "), "<no info log>", i, "<unused source>");
        }
        android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
        android.opengl.GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = this.l;
        iArr[0] = 0;
        android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        int iGlGetError2 = android.opengl.GLES20.glGetError();
        if (iArr[0] == 0 || iGlGetError2 != 0) {
            throw new defpackage.uxk("glCompileShader failed", android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader), i, R(str));
        }
        return iGlCreateShader;
    }

    public final defpackage.uwt c(java.lang.Class cls) {
        defpackage.uwt uwtVar;
        java.util.HashMap map = this.p;
        defpackage.uwt uwtVar2 = (defpackage.uwt) map.get(cls);
        if (uwtVar2 != null) {
            return uwtVar2;
        }
        try {
            uwtVar = (defpackage.uwt) cls.newInstance();
            try {
                map.put(cls, uwtVar);
            } catch (java.lang.IllegalAccessException | java.lang.InstantiationException e) {
                e = e;
                uwtVar2 = uwtVar;
                ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) a.g()).p(e)).ai((char) 9697)).y("Failed to instantiate ShaderProgram class %s", cls);
                uwtVar = uwtVar2;
            }
        } catch (java.lang.IllegalAccessException e2) {
            e = e2;
        } catch (java.lang.InstantiationException e3) {
            e = e3;
        }
        uwtVar.getClass();
        return uwtVar;
    }

    public final defpackage.uwz d(int i) {
        android.util.SparseArray sparseArray = this.C;
        defpackage.uwz uwzVar = (defpackage.uwz) sparseArray.get(i);
        if (uwzVar != null) {
            return uwzVar;
        }
        defpackage.uwz uwzVar2 = new defpackage.uwz(defpackage.a.bo(i, "resource"), 3, 1);
        android.content.res.Resources resources = this.r;
        android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = displayMetrics.densityDpi;
        options.inTargetDensity = displayMetrics.densityDpi;
        android.graphics.Bitmap bitmapDecodeResource = android.graphics.BitmapFactory.decodeResource(resources, i, options);
        if (bitmapDecodeResource == null) {
            ((defpackage.ype) ((defpackage.ype) defpackage.uwz.a.h()).ai(9719)).w("Null bitmap loaded from resource. Resource id: %d", i);
        } else {
            int width = bitmapDecodeResource.getWidth();
            int height = bitmapDecodeResource.getHeight();
            int width2 = bitmapDecodeResource.getWidth();
            int height2 = bitmapDecodeResource.getHeight();
            if (!defpackage.vab.e(width2) || !defpackage.vab.e(height2)) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                int width3 = bitmapDecodeResource.getWidth();
                int height3 = bitmapDecodeResource.getHeight();
                int iC = defpackage.vab.c(width3, 1);
                int iC2 = defpackage.vab.c(height3, 1);
                android.graphics.Bitmap bitmapCreateBitmap = android.graphics.Bitmap.createBitmap(iC, iC2, config);
                bitmapCreateBitmap.setDensity(bitmapDecodeResource.getDensity());
                bitmapCreateBitmap.eraseColor(0);
                android.graphics.Canvas canvas = new android.graphics.Canvas(bitmapCreateBitmap);
                android.graphics.Paint paint = new android.graphics.Paint();
                canvas.drawBitmap(bitmapDecodeResource, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, paint);
                if (iC > width3) {
                    canvas.drawBitmap(bitmapDecodeResource, new android.graphics.Rect(width3 - 1, 0, width3, height3), new android.graphics.Rect(width3, 0, width3 + 1, height3), paint);
                }
                if (iC2 > height3) {
                    canvas.drawBitmap(bitmapDecodeResource, new android.graphics.Rect(0, height3 - 1, width3, height3), new android.graphics.Rect(0, height3, width3, height3 + 1), paint);
                }
                if (iC > width3 && iC2 > height3) {
                    canvas.drawBitmap(bitmapDecodeResource, new android.graphics.Rect(width3 - 1, height3 - 1, width3, height3), new android.graphics.Rect(width3, height3, width3 + 1, height3 + 1), paint);
                }
                bitmapDecodeResource.recycle();
                bitmapDecodeResource = bitmapCreateBitmap;
            }
            uwzVar2.a(bitmapDecodeResource, width, height);
        }
        sparseArray.put(i, uwzVar2);
        return uwzVar2;
    }

    public final void e(defpackage.uva uvaVar) {
        int i = uvaVar.d;
        if (i != this.h.d) {
            android.opengl.GLES20.glBindBuffer(34963, i);
        }
        this.h = uvaVar;
    }

    public final void f(int i) {
        if (this.D == i) {
            return;
        }
        android.opengl.GLES20.glUseProgram(i);
        this.D = i;
    }

    public final void g(defpackage.uva uvaVar) {
        int i = uvaVar.d;
        if (i != this.g.d) {
            android.opengl.GLES20.glBindBuffer(34962, i);
        }
        this.g = uvaVar;
    }

    public final void h(defpackage.uva uvaVar) {
        if (uvaVar == this.g) {
            v();
        }
        if (uvaVar == this.h) {
            u();
        }
        int[] iArr = this.l;
        iArr[0] = uvaVar.d;
        android.opengl.GLES20.glDeleteBuffers(1, iArr, 0);
        t(uvaVar);
    }

    public final void i(defpackage.uva uvaVar) {
        if (uvaVar.b()) {
            for (int i = 0; i < 8; i++) {
                defpackage.uva[] uvaVarArr = this.o;
                if (uvaVarArr[i] == uvaVar) {
                    uvaVarArr[i] = defpackage.uva.a;
                }
            }
            int[] iArr = this.l;
            iArr[0] = uvaVar.d;
            android.opengl.GLES20.glDeleteTextures(1, iArr, 0);
            t(uvaVar);
        }
    }

    public final void j(int i) {
        boolean[] zArr = this.i;
        if (zArr[i]) {
            android.opengl.GLES20.glDisableVertexAttribArray(i);
            zArr[i] = false;
        }
    }

    public final void k(int i) {
        boolean[] zArr = this.i;
        if (zArr[i]) {
            return;
        }
        android.opengl.GLES20.glEnableVertexAttribArray(i);
        zArr[i] = true;
    }

    public final void l() {
        this.d = -1;
        this.e = -1;
        this.s = -1;
        this.t = -1;
        this.u = false;
        this.v = Integer.MIN_VALUE;
        this.w = Integer.MIN_VALUE;
        this.x = Integer.MIN_VALUE;
        this.y = Float.NaN;
        this.z = Float.NaN;
        this.f = Float.NaN;
        for (int i = 0; i < 8; i++) {
            android.opengl.GLES20.glActiveTexture(33984 + i);
            android.opengl.GLES20.glBindTexture(3553, 0);
            this.o[i] = defpackage.uva.a;
        }
        android.opengl.GLES20.glActiveTexture(33984);
        this.E = 1;
        this.D = -1;
        defpackage.uva uvaVar = defpackage.uva.a;
        int i2 = uvaVar.d;
        android.opengl.GLES20.glBindBuffer(34962, i2);
        android.opengl.GLES20.glBindBuffer(34963, i2);
        this.g = uvaVar;
        this.h = uvaVar;
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.i;
            if (i3 >= zArr.length) {
                return;
            }
            android.opengl.GLES20.glDisableVertexAttribArray(i3);
            zArr[i3] = false;
            i3++;
        }
    }

    public final void m() {
        defpackage.ysr.bj(this.j);
        this.j = false;
        T("Unknown GL error(s) in frameEnd:");
    }

    public final void n(int i, int i2) {
        defpackage.ysr.bj(this.j);
        if (this.d == i && this.e == i2) {
            return;
        }
        if (i == 1 && i2 == 0) {
            android.opengl.GLES20.glDisable(3042);
        } else {
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(i, i2);
        }
        this.d = i;
        this.e = i2;
    }

    public final void o(int i, int i2, java.nio.Buffer buffer, int i3) {
        android.opengl.GLES20.glBufferData(i, i2, buffer, i3);
        if (i == 34962) {
            this.g.e = i2;
        } else {
            this.h.e = i2;
        }
    }

    public final void p(int i) {
        defpackage.ysr.bj(this.j);
        if (this.s == i) {
            return;
        }
        if (i == 519) {
            android.opengl.GLES20.glDisable(2929);
        } else {
            android.opengl.GLES20.glEnable(2929);
            android.opengl.GLES20.glDepthFunc(i);
        }
        this.s = i;
    }

    public final void q(int i) {
        defpackage.ysr.bj(this.j);
        if (this.t == i) {
            return;
        }
        android.opengl.GLES20.glDepthMask(1 == i);
        this.t = i;
    }

    public final void r(float f, float f2) {
        defpackage.ysr.bj(this.j);
        if (this.y == f && this.z == f2) {
            return;
        }
        if (f == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED && f2 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
            android.opengl.GLES20.glDisable(32823);
        } else {
            android.opengl.GLES20.glEnable(32823);
            android.opengl.GLES20.glPolygonOffset(f, f2);
        }
        this.y = f;
        this.z = f2;
    }

    public final void s(boolean z, int i, int i2, int i3) {
        defpackage.ysr.bj(this.j);
        if (this.u == z && this.v == i && this.w == i2 && this.x == i3) {
            return;
        }
        if (z) {
            android.opengl.GLES20.glEnable(2960);
            android.opengl.GLES20.glStencilFunc(i, i2, i3);
            if (i == 519) {
                android.opengl.GLES20.glStencilOp(7681, 7681, 7681);
            } else {
                android.opengl.GLES20.glStencilOp(7680, 7680, 7680);
            }
            android.opengl.GLES20.glStencilMask(i3);
        } else {
            android.opengl.GLES20.glDisable(2960);
        }
        this.u = z;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    public final void t(defpackage.uva uvaVar) {
        defpackage.ysr.bj(uvaVar.b());
        if (this.m == uvaVar) {
            this.m = uvaVar.c;
        }
        defpackage.uva uvaVar2 = uvaVar.b;
        if (uvaVar2 != null) {
            uvaVar2.c = uvaVar.c;
        }
        defpackage.uva uvaVar3 = uvaVar.c;
        if (uvaVar3 != null) {
            uvaVar3.b = uvaVar2;
        }
        uvaVar.b = null;
        uvaVar.c = null;
        uvaVar.g = false;
    }

    public final void u() {
        e(defpackage.uva.a);
    }

    public final void v() {
        g(defpackage.uva.a);
    }

    public final boolean w() {
        return this.c != -1;
    }

    public final void x(int i, defpackage.uva uvaVar) {
        uvaVar.getClass();
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        defpackage.uva[] uvaVarArr = this.o;
        if (uvaVarArr[i2] != uvaVar) {
            if (this.E != i) {
                android.opengl.GLES20.glActiveTexture(33983 + i);
                this.E = i;
            }
            android.opengl.GLES20.glBindTexture(3553, uvaVar.d);
            uvaVarArr[i2] = uvaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:13:0x001d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0021  */
    /* JADX WARN: Code duplicated, block: B:17:0x0025  */
    /* JADX WARN: Code duplicated, block: B:18:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    public final void y(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i - 1;
        if (i8 != 0) {
            i3 = 9729;
            if (i8 != 1) {
                i3 = 9987;
                i4 = 9729;
            }
            i5 = i2 - 1;
            i6 = 33071;
            if (i5 != 0) {
                i7 = 10497;
                if (i5 != 1) {
                    i6 = 10497;
                } else if (i5 == 2) {
                    i7 = 33071;
                    i6 = 10497;
                }
            } else {
                i7 = 33071;
            }
            android.opengl.GLES20.glTexParameteri(3553, 10241, i3);
            android.opengl.GLES20.glTexParameteri(3553, 10240, i4);
            android.opengl.GLES20.glTexParameteri(3553, 10242, i6);
            android.opengl.GLES20.glTexParameteri(3553, 10243, i7);
            if (i == 3) {
                android.opengl.GLES20.glGenerateMipmap(3553);
            }
        }
        i3 = 9728;
        i4 = i3;
        i5 = i2 - 1;
        i6 = 33071;
        if (i5 != 0) {
            i7 = 10497;
            if (i5 != 1) {
                i6 = 10497;
            } else if (i5 == 2) {
                i7 = 33071;
                i6 = 10497;
            }
        } else {
            i7 = 33071;
        }
        android.opengl.GLES20.glTexParameteri(3553, 10241, i3);
        android.opengl.GLES20.glTexParameteri(3553, 10240, i4);
        android.opengl.GLES20.glTexParameteri(3553, 10242, i6);
        android.opengl.GLES20.glTexParameteri(3553, 10243, i7);
        if (i == 3) {
            android.opengl.GLES20.glGenerateMipmap(3553);
        }
    }

    public final void z(defpackage.uva uvaVar, int i, int i2, int i3, int i4) {
        defpackage.uva uvaVar2 = this.o[0];
        x(1, uvaVar);
        android.opengl.GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        y(i3, i4);
        x(1, uvaVar2);
        uvaVar.e = i * i2 * 4;
    }
}
