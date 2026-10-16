package ea;

import A7.AbstractC0279p0;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes4.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final String f34488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34489b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34490c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34491d;

    /* renamed from: e, reason: collision with root package name */
    public final C2495j f34492e;

    /* renamed from: f, reason: collision with root package name */
    public final String f34493f;

    /* renamed from: g, reason: collision with root package name */
    public final String f34494g;

    public N(String sessionId, String firstSessionId, int i5, long j8, C2495j c2495j, String str, String firebaseAuthenticationToken) {
        AbstractC3340k.e(sessionId, "sessionId");
        AbstractC3340k.e(firstSessionId, "firstSessionId");
        AbstractC3340k.e(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f34488a = sessionId;
        this.f34489b = firstSessionId;
        this.f34490c = i5;
        this.f34491d = j8;
        this.f34492e = c2495j;
        this.f34493f = str;
        this.f34494g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return AbstractC3340k.a(this.f34488a, n10.f34488a) && AbstractC3340k.a(this.f34489b, n10.f34489b) && this.f34490c == n10.f34490c && this.f34491d == n10.f34491d && AbstractC3340k.a(this.f34492e, n10.f34492e) && AbstractC3340k.a(this.f34493f, n10.f34493f) && AbstractC3340k.a(this.f34494g, n10.f34494g);
    }

    public final int hashCode() {
        int iC = (N0.a.c(this.f34488a.hashCode() * 31, 31, this.f34489b) + this.f34490c) * 31;
        long j8 = this.f34491d;
        return this.f34494g.hashCode() + N0.a.c((this.f34492e.hashCode() + ((iC + ((int) (j8 ^ (j8 >>> 32)))) * 31)) * 31, 31, this.f34493f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f34488a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f34489b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f34490c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f34491d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f34492e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f34493f);
        sb2.append(", firebaseAuthenticationToken=");
        return AbstractC0279p0.n(sb2, this.f34494g, ')');
    }
}
