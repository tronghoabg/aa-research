package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jho extends defpackage.jhh {
    public static final /* synthetic */ int O = 0;
    private static final defpackage.yqm P = defpackage.yqm.c("CAR.WM.WINWG");
    public final float[] M;
    public volatile android.graphics.SurfaceTexture N;
    private final java.util.function.Consumer Q;
    private final defpackage.xzi R;
    private int S;
    private volatile android.view.Surface T;
    private final android.graphics.SurfaceTexture.OnFrameAvailableListener U;

    public jho(defpackage.jkr jkrVar, int i, defpackage.jhk jhkVar, com.google.android.gms.car.display.CarRegionId carRegionId, java.util.function.Consumer consumer, java.util.UUID uuid, android.content.ComponentName componentName) {
        super(jkrVar, i, jhkVar, carRegionId, uuid, componentName);
        this.Q = consumer;
        this.M = new float[16];
        defpackage.xzi xziVarAQ = defpackage.ysr.aQ(new defpackage.joi(1));
        xziVarAQ.getClass();
        this.R = xziVarAQ;
        this.U = new android.graphics.SurfaceTexture.OnFrameAvailableListener() { // from class: jhn
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
                defpackage.jho jhoVar = this.a;
                synchronized (jhoVar) {
                    android.graphics.SurfaceTexture surfaceTexture2 = jhoVar.N;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.updateTexImage();
                        surfaceTexture2.getTransformMatrix(jhoVar.M);
                    }
                }
            }
        };
    }

    @Override // defpackage.jhh
    protected final void aR(defpackage.jkb jkbVar, float f, float[] fArr, defpackage.jhm jhmVar, int i) {
        defpackage.jkd jkdVarB;
        fArr.getClass();
        super.aR(jkbVar, f, fArr, jhmVar, i);
        if (((java.lang.Boolean) this.R.fF()).booleanValue()) {
            if (f == 1.0f) {
                jkbVar.d(0);
                jkdVarB = jkbVar.b(0);
            } else {
                jkbVar.d(1);
                jkdVarB = jkbVar.b(1);
                android.opengl.GLES20.glUniform1f(android.opengl.GLES20.glGetUniformLocation(jkdVarB.a, "uAlphaMask"), f);
            }
            android.opengl.GLES20.glEnable(3042);
            android.opengl.GLES20.glBlendFunc(1, 771);
            android.opengl.GLES20.glActiveTexture(33984);
            android.opengl.GLES20.glBindTexture(36197, this.S);
            this.G.position(0);
            java.nio.FloatBuffer floatBuffer = this.G;
            int i2 = jkdVarB.d;
            android.opengl.GLES20.glVertexAttribPointer(i2, 3, 5126, false, 20, (java.nio.Buffer) floatBuffer);
            android.opengl.GLES20.glEnableVertexAttribArray(i2);
            this.G.position(3);
            java.nio.FloatBuffer floatBuffer2 = this.G;
            int i3 = jkdVarB.e;
            android.opengl.GLES20.glVertexAttribPointer(i3, 2, 5126, false, 20, (java.nio.Buffer) floatBuffer2);
            android.opengl.GLES20.glEnableVertexAttribArray(i3);
            android.opengl.GLES20.glUniformMatrix4fv(jkdVarB.c, 1, false, this.M, 0);
            android.opengl.GLES20.glDrawArrays(5, 0, 4);
        }
    }

    @Override // defpackage.jhh, defpackage.jhl
    public final synchronized void aT(defpackage.jjn jjnVar) {
        jjnVar.getClass();
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.S = i;
        android.opengl.GLES20.glBindTexture(36197, i);
        defpackage.yqm yqmVar = P;
        defpackage.jkc.a(yqmVar, "glBindTexture mTextureID");
        defpackage.jhi jhiVar = ((defpackage.inh) this.c).w;
        if (jhiVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        android.opengl.GLES20.glTexParameterf(36197, 10241, ((defpackage.jkb) jjnVar).a(jhiVar));
        android.opengl.GLES20.glTexParameterf(36197, 10240, ((defpackage.jkb) jjnVar).a(jhiVar));
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        defpackage.jkc.a(yqmVar, "glTexParameter");
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.S);
        defpackage.jhx jhxVar = this.f;
        if (jhxVar == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        surfaceTexture.setDefaultBufferSize(jhxVar.c, jhxVar.d);
        this.T = new android.view.Surface(surfaceTexture);
        surfaceTexture.setOnFrameAvailableListener(this.U);
        this.N = surfaceTexture;
        android.opengl.GLES20.glBindTexture(36197, 0);
        super.aT(jjnVar);
    }

    @Override // defpackage.jhh
    protected final synchronized void aU() {
        android.view.Surface surface = this.T;
        if (surface != null) {
            surface.release();
            this.T = null;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.N;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.N = null;
        }
        int i = this.S;
        if (i != 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
            android.opengl.GLES20.glFinish();
            this.S = 0;
        }
        super.aU();
    }

    @Override // defpackage.jhh
    public final synchronized boolean bb() {
        android.graphics.SurfaceTexture surfaceTexture;
        boolean zBb = super.bb();
        if (!zBb || (surfaceTexture = this.N) == null) {
            return zBb;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.M);
        return true;
    }

    @Override // defpackage.jha
    protected final void bo(int i, int i2) {
        int iJ;
        synchronized (this.t) {
            iJ = j();
        }
        synchronized (this) {
            if (this.T == null) {
                ((defpackage.yqj) P.f()).y("Cannot modify null surface. Current window state is %s.", new defpackage.zkf(defpackage.zke.a, java.lang.Integer.valueOf(iJ)));
                defpackage.ysr.bo(iJ != 0, "Window state cannot be STATE_CREATED.", new java.lang.Object[0]);
            } else {
                android.view.Surface surface = this.T;
                if (surface != null) {
                    a$.ExternalSyntheticApiModelOutline2.m(this.Q, surface);
                }
            }
        }
        super.bo(i, i2);
    }
}
