package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class w extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.search.d.a.a.a f35965a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(com.waze.search.d.a.a.a aVar) {
        super(null);
        h.g.b.x.f(aVar, "categoryGroupItem");
        this.f35965a = aVar;
    }

    public final com.waze.search.d.a.a.a a() {
        return this.f35965a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && h.g.b.x.n(this.f35965a, ((w) obj).f35965a);
    }

    public final int hashCode() {
        return this.f35965a.hashCode();
    }

    public final String toString() {
        return "OpenCategory(categoryGroupItem=" + this.f35965a + ")";
    }
}
