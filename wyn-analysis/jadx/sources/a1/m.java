package a1;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class m {
    public static final m k;

    /* renamed from: a, reason: collision with root package name */
    public final float f17135a;

    /* renamed from: b, reason: collision with root package name */
    public final float f17136b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17137c;

    /* renamed from: d, reason: collision with root package name */
    public final float f17138d;

    /* renamed from: e, reason: collision with root package name */
    public final float f17139e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17140f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f17141g;

    /* renamed from: h, reason: collision with root package name */
    public final float f17142h;

    /* renamed from: i, reason: collision with root package name */
    public final float f17143i;

    /* renamed from: j, reason: collision with root package name */
    public final float f17144j;

    static {
        float[] fArr = AbstractC1312b.f17107c;
        float fP = (float) ((AbstractC1312b.p() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1312b.f17105a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fP) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d3 = fExp;
        if (d3 > 1.0d) {
            fExp = 1.0f;
        } else if (d3 < 0.0d) {
            fExp = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f19 = 1.0f / ((5.0f * fP) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(fP * 5.0d))) + (f20 * fP);
        float fP2 = AbstractC1312b.p() / fArr[1];
        double d5 = fP2;
        float fSqrt = ((float) Math.sqrt(d5)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d5, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * fCbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * fCbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * fCbrt) * f17) / 100.0d, 0.42d)};
        float f22 = fArr6[0];
        float f23 = (f22 * 400.0f) / (f22 + 27.13f);
        float f24 = fArr6[1];
        float f25 = (f24 * 400.0f) / (f24 + 27.13f);
        float f26 = fArr6[2];
        float[] fArr7 = {f23, f25, (400.0f * f26) / (f26 + 27.13f)};
        k = new m(fP2, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * fPow, fPow, fPow, f18, 1.0f, new float[]{(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp}, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public m(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f17140f = f10;
        this.f17135a = f11;
        this.f17136b = f12;
        this.f17137c = f13;
        this.f17138d = f14;
        this.f17139e = f15;
        this.f17141g = fArr;
        this.f17142h = f16;
        this.f17143i = f17;
        this.f17144j = f18;
    }
}
