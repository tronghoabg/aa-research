package defpackage;

import android.opengl.Matrix;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class usy {
    private static final yob j = yob.c("com/google/android/libraries/geo/mapcore/renderer/Camera3D");
    public final AtomicReference a;
    protected final Runnable b;
    public boolean c;
    public int d;
    public final tsy e;
    public final tta f;
    public tst g;
    public zwj h;
    protected final gms i;

    public usy(ttn ttnVar, int i, int i2, float f, Runnable runnable, tsy tsyVar) {
        this.c = false;
        this.i = new gms((byte[]) null, (short[]) null);
        woy.T(i > 0 && i2 > 0, "target=%sx%s", i, i2);
        woy.S(f > BitmapDescriptorFactory.HUE_RED, "screenDensity=%s", Float.valueOf(f));
        woy.S(true, "nearClip=%s", Float.valueOf(0.1f));
        woy.S(true, "farClip=%s", Float.valueOf(20.0f));
        woy.S(true, "filedOfViewDegrees=%s", Float.valueOf(30.0f));
        this.a = new AtomicReference(q(ttnVar, i, i2, f, 0.1f, 20.0f, 30.0f));
        this.b = runnable;
        this.f = new tta();
        this.e = tsyVar;
    }

    protected static usz q(ttn ttnVar, int i, int i2, float f, float f2, float f3, float f4) {
        float[] fArr;
        double d;
        int i3;
        toh tohVar;
        float f5 = ttnVar.o.b;
        double d2 = f4;
        double dTan = 0.5d / Math.tan((d2 * 0.017453292519943295d) * 0.5d);
        double d3 = i2;
        float fHypot = (float) Math.hypot(i, d3);
        float fTan = (float) Math.tan(0.5235987755982988d);
        float fTan2 = (float) Math.tan((d2 / 2.0d) * 0.017453292519943295d);
        double dHypot = Math.hypot(fHypot / ((fTan2 + fTan2) - (2.0f / fTan)), (-r14) / fTan);
        float f6 = 256.0f * f;
        float fMax = Math.max(2.0f, uzg.a(((float) Math.ceil(((float) (dHypot + dHypot)) / f6)) + 1.0f));
        float f7 = ttnVar.n;
        float f8 = ttnVar.m;
        double d4 = f8 * 0.017453292519943295d;
        double dSin = Math.sin(d4);
        double d5 = (90.0d - f7) * 0.017453292519943295d;
        double dCos = Math.cos(d5) * dSin;
        double dSin2 = dSin * Math.sin(d5);
        double d6 = -Math.cos(d4);
        double dTan2 = 1.0d / Math.tan((d2 * 0.5d) * 0.017453292519943295d);
        double dAtan2 = Math.atan2(r0.c, dTan2);
        float f9 = (float) dTan;
        double dSin3 = Math.sin(dAtan2) / Math.sin((3.141592653589793d - (1.5707963267948966d - d4)) - dAtan2);
        float f10 = i2;
        double dPow = Math.pow(2.0d, 30.0f - ttnVar.l) * (f10 / f6);
        double d7 = dPow * 0.5d * dTan2;
        too tooVar = ttnVar.h;
        double d8 = tooVar.a;
        double d9 = f7 * 0.017453292f;
        float fSin = (float) Math.sin(d9);
        double d10 = tooVar.b;
        float fCos = (float) Math.cos(d9);
        int i4 = tooVar.c;
        float f11 = (float) (f9 * dPow);
        if (f11 > 2.1474835E9f) {
            f11 = 2.1474835E9f;
        }
        float f12 = f11;
        double d11 = -f11;
        int iRound = (int) Math.round(d11 * dCos);
        int iRound2 = (int) Math.round(d11 * dSin2);
        int iRound3 = ((int) Math.round(d11 * d6)) + i4;
        float f13 = iRound3;
        float f14 = 1.0f / f13;
        woy.Z(f14 >= BitmapDescriptorFactory.HUE_RED);
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        float f15 = i;
        float f16 = f10 * 0.5f;
        float f17 = f15 * 0.5f;
        fArr2[0] = f17;
        fArr2[5] = -f16;
        fArr2[10] = 1.0f;
        fArr2[15] = 1.0f;
        fArr2[12] = f17;
        fArr2[13] = f16;
        float f18 = i2 == 0 ? 1.0f : f15 / f10;
        float fTan3 = ((float) Math.tan(Math.toRadians(d2) / 2.0d)) * f2;
        float f19 = f2 + f2;
        float f20 = fTan3 * f18 * (1.0f - f5);
        float f21 = -fTan3;
        float f22 = f18 * f21 * (f5 + 1.0f);
        float f23 = f20 - f22;
        float f24 = fTan3 - f21;
        float f25 = f3 - f2;
        float[] fArr3 = {f19 / f23, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f19 / f24, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (f20 + f22) / f23, (fTan3 + f21) / f24, (-(f3 + f2)) / f25, -1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (-((f3 + f3) * f2)) / f25, BitmapDescriptorFactory.HUE_RED};
        if (ttnVar.p == null) {
            fArr = fArr2;
            float fCos2 = (float) Math.cos(d5);
            float fSin2 = (float) Math.sin(d5);
            if (f8 == BitmapDescriptorFactory.HUE_RED) {
                tohVar = new toh(Math.round(fCos2 * 65536.0f), Math.round(fSin2 * 65536.0f));
                d = d3;
                i3 = iRound;
            } else {
                float fCos3 = (float) Math.cos(d4);
                d = d3;
                i3 = iRound;
                tohVar = new toh(Math.round(fCos2 * fCos3 * 65536.0f), Math.round(fCos3 * fSin2 * 65536.0f), Math.round(((float) Math.sin(d4)) * 65536.0f));
            }
            ttnVar.p = tohVar;
        } else {
            fArr = fArr2;
            d = d3;
            i3 = iRound;
        }
        double d12 = dSin3 * d7;
        int i5 = (int) (d10 + (fCos * d12));
        int i6 = iRound2 + i5;
        int i7 = (int) (d8 + (d12 * fSin));
        int i8 = i3 + i7;
        toh tohVar2 = ttnVar.p;
        float f26 = tohVar2.a;
        float f27 = tohVar2.b;
        float f28 = tohVar2.c;
        float f29 = -((i8 - i7) * f14);
        float f30 = -((i6 - i5) * f14);
        float f31 = -((iRound3 - i4) * f14);
        float fA = 1.0f / uxf.a(f29, f30, f31);
        float f32 = f29 * fA;
        float f33 = f30 * fA;
        float f34 = f31 * fA;
        float f35 = (f28 * f33) - (f27 * f34);
        float f36 = (f26 * f34) - (f32 * f28);
        float f37 = (f32 * f27) - (f33 * f26);
        float fA2 = 1.0f / uxf.a(f35, f36, f37);
        float f38 = f35 * fA2;
        float f39 = f37 * fA2;
        float f40 = f36 * fA2;
        float[] fArr4 = {f38, (f40 * f34) - (f39 * f33), -f32, BitmapDescriptorFactory.HUE_RED, f40, (f39 * f32) - (f38 * f34), -f33, BitmapDescriptorFactory.HUE_RED, f39, (f33 * f38) - (f32 * f40), -f34, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        Matrix.translateM(fArr4, 0, f29, f30, f31);
        float[] fArr5 = new float[16];
        uxf.b(fArr5, fArr3, fArr4);
        float[] fArr6 = new float[16];
        float[] fArr7 = new float[16];
        uxf.b(fArr6, fArr, fArr3);
        uxf.b(fArr7, fArr6, fArr4);
        for (int i9 = 12; i9 < 16; i9++) {
            fArr7[i9] = fArr7[i9] * f13;
        }
        float[] fArr8 = new float[16];
        Matrix.invertM(fArr8, 0, fArr7, 0);
        tpj tpjVar = new tpj(new too[]{new too(), new too(), new too(), new too()});
        float[] fArr9 = new float[8];
        float fCeil = (float) Math.ceil((d * 0.5d) - ((f10 * f9) * ((float) Math.tan((Math.min(Math.min((f4 * 0.5f) + f8, 82.5f), 90.0f) - f8) * 0.017453292f))));
        boolean zV = v(BitmapDescriptorFactory.HUE_RED, f10, i7, i5, i8, i6, iRound3, fArr8, tpjVar.b(0), fArr9);
        boolean zV2 = v(f15, f10, i7, i5, i8, i6, iRound3, fArr8, tpjVar.b(1), fArr9);
        boolean zV3 = v(f15, fCeil, i7, i5, i8, i6, iRound3, fArr8, tpjVar.b(2), fArr9);
        boolean zV4 = v(BitmapDescriptorFactory.HUE_RED, fCeil, i7, i5, i8, i6, iRound3, fArr8, tpjVar.b(3), fArr9);
        if (zV && zV2 && zV3 && zV4) {
            tpjVar.f();
        } else {
            tpjVar.b(0).r(0, 0);
            tpjVar.b(1).r(0, 0);
            tpjVar.b(2).r(0, 0);
            tpjVar.b(3).r(0, 0);
            tpjVar.f();
        }
        return new usz(ttnVar, i, i2, f, f2, f3, f4, i7, i5, i4, i8, i6, iRound3, dCos, dSin2, d6, f12, f9, fMax, f14, tpjVar, fArr4, fArr5, fArr7, fArr8);
    }

    public static boolean v(float f, float f2, int i, int i2, int i3, int i4, int i5, float[] fArr, too tooVar, float[] fArr2) {
        fArr2[0] = f;
        fArr2[1] = f2;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        uxf.d(fArr2, 4, fArr, fArr2);
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
        tooVar.r((int) ((((f4 + i) - d3) * d2) + d3), (int) ((((f5 + i2) - d4) * d2) + d4));
        return true;
    }

    public final void A(float[] fArr) {
        r();
        tta ttaVar = this.f;
        fArr[0] = ttaVar.g;
        fArr[1] = ttaVar.h;
        fArr[2] = ttaVar.i;
    }

    public final void B(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void C() {
        Runnable runnable = this.b;
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
        return ((usz) this.a.get()).q;
    }

    public final float b() {
        return ((usz) this.a.get()).g;
    }

    public final float c() {
        return ((usz) this.a.get()).r;
    }

    public final float d() {
        return ((usz) this.a.get()).t;
    }

    @ResultIgnorabilityUnspecified
    public final float e(too tooVar, boolean z) {
        double d;
        r();
        gms gmsVar = this.i;
        synchronized (gmsVar) {
            usz uszVar = (usz) this.a.get();
            Object obj = gmsVar.a;
            int i = tooVar.a;
            int i2 = uszVar.h;
            ((too) obj).a = i - i2;
            int i3 = tooVar.b;
            int i4 = uszVar.i;
            ((too) obj).b = i3 - i4;
            int i5 = tooVar.c;
            int i6 = uszVar.j;
            ((too) obj).c = i5 - i6;
            if (z) {
                ((too) obj).w((too) obj);
            }
            int i7 = i2 - uszVar.k;
            int i8 = i4 - uszVar.l;
            int i9 = i6 - uszVar.m;
            int i10 = ((too) obj).a + i7;
            ((too) obj).a = i10;
            int i11 = ((too) obj).b + i8;
            ((too) obj).b = i11;
            int i12 = ((too) obj).c + i9;
            ((too) obj).c = i12;
            d = (i10 * uszVar.n) + (i11 * uszVar.o) + (i12 * uszVar.p);
        }
        return (float) d;
    }

    public final boolean equals(Object obj) {
        r();
        if (this == obj) {
            return true;
        }
        if (obj instanceof usy) {
            return ((usz) this.a.get()).equals(((usy) obj).a.get());
        }
        return false;
    }

    public final float f() {
        return ((usz) this.a.get()).d;
    }

    public final float g() {
        return ((usz) this.a.get()).a.l;
    }

    public final int h() {
        return ((usz) this.a.get()).h;
    }

    public final int hashCode() {
        return ((usz) this.a.get()).hashCode();
    }

    public final int i() {
        return ((usz) this.a.get()).i;
    }

    public final int j() {
        return ((usz) this.a.get()).c;
    }

    public final int k() {
        return ((usz) this.a.get()).b;
    }

    public final too l() {
        usz uszVar = (usz) this.a.get();
        return new too(uszVar.h, uszVar.i, uszVar.j);
    }

    @ResultIgnorabilityUnspecified
    public final too m() {
        r();
        usz uszVar = (usz) this.a.get();
        return new too(uszVar.k, uszVar.l, uszVar.m);
    }

    @ResultIgnorabilityUnspecified
    public final tpj n() {
        r();
        return ((usz) this.a.get()).u;
    }

    public final ttn o() {
        return ((usz) this.a.get()).a;
    }

    @ResultIgnorabilityUnspecified
    public final usz p() {
        return (usz) this.a.get();
    }

    protected final void r() {
        if (this.c && !uui.b()) {
            ((ynz) ((ynz) ((ynz) j.g()).p(new IllegalStateException("Camera method called from wrong thread."))).ai((char) 9638)).u("Camera method called from wrong thread.");
        }
    }

    public final void s(too tooVar) {
        usz uszVar = (usz) this.a.get();
        tooVar.s(uszVar.h, uszVar.i, uszVar.j);
    }

    public final void t(ttn ttnVar) {
        if (ttnVar == null) {
            return;
        }
        r();
        AtomicReference atomicReference = this.a;
        usz uszVar = (usz) atomicReference.get();
        if (uszVar.a.equals(ttnVar)) {
            return;
        }
        atomicReference.set(q(ttnVar, uszVar.b, uszVar.c, uszVar.d, uszVar.e, uszVar.f, uszVar.g));
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final String toString() {
        usz uszVar = (usz) this.a.get();
        String string = new too(uszVar.h, uszVar.i, uszVar.j).toString();
        float f = uszVar.q;
        ttn ttnVar = uszVar.a;
        return "[" + string + ", " + f + ", " + ttnVar.n + ", " + ttnVar.m + ", " + uszVar.g + "]";
    }

    public final void u(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        r();
        AtomicReference atomicReference = this.a;
        usz uszVar = (usz) atomicReference.get();
        if (uszVar.b == i && uszVar.c == i2) {
            return;
        }
        atomicReference.set(q(uszVar.a, i, i2, uszVar.d, uszVar.e, uszVar.f, uszVar.g));
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final float[] w() {
        r();
        return ((usz) this.a.get()).y;
    }

    public final float[] x() {
        r();
        return ((usz) this.a.get()).x;
    }

    public final float[] y() {
        return ((usz) this.a.get()).w;
    }

    @ResultIgnorabilityUnspecified
    public final tta z() {
        r();
        return this.f;
    }

    public usy(ttn ttnVar, int i, int i2, float f) {
        this(ttnVar, i, i2, f, null, new tsy(null, 65.0f));
    }

    public usy(usy usyVar) {
        this.c = false;
        this.i = new gms((byte[]) null, (short[]) null);
        this.a = new AtomicReference((usz) usyVar.a.get());
        this.b = null;
        this.f = new tta();
        this.d = usyVar.d;
        this.h = usyVar.h;
        this.e = usyVar.e;
    }
}
