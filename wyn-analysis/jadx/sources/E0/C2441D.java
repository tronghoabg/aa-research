package e0;

import A7.AbstractC0279p0;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import ef.C2539w;

/* renamed from: e0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441D {

    /* renamed from: d, reason: collision with root package name */
    public static final C2441D f34337d = new C2441D(z.c(4278190080L), C2384c.f33931b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);

    /* renamed from: a, reason: collision with root package name */
    public final long f34338a;

    /* renamed from: b, reason: collision with root package name */
    public final long f34339b;

    /* renamed from: c, reason: collision with root package name */
    public final float f34340c;

    public C2441D(long j8, long j10, float f10) {
        this.f34338a = j8;
        this.f34339b = j10;
        this.f34340c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2441D)) {
            return false;
        }
        C2441D c2441d = (C2441D) obj;
        return C2465q.b(this.f34338a, c2441d.f34338a) && C2384c.a(this.f34339b, c2441d.f34339b) && this.f34340c == c2441d.f34340c;
    }

    public final int hashCode() {
        int i5 = C2465q.f34381j;
        return Float.floatToIntBits(this.f34340c) + ((C2384c.d(this.f34339b) + (C2539w.a(this.f34338a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) C2465q.h(this.f34338a));
        sb2.append(", offset=");
        sb2.append((Object) C2384c.g(this.f34339b));
        sb2.append(", blurRadius=");
        return AbstractC0279p0.m(sb2, this.f34340c, ')');
    }
}
