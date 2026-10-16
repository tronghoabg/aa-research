package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class h implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.c.l f17290a;

    public h(com.waze.av.c.l lVar) {
        h.g.b.x.f(lVar, "searchV2ResultsResponse");
        this.f17290a = lVar;
    }

    public final com.waze.av.c.l a() {
        return this.f17290a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && h.g.b.x.n(this.f17290a, ((h) obj).f17290a);
    }

    public final int hashCode() {
        return this.f17290a.hashCode();
    }

    public final String toString() {
        return "SearchResults(searchV2ResultsResponse=" + this.f17290a + ")";
    }
}
