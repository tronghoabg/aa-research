package com.waze.map.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ci {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28146a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28147b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28148c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28149d;

    public ci(com.waze.shared_infra.h.c cVar, com.waze.shared_infra.h.c cVar2, com.waze.shared_infra.h.c cVar3, com.waze.shared_infra.h.c cVar4) {
        h.g.b.x.f(cVar, "topLeft");
        h.g.b.x.f(cVar2, "topRight");
        h.g.b.x.f(cVar3, "bottomRight");
        h.g.b.x.f(cVar4, "bottomLeft");
        this.f28146a = cVar;
        this.f28147b = cVar2;
        this.f28148c = cVar3;
        this.f28149d = cVar4;
    }

    public final com.waze.shared_infra.h.c a() {
        return this.f28149d;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28146a;
    }

    public final com.waze.shared_infra.h.c c() {
        return this.f28147b;
    }

    public final List d() {
        return h.a.i.i(this.f28146a, this.f28147b, this.f28148c, this.f28149d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci)) {
            return false;
        }
        ci ciVar = (ci) obj;
        return h.g.b.x.n(this.f28146a, ciVar.f28146a) && h.g.b.x.n(this.f28147b, ciVar.f28147b) && h.g.b.x.n(this.f28148c, ciVar.f28148c) && h.g.b.x.n(this.f28149d, ciVar.f28149d);
    }

    public final int hashCode() {
        return (((((this.f28146a.hashCode() * 31) + this.f28147b.hashCode()) * 31) + this.f28148c.hashCode()) * 31) + this.f28149d.hashCode();
    }

    public final String toString() {
        return "CornersPolygon(topLeft=" + this.f28146a + ", topRight=" + this.f28147b + ", bottomRight=" + this.f28148c + ", bottomLeft=" + this.f28149d + ")";
    }
}
