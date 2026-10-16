package defpackage;

import android.content.ComponentName;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.view.Surface;
import com.google.android.gms.car.display.CarRegionId;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.UUID;
import java.util.function.Consumer;

/* loaded from: classes.dex */
public final class jhi extends jhb {
    public static final /* synthetic */ int N = 0;
    private static final yph O = yph.c("CAR.WM.WINWG");
    public final float[] L;
    public volatile SurfaceTexture M;
    private final Consumer P;
    private final xyc Q;
    private int R;
    private volatile Surface S;
    private final SurfaceTexture.OnFrameAvailableListener T;

    public jhi(jkk jkkVar, int i, jhe jheVar, CarRegionId carRegionId, Consumer consumer, UUID uuid, ComponentName componentName) {
        super(jkkVar, i, jheVar, carRegionId, uuid, componentName);
        this.P = consumer;
        this.L = new float[16];
        xyc xycVarL = wub.L(new imq(6));
        xycVarL.getClass();
        this.Q = xycVarL;
        this.T = new SurfaceTexture.OnFrameAvailableListener() { // from class: jhh
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                jhi jhiVar = this.a;
                synchronized (jhiVar) {
                    SurfaceTexture surfaceTexture2 = jhiVar.M;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.updateTexImage();
                        surfaceTexture2.getTransformMatrix(jhiVar.L);
                    }
                }
            }
        };
    }

    @Override // defpackage.jhb
    protected final void aP(jju jjuVar, float f, float[] fArr, jhg jhgVar, int i) {
        jjw jjwVarB;
        fArr.getClass();
        super.aP(jjuVar, f, fArr, jhgVar, i);
        if (((Boolean) this.Q.gu()).booleanValue()) {
            if (f == 1.0f) {
                jjuVar.d(0);
                jjwVarB = jjuVar.b(0);
            } else {
                jjuVar.d(1);
                jjwVarB = jjuVar.b(1);
                GLES20.glUniform1f(GLES20.glGetUniformLocation(jjwVarB.a, "uAlphaMask"), f);
            }
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(1, 771);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, this.R);
            this.F.position(0);
            FloatBuffer floatBuffer = this.F;
            int i2 = jjwVarB.d;
            GLES20.glVertexAttribPointer(i2, 3, 5126, false, 20, (Buffer) floatBuffer);
            GLES20.glEnableVertexAttribArray(i2);
            this.F.position(3);
            FloatBuffer floatBuffer2 = this.F;
            int i3 = jjwVarB.e;
            GLES20.glVertexAttribPointer(i3, 2, 5126, false, 20, (Buffer) floatBuffer2);
            GLES20.glEnableVertexAttribArray(i3);
            GLES20.glUniformMatrix4fv(jjwVarB.c, 1, false, this.L, 0);
            GLES20.glDrawArrays(5, 0, 4);
        }
    }

    @Override // defpackage.jhb, defpackage.jhf
    public final synchronized void aR(jjh jjhVar) {
        jjhVar.getClass();
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.R = i;
        GLES20.glBindTexture(36197, i);
        yph yphVar = O;
        jjv.a(yphVar, "glBindTexture mTextureID");
        if (((ina) this.c).w == null) {
            throw new IllegalStateException("Required value was null.");
        }
        GLES20.glTexParameterf(36197, 10241, ((jju) jjhVar).a(r3));
        GLES20.glTexParameterf(36197, 10240, ((jju) jjhVar).a(r3));
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        jjv.a(yphVar, "glTexParameter");
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.R);
        jhq jhqVar = this.e;
        if (jhqVar == null) {
            throw new IllegalStateException("Required value was null.");
        }
        surfaceTexture.setDefaultBufferSize(jhqVar.c, jhqVar.d);
        this.S = new Surface(surfaceTexture);
        surfaceTexture.setOnFrameAvailableListener(this.T);
        this.M = surfaceTexture;
        GLES20.glBindTexture(36197, 0);
        super.aR(jjhVar);
    }

    @Override // defpackage.jhb
    protected final synchronized void aS() {
        Surface surface = this.S;
        if (surface != null) {
            surface.release();
            this.S = null;
        }
        SurfaceTexture surfaceTexture = this.M;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.M = null;
        }
        int i = this.R;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            GLES20.glFinish();
            this.R = 0;
        }
        super.aS();
    }

    @Override // defpackage.jhb
    public final synchronized boolean aZ() {
        SurfaceTexture surfaceTexture;
        boolean zAZ = super.aZ();
        if (!zAZ || (surfaceTexture = this.M) == null) {
            return zAZ;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.L);
        return true;
    }

    @Override // defpackage.jgs
    protected final void bm(int i, int i2) {
        int iJ;
        synchronized (this.s) {
            iJ = j();
        }
        synchronized (this) {
            if (this.S == null) {
                ((ype) O.f()).y("Cannot modify null surface. Current window state is %s.", new zjd(zjc.a, Integer.valueOf(iJ)));
                woy.ae(iJ != 0, "Window state cannot be STATE_CREATED.", new Object[0]);
            } else {
                Surface surface = this.S;
                if (surface != null) {
                    this.P.accept(surface);
                }
            }
        }
        super.bm(i, i2);
    }
}
