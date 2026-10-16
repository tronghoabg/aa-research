package ea;

import A.AbstractC0213f;
import kotlin.jvm.internal.AbstractC3340k;

/* renamed from: ea.E, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2481E {

    /* renamed from: a, reason: collision with root package name */
    public final String f34454a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34455b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34456c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34457d;

    public C2481E(long j8, String sessionId, String firstSessionId, int i5) {
        AbstractC3340k.e(sessionId, "sessionId");
        AbstractC3340k.e(firstSessionId, "firstSessionId");
        this.f34454a = sessionId;
        this.f34455b = firstSessionId;
        this.f34456c = i5;
        this.f34457d = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2481E)) {
            return false;
        }
        C2481E c2481e = (C2481E) obj;
        return AbstractC3340k.a(this.f34454a, c2481e.f34454a) && AbstractC3340k.a(this.f34455b, c2481e.f34455b) && this.f34456c == c2481e.f34456c && this.f34457d == c2481e.f34457d;
    }

    public final int hashCode() {
        int iC = (N0.a.c(this.f34454a.hashCode() * 31, 31, this.f34455b) + this.f34456c) * 31;
        long j8 = this.f34457d;
        return iC + ((int) (j8 ^ (j8 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionDetails(sessionId=");
        sb2.append(this.f34454a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f34455b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f34456c);
        sb2.append(", sessionStartTimestampUs=");
        return AbstractC0213f.e(sb2, this.f34457d, ')');
    }
}
