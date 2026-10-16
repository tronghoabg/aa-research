package A;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: A.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220m extends AbstractC0221n {

    /* renamed from: a, reason: collision with root package name */
    public float f175a;

    /* renamed from: b, reason: collision with root package name */
    public float f176b;

    /* renamed from: c, reason: collision with root package name */
    public float f177c;

    /* renamed from: d, reason: collision with root package name */
    public float f178d;

    public C0220m(float f10, float f11, float f12, float f13) {
        this.f175a = f10;
        this.f176b = f11;
        this.f177c = f12;
        this.f178d = f13;
    }

    @Override // A.AbstractC0221n
    public final float a(int i5) {
        return i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f178d : this.f177c : this.f176b : this.f175a;
    }

    @Override // A.AbstractC0221n
    public final int b() {
        return 4;
    }

    @Override // A.AbstractC0221n
    public final AbstractC0221n c() {
        return new C0220m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // A.AbstractC0221n
    public final void d() {
        this.f175a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f176b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f177c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f178d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // A.AbstractC0221n
    public final void e(float f10, int i5) {
        if (i5 == 0) {
            this.f175a = f10;
            return;
        }
        if (i5 == 1) {
            this.f176b = f10;
        } else if (i5 == 2) {
            this.f177c = f10;
        } else {
            if (i5 != 3) {
                return;
            }
            this.f178d = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0220m)) {
            return false;
        }
        C0220m c0220m = (C0220m) obj;
        return c0220m.f175a == this.f175a && c0220m.f176b == this.f176b && c0220m.f177c == this.f177c && c0220m.f178d == this.f178d;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f178d) + AbstractC0213f.c(this.f177c, AbstractC0213f.c(this.f176b, Float.floatToIntBits(this.f175a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f175a + ", v2 = " + this.f176b + ", v3 = " + this.f177c + ", v4 = " + this.f178d;
    }
}
