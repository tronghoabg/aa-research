package com.waze.ui.m;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.i f42844a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.n f42845b;

    public c(com.waze.ui.ac.i iVar, com.waze.ui.ac.n nVar) {
        h.g.b.x.f(iVar, "source");
        h.g.b.x.f(nVar, "text");
        this.f42844a = iVar;
        this.f42845b = nVar;
    }

    public final com.waze.ui.ac.i a() {
        return this.f42844a;
    }

    public final com.waze.ui.ac.n b() {
        return this.f42845b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return h.g.b.x.n(this.f42844a, cVar.f42844a) && h.g.b.x.n(this.f42845b, cVar.f42845b);
    }

    public final int hashCode() {
        return (this.f42844a.hashCode() * 31) + this.f42845b.hashCode();
    }

    public final String toString() {
        return "Attribution(source=" + this.f42844a + ", text=" + this.f42845b + ")";
    }
}
