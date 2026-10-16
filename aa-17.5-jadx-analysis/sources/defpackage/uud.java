package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/* loaded from: classes3.dex */
public final class uud {
    public static final yob a = yob.c("com/google/android/libraries/geo/mapcore/renderer/GlContext");
    public static int b = 0;
    public static final int[] q = {1, 2, 3, 4, 5, 6, 7, 8};
    private final long A;
    private ByteBuffer B;
    private final SparseArray C;
    private int D;
    private int E;
    public float f;
    public uue g;
    public uue h;
    public final boolean[] i;
    public boolean j;
    public boolean k;
    public final int[] l;
    public uue m;
    public uws n;
    public final uue[] o;
    public final HashMap p;
    private final Resources r;
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

    public uud(Resources resources, Resources resources2, long j) {
        uue uueVar = uue.a;
        this.g = uueVar;
        this.h = uueVar;
        this.j = false;
        this.l = new int[]{0, 0, 0, 0};
        this.B = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());
        this.C = new SparseArray();
        this.E = 1;
        this.D = -1;
        this.p = new HashMap();
        resources.getClass();
        this.r = resources2 != null ? resources2 : resources;
        this.i = new boolean[uuc.a().f];
        this.o = new uue[8];
        for (int i = 0; i < 8; i++) {
            this.o[i] = uueVar;
        }
        this.A = j;
        U(4096, false);
    }

    public static final void J(int i, int i2, Bitmap bitmap) {
        GLUtils.texSubImage2D(3553, 0, i, i2, bitmap);
    }

    public static final int L(int i, String str) {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (GLES20.glGetError() != 0) {
            throw new uwn("Error while getting uniform location for ".concat(str));
        }
        if (iGlGetUniformLocation != -1) {
            return iGlGetUniformLocation;
        }
        throw new uwn("Unable to get uniform location for ".concat(str));
    }

    private static String R(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        Scanner scanner = new Scanner(str);
        int i = 1;
        while (scanner.hasNextLine()) {
            sb.append(String.format(Locale.US, "%03d", Integer.valueOf(i)));
            sb.append(": ");
            sb.append(scanner.nextLine());
            sb.append("\n");
            i++;
        }
        return sb.toString();
    }

    private final ByteBuffer S(int i) {
        if (i > this.A) {
            U(i, true);
            return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        int iCapacity = this.B.capacity();
        if (iCapacity < i) {
            while (i > iCapacity) {
                iCapacity += iCapacity;
            }
            U(iCapacity, false);
            this.B = ByteBuffer.allocateDirect(iCapacity).order(ByteOrder.nativeOrder());
        }
        return this.B;
    }

    private static void T(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String strConcat = str.concat("\n");
        while (iGlGetError != 0) {
            strConcat = strConcat + "Error code: " + iGlGetError + "\n";
            iGlGetError = GLES20.glGetError();
        }
        ((ynz) ((ynz) ((ynz) a.g()).p(new RuntimeException(strConcat))).ai((char) 9667)).u("GlContext error");
    }

    private static void U(int i, boolean z) {
        if (!z) {
            String[] strArr = vaq.a;
            fdi.a("GLTransferBuffer-size", i);
        } else {
            String[] strArr2 = vaq.a;
            fdi.a("GLTransferBufferOnceOff-size", i);
            fdi.a("GLTransferBufferOnceOff-size", 0);
        }
    }

    private final ByteBuffer V(float[] fArr, int i) {
        ByteBuffer byteBufferS = S(i * 4);
        byteBufferS.asFloatBuffer().put(fArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final void A(uue uueVar, int i, int i2, int i3, int i4, int i5, ByteBuffer byteBuffer) {
        uueVar.getClass();
        uue uueVar2 = this.o[0];
        x(1, uueVar);
        GLES20.glTexImage2D(3553, 0, i, i2, i3, 0, i, 5121, byteBuffer);
        y(i4, i5);
        x(1, uueVar2);
        uueVar.e = i2 * i3 * 4;
    }

    public final ByteBuffer B(byte[] bArr, int i) {
        ByteBuffer byteBufferS = S(i);
        byteBufferS.put(bArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final ByteBuffer C(int[] iArr, int i) {
        ByteBuffer byteBufferS = S(i * 4);
        byteBufferS.asIntBuffer().put(iArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final ByteBuffer D(short[] sArr, int i) {
        ByteBuffer byteBufferS = S(i + i);
        byteBufferS.asShortBuffer().put(sArr, 0, i);
        byteBufferS.rewind();
        return byteBufferS;
    }

    public final void E(float[] fArr, int i, int i2) {
        if (!w()) {
            ((ynz) a.a(uys.a).ai((char) 9668)).u("Started frame before we created our EGL context");
        }
        T("Unknown GL error(s) in frameStart:");
        this.k = false;
        woy.Z(!this.j);
        this.j = true;
        GLES20.glDisable(3089);
        GLES20.glColorMask(true, true, true, true);
        GLES20.glDepthMask(true);
        GLES20.glStencilMask(-1);
        GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClearStencil(0);
        GLES20.glClear(17664);
        GLES20.glViewport(0, 0, i, i2);
        l();
    }

    public final void F(float[] fArr, int i) {
        o(34962, i * 4, V(fArr, i), 35044);
    }

    public final void G(short[] sArr, int i, int i2) {
        o(34963, i + i, D(sArr, i), i2);
    }

    public final void H(int i, int i2, float[] fArr, int i3) {
        GLES20.glBufferSubData(i, i2, i3 * 4, V(fArr, i3));
    }

    public final void I(int i, int i2, int i3, int i4, byte[] bArr) {
        GLES20.glTexSubImage2D(3553, 0, i, i2, i3, i4, 6408, 5121, B(bArr, bArr.length));
    }

    public final uue K(int i) {
        uue uueVar = new uue(i);
        uueVar.a(null, this.m);
        this.m = uueVar;
        return uueVar;
    }

    public final void M(int[] iArr, int i) {
        o(34962, i * 4, C(iArr, i), 35044);
    }

    public final void N(uue uueVar, int i, int i2, int[] iArr) {
        A(uueVar, 6408, i, i2, 1, 2, C(iArr, iArr.length));
    }

    public final uue O() {
        int[] iArr = this.l;
        iArr[0] = 0;
        GLES20.glGenBuffers(1, iArr, 0);
        return K(iArr[0]);
    }

    public final uue P() {
        int[] iArr = this.l;
        iArr[0] = 0;
        GLES20.glGenTextures(1, iArr, 0);
        return K(iArr[0]);
    }

    @ResultIgnorabilityUnspecified
    public final uue Q() {
        int[] iArr = this.l;
        iArr[0] = 0;
        GLES20.glGenBuffers(1, iArr, 0);
        return K(iArr[0]);
    }

    public final int a(String str, String str2, String[] strArr) {
        int iB = b(35633, str);
        int iB2 = b(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        int iGlGetError = GLES20.glGetError();
        if (iGlCreateProgram == 0 || iGlGetError != 0) {
            throw new uwn("glCreateProgram failed", "<no info log>", R(str), R(str2));
        }
        GLES20.glAttachShader(iGlCreateProgram, iB);
        int iGlGetError2 = GLES20.glGetError();
        if (iGlGetError2 != 0) {
            throw new uwn("glAttachShader(vertShader) failed", a.bo(iGlGetError2, iB, "Shader id: ", "\nGL error code: "), R(str), R(str2));
        }
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        if (GLES20.glGetError() != 0) {
            throw new uwn("glAttachShader(fragShader) failed", a.bp(iB2, "Shader id "), R(str), R(str2));
        }
        for (int i = 0; i < strArr.length; i++) {
            String str3 = strArr[i];
            if (!str3.equals("unused")) {
                GLES20.glBindAttribLocation(iGlCreateProgram, i, str3);
                int iGlGetError3 = GLES20.glGetError();
                if (iGlGetError3 != 0) {
                    throw new uwn("glBindAttribLocation failed", "Attrib name: " + str3 + "\nAttrib index: " + i + "\nGL error code: " + iGlGetError3, R(str), R(str2));
                }
            }
        }
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = this.l;
        iArr[0] = 0;
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        int iGlGetError4 = GLES20.glGetError();
        if (iArr[0] == 1 && iGlGetError4 == 0) {
            return iGlCreateProgram;
        }
        throw new uwn("glLinkProgram failed", GLES20.glGetProgramInfoLog(iGlCreateProgram), R(str), R(str2));
    }

    final int b(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        int iGlGetError = GLES20.glGetError();
        if (iGlCreateShader == 0 || iGlGetError != 0) {
            throw new uwn(a.bo(iGlGetError, iGlCreateShader, "glCreateShader failed with return value ", " and GL error code "), "<no info log>", i, "<unused source>");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = this.l;
        iArr[0] = 0;
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        int iGlGetError2 = GLES20.glGetError();
        if (iArr[0] == 0 || iGlGetError2 != 0) {
            throw new uwn("glCompileShader failed", GLES20.glGetShaderInfoLog(iGlCreateShader), i, R(str));
        }
        return iGlCreateShader;
    }

    public final uvw c(Class cls) {
        uvw uvwVar;
        HashMap map = this.p;
        uvw uvwVar2 = (uvw) map.get(cls);
        if (uvwVar2 != null) {
            return uvwVar2;
        }
        try {
            uvwVar = (uvw) cls.newInstance();
        } catch (IllegalAccessException e) {
            e = e;
        } catch (InstantiationException e2) {
            e = e2;
        }
        try {
            map.put(cls, uvwVar);
        } catch (IllegalAccessException | InstantiationException e3) {
            e = e3;
            uvwVar2 = uvwVar;
            ((ynz) ((ynz) ((ynz) a.g()).p(e)).ai((char) 9669)).y("Failed to instantiate ShaderProgram class %s", cls);
            uvwVar = uvwVar2;
            uvwVar.getClass();
            return uvwVar;
        }
        uvwVar.getClass();
        return uvwVar;
    }

    public final uwc d(int i) {
        Bitmap bitmap;
        SparseArray sparseArray = this.C;
        uwc uwcVar = (uwc) sparseArray.get(i);
        if (uwcVar != null) {
            return uwcVar;
        }
        uwc uwcVar2 = new uwc(a.bp(i, "resource"), 3, 1);
        Resources resources = this.r;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = displayMetrics.densityDpi;
        options.inTargetDensity = displayMetrics.densityDpi;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(resources, i, options);
        if (bitmapDecodeResource == null) {
            ((ynz) ((ynz) uwc.a.h()).ai(9691)).w("Null bitmap loaded from resource. Resource id: %d", i);
        } else {
            int width = bitmapDecodeResource.getWidth();
            int height = bitmapDecodeResource.getHeight();
            int width2 = bitmapDecodeResource.getWidth();
            int height2 = bitmapDecodeResource.getHeight();
            if (!uzg.e(width2) || !uzg.e(height2)) {
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                int width3 = bitmapDecodeResource.getWidth();
                int height3 = bitmapDecodeResource.getHeight();
                int iC = uzg.c(width3, 1);
                int iC2 = uzg.c(height3, 1);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iC, iC2, config);
                bitmapCreateBitmap.setDensity(bitmapDecodeResource.getDensity());
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint();
                canvas.drawBitmap(bitmapDecodeResource, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
                if (iC > width3) {
                    bitmap = bitmapCreateBitmap;
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(width3 - 1, 0, width3, height3), new Rect(width3, 0, width3 + 1, height3), paint);
                } else {
                    bitmap = bitmapCreateBitmap;
                }
                if (iC2 > height3) {
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(0, height3 - 1, width3, height3), new Rect(0, height3, width3, height3 + 1), paint);
                }
                if (iC > width3 && iC2 > height3) {
                    canvas.drawBitmap(bitmapDecodeResource, new Rect(width3 - 1, height3 - 1, width3, height3), new Rect(width3, height3, width3 + 1, height3 + 1), paint);
                }
                bitmapDecodeResource.recycle();
                bitmapDecodeResource = bitmap;
            }
            uwcVar2.a(bitmapDecodeResource, width, height);
        }
        sparseArray.put(i, uwcVar2);
        return uwcVar2;
    }

    public final void e(uue uueVar) {
        int i = uueVar.d;
        if (i != this.h.d) {
            GLES20.glBindBuffer(34963, i);
        }
        this.h = uueVar;
    }

    public final void f(int i) {
        if (this.D == i) {
            return;
        }
        GLES20.glUseProgram(i);
        this.D = i;
    }

    public final void g(uue uueVar) {
        int i = uueVar.d;
        if (i != this.g.d) {
            GLES20.glBindBuffer(34962, i);
        }
        this.g = uueVar;
    }

    public final void h(uue uueVar) {
        if (uueVar == this.g) {
            v();
        }
        if (uueVar == this.h) {
            u();
        }
        int[] iArr = this.l;
        iArr[0] = uueVar.d;
        GLES20.glDeleteBuffers(1, iArr, 0);
        t(uueVar);
    }

    public final void i(uue uueVar) {
        if (uueVar.b()) {
            for (int i = 0; i < 8; i++) {
                uue[] uueVarArr = this.o;
                if (uueVarArr[i] == uueVar) {
                    uueVarArr[i] = uue.a;
                }
            }
            int[] iArr = this.l;
            iArr[0] = uueVar.d;
            GLES20.glDeleteTextures(1, iArr, 0);
            t(uueVar);
        }
    }

    public final void j(int i) {
        boolean[] zArr = this.i;
        if (zArr[i]) {
            GLES20.glDisableVertexAttribArray(i);
            zArr[i] = false;
        }
    }

    public final void k(int i) {
        boolean[] zArr = this.i;
        if (zArr[i]) {
            return;
        }
        GLES20.glEnableVertexAttribArray(i);
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
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, 0);
            this.o[i] = uue.a;
        }
        GLES20.glActiveTexture(33984);
        this.E = 1;
        this.D = -1;
        uue uueVar = uue.a;
        int i2 = uueVar.d;
        GLES20.glBindBuffer(34962, i2);
        GLES20.glBindBuffer(34963, i2);
        this.g = uueVar;
        this.h = uueVar;
        int i3 = 0;
        while (true) {
            boolean[] zArr = this.i;
            if (i3 >= zArr.length) {
                return;
            }
            GLES20.glDisableVertexAttribArray(i3);
            zArr[i3] = false;
            i3++;
        }
    }

    public final void m() {
        woy.Z(this.j);
        this.j = false;
        T("Unknown GL error(s) in frameEnd:");
    }

    public final void n(int i, int i2) {
        woy.Z(this.j);
        if (this.d == i && this.e == i2) {
            return;
        }
        if (i == 1 && i2 == 0) {
            GLES20.glDisable(3042);
        } else {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(i, i2);
        }
        this.d = i;
        this.e = i2;
    }

    public final void o(int i, int i2, Buffer buffer, int i3) {
        GLES20.glBufferData(i, i2, buffer, i3);
        if (i == 34962) {
            this.g.e = i2;
        } else {
            this.h.e = i2;
        }
    }

    public final void p(int i) {
        woy.Z(this.j);
        if (this.s == i) {
            return;
        }
        if (i == 519) {
            GLES20.glDisable(2929);
        } else {
            GLES20.glEnable(2929);
            GLES20.glDepthFunc(i);
        }
        this.s = i;
    }

    public final void q(int i) {
        woy.Z(this.j);
        if (this.t == i) {
            return;
        }
        GLES20.glDepthMask(1 == i);
        this.t = i;
    }

    public final void r(float f, float f2) {
        woy.Z(this.j);
        if (this.y == f && this.z == f2) {
            return;
        }
        if (f == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
            GLES20.glDisable(32823);
        } else {
            GLES20.glEnable(32823);
            GLES20.glPolygonOffset(f, f2);
        }
        this.y = f;
        this.z = f2;
    }

    public final void s(boolean z, int i, int i2, int i3) {
        woy.Z(this.j);
        if (this.u == z && this.v == i && this.w == i2 && this.x == i3) {
            return;
        }
        if (z) {
            GLES20.glEnable(2960);
            GLES20.glStencilFunc(i, i2, i3);
            if (i == 519) {
                GLES20.glStencilOp(7681, 7681, 7681);
            } else {
                GLES20.glStencilOp(7680, 7680, 7680);
            }
            GLES20.glStencilMask(i3);
        } else {
            GLES20.glDisable(2960);
        }
        this.u = z;
        this.v = i;
        this.w = i2;
        this.x = i3;
    }

    public final void t(uue uueVar) {
        woy.Z(uueVar.b());
        if (this.m == uueVar) {
            this.m = uueVar.c;
        }
        uue uueVar2 = uueVar.b;
        if (uueVar2 != null) {
            uueVar2.c = uueVar.c;
        }
        uue uueVar3 = uueVar.c;
        if (uueVar3 != null) {
            uueVar3.b = uueVar2;
        }
        uueVar.b = null;
        uueVar.c = null;
        uueVar.g = false;
    }

    public final void u() {
        e(uue.a);
    }

    public final void v() {
        g(uue.a);
    }

    public final boolean w() {
        return this.c != -1;
    }

    public final void x(int i, uue uueVar) {
        uueVar.getClass();
        if (i == 0) {
            throw null;
        }
        int i2 = i - 1;
        uue[] uueVarArr = this.o;
        if (uueVarArr[i2] != uueVar) {
            if (this.E != i) {
                GLES20.glActiveTexture(33983 + i);
                this.E = i;
            }
            GLES20.glBindTexture(3553, uueVar.d);
            uueVarArr[i2] = uueVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(int r6, int r7) {
        /*
            r5 = this;
            int r5 = r6 + (-1)
            r0 = 1
            if (r5 == 0) goto Lf
            r1 = 9729(0x2601, float:1.3633E-41)
            if (r5 == r0) goto L11
            r5 = 9987(0x2703, float:1.3995E-41)
            r4 = r1
            r1 = r5
            r5 = r4
            goto L12
        Lf:
            r1 = 9728(0x2600, float:1.3632E-41)
        L11:
            r5 = r1
        L12:
            int r7 = r7 + (-1)
            r2 = 33071(0x812f, float:4.6342E-41)
            if (r7 == 0) goto L27
            r3 = 10497(0x2901, float:1.471E-41)
            if (r7 == r0) goto L25
            r0 = 2
            if (r7 == r0) goto L21
            goto L28
        L21:
            r4 = r3
            r3 = r2
            r2 = r4
            goto L28
        L25:
            r2 = r3
            goto L28
        L27:
            r3 = r2
        L28:
            r7 = 10241(0x2801, float:1.435E-41)
            r0 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glTexParameteri(r0, r7, r1)
            r7 = 10240(0x2800, float:1.4349E-41)
            android.opengl.GLES20.glTexParameteri(r0, r7, r5)
            r5 = 10242(0x2802, float:1.4352E-41)
            android.opengl.GLES20.glTexParameteri(r0, r5, r2)
            r5 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r0, r5, r3)
            r5 = 3
            if (r6 != r5) goto L44
            android.opengl.GLES20.glGenerateMipmap(r0)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uud.y(int, int):void");
    }

    public final void z(uue uueVar, int i, int i2, int i3, int i4) {
        uue uueVar2 = this.o[0];
        x(1, uueVar);
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        y(i3, i4);
        x(1, uueVar2);
        uueVar.e = i * i2 * 4;
    }
}
