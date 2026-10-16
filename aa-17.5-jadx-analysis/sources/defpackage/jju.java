package defpackage;

import android.opengl.GLES20;

/* loaded from: classes.dex */
public final class jju implements jjh {
    private static final yph e = yph.c("CAR.WM.GLCTX");
    public final jjw[] a = new jjw[10];
    public int b = -1;
    public int c;
    public int d;

    public static final jjw e(String str, boolean z) throws jjv {
        int iF;
        int i;
        int i2;
        int i3;
        int iF2 = f(35633, "precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iF2 == 0 || (iF = f(35632, str)) == 0) {
            i = 0;
        } else {
            int iGlCreateProgram = GLES20.glCreateProgram();
            yph yphVar = e;
            jjv.a(yphVar, "glCreateProgram");
            if (iGlCreateProgram == 0) {
                ((ype) yphVar.g()).u("Could not create program");
            } else {
                GLES20.glAttachShader(iGlCreateProgram, iF2);
                jjv.a(yphVar, "glAttachShader");
                GLES20.glAttachShader(iGlCreateProgram, iF);
                jjv.a(yphVar, "glAttachShader");
                GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    ((ype) yphVar.g()).y("Could not link program: %s", GLES20.glGetProgramInfoLog(iGlCreateProgram));
                    GLES20.glDeleteProgram(iGlCreateProgram);
                } else {
                    i = iGlCreateProgram;
                }
            }
            i = 0;
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, "aPosition");
        yph yphVar2 = e;
        jjv.a(yphVar2, "glGetAttribLocation aPosition");
        if (iGlGetAttribLocation == -1) {
            throw new jjv("Could not get attrib location for aPosition");
        }
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(i, "aTextureCoord");
        jjv.a(yphVar2, "glGetAttribLocation aTextureCoord");
        if (iGlGetAttribLocation2 != -1) {
            i2 = iGlGetAttribLocation2;
        } else {
            if (z) {
                throw new jjv("Could not get attrib location for aTextureCoord");
            }
            i2 = -1;
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, "uMVPMatrix");
        jjv.a(yphVar2, "glGetUniformLocation uMVPMatrix");
        if (iGlGetUniformLocation == -1) {
            throw new jjv("Could not get attrib location for uMVPMatrix");
        }
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(i, "uSTMatrix");
        jjv.a(yphVar2, "glGetUniformLocation uSTMatrix");
        if (iGlGetUniformLocation2 != -1) {
            i3 = iGlGetUniformLocation2;
        } else {
            if (z) {
                throw new jjv("Could not get attrib location for uSTMatrix");
            }
            i3 = -1;
        }
        return new jjw(i, iGlGetUniformLocation, i3, iGlGetAttribLocation, i2);
    }

    private static final int f(int i, String str) throws jjv {
        int iGlCreateShader = GLES20.glCreateShader(i);
        yph yphVar = e;
        jjv.a(yphVar, a.bp(i, "glCreateShader type="));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        ((ype) yphVar.g()).D("Could not compile shader %d: %s", i, GLES20.glGetShaderInfoLog(iGlCreateShader));
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final int a(jhc jhcVar) {
        return jhcVar.d == 1.0f ? 9728 : 9729;
    }

    public final jjw b(int i) {
        jjw jjwVar = this.a[i];
        if (jjwVar != null) {
            return jjwVar;
        }
        throw new IllegalStateException(a.bp(i, "Invalid programId: "));
    }

    public final void c() {
        int i = this.c;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.c = 0;
        }
        int i2 = this.d;
        if (i2 != 0) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.d = 0;
        }
    }

    public final void d(int i) {
        if (i != this.b) {
            GLES20.glUseProgram(b(i).a);
            this.b = i;
        }
    }
}
