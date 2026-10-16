package A;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: A.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218k extends AbstractC0221n {

    /* renamed from: a, reason: collision with root package name */
    public float f172a;

    public C0218k(float f10) {
        this.f172a = f10;
    }

    @Override // A.AbstractC0221n
    public final float a(int i5) {
        return i5 == 0 ? this.f172a : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // A.AbstractC0221n
    public final int b() {
        return 1;
    }

    @Override // A.AbstractC0221n
    public final AbstractC0221n c() {
        return new C0218k(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // A.AbstractC0221n
    public final void d() {
        this.f172a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // A.AbstractC0221n
    public final void e(float f10, int i5) {
        if (i5 == 0) {
            this.f172a = f10;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0218k) && ((C0218k) obj).f172a == this.f172a;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f172a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.f172a;
    }
}
