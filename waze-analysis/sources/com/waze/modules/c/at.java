package com.waze.modules.c;

import i.b.l.pv;
import i.b.l.pw;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class at implements av {

    /* renamed from: a, reason: collision with root package name */
    private final ar f29885a;

    /* renamed from: b, reason: collision with root package name */
    private final long f29886b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29887c;

    public at(ar arVar, long j2, boolean z) {
        h.g.b.x.f(arVar, "route");
        this.f29885a = arVar;
        this.f29886b = j2;
        this.f29887c = z;
    }

    @Override // com.waze.modules.c.av
    public final ar a() {
        return this.f29885a;
    }

    public final pw b() {
        ar arVarD;
        boolean z = this.f29887c;
        ar arVar = this.f29885a;
        if (z && (arVarD = arVar.d()) != null) {
            arVar = arVarD;
        }
        long j2 = this.f29886b;
        pv pvVarNewBuilder = pw.newBuilder();
        pvVarNewBuilder.a(j2);
        pvVarNewBuilder.b(arVar.u());
        pw pwVarBuild = pvVarNewBuilder.build();
        h.g.b.x.e(pwVarBuild, "build(...)");
        return pwVarBuild;
    }

    @Override // com.waze.modules.c.av
    public final boolean c() {
        return this.f29887c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof at)) {
            return false;
        }
        at atVar = (at) obj;
        return h.g.b.x.n(this.f29885a, atVar.f29885a) && this.f29886b == atVar.f29886b && this.f29887c == atVar.f29887c;
    }

    public final int hashCode() {
        return (((this.f29885a.hashCode() * 31) + a.a.b(this.f29886b)) * 31) + a.a.a(this.f29887c);
    }

    public final String toString() {
        return "RoutingUpdate(route=" + this.f29885a + ", routingId=" + this.f29886b + ", hovRouteSelected=" + this.f29887c + ")";
    }
}
