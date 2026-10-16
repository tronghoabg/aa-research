package N1;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: N1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0769s {

    /* renamed from: a, reason: collision with root package name */
    public final long f8259a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8260b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8261c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8262d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8263e;

    static {
        new E5.Y().b();
        Q1.x.E(0);
        Q1.x.E(1);
        Q1.x.E(2);
        Q1.x.E(3);
        Q1.x.E(4);
    }

    public C0769s(E5.Y y10) {
        long j8 = y10.f3267a;
        long j10 = y10.f3268b;
        long j11 = y10.f3269c;
        float f10 = y10.f3270d;
        float f11 = y10.f3271e;
        this.f8259a = j8;
        this.f8260b = j10;
        this.f8261c = j11;
        this.f8262d = f10;
        this.f8263e = f11;
    }

    public final E5.Y a() {
        E5.Y y10 = new E5.Y();
        y10.f3267a = this.f8259a;
        y10.f3268b = this.f8260b;
        y10.f3269c = this.f8261c;
        y10.f3270d = this.f8262d;
        y10.f3271e = this.f8263e;
        return y10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0769s)) {
            return false;
        }
        C0769s c0769s = (C0769s) obj;
        return this.f8259a == c0769s.f8259a && this.f8260b == c0769s.f8260b && this.f8261c == c0769s.f8261c && this.f8262d == c0769s.f8262d && this.f8263e == c0769s.f8263e;
    }

    public final int hashCode() {
        long j8 = this.f8259a;
        long j10 = this.f8260b;
        int i5 = ((((int) (j8 ^ (j8 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f8261c;
        int i10 = (i5 + ((int) ((j11 >>> 32) ^ j11))) * 31;
        float f10 = this.f8262d;
        int iFloatToIntBits = (i10 + (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f10) : 0)) * 31;
        float f11 = this.f8263e;
        return iFloatToIntBits + (f11 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Float.floatToIntBits(f11) : 0);
    }
}
