package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    private final String f20677a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20678b;

    public bx(String str, String str2) {
        h.g.b.x.f(str, "time");
        h.g.b.x.f(str2, "rate");
        this.f20677a = str;
        this.f20678b = str2;
    }

    public final String a() {
        return this.f20678b;
    }

    public final String b() {
        return this.f20677a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx)) {
            return false;
        }
        bx bxVar = (bx) obj;
        return h.g.b.x.n(this.f20677a, bxVar.f20677a) && h.g.b.x.n(this.f20678b, bxVar.f20678b);
    }

    public final int hashCode() {
        return (this.f20677a.hashCode() * 31) + this.f20678b.hashCode();
    }

    public final String toString() {
        return "ParkingPrice(time=" + this.f20677a + ", rate=" + this.f20678b + ")";
    }
}
