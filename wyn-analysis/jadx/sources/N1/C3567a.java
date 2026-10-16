package n1;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: n1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3567a {

    /* renamed from: a, reason: collision with root package name */
    public int f40758a;

    /* renamed from: b, reason: collision with root package name */
    public int f40759b;

    /* renamed from: c, reason: collision with root package name */
    public float f40760c;

    /* renamed from: d, reason: collision with root package name */
    public float f40761d;

    /* renamed from: e, reason: collision with root package name */
    public long f40762e;

    /* renamed from: f, reason: collision with root package name */
    public long f40763f;

    /* renamed from: g, reason: collision with root package name */
    public long f40764g;

    /* renamed from: h, reason: collision with root package name */
    public float f40765h;

    /* renamed from: i, reason: collision with root package name */
    public int f40766i;

    public final float a(long j8) {
        if (j8 < this.f40762e) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        long j10 = this.f40764g;
        if (j10 < 0 || j8 < j10) {
            return ViewOnTouchListenerC3570d.b((j8 - r0) / this.f40758a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
        }
        float f10 = this.f40765h;
        return (ViewOnTouchListenerC3570d.b((j8 - j10) / this.f40766i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * f10) + (1.0f - f10);
    }
}
