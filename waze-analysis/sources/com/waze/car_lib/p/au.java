package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class au {

    /* renamed from: a, reason: collision with root package name */
    private final String f20596a;

    /* renamed from: b, reason: collision with root package name */
    private final long f20597b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20598c;

    public /* synthetic */ au(String str, long j2, boolean z) {
        h.g.b.x.f(str, "etaText");
        this.f20596a = str;
        this.f20597b = j2;
        this.f20598c = z;
    }

    public final long a() {
        return this.f20597b;
    }

    public final String b() {
        return this.f20596a;
    }

    public final boolean c() {
        return this.f20598c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return h.g.b.x.n(this.f20596a, auVar.f20596a) && h.o.a.A(this.f20597b, auVar.f20597b) && this.f20598c == auVar.f20598c;
    }

    public final int hashCode() {
        int iHashCode = this.f20596a.hashCode() * 31;
        h.o.c cVar = h.o.a.f48264a;
        return ((iHashCode + a.a.b(this.f20597b)) * 31) + a.a.a(this.f20598c);
    }

    public final String toString() {
        return "EtaData(etaText=" + this.f20596a + ", routeDuration=" + h.o.a.y(this.f20597b) + ", isTrafficHeavierThanUsual=" + this.f20598c + ")";
    }
}
