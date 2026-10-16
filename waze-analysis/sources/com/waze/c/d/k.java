package com.waze.c.d;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends l {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.modules.c.ar f18373a;

    /* renamed from: b, reason: collision with root package name */
    private final long f18374b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f18375c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.waze.modules.c.ar arVar, long j2, boolean z) {
        super(null);
        h.g.b.x.f(arVar, "route");
        this.f18373a = arVar;
        this.f18374b = j2;
        this.f18375c = z;
    }

    public static /* synthetic */ k d(k kVar, boolean z) {
        com.waze.modules.c.ar arVar = kVar.f18373a;
        long j2 = kVar.f18374b;
        h.g.b.x.f(arVar, "route");
        return new k(arVar, j2, z);
    }

    @Override // com.waze.c.d.l
    public final long a() {
        return this.f18374b;
    }

    @Override // com.waze.c.d.l
    public final boolean b() {
        return this.f18375c;
    }

    @Override // com.waze.c.d.m
    public final com.waze.modules.c.ar c() {
        return this.f18373a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(this.f18373a, kVar.f18373a) && this.f18374b == kVar.f18374b && this.f18375c == kVar.f18375c;
    }

    public final int hashCode() {
        return (((this.f18373a.hashCode() * 31) + a.a.b(this.f18374b)) * 31) + a.a.a(this.f18375c);
    }

    public final String toString() {
        return "New(route=" + this.f18373a + ", routingId=" + this.f18374b + ", hovRouteEnabled=" + this.f18375c + ")";
    }
}
