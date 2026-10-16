package com.waze.car_lib.n;

import com.waze.car_lib.r.cq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai extends cq {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.aa f20363a;

    public ai(com.waze.av.b.aa aaVar) {
        h.g.b.x.f(aaVar, "wazePlace");
        this.f20363a = aaVar;
    }

    public final com.waze.av.b.aa a() {
        return this.f20363a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ai) && h.g.b.x.n(this.f20363a, ((ai) obj).f20363a);
    }

    public final int hashCode() {
        return this.f20363a.hashCode();
    }

    public final String toString() {
        return "WorkItem(wazePlace=" + this.f20363a + ")";
    }
}
