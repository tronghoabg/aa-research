package z;

import A.InterfaceC0227u;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0227u f48245a;

    public o(InterfaceC0227u interfaceC0227u) {
        this.f48245a = interfaceC0227u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        Float fValueOf = Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        oVar.getClass();
        return fValueOf.equals(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) && this.f48245a.equals(oVar.f48245a);
    }

    public final int hashCode() {
        return this.f48245a.hashCode() + (Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31);
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.f48245a + ')';
    }
}
