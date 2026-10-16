package x0;

import com.unity3d.services.UnityAdsConstants;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4434d {

    /* renamed from: b, reason: collision with root package name */
    public static final C4434d f47576b = new C4434d(new zf.d());

    /* renamed from: a, reason: collision with root package name */
    public final zf.d f47577a;

    public C4434d(zf.d dVar) {
        this.f47577a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4434d)) {
            return false;
        }
        C4434d c4434d = (C4434d) obj;
        c4434d.getClass();
        return this.f47577a.equals(c4434d.f47577a);
    }

    public final int hashCode() {
        return (this.f47577a.hashCode() + (Float.floatToIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=0.0, range=" + this.f47577a + ", steps=0)";
    }
}
