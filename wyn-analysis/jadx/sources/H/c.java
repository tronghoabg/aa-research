package H;

import com.unity3d.services.UnityAdsConstants;
import d0.f;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float f4843a;

    public c(float f10) {
        this.f4843a = f10;
        if (f10 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f10 > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // H.a
    public final float a(long j8, L0.b density) {
        AbstractC3340k.e(density, "density");
        return (this.f4843a / 100.0f) * f.c(j8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Float.valueOf(this.f4843a).equals(Float.valueOf(((c) obj).f4843a));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f4843a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.f4843a + "%)";
    }
}
