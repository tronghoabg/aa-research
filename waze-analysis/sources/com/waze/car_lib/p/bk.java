package com.waze.car_lib.p;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bk {

    /* renamed from: a, reason: collision with root package name */
    private final Double f20636a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20637b;

    public bk(Double d2, String str) {
        this.f20636a = d2;
        this.f20637b = str;
    }

    public final Double a() {
        return this.f20636a;
    }

    public final String b() {
        return this.f20637b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk)) {
            return false;
        }
        bk bkVar = (bk) obj;
        return h.g.b.x.n(this.f20636a, bkVar.f20636a) && h.g.b.x.n(this.f20637b, bkVar.f20637b);
    }

    public final int hashCode() {
        Double d2 = this.f20636a;
        int iHashCode = d2 == null ? 0 : d2.hashCode();
        String str = this.f20637b;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "TollInfo(price=" + this.f20636a + ", currencyCode=" + this.f20637b + ")";
    }
}
