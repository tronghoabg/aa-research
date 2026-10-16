package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* loaded from: classes3.dex */
public final class tsw {
    public static final /* synthetic */ int a = 0;

    static {
        Math.log(2.0d);
        Math.cos(1.3962634015954636d);
        Math.cos(1.4835298641951802d);
    }

    public static float a(float f, float f2, int i, float f3) {
        return c(f, i, f3) * b(f2);
    }

    public static float b(float f) {
        return (float) (0.5d / Math.tan((f * 0.017453292519943295d) * 0.5d));
    }

    public static float c(float f, int i, float f2) {
        return ((float) Math.pow(2.0d, 30.0f - f)) * (i / (f2 * 256.0f));
    }

    public static too d(float f) {
        double d = f * 0.017453292519943295d;
        return new too(Math.round((float) (Math.sin(d) * 65536.0d)), Math.round((float) (Math.cos(d) * 65536.0d)));
    }

    public static float e(float f, int i, float f2, float f3) {
        return (c(f, i, 1.0f) * b(f3)) / (f2 * i);
    }

    public static float f(usy usyVar) {
        return p(usyVar, usyVar.a());
    }

    public static float g(usy usyVar, too tooVar) {
        if (usyVar.o().m == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return usyVar.a() / usyVar.e(tooVar, true);
    }

    @ResultIgnorabilityUnspecified
    public static toe h(usy usyVar, float f, float f2, float f3, float f4, float[] fArr) {
        woy.Z(fArr.length >= 8);
        too tooVarM = usyVar.m();
        int i = tooVarM.a;
        int i2 = tooVarM.b;
        int i3 = tooVarM.c;
        int iH = usyVar.h() - i;
        int i4 = usyVar.i() - i2;
        fArr[0] = f;
        fArr[1] = f3;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        uxf.d(fArr, 4, usyVar.w(), fArr);
        float f5 = 1.0f / fArr[7];
        float f6 = fArr[4] * f5;
        float f7 = fArr[5] * f5;
        float f8 = i3;
        double d = (fArr[6] * f5) / f8;
        if (d >= 1.0d) {
            return null;
        }
        double d2 = 1.0d / (1.0d - d);
        double d3 = iH;
        double d4 = i;
        double d5 = i4;
        double d6 = i2;
        too tooVar = new too((int) (((f6 + d3) * d2) + d4), (int) (((f7 + d5) * d2) + d6));
        fArr[0] = f2;
        uxf.d(fArr, 4, usyVar.w(), fArr);
        float f9 = 1.0f / fArr[7];
        float f10 = fArr[4] * f9;
        float f11 = fArr[5] * f9;
        double d7 = (fArr[6] * f9) / f8;
        if (d7 >= 1.0d) {
            return null;
        }
        double d8 = 1.0d / (1.0d - d7);
        too tooVar2 = new too((int) (((f10 + d3) * d8) + d4), (int) (((f11 + d5) * d8) + d6));
        fArr[1] = f4;
        uxf.d(fArr, 4, usyVar.w(), fArr);
        float f12 = 1.0f / fArr[7];
        float f13 = fArr[4] * f12;
        float f14 = fArr[5] * f12;
        double d9 = (fArr[6] * f12) / f8;
        if (d9 >= 1.0d) {
            return null;
        }
        double d10 = 1.0d / (1.0d - d9);
        too tooVar3 = new too((int) (((f13 + d3) * d10) + d4), (int) (((f14 + d5) * d10) + d6));
        fArr[0] = f;
        uxf.d(fArr, 4, usyVar.w(), fArr);
        float f15 = 1.0f / fArr[7];
        float f16 = fArr[4] * f15;
        float f17 = fArr[5] * f15;
        double d11 = (fArr[6] * f15) / f8;
        if (d11 >= 1.0d) {
            return null;
        }
        double d12 = 1.0d / (1.0d - d11);
        return toe.c(new too((int) (((f16 + d3) * d12) + d4), (int) (((f17 + d5) * d12) + d6)), tooVar3, tooVar, tooVar2);
    }

    public static too i(usy usyVar, float f, float f2, float[] fArr) {
        too tooVar = new too();
        if (o(usyVar, f, f2, tooVar, fArr)) {
            return tooVar;
        }
        return null;
    }

    public static ttn j(usy usyVar, ttn ttnVar, float f, float f2, float f3) {
        float fK = usyVar.k();
        tto ttoVar = ttnVar.o;
        float fA = f2 - (fK * ttoVar.a());
        float fJ = f3 - (usyVar.j() * ttoVar.b());
        ttl ttlVar = new ttl(k(usyVar, ttnVar, fA, fJ));
        ttlVar.e = f;
        usyVar.e.c(ttlVar);
        ttn ttnVarA = ttlVar.a();
        usyVar.t(ttnVarA);
        return k(usyVar, ttnVarA, -fA, -fJ);
    }

    public static ttn k(usy usyVar, ttn ttnVar, float f, float f2) {
        toh tohVar;
        float fP = p(usyVar, a(ttnVar.l, usyVar.b(), usyVar.j(), usyVar.f()));
        ttn ttnVarO = usyVar.o();
        float f3 = ttnVarO.m;
        float f4 = ttnVarO.n;
        float f5 = f * fP;
        float f6 = (-f2) * fP;
        double d = f3 * 0.017453292519943295d;
        float fCos = (float) Math.cos(d);
        too tooVarA = new toh(d(90.0f + f4)).a();
        double d2 = (90.0d - f4) * 0.017453292519943295d;
        float fCos2 = (float) Math.cos(d2);
        float fSin = (float) Math.sin(d2);
        if (f3 == BitmapDescriptorFactory.HUE_RED) {
            tohVar = new toh(Math.round(fCos2 * 65536.0f), Math.round(fSin * 65536.0f));
        } else {
            float fCos3 = (float) Math.cos(d);
            tohVar = new toh(Math.round(fCos2 * fCos3 * 65536.0f), Math.round(fSin * fCos3 * 65536.0f), Math.round(((float) Math.sin(d)) * 65536.0f));
        }
        float f7 = f6 / fCos;
        too tooVar = ttnVar.h;
        too tooVarA2 = tohVar.a();
        too.q(tooVarA, f5, tooVarA);
        too.q(tooVarA2, f7, tooVarA2);
        int i = tooVar.c;
        too tooVarH = tooVar.h(tooVarA);
        too.n(tooVarH, tooVarA2, tooVarH);
        tooVarH.c = i;
        ttl ttlVar = new ttl(ttnVar);
        ttlVar.e(tooVarH);
        return ttlVar.a();
    }

    public static boolean l(usy usyVar, too tooVar, float[] fArr, boolean z) {
        fArr[0] = z ? (((tooVar.a - usyVar.h()) + 536870912) & 1073741823) - 536870912 : tooVar.a - usyVar.h();
        fArr[1] = tooVar.b - usyVar.i();
        fArr[2] = tooVar.c;
        float[] fArrX = usyVar.x();
        float f = fArrX[0];
        float f2 = fArr[0];
        float f3 = fArrX[4];
        float f4 = fArr[1];
        float f5 = fArrX[8];
        float f6 = fArr[2];
        float f7 = (f * f2) + (f3 * f4) + (f5 * f6) + fArrX[12];
        fArr[4] = f7;
        float f8 = (fArrX[1] * f2) + (fArrX[5] * f4) + (fArrX[9] * f6) + fArrX[13];
        fArr[5] = f8;
        float f9 = (fArrX[3] * f2) + (fArrX[7] * f4) + (fArrX[11] * f6) + fArrX[15];
        fArr[7] = f9;
        if (f9 <= BitmapDescriptorFactory.HUE_RED) {
            fArr[0] = Float.NaN;
            fArr[1] = Float.NaN;
            return false;
        }
        float f10 = 1.0f / f9;
        fArr[0] = f7 * f10;
        fArr[1] = f8 * f10;
        return true;
    }

    public static boolean m(usy usyVar, too tooVar, tpf tpfVar, float[] fArr) {
        boolean zL = l(usyVar, tooVar, fArr, true);
        tpfVar.n(fArr[0], fArr[1]);
        return zL;
    }

    @ResultIgnorabilityUnspecified
    public static boolean n(usy usyVar, too tooVar, float[] fArr) {
        fArr[0] = (((tooVar.a - usyVar.h()) + 536870912) & 1073741823) - 536870912;
        fArr[1] = tooVar.b - usyVar.i();
        float[] fArrX = usyVar.x();
        float f = fArrX[0];
        float f2 = fArr[0];
        float f3 = fArrX[4];
        float f4 = fArr[1];
        float f5 = (f * f2) + (f3 * f4) + fArrX[12];
        fArr[4] = f5;
        float f6 = (fArrX[1] * f2) + (fArrX[5] * f4) + fArrX[13];
        fArr[5] = f6;
        float f7 = (fArrX[3] * f2) + (fArrX[7] * f4) + fArrX[15];
        fArr[7] = f7;
        if (f7 <= BitmapDescriptorFactory.HUE_RED) {
            fArr[0] = Float.NaN;
            fArr[1] = Float.NaN;
            return false;
        }
        float f8 = 1.0f / f7;
        fArr[0] = f5 * f8;
        fArr[1] = f6 * f8;
        return true;
    }

    @ResultIgnorabilityUnspecified
    public static boolean o(usy usyVar, float f, float f2, too tooVar, float[] fArr) {
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = 1.0f;
        fArr[3] = 1.0f;
        uxf.d(fArr, 4, usyVar.w(), fArr);
        too tooVarM = usyVar.m();
        int i = tooVarM.a;
        int i2 = tooVarM.b;
        int i3 = tooVarM.c;
        float f3 = 1.0f / fArr[7];
        float f4 = fArr[4] * f3;
        float f5 = fArr[5] * f3;
        double d = (fArr[6] * f3) / i3;
        if (d >= 1.0d || Double.isNaN(d)) {
            return false;
        }
        double d2 = 1.0d / (1.0d - d);
        usyVar.s(tooVar);
        double d3 = i;
        double d4 = i2;
        tooVar.r((int) ((((f4 + tooVar.a) - d3) * d2) + d3), (int) ((((f5 + tooVar.b) - d4) * d2) + d4));
        return true;
    }

    public static float p(usy usyVar, float f) {
        return f / (usyVar.c() * usyVar.j());
    }
}
