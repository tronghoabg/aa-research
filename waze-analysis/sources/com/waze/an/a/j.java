package com.waze.an.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final long f14587a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f14588b;

    private j(long j2, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onTimeout");
        this.f14587a = j2;
        this.f14588b = aVar;
    }

    public static /* synthetic */ j c(j jVar, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onTimeout");
        return new j(jVar.f14587a, aVar);
    }

    public final long a() {
        return this.f14587a;
    }

    public final h.g.a.a b() {
        return this.f14588b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.o.a.A(this.f14587a, jVar.f14587a) && h.g.b.x.n(this.f14588b, jVar.f14588b);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (a.a.b(this.f14587a) * 31) + this.f14588b.hashCode();
    }

    public final String toString() {
        return "Timeout(timeoutDuration=" + h.o.a.y(this.f14587a) + ", onTimeout=" + this.f14588b + ")";
    }

    public /* synthetic */ j(long j2, h.g.a.a aVar, byte[] bArr) {
        this(j2, aVar);
    }
}
