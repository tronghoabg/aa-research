package defpackage;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class aafs {
    public static final aafs a = new aafs();
    public static final ThreadLocal b;
    public static final ThreadLocal c;
    private static final ThreadLocal d;
    private static final ThreadLocal e;
    private static final ThreadLocal f;
    private static final ThreadLocal g;

    static {
        ExecutorService executorService = zrz.a;
        d = new zrv();
        e = new zrv();
        f = new zrv();
        g = new zrv();
        b = new zrv();
        c = new zrv();
    }

    static String a(int i) {
        if (i == 0) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(i);
        return String.format("*** GlError *** #%s|0x%x: %s", numValueOf, numValueOf, GLU.gluErrorString(i));
    }

    static final int b(String str, int i, String str2) {
        zkt.n(str, "tag");
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("loadShader(%s,%s)", Integer.valueOf(i), str2));
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str2);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = (int[]) f.get();
        iArr[0] = 0;
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("loadShader(): glCompileShader() OK => %s", Integer.valueOf(iGlCreateShader)));
            }
            return iGlCreateShader;
        }
        String str3 = String.format("glCompileShader() FAILED[%s]: %s", Integer.valueOf(iArr[0]), GLES20.glGetShaderInfoLog(iGlCreateShader));
        IllegalStateException illegalStateException = new IllegalStateException(str3);
        if (!zrn.e(str, 6)) {
            throw illegalStateException;
        }
        Log.e(str, str3, illegalStateException);
        throw illegalStateException;
    }

    public static final void c(int i, aafp aafpVar) {
        zkt.e(i != 0, "shaderProgram");
        zkt.n(aafpVar, "info");
        GLES20.glBindBuffer(34962, aafpVar.b);
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, aafpVar.a);
        GLES20.glEnableVertexAttribArray(iGlGetAttribLocation);
        GLES20.glVertexAttribPointer(iGlGetAttribLocation, aafpVar.d, aafpVar.c, false, 0, 0);
    }

    public static final String d() {
        return a(GLES20.glGetError());
    }

    public static final void e(aafp aafpVar) {
        zkt.n(aafpVar, "glChannelInfo");
        int[] iArr = (int[]) e.get();
        iArr[0] = aafpVar.b;
        GLES20.glDeleteBuffers(1, iArr, 0);
    }

    @ResultIgnorabilityUnspecified
    public static final void f(String str) {
        zkt.n(str, "TAG");
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            while (iGlGetError != 0) {
                if (zrn.e(str, 6)) {
                    Log.e(str, a(iGlGetError));
                }
                iGlGetError = GLES20.glGetError();
            }
        }
    }

    public static final int g() {
        int[] iArr = (int[]) d.get();
        iArr[0] = 0;
        GLES20.glGenBuffers(1, iArr, 0);
        return iArr[0];
    }

    public static final FloatBuffer h(int i) {
        return ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static final int i(String str, String str2, String str3) {
        zkt.n(str, "tag");
        if (zrn.e(str, 4)) {
            Log.i(str, String.format("registerShaderProgram([%s],[%s])", str2, str3));
        }
        int iB = b(str, 35633, str2);
        int iB2 = b(str, 35632, str3);
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, iB);
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = (int[]) g.get();
        iArr[0] = 0;
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            if (zrn.e(str, 4)) {
                Log.i(str, String.format("registerShaderProgram(): glLinkProgram() OK => %s", Integer.valueOf(iGlCreateProgram)));
            }
            return iGlCreateProgram;
        }
        String str4 = String.format("glLinkProgram() FAILED[%s]: %s", Integer.valueOf(iArr[0]), GLES20.glGetProgramInfoLog(iGlCreateProgram));
        IllegalStateException illegalStateException = new IllegalStateException(str4);
        if (!zrn.e(str, 6)) {
            throw illegalStateException;
        }
        Log.e(str, str4, illegalStateException);
        throw illegalStateException;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(int r5, android.graphics.Bitmap r6) {
        /*
            java.lang.String r0 = "bitmap"
            defpackage.zkt.n(r6, r0)
            r0 = 1
            r1 = 0
            if (r5 == 0) goto Lb
            r2 = r0
            goto Lc
        Lb:
            r2 = r1
        Lc:
            java.lang.String r3 = "glTextureHandle"
            defpackage.zkt.e(r2, r3)
            r2 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r2, r5)
            r5 = 10241(0x2801, float:1.435E-41)
            r3 = 1175977984(0x46180000, float:9728.0)
            android.opengl.GLES20.glTexParameterf(r2, r5, r3)
            r5 = 10240(0x2800, float:1.4349E-41)
            r3 = 1175979008(0x46180400, float:9729.0)
            android.opengl.GLES20.glTexParameterf(r2, r5, r3)
            r5 = 10242(0x2802, float:1.4352E-41)
            r3 = 1191259904(0x47012f00, float:33071.0)
            android.opengl.GLES20.glTexParameterf(r2, r5, r3)
            r5 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameterf(r2, r5, r3)
            java.lang.ThreadLocal r5 = defpackage.zrk.a
            android.graphics.Bitmap$Config r5 = r6.getConfig()
            r3 = 4
            if (r5 != 0) goto L3d
        L3b:
            r0 = r3
            goto L4e
        L3d:
            int[] r4 = defpackage.zrj.a
            int r5 = r5.ordinal()
            r5 = r4[r5]
            if (r5 == r0) goto L4e
            r0 = 2
            if (r5 == r0) goto L4e
            r4 = 3
            if (r5 == r4) goto L4e
            goto L3b
        L4e:
            java.lang.ThreadLocal r5 = defpackage.zrk.a
            java.lang.Object r5 = r5.get()
            int[] r5 = (int[]) r5
            r5[r1] = r1
            r3 = 3317(0xcf5, float:4.648E-42)
            android.opengl.GLES20.glGetIntegerv(r3, r5, r1)
            r5 = r5[r1]
            if (r0 == r5) goto L64
            android.opengl.GLES20.glPixelStorei(r3, r0)
        L64:
            android.opengl.GLUtils.texImage2D(r2, r1, r6, r1)
            if (r0 == r5) goto L6c
            android.opengl.GLES20.glPixelStorei(r3, r5)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aafs.j(int, android.graphics.Bitmap):void");
    }

    public static final aafp k(String str, FloatBuffer floatBuffer, int i) {
        zkt.n(floatBuffer, "floatBuffer");
        int iG = g();
        GLES20.glBindBuffer(34962, iG);
        GLES20.glBufferData(34962, floatBuffer.capacity() * 4, floatBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
        return new aafp(str, iG, 5126, i);
    }
}
