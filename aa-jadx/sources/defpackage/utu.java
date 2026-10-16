package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utu {
    private static final defpackage.ypg j = defpackage.ypg.c("com/google/android/libraries/geo/mapcore/renderer/Camera3D");
    public final java.util.concurrent.atomic.AtomicReference a;
    protected final java.lang.Runnable b;
    public boolean c;
    public int d;
    public final defpackage.ttu e;
    public final defpackage.ttw f;
    public defpackage.ttp g;
    public defpackage.zxm h;
    protected final defpackage.gmz i;

    public utu(defpackage.tuj tujVar, int i, int i2, float f, java.lang.Runnable runnable, defpackage.ttu ttuVar) {
        this.c = false;
        this.i = new defpackage.gmz((byte[]) null, (char[]) null);
        defpackage.ysr.bd(i > 0 && i2 > 0, "target=%sx%s", i, i2);
        defpackage.ysr.bc(f > com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, "screenDensity=%s", java.lang.Float.valueOf(f));
        defpackage.ysr.bc(true, "nearClip=%s", java.lang.Float.valueOf(0.1f));
        defpackage.ysr.bc(true, "farClip=%s", java.lang.Float.valueOf(20.0f));
        defpackage.ysr.bc(true, "filedOfViewDegrees=%s", java.lang.Float.valueOf(30.0f));
        this.a = new java.util.concurrent.atomic.AtomicReference(q(tujVar, i, i2, f, 0.1f, 20.0f, 30.0f));
        this.b = runnable;
        this.f = new defpackage.ttw();
        this.e = ttuVar;
    }

    protected static defpackage.utv q(defpackage.tuj tujVar, int i, int i2, float f, float f2, float f3, float f4) {
        defpackage.tpf tpfVar;
        defpackage.tuk tukVar = tujVar.o;
        float f5 = tukVar.b;
        double d = f4;
        double dTan = 0.5d / java.lang.Math.tan((d * 0.017453292519943295d) * 0.5d);
        double d2 = i2;
        float fHypot = (float) java.lang.Math.hypot(i, d2);
        float fTan = (float) java.lang.Math.tan((d / 2.0d) * 0.017453292519943295d);
        float f6 = fHypot / ((fTan + fTan) - 3.4641018f);
        double dHypot = java.lang.Math.hypot(f6, (-f6) / 0.57735026f);
        float f7 = 256.0f * f;
        float fMax = java.lang.Math.max(2.0f, defpackage.vab.a(((float) java.lang.Math.ceil(((float) (dHypot + dHypot)) / f7)) + 1.0f));
        float f8 = tujVar.n;
        float f9 = tujVar.m;
        double d3 = ((double) f9) * 0.017453292519943295d;
        double dSin = java.lang.Math.sin(d3);
        double d4 = (90.0d - ((double) f8)) * 0.017453292519943295d;
        double dCos = java.lang.Math.cos(d4) * dSin;
        double dSin2 = dSin * java.lang.Math.sin(d4);
        double d5 = -java.lang.Math.cos(d3);
        double dTan2 = 1.0d / java.lang.Math.tan((d * 0.5d) * 0.017453292519943295d);
        double dAtan2 = java.lang.Math.atan2(tukVar.c, dTan2);
        float f10 = (float) dTan;
        double dSin3 = java.lang.Math.sin(dAtan2) / java.lang.Math.sin((3.141592653589793d - (1.5707963267948966d - d3)) - dAtan2);
        float f11 = i2;
        double dPow = java.lang.Math.pow(2.0d, 30.0f - tujVar.l) * ((double) (f11 / f7));
        double d6 = dPow * 0.5d * dTan2;
        defpackage.tpm tpmVar = tujVar.h;
        double d7 = tpmVar.a;
        double d8 = f8 * 0.017453292f;
        float fSin = (float) java.lang.Math.sin(d8);
        double d9 = tpmVar.b;
        float fCos = (float) java.lang.Math.cos(d8);
        int i3 = tpmVar.c;
        float f12 = (float) (dPow * ((double) f10));
        if (f12 > 2.1474835E9f) {
            f12 = 2.1474835E9f;
        }
        double d10 = -f12;
        int i4 = i3;
        float f13 = f12;
        int iRound = (int) java.lang.Math.round(d10 * dCos);
        int iRound2 = (int) java.lang.Math.round(d10 * dSin2);
        int iRound3 = ((int) java.lang.Math.round(d10 * d5)) + i4;
        float f14 = iRound3;
        float f15 = 1.0f / f14;
        defpackage.ysr.bj(f15 >= com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED);
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        float f16 = i;
        float f17 = f11 * 0.5f;
        float f18 = f16 * 0.5f;
        fArr[0] = f18;
        fArr[5] = -f17;
        fArr[10] = 1.0f;
        fArr[15] = 1.0f;
        fArr[12] = f18;
        fArr[13] = f17;
        float f19 = i2 == 0 ? 1.0f : f16 / f11;
        float fTan2 = ((float) java.lang.Math.tan(java.lang.Math.toRadians(d) / 2.0d)) * f2;
        float f20 = f2 + f2;
        float f21 = fTan2 * f19 * (1.0f - f5);
        float f22 = -fTan2;
        float f23 = f19 * f22 * (f5 + 1.0f);
        float f24 = f21 - f23;
        float f25 = fTan2 - f22;
        float f26 = f3 - f2;
        float[] fArr2 = {f20 / f24, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f20 / f25, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (f21 + f23) / f24, (fTan2 + f22) / f25, (-(f3 + f2)) / f26, -1.0f, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, (-((f3 + f3) * f2)) / f26, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED};
        if (tujVar.p == null) {
            float fCos2 = (float) java.lang.Math.cos(d4);
            float fSin2 = (float) java.lang.Math.sin(d4);
            if (f9 == com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED) {
                fCos = fCos;
                tpfVar = new defpackage.tpf(java.lang.Math.round(fCos2 * 65536.0f), java.lang.Math.round(fSin2 * 65536.0f));
            } else {
                fCos = fCos;
                float fCos3 = (float) java.lang.Math.cos(d3);
                tpfVar = new defpackage.tpf(java.lang.Math.round(fCos2 * fCos3 * 65536.0f), java.lang.Math.round(fCos3 * fSin2 * 65536.0f), java.lang.Math.round(((float) java.lang.Math.sin(d3)) * 65536.0f));
            }
            tujVar.p = tpfVar;
        } else {
            iRound3 = iRound3;
            i4 = i4;
        }
        double d11 = dSin3 * d6;
        double d12 = d7 + (d11 * ((double) fSin));
        int i5 = (int) (d9 + (((double) fCos) * d11));
        int i6 = iRound2 + i5;
        int i7 = (int) d12;
        int i8 = iRound + i7;
        defpackage.tpf tpfVar2 = tujVar.p;
        float f27 = (i6 - i5) * f15;
        float f28 = tpfVar2.a;
        float f29 = tpfVar2.b;
        float f30 = tpfVar2.c;
        float f31 = -((i8 - i7) * f15);
        float f32 = -f27;
        float f33 = -((iRound3 - i4) * f15);
        float fA = 1.0f / defpackage.uyb.a(f31, f32, f33);
        float f34 = f31 * fA;
        float f35 = f32 * fA;
        float f36 = f33 * fA;
        float f37 = f34 * f30;
        float f38 = (f30 * f35) - (f29 * f36);
        float f39 = (f28 * f36) - f37;
        float f40 = (f34 * f29) - (f35 * f28);
        float fA2 = 1.0f / defpackage.uyb.a(f38, f39, f40);
        float f41 = f38 * fA2;
        float f42 = f40 * fA2;
        float f43 = f39 * fA2;
        float[] fArr3 = {f41, (f43 * f36) - (f42 * f35), -f34, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f43, (f42 * f34) - (f41 * f36), -f35, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f42, (f35 * f41) - (f34 * f43), -f36, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, 1.0f};
        android.opengl.Matrix.translateM(fArr3, 0, f31, f32, f33);
        float[] fArr4 = new float[16];
        defpackage.uyb.b(fArr4, fArr2, fArr3);
        float[] fArr5 = new float[16];
        float[] fArr6 = new float[16];
        defpackage.uyb.b(fArr5, fArr, fArr2);
        defpackage.uyb.b(fArr6, fArr5, fArr3);
        for (int i9 = 12; i9 < 16; i9++) {
            fArr6[i9] = fArr6[i9] * f14;
        }
        float[] fArr7 = new float[16];
        android.opengl.Matrix.invertM(fArr7, 0, fArr6, 0);
        defpackage.tqh tqhVar = new defpackage.tqh(new defpackage.tpm[]{new defpackage.tpm(), new defpackage.tpm(), new defpackage.tpm(), new defpackage.tpm()});
        float[] fArr8 = new float[8];
        float fCeil = (float) java.lang.Math.ceil((d2 * 0.5d) - ((double) ((f11 * f10) * ((float) java.lang.Math.tan((java.lang.Math.min(java.lang.Math.min(f9 + (f4 * 0.5f), 82.5f), 90.0f) - f9) * 0.017453292f)))));
        int i10 = iRound3;
        boolean zV = v(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, f11, i7, i5, i8, i6, i10, fArr7, tqhVar.b(0), fArr8);
        boolean zV2 = v(f16, f11, i7, i5, i8, i6, i10, fArr7, tqhVar.b(1), fArr8);
        boolean zV3 = v(f16, fCeil, i7, i5, i8, i6, i10, fArr7, tqhVar.b(2), fArr8);
        boolean zV4 = v(com.google.android.libraries.maps.model.BitmapDescriptorFactory.HUE_RED, fCeil, i7, i5, i8, i6, i10, fArr7, tqhVar.b(3), fArr8);
        if (zV && zV2 && zV3 && zV4) {
            tqhVar.f();
        } else {
            tqhVar.b(0).r(0, 0);
            tqhVar.b(1).r(0, 0);
            tqhVar.b(2).r(0, 0);
            tqhVar.b(3).r(0, 0);
            tqhVar.f();
        }
        return new defpackage.utv(tujVar, i, i2, f, f2, f3, f4, i7, i5, i4, i8, i6, i10, dCos, dSin2, d5, f13, f10, fMax, f15, tqhVar, fArr3, fArr4, fArr6, fArr7);
    }

    public static boolean v(float f, float f2, int i, int i2, int i3, int i4, int i5, float[] fArr, defpackage.tpm tpmVar, float[] fArr2) {
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        defpackage.uyb.d(fArr2, 4, fArr, fArr2);
        float f3 = 1.0f / fArr2[7];
        float f4 = fArr2[4] * f3;
        float f5 = fArr2[5] * f3;
        double d = (fArr2[6] * f3) / i5;
        if (d >= 1.0d) {
            return false;
        }
        double d2 = 1.0d / (1.0d - d);
        double d3 = i3;
        double d4 = i4;
        tpmVar.r((int) ((((((double) f4) + ((double) i)) - d3) * d2) + d3), (int) ((((((double) f5) + ((double) i2)) - d4) * d2) + d4));
        return true;
    }

    public final void A(float[] fArr) {
        r();
        defpackage.ttw ttwVar = this.f;
        fArr[0] = ttwVar.g;
        fArr[1] = ttwVar.h;
        fArr[2] = ttwVar.i;
    }

    public final void B(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void C() {
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        } else {
            B(6);
        }
    }

    public final boolean D() {
        return (this.d & 2) != 0;
    }

    public final float a() {
        return ((defpackage.utv) this.a.get()).q;
    }

    public final float b() {
        return ((defpackage.utv) this.a.get()).g;
    }

    public final float c() {
        return ((defpackage.utv) this.a.get()).r;
    }

    public final float d() {
        return ((defpackage.utv) this.a.get()).t;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final float e(defpackage.tpm tpmVar, boolean z) {
        double d;
        r();
        defpackage.gmz gmzVar = this.i;
        synchronized (gmzVar) {
            defpackage.utv utvVar = (defpackage.utv) this.a.get();
            java.lang.Object obj = gmzVar.a;
            int i = tpmVar.a;
            int i2 = utvVar.h;
            ((defpackage.tpm) obj).a = i - i2;
            int i3 = tpmVar.b;
            int i4 = utvVar.i;
            ((defpackage.tpm) obj).b = i3 - i4;
            int i5 = tpmVar.c;
            int i6 = utvVar.j;
            ((defpackage.tpm) obj).c = i5 - i6;
            if (z) {
                ((defpackage.tpm) obj).w((defpackage.tpm) obj);
            }
            int i7 = i2 - utvVar.k;
            int i8 = i4 - utvVar.l;
            int i9 = i6 - utvVar.m;
            int i10 = ((defpackage.tpm) obj).a + i7;
            ((defpackage.tpm) obj).a = i10;
            int i11 = ((defpackage.tpm) obj).b + i8;
            ((defpackage.tpm) obj).b = i11;
            int i12 = ((defpackage.tpm) obj).c + i9;
            ((defpackage.tpm) obj).c = i12;
            d = (((double) i10) * utvVar.n) + (((double) i11) * utvVar.o) + (((double) i12) * utvVar.p);
        }
        return (float) d;
    }

    public final boolean equals(java.lang.Object obj) {
        r();
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.utu) {
            return ((defpackage.utv) this.a.get()).equals(((defpackage.utu) obj).a.get());
        }
        return false;
    }

    public final float f() {
        return ((defpackage.utv) this.a.get()).d;
    }

    public final float g() {
        return ((defpackage.utv) this.a.get()).a.l;
    }

    public final int h() {
        return ((defpackage.utv) this.a.get()).h;
    }

    public final int hashCode() {
        return ((defpackage.utv) this.a.get()).hashCode();
    }

    public final int i() {
        return ((defpackage.utv) this.a.get()).i;
    }

    public final int j() {
        return ((defpackage.utv) this.a.get()).c;
    }

    public final int k() {
        return ((defpackage.utv) this.a.get()).b;
    }

    public final defpackage.tpm l() {
        defpackage.utv utvVar = (defpackage.utv) this.a.get();
        return new defpackage.tpm(utvVar.h, utvVar.i, utvVar.j);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.tpm m() {
        r();
        defpackage.utv utvVar = (defpackage.utv) this.a.get();
        return new defpackage.tpm(utvVar.k, utvVar.l, utvVar.m);
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.tqh n() {
        r();
        return ((defpackage.utv) this.a.get()).u;
    }

    public final defpackage.tuj o() {
        return ((defpackage.utv) this.a.get()).a;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.utv p() {
        return (defpackage.utv) this.a.get();
    }

    protected final void r() {
        if (this.c && !defpackage.uve.b()) {
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) j.g()).p(new java.lang.IllegalStateException("Camera method called from wrong thread."))).ai((char) 9666)).u("Camera method called from wrong thread.");
        }
    }

    public final void s(defpackage.tpm tpmVar) {
        defpackage.utv utvVar = (defpackage.utv) this.a.get();
        tpmVar.s(utvVar.h, utvVar.i, utvVar.j);
    }

    public final void t(defpackage.tuj tujVar) {
        if (tujVar == null) {
            return;
        }
        r();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        defpackage.utv utvVar = (defpackage.utv) atomicReference.get();
        if (utvVar.a.equals(tujVar)) {
            return;
        }
        atomicReference.set(q(tujVar, utvVar.b, utvVar.c, utvVar.d, utvVar.e, utvVar.f, utvVar.g));
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final java.lang.String toString() {
        defpackage.utv utvVar = (defpackage.utv) this.a.get();
        java.lang.String string = new defpackage.tpm(utvVar.h, utvVar.i, utvVar.j).toString();
        float f = utvVar.q;
        defpackage.tuj tujVar = utvVar.a;
        return "[" + string + ", " + f + ", " + tujVar.n + ", " + tujVar.m + ", " + utvVar.g + "]";
    }

    public final void u(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        r();
        java.util.concurrent.atomic.AtomicReference atomicReference = this.a;
        defpackage.utv utvVar = (defpackage.utv) atomicReference.get();
        if (utvVar.b == i && utvVar.c == i2) {
            return;
        }
        atomicReference.set(q(utvVar.a, i, i2, utvVar.d, utvVar.e, utvVar.f, utvVar.g));
        java.lang.Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final float[] w() {
        r();
        return ((defpackage.utv) this.a.get()).y;
    }

    public final float[] x() {
        r();
        return ((defpackage.utv) this.a.get()).x;
    }

    public final float[] y() {
        return ((defpackage.utv) this.a.get()).w;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public final defpackage.ttw z() {
        r();
        return this.f;
    }

    public utu(defpackage.tuj tujVar, int i, int i2, float f) {
        this(tujVar, i, i2, f, null, new defpackage.ttu(null, 65.0f));
    }

    public utu(defpackage.utu utuVar) {
        this.c = false;
        this.i = new defpackage.gmz((byte[]) null, (char[]) null);
        this.a = new java.util.concurrent.atomic.AtomicReference((defpackage.utv) utuVar.a.get());
        this.b = null;
        this.f = new defpackage.ttw();
        this.d = utuVar.d;
        this.h = utuVar.h;
        this.e = utuVar.e;
    }
}
