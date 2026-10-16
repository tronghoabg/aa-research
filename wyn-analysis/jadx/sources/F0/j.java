package f0;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class j extends AbstractC2547c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f34772d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f34773e;

    /* renamed from: f, reason: collision with root package name */
    public static final float[] f34774f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f34775g;

    static {
        float[] fArrI = h.i(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, h.c(C2545a.f34731b.f34732a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f34772d = fArrI;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f34773e = fArr;
        f34774f = h.h(fArrI);
        f34775g = h.h(fArr);
    }

    @Override // f0.AbstractC2547c
    public final float[] a(float[] v2) {
        AbstractC3340k.e(v2, "v");
        h.j(f34772d, v2);
        double d3 = 0.33333334f;
        v2[0] = Math.signum(v2[0]) * ((float) Math.pow(Math.abs(v2[0]), d3));
        v2[1] = Math.signum(v2[1]) * ((float) Math.pow(Math.abs(v2[1]), d3));
        v2[2] = Math.signum(v2[2]) * ((float) Math.pow(Math.abs(v2[2]), d3));
        h.j(f34773e, v2);
        return v2;
    }

    @Override // f0.AbstractC2547c
    public final float b(int i5) {
        return i5 == 0 ? 1.0f : 0.5f;
    }

    @Override // f0.AbstractC2547c
    public final float c(int i5) {
        if (i5 == 0) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return -0.5f;
    }

    @Override // f0.AbstractC2547c
    public final float[] e(float[] fArr) {
        fArr[0] = android.support.v4.media.session.b.R(fArr[0], UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        fArr[1] = android.support.v4.media.session.b.R(fArr[1], -0.5f, 0.5f);
        fArr[2] = android.support.v4.media.session.b.R(fArr[2], -0.5f, 0.5f);
        h.j(f34775g, fArr);
        float f10 = fArr[0];
        fArr[0] = f10 * f10 * f10;
        float f11 = fArr[1];
        fArr[1] = f11 * f11 * f11;
        float f12 = fArr[2];
        fArr[2] = f12 * f12 * f12;
        h.j(f34774f, fArr);
        return fArr;
    }
}
