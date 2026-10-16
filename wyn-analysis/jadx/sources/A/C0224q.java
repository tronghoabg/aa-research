package A;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: A.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224q implements r {

    /* renamed from: a, reason: collision with root package name */
    public final float f181a;

    public C0224q(float f10) {
        this.f181a = f10;
    }

    public static float b(float f10, float f11, float f12) {
        float f13 = 3;
        float f14 = 1 - f12;
        return (f12 * f12 * f12) + (f13 * f11 * f14 * f12 * f12) + (f10 * f13 * f14 * f14 * f12);
    }

    @Override // A.r
    public final float a(float f10) {
        if (f10 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 >= 1.0f) {
            return f10;
        }
        float f11 = 0.0f;
        float f12 = 1.0f;
        while (true) {
            float f13 = (f11 + f12) / 2;
            float fB = b(0.4f, this.f181a, f13);
            if (Math.abs(f10 - fB) < 0.001f) {
                return b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, f13);
            }
            if (fB < f10) {
                f11 = f13;
            } else {
                f12 = f13;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0224q)) {
            return false;
        }
        C0224q c0224q = (C0224q) obj;
        c0224q.getClass();
        return this.f181a == c0224q.f181a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) + AbstractC0213f.c(this.f181a, AbstractC0213f.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.floatToIntBits(0.4f) * 31, 31), 31);
    }
}
