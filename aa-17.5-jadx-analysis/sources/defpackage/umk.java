package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class umk {
    private static final yob j = yob.c("com/google/android/libraries/geo/mapcore/internal/renderer/GmmProjectedCircle");
    public final toe a;
    public final uev b;
    protected final too c;
    public final float[] d;
    public final float e;
    public final float[] f;
    public final uew h;
    public final usy i;
    private final qsb k = new qsb((short[]) null);
    public final float[] g = new float[6];

    public umk(too tooVar, float f, usy usyVar) {
        float[] fArr = new float[2];
        this.d = fArr;
        float[] fArr2 = new float[8];
        this.f = fArr2;
        toe.c(new too(0, 0), new too(0, 0), new too(0, 0), new too(0, 0));
        this.h = new uew();
        if (!tsw.l(usyVar, tooVar, fArr2, true)) {
            fArr2[0] = 0.0f;
            fArr2[1] = 0.0f;
        }
        float f2 = fArr2[0];
        fArr[0] = f2;
        float f3 = fArr2[1];
        fArr[1] = f3;
        float f4 = f2 - f;
        float f5 = f2 + f;
        float f6 = f3 - f;
        float f7 = f3 + f;
        toe toeVarH = tsw.h(usyVar, f4, f5, f6, f7, fArr2);
        this.a = toeVarH;
        if (toeVarH == null) {
            ((ynz) ((ynz) j.g()).ai((char) 9425)).u("Unable to create boundingQuad");
        }
        this.b = new uev(f4, f6, f5, f7);
        this.c = tooVar;
        this.i = usyVar;
        this.e = f;
    }

    private static boolean e(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float f9 = f5 - f3;
        float f10 = f4 - f2;
        float f11 = (((f6 - f2) * f10) + ((f7 - f3) * f9)) / ((f10 * f10) + (f9 * f9));
        if (f11 > BitmapDescriptorFactory.HUE_RED && !Float.isNaN(f11)) {
            if (f11 >= 1.0f) {
                f2 = f4;
                f3 = f5;
            } else {
                f2 += f10 * f11;
                f3 += f11 * f9;
            }
        }
        float f12 = f8 + (f / 2.0f);
        float f13 = f6 - f2;
        float f14 = f7 - f3;
        return (f13 * f13) + (f14 * f14) <= f12 * f12;
    }

    public final boolean a(uew uewVar) {
        return uewVar.f(this.b);
    }

    public final boolean b(float f, float f2, double d, float f3, float f4) {
        uew uewVar = this.h;
        uewVar.h(f, f2, d, f3 / 2.0f, f4 / 2.0f);
        return uewVar.f(this.b);
    }

    public final boolean c(float[] fArr, boolean z, float f, uww uwwVar, float f2) {
        too tooVarS = this.k.s(this.c, uwwVar);
        usy usyVar = this.i;
        if (z) {
            float[] fArr2 = this.f;
            fArr2[0] = tooVarS.a;
            fArr2[1] = tooVarS.b;
            float[] fArrX = usyVar.x();
            float f3 = fArrX[0];
            float f4 = fArr2[0];
            float f5 = fArrX[4];
            float f6 = fArr2[1];
            float f7 = (f3 * f4) + (f5 * f6);
            fArr2[4] = f7;
            float f8 = (fArrX[1] * f4) + (fArrX[5] * f6);
            fArr2[5] = f8;
            float f9 = fArrX[11] + fArrX[15];
            fArr2[7] = f9;
            if (f9 <= BitmapDescriptorFactory.HUE_RED) {
                fArr2[0] = Float.NaN;
                fArr2[1] = Float.NaN;
                return false;
            }
            float f10 = 1.0f / f9;
            fArr2[0] = f7 * f10;
            fArr2[1] = f8 * f10;
        } else if (!tsw.l(usyVar, tooVarS, this.f, false)) {
            return false;
        }
        float[] fArr3 = this.f;
        float f11 = fArr3[0];
        float f12 = fArr3[1];
        float f13 = 0.5f * f;
        if (f11 < (wub.aA(fArr[0], fArr[2], fArr[4]) - f2) - f13 || f11 > wub.az(fArr[0], fArr[2], fArr[4]) + f2 + f13 || f12 < (wub.aA(fArr[1], fArr[3], fArr[5]) - f2) - f13 || f12 > wub.az(fArr[1], fArr[3], fArr[5]) + f2 + f13) {
            return false;
        }
        if (e(f, fArr[0], fArr[1], fArr[2], fArr[3], f11, f12, f2) || e(f, fArr[2], fArr[3], fArr[4], fArr[5], f11, f12, f2) || e(f, fArr[4], fArr[5], fArr[0], fArr[1], f11, f12, f2)) {
            return true;
        }
        double d = f12;
        double d2 = fArr[0];
        double d3 = fArr[1];
        double d4 = fArr[2];
        double d5 = fArr[3];
        double d6 = fArr[4];
        double d7 = fArr[5];
        double d8 = d5 - d7;
        double d9 = d6 - d4;
        double d10 = d2 - d6;
        double d11 = (d8 * d10) + ((d3 - d7) * d9);
        double d12 = f11 - d6;
        double d13 = d - d7;
        double d14 = (d8 * d12) + (d9 * d13);
        double d15 = ((d7 - d3) * d12) + (d10 * d13);
        double d16 = (d11 - d14) - d15;
        if (d11 < 0.0d) {
            d11 = -d11;
            d14 = -d14;
            d15 = -d15;
            d16 = -d16;
        }
        return d14 >= 0.0d && d14 <= d11 && d15 >= 0.0d && d15 <= d11 && d16 >= 0.0d && d16 <= d11;
    }

    public final boolean d(too tooVar, too tooVar2, too tooVar3, uww uwwVar) {
        too tooVarS = this.k.s(this.c, uwwVar);
        int i = tooVarS.a;
        int i2 = tooVarS.b;
        long j2 = tooVar.a;
        long j3 = tooVar.b;
        long j4 = tooVar2.a;
        long j5 = tooVar2.b;
        long j6 = tooVar3.a;
        long j7 = tooVar3.b;
        long j8 = i2;
        long j9 = j5 - j7;
        long j10 = j6 - j4;
        long j11 = j2 - j6;
        long j12 = (j9 * j11) + ((j3 - j7) * j10);
        long j13 = i - j6;
        long j14 = j8 - j7;
        long j15 = (j10 * j14) + (j9 * j13);
        long j16 = ((j7 - j3) * j13) + (j11 * j14);
        long j17 = (j12 - j15) - j16;
        if (j12 < 0) {
            j12 = -j12;
            j15 = -j15;
            j16 = -j16;
            j17 = -j17;
        }
        return j15 >= 0 && j15 <= j12 && j16 >= 0 && j16 <= j12 && j17 >= 0 && j17 <= j12;
    }
}
