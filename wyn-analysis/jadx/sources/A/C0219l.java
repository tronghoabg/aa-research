package A;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: A.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0219l extends AbstractC0221n {

    /* renamed from: a, reason: collision with root package name */
    public float f173a;

    /* renamed from: b, reason: collision with root package name */
    public float f174b;

    public C0219l(float f10, float f11) {
        this.f173a = f10;
        this.f174b = f11;
    }

    @Override // A.AbstractC0221n
    public final float a(int i5) {
        return i5 != 0 ? i5 != 1 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f174b : this.f173a;
    }

    @Override // A.AbstractC0221n
    public final int b() {
        return 2;
    }

    @Override // A.AbstractC0221n
    public final AbstractC0221n c() {
        return new C0219l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // A.AbstractC0221n
    public final void d() {
        this.f173a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f174b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // A.AbstractC0221n
    public final void e(float f10, int i5) {
        if (i5 == 0) {
            this.f173a = f10;
        } else {
            if (i5 != 1) {
                return;
            }
            this.f174b = f10;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0219l)) {
            return false;
        }
        C0219l c0219l = (C0219l) obj;
        return c0219l.f173a == this.f173a && c0219l.f174b == this.f174b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f174b) + (Float.floatToIntBits(this.f173a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.f173a + ", v2 = " + this.f174b;
    }
}
