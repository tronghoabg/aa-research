package com.waze.location.b;

import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sharedui.e.c f25304a;

    /* renamed from: b, reason: collision with root package name */
    private final long f25305b;

    /* renamed from: c, reason: collision with root package name */
    private final b f25306c;

    public /* synthetic */ c(com.waze.sharedui.e.c cVar, long j2, b bVar) {
        x.f(cVar, "wazeLocation");
        x.f(bVar, "provider");
        this.f25304a = cVar;
        this.f25305b = j2;
        this.f25306c = bVar;
    }

    public final long a() {
        return this.f25305b;
    }

    public final b b() {
        return this.f25306c;
    }

    public final com.waze.sharedui.e.c c() {
        return this.f25304a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return x.n(this.f25304a, cVar.f25304a) && h.o.a.A(this.f25305b, cVar.f25305b) && this.f25306c == cVar.f25306c;
    }

    public final int hashCode() {
        int iHashCode = this.f25304a.hashCode() * 31;
        h.o.c cVar = h.o.a.f48264a;
        return ((iHashCode + a.a.b(this.f25305b)) * 31) + this.f25306c.hashCode();
    }

    public final String toString() {
        return "ResolvedLocation(wazeLocation=" + this.f25304a + ", fetchDuration=" + h.o.a.y(this.f25305b) + ", provider=" + this.f25306c + ")";
    }
}
