package f0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class i extends AbstractC2547c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f34771d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i5, long j8, int i10, String str) {
        super(str, j8, i5);
        this.f34771d = i10;
    }

    public static float f(float f10) {
        return android.support.v4.media.session.b.R(f10, -2.0f, 2.0f);
    }

    @Override // f0.AbstractC2547c
    public final float[] a(float[] v2) {
        char c10;
        float fPow;
        float f10;
        char c11;
        float fPow2;
        switch (this.f34771d) {
            case 0:
                AbstractC3340k.e(v2, "v");
                float f11 = v2[0];
                float[] fArr = h.f34770e;
                float f12 = f11 / fArr[0];
                float f13 = v2[1] / fArr[1];
                float f14 = v2[2] / fArr[2];
                if (f12 > 0.008856452f) {
                    c10 = 0;
                    fPow = (float) Math.pow(f12, 0.33333334f);
                } else {
                    c10 = 0;
                    fPow = (f12 * 7.787037f) + 0.13793103f;
                }
                if (f13 > 0.008856452f) {
                    f10 = 0.008856452f;
                    c11 = 1;
                    fPow2 = (float) Math.pow(f13, 0.33333334f);
                } else {
                    f10 = 0.008856452f;
                    c11 = 1;
                    fPow2 = (f13 * 7.787037f) + 0.13793103f;
                }
                float f15 = (116.0f * fPow2) - 16.0f;
                float f16 = (fPow - fPow2) * 500.0f;
                float fPow3 = (fPow2 - (f14 > f10 ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f)) * 200.0f;
                v2[c10] = android.support.v4.media.session.b.R(f15, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
                v2[c11] = android.support.v4.media.session.b.R(f16, -128.0f, 128.0f);
                v2[2] = android.support.v4.media.session.b.R(fPow3, -128.0f, 128.0f);
                break;
            default:
                AbstractC3340k.e(v2, "v");
                v2[0] = f(v2[0]);
                v2[1] = f(v2[1]);
                v2[2] = f(v2[2]);
                break;
        }
        return v2;
    }

    @Override // f0.AbstractC2547c
    public final float b(int i5) {
        switch (this.f34771d) {
            case 0:
                return i5 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // f0.AbstractC2547c
    public final float c(int i5) {
        switch (this.f34771d) {
            case 0:
                if (i5 == 0) {
                    return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                return -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // f0.AbstractC2547c
    public final float[] e(float[] fArr) {
        switch (this.f34771d) {
            case 0:
                fArr[0] = android.support.v4.media.session.b.R(fArr[0], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 100.0f);
                fArr[1] = android.support.v4.media.session.b.R(fArr[1], -128.0f, 128.0f);
                float fR = android.support.v4.media.session.b.R(fArr[2], -128.0f, 128.0f);
                fArr[2] = fR;
                float f10 = (fArr[0] + 16.0f) / 116.0f;
                float f11 = (fArr[1] * 0.002f) + f10;
                float f12 = f10 - (fR * 0.005f);
                float f13 = f11 > 0.20689656f ? f11 * f11 * f11 : (f11 - 0.13793103f) * 0.12841855f;
                float f14 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
                float f15 = f12 > 0.20689656f ? f12 * f12 * f12 : (f12 - 0.13793103f) * 0.12841855f;
                float[] fArr2 = h.f34770e;
                fArr[0] = f13 * fArr2[0];
                fArr[1] = f14 * fArr2[1];
                fArr[2] = f15 * fArr2[2];
                break;
            default:
                fArr[0] = f(fArr[0]);
                fArr[1] = f(fArr[1]);
                fArr[2] = f(fArr[2]);
                break;
        }
        return fArr;
    }
}
