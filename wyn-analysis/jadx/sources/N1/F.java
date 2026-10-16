package N1;

import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: d, reason: collision with root package name */
    public static final F f8031d = new F(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f8032a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8033b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8034c;

    static {
        Q1.x.E(0);
        Q1.x.E(1);
    }

    public F(float f10) {
        this(f10, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && F.class == obj.getClass()) {
            F f10 = (F) obj;
            if (this.f8032a == f10.f8032a && this.f8033b == f10.f8033b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f8033b) + ((Float.floatToRawIntBits(this.f8032a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f8032a), Float.valueOf(this.f8033b)};
        int i5 = Q1.x.f9724a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public F(float f10, float f11) {
        Q1.k.c(f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Q1.k.c(f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f8032a = f10;
        this.f8033b = f11;
        this.f8034c = Math.round(f10 * 1000.0f);
    }
}
