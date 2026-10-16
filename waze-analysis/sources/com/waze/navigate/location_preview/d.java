package com.waze.navigate.location_preview;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31713a;

    /* renamed from: b, reason: collision with root package name */
    private final int f31714b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31715c;

    /* renamed from: d, reason: collision with root package name */
    private final e f31716d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f31717e;

    public d(String str, int i2, boolean z, e eVar, Integer num) {
        h.g.b.x.f(str, "typeId");
        this.f31713a = str;
        this.f31714b = i2;
        this.f31715c = z;
        this.f31716d = eVar;
        this.f31717e = num;
    }

    public final int a() {
        return this.f31714b;
    }

    public final e b() {
        return this.f31716d;
    }

    public final Integer c() {
        return this.f31717e;
    }

    public final String d() {
        return this.f31713a;
    }

    public final boolean e() {
        return this.f31715c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f31713a, dVar.f31713a) && this.f31714b == dVar.f31714b && this.f31715c == dVar.f31715c && h.g.b.x.n(this.f31716d, dVar.f31716d) && h.g.b.x.n(this.f31717e, dVar.f31717e);
    }

    public final int hashCode() {
        int iHashCode = this.f31713a.hashCode() * 31;
        e eVar = this.f31716d;
        int iA = (((((iHashCode + this.f31714b) * 31) + a.a.a(this.f31715c)) * 31) + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Integer num = this.f31717e;
        return iA + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "EVPlugOverviewModel(typeId=" + this.f31713a + ", count=" + this.f31714b + ", isCompatible=" + this.f31715c + ", speed=" + this.f31716d + ", availableCount=" + this.f31717e + ")";
    }
}
