package E5;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class p0 extends A0 {

    /* renamed from: b, reason: collision with root package name */
    public final float f3496b;

    public p0() {
        this.f3496b = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p0) {
            return this.f3496b == ((p0) obj).f3496b;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f3496b)});
    }

    public p0(float f10) {
        AbstractC4256a.d("percent must be in the range of [0, 100]", f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= 100.0f);
        this.f3496b = f10;
    }
}
