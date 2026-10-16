package com.waze.car_lib.i.c;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private final e f20141a;

    /* renamed from: b, reason: collision with root package name */
    private final e f20142b;

    public u(e eVar, e eVar2) {
        this.f20141a = eVar;
        this.f20142b = eVar2;
    }

    public static /* synthetic */ u c(u uVar, e eVar, e eVar2, int i2) {
        if ((i2 & 1) != 0) {
            eVar = uVar.f20141a;
        }
        if ((i2 & 2) != 0) {
            eVar2 = uVar.f20142b;
        }
        return new u(eVar, eVar2);
    }

    public final e a() {
        return this.f20142b;
    }

    public final e b() {
        return this.f20141a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return h.g.b.x.n(this.f20141a, uVar.f20141a) && h.g.b.x.n(this.f20142b, uVar.f20142b);
    }

    public final int hashCode() {
        e eVar = this.f20141a;
        int iHashCode = eVar == null ? 0 : eVar.hashCode();
        e eVar2 = this.f20142b;
        return (iHashCode * 31) + (eVar2 != null ? eVar2.hashCode() : 0);
    }

    public final String toString() {
        return "InternalState(street=" + this.f20141a + ", segment=" + this.f20142b + ")";
    }
}
