package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.e.p f35766a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.av.b.n f35767b;

    public ae(com.waze.search.e.p pVar, com.waze.av.b.n nVar) {
        h.g.b.x.f(pVar, "searchListItem");
        h.g.b.x.f(nVar, "genericPlace");
        this.f35766a = pVar;
        this.f35767b = nVar;
    }

    public final com.waze.av.b.n a() {
        return this.f35767b;
    }

    public final com.waze.search.e.p b() {
        return this.f35766a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ae)) {
            return false;
        }
        ae aeVar = (ae) obj;
        return h.g.b.x.n(this.f35766a, aeVar.f35766a) && h.g.b.x.n(this.f35767b, aeVar.f35767b);
    }

    public final int hashCode() {
        return (this.f35766a.hashCode() * 31) + this.f35767b.hashCode();
    }

    public final String toString() {
        return "LongClickedItem(searchListItem=" + this.f35766a + ", genericPlace=" + this.f35767b + ")";
    }
}
