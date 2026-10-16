package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cw implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final int f28171a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28172b;

    public cw(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28171a = i2;
        this.f28172b = cVar;
    }

    public final int a() {
        return this.f28171a;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28172b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw)) {
            return false;
        }
        cw cwVar = (cw) obj;
        return this.f28171a == cwVar.f28171a && h.g.b.x.n(this.f28172b, cwVar.f28172b);
    }

    public final int hashCode() {
        return (this.f28171a * 31) + this.f28172b.hashCode();
    }

    public final String toString() {
        return "ExternalPoiClicked(id=" + this.f28171a + ", coordinate=" + this.f28172b + ")";
    }
}
