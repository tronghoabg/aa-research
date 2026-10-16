package E5;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes3.dex */
public final class Z implements InterfaceC0453h {

    /* renamed from: f, reason: collision with root package name */
    public static final Z f3272f = new Z(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* renamed from: a, reason: collision with root package name */
    public final long f3273a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3274b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3275c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3276d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3277e;

    public Z(long j8, long j10, long j11, float f10, float f11) {
        this.f3273a = j8;
        this.f3274b = j10;
        this.f3275c = j11;
        this.f3276d = f10;
        this.f3277e = f11;
    }

    public final Y a() {
        Y y10 = new Y();
        y10.f3267a = this.f3273a;
        y10.f3268b = this.f3274b;
        y10.f3269c = this.f3275c;
        y10.f3270d = this.f3276d;
        y10.f3271e = this.f3277e;
        return y10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z2 = (Z) obj;
        return this.f3273a == z2.f3273a && this.f3274b == z2.f3274b && this.f3275c == z2.f3275c && this.f3276d == z2.f3276d && this.f3277e == z2.f3277e;
    }

    public final int hashCode() {
        long j8 = this.f3273a;
        long j10 = this.f3274b;
        int i5 = ((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f3275c;
        int i10 = (i5 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.f3276d;
        int iFloatToIntBits = (i10 + (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f3277e;
        return iFloatToIntBits + (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f11) : 0);
    }
}
