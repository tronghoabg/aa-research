package d0;

import com.moloco.sdk.internal.publisher.H;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final long f33949b = H.I(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: c, reason: collision with root package name */
    public static final long f33950c = H.I(Float.NaN, Float.NaN);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33951d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f33952a;

    public /* synthetic */ f(long j8) {
        this.f33952a = j8;
    }

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static final float b(long j8) {
        if (j8 != f33950c) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static final float c(long j8) {
        return Math.min(Math.abs(d(j8)), Math.abs(b(j8)));
    }

    public static final float d(long j8) {
        if (j8 != f33950c) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("Size is unspecified");
    }

    public static String e(long j8) {
        if (j8 == f33950c) {
            return "Size.Unspecified";
        }
        return "Size(" + S3.f.O(d(j8)) + ", " + S3.f.O(b(j8)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f33952a == ((f) obj).f33952a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f33952a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        return e(this.f33952a);
    }
}
