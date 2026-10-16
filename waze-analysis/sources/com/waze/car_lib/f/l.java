package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class l extends com.waze.copilot.data.b.k {

    /* renamed from: a, reason: collision with root package name */
    private final jc f19769a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(jc jcVar) {
        super(null);
        h.g.b.x.f(jcVar, "params");
        this.f19769a = jcVar;
    }

    public final jc a() {
        return this.f19769a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && h.g.b.x.n(this.f19769a, ((l) obj).f19769a);
    }

    public final int hashCode() {
        return this.f19769a.hashCode();
    }

    public final String toString() {
        return "RoutesSelector(params=" + this.f19769a + ")";
    }
}
