package com.waze.an.c;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final long f14746a;

    /* renamed from: b, reason: collision with root package name */
    private final long f14747b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f14748c;

    public /* synthetic */ ad(long j2, long j3, h.g.a.a aVar) {
        h.g.b.x.f(aVar, "onTimeout");
        this.f14746a = j2;
        this.f14747b = j3;
        this.f14748c = aVar;
    }

    public final long a() {
        return this.f14747b;
    }

    public final long b() {
        return this.f14746a;
    }

    public final h.g.a.a c() {
        return this.f14748c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return h.o.f.e(this.f14746a, adVar.f14746a) && h.o.a.A(this.f14747b, adVar.f14747b) && h.g.b.x.n(this.f14748c, adVar.f14748c);
    }

    public final int hashCode() {
        h.o.c cVar = h.o.a.f48264a;
        return (((a.a.b(this.f14746a) * 31) + a.a.b(this.f14747b)) * 31) + this.f14748c.hashCode();
    }

    public final String toString() {
        long j2 = this.f14747b;
        return "TimerData(startedTime=" + h.o.f.c(this.f14746a) + ", duration=" + h.o.a.y(j2) + ", onTimeout=" + this.f14748c + ")";
    }
}
