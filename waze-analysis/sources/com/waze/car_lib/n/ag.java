package com.waze.car_lib.n;

import com.waze.car_lib.r.cq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ag extends cq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.aa f20361a;

    public ag(com.waze.av.b.aa aaVar) {
        h.g.b.x.f(aaVar, "wazePlace");
        this.f20361a = aaVar;
    }

    public final com.waze.av.b.aa a() {
        return this.f20361a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ag) && h.g.b.x.n(this.f20361a, ((ag) obj).f20361a);
    }

    public final int hashCode() {
        return this.f20361a.hashCode();
    }

    public final String toString() {
        return "HomeItem(wazePlace=" + this.f20361a + ")";
    }
}
