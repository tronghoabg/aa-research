package com.waze.modules.c;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw implements as {

    /* renamed from: a, reason: collision with root package name */
    private final dk f29893a;

    /* renamed from: b, reason: collision with root package name */
    private final av f29894b;

    /* renamed from: c, reason: collision with root package name */
    private final List f29895c;

    /* renamed from: d, reason: collision with root package name */
    private final long f29896d;

    public aw(dk dkVar, av avVar) {
        h.g.b.x.f(dkVar, "routingResponse");
        this.f29893a = dkVar;
        this.f29894b = avVar;
        this.f29895c = dkVar.f();
        this.f29896d = dkVar.c();
    }

    @Override // com.waze.modules.c.as
    public final /* synthetic */ long a() {
        return -1L;
    }

    @Override // com.waze.modules.c.as
    public final boolean b() {
        return (this.f29895c.isEmpty() && this.f29894b == null) ? false : true;
    }

    public final long c() {
        return this.f29896d;
    }

    public final av d() {
        return this.f29894b;
    }

    public final dk e() {
        return this.f29893a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw)) {
            return false;
        }
        aw awVar = (aw) obj;
        return h.g.b.x.n(this.f29893a, awVar.f29893a) && h.g.b.x.n(this.f29894b, awVar.f29894b);
    }

    public final int hashCode() {
        int iHashCode = this.f29893a.hashCode() * 31;
        av avVar = this.f29894b;
        return iHashCode + (avVar == null ? 0 : avVar.hashCode());
    }

    public final String toString() {
        return "RouteAlternativesResponse(routingResponse=" + this.f29893a + ", currentRouteAction=" + this.f29894b + ")";
    }
}
