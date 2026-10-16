package com.waze.car_lib.p;

import androidx.car.app.model.CarColor;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bv {

    /* renamed from: a, reason: collision with root package name */
    private final String f20662a;

    /* renamed from: b, reason: collision with root package name */
    private final CarColor f20663b;

    /* renamed from: c, reason: collision with root package name */
    private final String f20664c;

    public bv(String str, CarColor carColor, String str2) {
        h.g.b.x.f(str, "value");
        h.g.b.x.f(carColor, "color");
        h.g.b.x.f(str2, "updatedDaysAgo");
        this.f20662a = str;
        this.f20663b = carColor;
        this.f20664c = str2;
    }

    public final CarColor a() {
        return this.f20663b;
    }

    public final String b() {
        return this.f20664c;
    }

    public final String c() {
        return this.f20662a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv)) {
            return false;
        }
        bv bvVar = (bv) obj;
        return h.g.b.x.n(this.f20662a, bvVar.f20662a) && h.g.b.x.n(this.f20663b, bvVar.f20663b) && h.g.b.x.n(this.f20664c, bvVar.f20664c);
    }

    public final int hashCode() {
        return (((this.f20662a.hashCode() * 31) + this.f20663b.hashCode()) * 31) + this.f20664c.hashCode();
    }

    public final String toString() {
        return "GasPrice(value=" + this.f20662a + ", color=" + this.f20663b + ", updatedDaysAgo=" + this.f20664c + ")";
    }
}
