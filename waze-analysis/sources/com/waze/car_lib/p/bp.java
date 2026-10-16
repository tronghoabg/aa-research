package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bp extends com.waze.car_lib.screens.bx {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f20650a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f20651b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(com.waze.av.a.p pVar, h.g.a.a aVar) {
        super(null);
        h.g.b.x.f(pVar, "wazeAddress");
        h.g.b.x.f(aVar, "onItemClicked");
        this.f20650a = pVar;
        this.f20651b = aVar;
    }

    public final com.waze.av.a.p a() {
        return this.f20650a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return h.g.b.x.n(this.f20650a, bpVar.f20650a) && h.g.b.x.n(this.f20651b, bpVar.f20651b);
    }

    public final int hashCode() {
        return (this.f20650a.hashCode() * 31) + this.f20651b.hashCode();
    }

    public final h.g.a.a l() {
        return this.f20651b;
    }

    public final String toString() {
        return "Other(wazeAddress=" + this.f20650a + ", onItemClicked=" + this.f20651b + ")";
    }
}
