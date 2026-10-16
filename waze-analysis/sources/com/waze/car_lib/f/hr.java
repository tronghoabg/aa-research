package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class hr extends com.waze.car_lib.p.dh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.aa f19682a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr(com.waze.av.b.aa aaVar) {
        super(null);
        h.g.b.x.f(aaVar, "wazePlace");
        this.f19682a = aaVar;
    }

    public final com.waze.av.b.aa a() {
        return this.f19682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hr) && h.g.b.x.n(this.f19682a, ((hr) obj).f19682a);
    }

    public final int hashCode() {
        return this.f19682a.hashCode();
    }

    public final String toString() {
        return "OpenDeleteRecentDestination(wazePlace=" + this.f19682a + ")";
    }
}
