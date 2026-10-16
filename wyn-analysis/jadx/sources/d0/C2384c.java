package d0;

import U8.v0;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2384c {

    /* renamed from: b, reason: collision with root package name */
    public static final long f33931b = v0.f(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: c, reason: collision with root package name */
    public static final long f33932c = v0.f(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* renamed from: d, reason: collision with root package name */
    public static final long f33933d = v0.f(Float.NaN, Float.NaN);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33934e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f33935a;

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static final float b(long j8) {
        if (j8 != f33933d) {
            return Float.intBitsToFloat((int) (j8 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    public static final float c(long j8) {
        if (j8 != f33933d) {
            return Float.intBitsToFloat((int) (j8 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified");
    }

    public static int d(long j8) {
        return (int) (j8 ^ (j8 >>> 32));
    }

    public static final long e(long j8, long j10) {
        return v0.f(b(j8) - b(j10), c(j8) - c(j10));
    }

    public static final long f(long j8, long j10) {
        return v0.f(b(j10) + b(j8), c(j10) + c(j8));
    }

    public static String g(long j8) {
        if (j8 == f33933d) {
            return "Offset.Unspecified";
        }
        return "Offset(" + S3.f.O(b(j8)) + ", " + S3.f.O(c(j8)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2384c) {
            return this.f33935a == ((C2384c) obj).f33935a;
        }
        return false;
    }

    public final int hashCode() {
        return d(this.f33935a);
    }

    public final String toString() {
        return g(this.f33935a);
    }
}
