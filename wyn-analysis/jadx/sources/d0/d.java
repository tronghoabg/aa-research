package d0;

import A.AbstractC0213f;
import U8.v0;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final d f33936e = new d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: a, reason: collision with root package name */
    public final float f33937a;

    /* renamed from: b, reason: collision with root package name */
    public final float f33938b;

    /* renamed from: c, reason: collision with root package name */
    public final float f33939c;

    /* renamed from: d, reason: collision with root package name */
    public final float f33940d;

    public d(float f10, float f11, float f12, float f13) {
        this.f33937a = f10;
        this.f33938b = f11;
        this.f33939c = f12;
        this.f33940d = f13;
    }

    public final long a() {
        return v0.f((c() / 2.0f) + this.f33937a, (b() / 2.0f) + this.f33938b);
    }

    public final float b() {
        return this.f33940d - this.f33938b;
    }

    public final float c() {
        return this.f33939c - this.f33937a;
    }

    public final d d(float f10, float f11) {
        return new d(this.f33937a + f10, this.f33938b + f11, this.f33939c + f10, this.f33940d + f11);
    }

    public final d e(long j8) {
        return new d(C2384c.b(j8) + this.f33937a, C2384c.c(j8) + this.f33938b, C2384c.b(j8) + this.f33939c, C2384c.c(j8) + this.f33940d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Float.valueOf(this.f33937a).equals(Float.valueOf(dVar.f33937a)) && Float.valueOf(this.f33938b).equals(Float.valueOf(dVar.f33938b)) && Float.valueOf(this.f33939c).equals(Float.valueOf(dVar.f33939c)) && Float.valueOf(this.f33940d).equals(Float.valueOf(dVar.f33940d));
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f33940d) + AbstractC0213f.c(this.f33939c, AbstractC0213f.c(this.f33938b, Float.floatToIntBits(this.f33937a) * 31, 31), 31);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + S3.f.O(this.f33937a) + ", " + S3.f.O(this.f33938b) + ", " + S3.f.O(this.f33939c) + ", " + S3.f.O(this.f33940d) + ')';
    }
}
