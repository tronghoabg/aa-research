package com.waze.alerters.b;

import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final List f14223a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.alerters.a.c f14224b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f14225c;

    public d(List list, com.waze.alerters.a.c cVar, com.waze.shared_infra.h.c cVar2) {
        x.f(list, "alerts");
        this.f14223a = list;
        this.f14224b = cVar;
        this.f14225c = cVar2;
    }

    public static final d d(List list, com.waze.alerters.a.c cVar, com.waze.shared_infra.h.c cVar2) {
        x.f(list, "alerts");
        return new d(list, cVar, cVar2);
    }

    public final com.waze.alerters.a.c a() {
        return this.f14224b;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f14225c;
    }

    public final List c() {
        return this.f14223a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return x.n(this.f14223a, dVar.f14223a) && x.n(this.f14224b, dVar.f14224b) && x.n(this.f14225c, dVar.f14225c);
    }

    public final int hashCode() {
        int iHashCode = this.f14223a.hashCode() * 31;
        com.waze.alerters.a.c cVar = this.f14224b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        com.waze.shared_infra.h.c cVar2 = this.f14225c;
        return iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        return "State(alerts=" + this.f14223a + ", selected=" + this.f14224b + ", lastSelectedPosition=" + this.f14225c + ")";
    }
}
