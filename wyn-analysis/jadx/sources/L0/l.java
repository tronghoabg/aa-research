package L0;

import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final long f6813b = Fe.c.d(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6814c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f6815a;

    public /* synthetic */ l(long j8) {
        this.f6815a = j8;
    }

    public static final long a(long j8, long j10) {
        return Fe.c.d(Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat((int) (j8 & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return this.f6815a == ((l) obj).f6815a;
        }
        return false;
    }

    public final int hashCode() {
        long j8 = this.f6815a;
        return (int) (j8 ^ (j8 >>> 32));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        long j8 = this.f6815a;
        sb2.append(Float.intBitsToFloat((int) (j8 >> 32)));
        sb2.append(", ");
        sb2.append(Float.intBitsToFloat((int) (j8 & 4294967295L)));
        sb2.append(") px/sec");
        return sb2.toString();
    }
}
