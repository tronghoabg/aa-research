package z;

import A.C0212e;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final C0212e f48246a;

    /* renamed from: b, reason: collision with root package name */
    public long f48247b;

    public q(C0212e c0212e, long j8) {
        this.f48246a = c0212e;
        this.f48247b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f48246a.equals(qVar.f48246a) && L0.h.a(this.f48247b, qVar.f48247b);
    }

    public final int hashCode() {
        int iHashCode = this.f48246a.hashCode() * 31;
        long j8 = this.f48247b;
        return ((int) (j8 ^ (j8 >>> 32))) + iHashCode;
    }

    public final String toString() {
        return "AnimData(anim=" + this.f48246a + ", startSize=" + ((Object) L0.h.b(this.f48247b)) + ')';
    }
}
