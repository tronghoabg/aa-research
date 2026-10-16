package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class dc implements cz {

    /* renamed from: a, reason: collision with root package name */
    private final int f28182a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28183b;

    public dc(int i2, com.waze.shared_infra.h.c cVar) {
        h.g.b.x.f(cVar, "coordinate");
        this.f28182a = i2;
        this.f28183b = cVar;
    }

    public final int a() {
        return this.f28182a;
    }

    public final com.waze.shared_infra.h.c b() {
        return this.f28183b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc)) {
            return false;
        }
        dc dcVar = (dc) obj;
        return this.f28182a == dcVar.f28182a && h.g.b.x.n(this.f28183b, dcVar.f28183b);
    }

    public final int hashCode() {
        return (this.f28182a * 31) + this.f28183b.hashCode();
    }

    public final String toString() {
        return "ParkingClicked(id=" + this.f28182a + ", coordinate=" + this.f28183b + ")";
    }
}
