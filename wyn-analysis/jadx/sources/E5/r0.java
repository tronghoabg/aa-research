package E5;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import u6.AbstractC4256a;

/* loaded from: classes3.dex */
public final class r0 implements InterfaceC0453h {

    /* renamed from: d, reason: collision with root package name */
    public static final r0 f3534d = new r0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f3535a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3536b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3537c;

    public r0(float f10, float f11) {
        AbstractC4256a.e(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AbstractC4256a.e(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f3535a = f10;
        this.f3536b = f11;
        this.f3537c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.f3535a == r0Var.f3535a && this.f3536b == r0Var.f3536b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3536b) + ((Float.floatToRawIntBits(this.f3535a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3535a), Float.valueOf(this.f3536b)};
        int i5 = u6.v.f46721a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
