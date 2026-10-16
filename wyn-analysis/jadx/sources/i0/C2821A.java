package i0;

import A7.AbstractC0279p0;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: i0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2821A {

    /* renamed from: a, reason: collision with root package name */
    public float f36463a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: b, reason: collision with root package name */
    public float f36464b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    public final void a() {
        this.f36463a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.f36464b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2821A)) {
            return false;
        }
        C2821A c2821a = (C2821A) obj;
        return Float.valueOf(this.f36463a).equals(Float.valueOf(c2821a.f36463a)) && Float.valueOf(this.f36464b).equals(Float.valueOf(c2821a.f36464b));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f36464b) + (Float.floatToIntBits(this.f36463a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PathPoint(x=");
        sb2.append(this.f36463a);
        sb2.append(", y=");
        return AbstractC0279p0.m(sb2, this.f36464b, ')');
    }
}
