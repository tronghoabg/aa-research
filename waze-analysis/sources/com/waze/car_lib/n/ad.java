package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.w.i f20357a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f20358b;

    public ad(com.waze.w.i iVar, Integer num) {
        h.g.b.x.f(iVar, "result");
        this.f20357a = iVar;
        this.f20358b = num;
    }

    public final com.waze.w.i a() {
        return this.f20357a;
    }

    public final com.waze.w.i b() {
        return this.f20357a;
    }

    public final Integer c() {
        return this.f20358b;
    }

    public final Integer d() {
        return this.f20358b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        return h.g.b.x.n(this.f20357a, adVar.f20357a) && h.g.b.x.n(this.f20358b, adVar.f20358b);
    }

    public final int hashCode() {
        int iHashCode = this.f20357a.hashCode() * 31;
        Integer num = this.f20358b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "AutoCompleteItem(result=" + this.f20357a + ", distanceMeters=" + this.f20358b + ")";
    }
}
