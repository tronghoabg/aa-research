package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jkb implements defpackage.jjn {
    private static final defpackage.yqm e = defpackage.yqm.c("CAR.WM.GLCTX");
    public final defpackage.jkd[] a = new defpackage.jkd[10];
    public int b = -1;
    public int c;
    public int d;

    public static final defpackage.jkd e(java.lang.String str, boolean z) throws defpackage.jkc {
        int iF;
        int i;
        int i2;
        int i3;
        int iF2 = f(35633, "precision highp float;\nuniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n");
        if (iF2 == 0 || (iF = f(35632, str)) == 0) {
            i = 0;
        } else {
            int iGlCreateProgram = android.opengl.GLES20.glCreateProgram();
            defpackage.yqm yqmVar = e;
            defpackage.jkc.a(yqmVar, "glCreateProgram");
            if (iGlCreateProgram == 0) {
                ((defpackage.yqj) yqmVar.g()).u("Could not create program");
            } else {
                android.opengl.GLES20.glAttachShader(iGlCreateProgram, iF2);
                defpackage.jkc.a(yqmVar, "glAttachShader");
                android.opengl.GLES20.glAttachShader(iGlCreateProgram, iF);
                defpackage.jkc.a(yqmVar, "glAttachShader");
                android.opengl.GLES20.glLinkProgram(iGlCreateProgram);
                int[] iArr = new int[1];
                android.opengl.GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                if (iArr[0] != 1) {
                    ((defpackage.yqj) yqmVar.g()).y("Could not link program: %s", android.opengl.GLES20.glGetProgramInfoLog(iGlCreateProgram));
                    android.opengl.GLES20.glDeleteProgram(iGlCreateProgram);
                } else {
                    i = iGlCreateProgram;
                }
            }
            i = 0;
        }
        int iGlGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(i, "aPosition");
        defpackage.yqm yqmVar2 = e;
        defpackage.jkc.a(yqmVar2, "glGetAttribLocation aPosition");
        if (iGlGetAttribLocation == -1) {
            throw new defpackage.jkc("Could not get attrib location for aPosition");
        }
        int iGlGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(i, "aTextureCoord");
        defpackage.jkc.a(yqmVar2, "glGetAttribLocation aTextureCoord");
        if (iGlGetAttribLocation2 != -1) {
            i2 = iGlGetAttribLocation2;
        } else {
            if (z) {
                throw new defpackage.jkc("Could not get attrib location for aTextureCoord");
            }
            i2 = -1;
        }
        int iGlGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(i, "uMVPMatrix");
        defpackage.jkc.a(yqmVar2, "glGetUniformLocation uMVPMatrix");
        if (iGlGetUniformLocation == -1) {
            throw new defpackage.jkc("Could not get attrib location for uMVPMatrix");
        }
        int iGlGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(i, "uSTMatrix");
        defpackage.jkc.a(yqmVar2, "glGetUniformLocation uSTMatrix");
        if (iGlGetUniformLocation2 != -1) {
            i3 = iGlGetUniformLocation2;
        } else {
            if (z) {
                throw new defpackage.jkc("Could not get attrib location for uSTMatrix");
            }
            i3 = -1;
        }
        return new defpackage.jkd(i, iGlGetUniformLocation, i3, iGlGetAttribLocation, i2);
    }

    private static final int f(int i, java.lang.String str) throws defpackage.jkc {
        int iGlCreateShader = android.opengl.GLES20.glCreateShader(i);
        defpackage.yqm yqmVar = e;
        defpackage.jkc.a(yqmVar, defpackage.a.bo(i, "glCreateShader type="));
        android.opengl.GLES20.glShaderSource(iGlCreateShader, str);
        android.opengl.GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        ((defpackage.yqj) yqmVar.g()).D("Could not compile shader %d: %s", i, android.opengl.GLES20.glGetShaderInfoLog(iGlCreateShader));
        android.opengl.GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public final int a(defpackage.jhi jhiVar) {
        return jhiVar.d == 1.0f ? 9728 : 9729;
    }

    public final defpackage.jkd b(int i) {
        defpackage.jkd jkdVar = this.a[i];
        if (jkdVar != null) {
            return jkdVar;
        }
        throw new java.lang.IllegalStateException(defpackage.a.bo(i, "Invalid programId: "));
    }

    public final void c() {
        int i = this.c;
        if (i != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.c = 0;
        }
        int i2 = this.d;
        if (i2 != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.d = 0;
        }
    }

    public final void d(int i) {
        if (i != this.b) {
            android.opengl.GLES20.glUseProgram(b(i).a);
            this.b = i;
        }
    }
}
