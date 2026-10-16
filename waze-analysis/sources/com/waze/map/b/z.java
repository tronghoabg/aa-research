package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class z extends com.waze.install.ah {

    /* renamed from: a, reason: collision with root package name */
    private final int f28375a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28376b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i2, com.waze.shared_infra.h.c cVar) {
        super(null);
        h.g.b.x.f(cVar, "coordinate");
        this.f28375a = i2;
        this.f28376b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return this.f28375a == zVar.f28375a && h.g.b.x.n(this.f28376b, zVar.f28376b);
    }

    public final int f() {
        return this.f28375a;
    }

    public final com.waze.shared_infra.h.c g() {
        return this.f28376b;
    }

    public final int hashCode() {
        return (this.f28375a * 31) + this.f28376b.hashCode();
    }

    public final String toString() {
        return "ParkingClick(id=" + this.f28375a + ", coordinate=" + this.f28376b + ")";
    }
}
