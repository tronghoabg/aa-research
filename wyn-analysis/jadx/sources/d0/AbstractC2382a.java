package d0;

import Fe.g;
import com.unity3d.services.UnityAdsConstants;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2382a {

    /* renamed from: a, reason: collision with root package name */
    public static final long f33925a = g.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33926b = 0;

    public static final boolean a(long j8, long j10) {
        return j8 == j10;
    }

    public static final float b(long j8) {
        return Float.intBitsToFloat((int) (j8 >> 32));
    }

    public static final float c(long j8) {
        return Float.intBitsToFloat((int) (j8 & 4294967295L));
    }

    public static String d(long j8) {
        if (b(j8) == c(j8)) {
            return "CornerRadius.circular(" + S3.f.O(b(j8)) + ')';
        }
        return "CornerRadius.elliptical(" + S3.f.O(b(j8)) + ", " + S3.f.O(c(j8)) + ')';
    }
}
