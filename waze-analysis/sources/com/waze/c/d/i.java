package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class i extends m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.ar f18366a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18367b;

    /* renamed from: c, reason: collision with root package name */
    private final long f18368c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(com.waze.modules.c.ar arVar, long j2, long j3) {
        super(null);
        h.g.b.x.f(arVar, "route");
        this.f18366a = arVar;
        this.f18367b = j2;
        this.f18368c = j3;
    }

    public final long a() {
        return this.f18367b;
    }

    public final long b() {
        return this.f18368c;
    }

    @Override // com.waze.c.d.m
    public final com.waze.modules.c.ar c() {
        return this.f18366a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return h.g.b.x.n(this.f18366a, iVar.f18366a) && h.o.a.A(this.f18367b, iVar.f18367b) && this.f18368c == iVar.f18368c;
    }

    public final int hashCode() {
        int iHashCode = this.f18366a.hashCode() * 31;
        h.o.c cVar = h.o.a.f48264a;
        return ((iHashCode + a.a.b(this.f18367b)) * 31) + a.a.b(this.f18368c);
    }

    public final String toString() {
        return "LocalActiveRoute(route=" + this.f18366a + ", latestEta=" + h.o.a.y(this.f18367b) + ", remainingDistanceMeters=" + this.f18368c + ")";
    }
}
