package w6;

import A7.C0237b0;
import E5.T;
import Q1.t;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.unity3d.services.UnityAdsConstants;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import u6.AbstractC4256a;
import u6.C4261f;
import u6.v;

/* loaded from: classes3.dex */
public final class i implements v6.i, InterfaceC4367a {

    /* renamed from: i, reason: collision with root package name */
    public int f47341i;

    /* renamed from: j, reason: collision with root package name */
    public SurfaceTexture f47342j;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f47344m;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f47333a = new AtomicBoolean();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f47334b = new AtomicBoolean(true);

    /* renamed from: c, reason: collision with root package name */
    public final g f47335c = new g();

    /* renamed from: d, reason: collision with root package name */
    public final C0237b0 f47336d = new C0237b0((byte) 0, 15);

    /* renamed from: e, reason: collision with root package name */
    public final t f47337e = new t(1);

    /* renamed from: f, reason: collision with root package name */
    public final t f47338f = new t(1);

    /* renamed from: g, reason: collision with root package name */
    public final float[] f47339g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public final float[] f47340h = new float[16];
    public volatile int k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f47343l = -1;

    @Override // w6.InterfaceC4367a
    public final void a(long j8, float[] fArr) {
        ((t) this.f47336d.f815e).a(j8, fArr);
    }

    @Override // w6.InterfaceC4367a
    public final void b() {
        this.f47337e.d();
        C0237b0 c0237b0 = this.f47336d;
        ((t) c0237b0.f815e).d();
        c0237b0.f812b = false;
        this.f47334b.set(true);
    }

    public final void c(float[] fArr) {
        Object objH;
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            AbstractC4256a.f();
        } catch (C4261f e7) {
            AbstractC4256a.p("SceneRenderer", "Failed to draw a frame", e7);
        }
        if (this.f47333a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = this.f47342j;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                AbstractC4256a.f();
            } catch (C4261f e10) {
                AbstractC4256a.p("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (this.f47334b.compareAndSet(true, false)) {
                Matrix.setIdentityM(this.f47339g, 0);
            }
            long timestamp = this.f47342j.getTimestamp();
            t tVar = this.f47337e;
            synchronized (tVar) {
                objH = tVar.h(timestamp, false);
            }
            Long l10 = (Long) objH;
            if (l10 != null) {
                C0237b0 c0237b0 = this.f47336d;
                float[] fArr2 = this.f47339g;
                float[] fArr3 = (float[]) ((t) c0237b0.f815e).j(l10.longValue());
                if (fArr3 != null) {
                    float f10 = fArr3[0];
                    float f11 = -fArr3[1];
                    float f12 = -fArr3[2];
                    float length = Matrix.length(f10, f11, f12);
                    float[] fArr4 = (float[]) c0237b0.f814d;
                    if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees(length), f10 / length, f11 / length, f12 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!c0237b0.f812b) {
                        C0237b0.m((float[]) c0237b0.f813c, (float[]) c0237b0.f814d);
                        c0237b0.f812b = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) c0237b0.f813c, 0, (float[]) c0237b0.f814d, 0);
                }
            }
            C4372f c4372f = (C4372f) this.f47338f.j(timestamp);
            if (c4372f != null) {
                g gVar = this.f47335c;
                gVar.getClass();
                if (g.b(c4372f)) {
                    gVar.f47324a = c4372f.f47320c;
                    gVar.f47325b = new M2.d(c4372f.f47318a.f47317a[0]);
                    if (!c4372f.f47321d) {
                        new M2.d(c4372f.f47319b.f47317a[0]);
                    }
                }
            }
        }
        Matrix.multiplyMM(this.f47340h, 0, fArr, 0, this.f47339g, 0);
        g gVar2 = this.f47335c;
        int i5 = this.f47341i;
        float[] fArr5 = this.f47340h;
        M2.d dVar = gVar2.f47325b;
        if (dVar == null) {
            return;
        }
        int i10 = gVar2.f47324a;
        GLES20.glUniformMatrix3fv(gVar2.f47328e, 1, false, i10 == 1 ? g.f47323j : i10 == 2 ? g.k : g.f47322i, 0);
        GLES20.glUniformMatrix4fv(gVar2.f47327d, 1, false, fArr5, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i5);
        GLES20.glUniform1i(gVar2.f47331h, 0);
        try {
            AbstractC4256a.f();
        } catch (C4261f e11) {
            Log.e("ProjectionRenderer", "Failed to bind uniforms", e11);
        }
        GLES20.glVertexAttribPointer(gVar2.f47329f, 3, 5126, false, 12, (Buffer) dVar.f7303d);
        try {
            AbstractC4256a.f();
        } catch (C4261f e12) {
            Log.e("ProjectionRenderer", "Failed to load position data", e12);
        }
        GLES20.glVertexAttribPointer(gVar2.f47330g, 2, 5126, false, 8, (Buffer) dVar.f7304e);
        try {
            AbstractC4256a.f();
        } catch (C4261f e13) {
            Log.e("ProjectionRenderer", "Failed to load texture data", e13);
        }
        GLES20.glDrawArrays(dVar.f7302c, 0, dVar.f7301b);
        try {
            AbstractC4256a.f();
        } catch (C4261f e14) {
            Log.e("ProjectionRenderer", "Failed to render", e14);
        }
    }

    @Override // v6.i
    public final void d(long j8, long j10, T t10, MediaFormat mediaFormat) {
        int i5;
        int i10;
        int i11;
        ArrayList arrayListF;
        int iD;
        int i12 = 0;
        int i13 = 1;
        this.f47337e.a(j10, Long.valueOf(j8));
        byte[] bArr = t10.f3248v;
        int i14 = t10.f3249w;
        byte[] bArr2 = this.f47344m;
        int i15 = this.f47343l;
        this.f47344m = bArr;
        if (i14 == -1) {
            i14 = this.k;
        }
        this.f47343l = i14;
        if (i15 == i14 && Arrays.equals(bArr2, this.f47344m)) {
            return;
        }
        byte[] bArr3 = this.f47344m;
        C4372f c4372f = null;
        if (bArr3 != null) {
            int i16 = this.f47343l;
            Y4.b bVar = new Y4.b(bArr3);
            try {
                bVar.B(4);
                iD = bVar.d();
                bVar.A(0);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            if (iD == 1886547818) {
                bVar.B(8);
                int i17 = bVar.f16680b;
                int i18 = bVar.f16681c;
                while (i17 < i18) {
                    int iD2 = bVar.d() + i17;
                    if (iD2 > i17 && iD2 <= i18) {
                        int iD3 = bVar.d();
                        if (iD3 != 2037673328 && iD3 != 1836279920) {
                            bVar.A(iD2);
                            i17 = iD2;
                        }
                        bVar.z(iD2);
                        arrayListF = xg.g.F(bVar);
                        break;
                    }
                    break;
                }
                arrayListF = null;
            } else {
                arrayListF = xg.g.F(bVar);
            }
            if (arrayListF != null) {
                int size = arrayListF.size();
                if (size == 1) {
                    C4371e c4371e = (C4371e) arrayListF.get(0);
                    c4372f = new C4372f(c4371e, c4371e, i16);
                } else if (size == 2) {
                    c4372f = new C4372f((C4371e) arrayListF.get(0), (C4371e) arrayListF.get(1), i16);
                }
            }
        }
        if (c4372f == null || !g.b(c4372f)) {
            int i19 = this.f47343l;
            float radians = (float) Math.toRadians(180.0f);
            float radians2 = (float) Math.toRadians(360.0f);
            float f10 = radians / 36;
            float f11 = radians2 / 72;
            float[] fArr = new float[15984];
            float[] fArr2 = new float[10656];
            int i20 = 0;
            int i21 = 0;
            for (int i22 = 36; i12 < i22; i22 = 36) {
                float f12 = radians / 2.0f;
                float f13 = (i12 * f10) - f12;
                int i23 = 3;
                int i24 = i12 + 1;
                int i25 = i13;
                float f14 = (i24 * f10) - f12;
                int i26 = 0;
                while (i26 < 73) {
                    int i27 = i24;
                    int i28 = i12;
                    float f15 = f14;
                    int i29 = i20;
                    int i30 = i21;
                    int i31 = 0;
                    int i32 = 2;
                    while (i31 < i32) {
                        float f16 = radians;
                        float f17 = i26 * f11;
                        float f18 = (f17 + 3.1415927f) - (radians2 / 2.0f);
                        float f19 = radians2;
                        float f20 = f13;
                        double d3 = 50.0f;
                        double d5 = f18;
                        double d10 = i31 == 0 ? f13 : f15;
                        fArr[i29] = -((float) (Math.cos(d10) * Math.sin(d5) * d3));
                        fArr[i29 + 1] = (float) (Math.sin(d10) * d3);
                        int i33 = i29 + 3;
                        fArr[i29 + 2] = (float) (Math.cos(d10) * Math.cos(d5) * d3);
                        fArr2[i30] = f17 / f19;
                        int i34 = i30 + 2;
                        fArr2[i30 + 1] = ((i28 + i31) * f10) / f16;
                        if (i26 == 0 && i31 == 0) {
                            i5 = i25;
                            i10 = i23;
                        } else {
                            i5 = i25;
                            if (i26 == 72) {
                                i10 = i23;
                                if (i31 == i5) {
                                }
                                i31 += i5;
                                i23 = i10;
                                i25 = i5;
                                i32 = i11;
                                radians = f16;
                                radians2 = f19;
                                f13 = f20;
                            } else {
                                i10 = i23;
                            }
                            i11 = 2;
                            i29 = i33;
                            i30 = i34;
                            i31 += i5;
                            i23 = i10;
                            i25 = i5;
                            i32 = i11;
                            radians = f16;
                            radians2 = f19;
                            f13 = f20;
                        }
                        System.arraycopy(fArr, i29, fArr, i33, i10);
                        i29 += 6;
                        System.arraycopy(fArr2, i30, fArr2, i34, 2);
                        i30 += 4;
                        i11 = 2;
                        i31 += i5;
                        i23 = i10;
                        i25 = i5;
                        i32 = i11;
                        radians = f16;
                        radians2 = f19;
                        f13 = f20;
                    }
                    i26 += i25;
                    i21 = i30;
                    i20 = i29;
                    i12 = i28;
                    f14 = f15;
                    radians = radians;
                    f13 = f13;
                    i24 = i27;
                }
                i12 = i24;
                i13 = i25;
            }
            int i35 = i13;
            M2.d[] dVarArr = new M2.d[i35];
            dVarArr[0] = new M2.d(0, i35, fArr, fArr2);
            C4371e c4371e2 = new C4371e(dVarArr);
            c4372f = new C4372f(c4371e2, c4371e2, i19);
        }
        this.f47338f.a(j10, c4372f);
    }

    public final SurfaceTexture e() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC4256a.f();
            this.f47335c.a();
            AbstractC4256a.f();
            AbstractC4256a.g("No current context", !v.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            AbstractC4256a.f();
            int i5 = iArr[0];
            GLES20.glBindTexture(36197, i5);
            AbstractC4256a.f();
            GLES20.glTexParameteri(36197, 10240, 9729);
            AbstractC4256a.f();
            GLES20.glTexParameteri(36197, 10241, 9729);
            AbstractC4256a.f();
            GLES20.glTexParameteri(36197, 10242, 33071);
            AbstractC4256a.f();
            GLES20.glTexParameteri(36197, 10243, 33071);
            AbstractC4256a.f();
            this.f47341i = i5;
        } catch (C4261f e7) {
            AbstractC4256a.p("SceneRenderer", "Failed to initialize the renderer", e7);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f47341i);
        this.f47342j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: w6.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f47332a.f47333a.set(true);
            }
        });
        return this.f47342j;
    }
}
