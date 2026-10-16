package E5;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class D0 extends A0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f3018b;

    /* renamed from: c, reason: collision with root package name */
    public final float f3019c;

    public D0(int i5) {
        AbstractC4256a.d("maxStars must be a positive integer", i5 > 0);
        this.f3018b = i5;
        this.f3019c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof D0)) {
            return false;
        }
        D0 d02 = (D0) obj;
        return this.f3018b == d02.f3018b && this.f3019c == d02.f3019c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3018b), Float.valueOf(this.f3019c)});
    }

    public D0(int i5, float f10) {
        boolean z2 = false;
        AbstractC4256a.d("maxStars must be a positive integer", i5 > 0);
        if (f10 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f10 <= i5) {
            z2 = true;
        }
        AbstractC4256a.d("starRating is out of range [0, maxStars]", z2);
        this.f3018b = i5;
        this.f3019c = f10;
    }
}
