package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hb extends com.waze.car_lib.o.ae {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.car_lib.n.v f19644a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(com.waze.car_lib.n.v vVar) {
        super(null);
        h.g.b.x.f(vVar, "query");
        this.f19644a = vVar;
    }

    public final com.waze.car_lib.n.v a() {
        return this.f19644a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb) && h.g.b.x.n(this.f19644a, ((hb) obj).f19644a);
    }

    public final int hashCode() {
        return this.f19644a.hashCode();
    }

    public final String toString() {
        return "OpenSearchResults(query=" + this.f19644a + ")";
    }
}
