package a1;

import android.graphics.Color;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1311a {

    /* renamed from: a, reason: collision with root package name */
    public final float f17099a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17100b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17101c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17102d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17103e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17104f;

    public C1311a(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f17099a = f10;
        this.f17100b = f11;
        this.f17101c = f12;
        this.f17102d = f13;
        this.f17103e = f14;
        this.f17104f = f15;
    }

    public static C1311a a(int i5) {
        m mVar = m.k;
        float fH = AbstractC1312b.h(Color.red(i5));
        float fH2 = AbstractC1312b.h(Color.green(i5));
        float fH3 = AbstractC1312b.h(Color.blue(i5));
        float[][] fArr = AbstractC1312b.f17108d;
        float[] fArr2 = fArr[0];
        float f10 = (fArr2[2] * fH3) + (fArr2[1] * fH2) + (fArr2[0] * fH);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * fH3) + (fArr3[1] * fH2) + (fArr3[0] * fH);
        float[] fArr4 = fArr[2];
        float f12 = (fH3 * fArr4[2]) + (fH2 * fArr4[1]) + (fH * fArr4[0]);
        float[][] fArr5 = AbstractC1312b.f17105a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f10);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f10);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f10 * fArr8[0]);
        float[] fArr9 = mVar.f17141g;
        float f16 = fArr9[0] * f13;
        float f17 = fArr9[1] * f14;
        float f18 = fArr9[2] * f15;
        float fAbs = Math.abs(f16);
        float f19 = mVar.f17142h;
        float fPow = (float) Math.pow((fAbs * f19) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow((Math.abs(f17) * f19) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow((Math.abs(f18) * f19) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f16) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f17) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f18) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d3 = fSignum3;
        float f20 = ((float) (((fSignum2 * (-12.0d)) + (fSignum * 11.0d)) + d3)) / 11.0f;
        float f21 = ((float) ((fSignum + fSignum2) - (d3 * 2.0d))) / 9.0f;
        float f22 = fSignum2 * 20.0f;
        float f23 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f22)) / 20.0f;
        float f24 = (((fSignum * 40.0f) + f22) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f21, f20)) * 180.0f) / 3.1415927f;
        if (fAtan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f25 = fAtan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float f27 = f24 * mVar.f17136b;
        float f28 = mVar.f17135a;
        float f29 = mVar.f17138d;
        float fPow4 = ((float) Math.pow(f27 / f28, mVar.f17144j * f29)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f30 = f28 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, mVar.f17140f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? f25 + 360.0f : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * mVar.f17139e) * mVar.f17137c) * ((float) Math.sqrt((f21 * f21) + (f20 * f20)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(fPow4 / 100.0d));
        float f31 = mVar.f17143i * fPow5;
        Math.sqrt((r3 * f29) / f30);
        float f32 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f31 * 0.0228f) + 1.0f)) * 43.85965f;
        double d5 = f26;
        return new C1311a(f25, fPow5, fPow4, f32, fLog * ((float) Math.cos(d5)), fLog * ((float) Math.sin(d5)));
    }

    public static C1311a b(float f10, float f11, float f12) {
        m mVar = m.k;
        float f13 = mVar.f17138d;
        Math.sqrt(f10 / 100.0d);
        float f14 = mVar.f17135a + 4.0f;
        float f15 = mVar.f17143i * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * mVar.f17138d) / f14);
        float f16 = (1.7f * f10) / ((0.007f * f10) + 1.0f);
        float fLog = ((float) Math.log((f15 * 0.0228d) + 1.0d)) * 43.85965f;
        double d3 = (3.1415927f * f12) / 180.0f;
        return new C1311a(f12, f11, f10, f16, fLog * ((float) Math.cos(d3)), fLog * ((float) Math.sin(d3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(a1.m r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.C1311a.c(a1.m):int");
    }
}
