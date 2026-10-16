package K0;

import A7.AbstractC0279p0;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final h f6319c = new h(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: a, reason: collision with root package name */
    public final float f6320a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6321b;

    public h(float f10, float f11) {
        this.f6320a = f10;
        this.f6321b = f11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6320a == hVar.f6320a && this.f6321b == hVar.f6321b;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f6321b) + (Float.floatToIntBits(this.f6320a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f6320a);
        sb2.append(", skewX=");
        return AbstractC0279p0.m(sb2, this.f6321b, ')');
    }
}
