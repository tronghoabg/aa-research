package org.a.d.c;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final org.a.d.g.a f56386a;

    /* renamed from: b, reason: collision with root package name */
    private final org.a.d.e.b f56387b;

    public d(org.a.d.g.a aVar, org.a.d.e.b bVar) {
        x.f(aVar, "module");
        x.f(bVar, "factory");
        this.f56386a = aVar;
        this.f56387b = bVar;
    }

    public final org.a.d.e.b a() {
        return this.f56387b;
    }

    public final org.a.d.g.a b() {
        return this.f56386a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f56386a, dVar.f56386a) && x.n(this.f56387b, dVar.f56387b);
    }

    public final int hashCode() {
        return (this.f56386a.hashCode() * 31) + this.f56387b.hashCode();
    }

    public final String toString() {
        return "KoinDefinition(module=" + this.f56386a + ", factory=" + this.f56387b + ")";
    }
}
