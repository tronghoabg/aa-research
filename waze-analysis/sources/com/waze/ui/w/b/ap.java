package com.waze.ui.w.b;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ap extends com.waze.ui.x.u {

    /* renamed from: a, reason: collision with root package name */
    private final int f43596a;

    /* renamed from: b, reason: collision with root package name */
    private final bh f43597b;

    /* renamed from: c, reason: collision with root package name */
    private final List f43598c;

    /* renamed from: d, reason: collision with root package name */
    private final long f43599d;

    /* renamed from: e, reason: collision with root package name */
    private final long f43600e;

    /* renamed from: f, reason: collision with root package name */
    private final au f43601f;

    public ap(int i2, bh bhVar, List list, long j2, long j3, au auVar) {
        h.g.b.x.f(bhVar, "categoryType");
        h.g.b.x.f(list, "items");
        this.f43596a = i2;
        this.f43597b = bhVar;
        this.f43598c = list;
        this.f43599d = j2;
        this.f43600e = j3;
        this.f43601f = auVar;
    }

    public static /* synthetic */ ap g(ap apVar, au auVar) {
        bh bhVar = apVar.f43597b;
        h.g.b.x.f(bhVar, "categoryType");
        List list = apVar.f43598c;
        h.g.b.x.f(list, "items");
        return new ap(apVar.f43596a, bhVar, list, apVar.f43599d, apVar.f43600e, auVar);
    }

    @Override // com.waze.ui.x.u
    public final List a() {
        return this.f43598c;
    }

    public final int b() {
        return this.f43596a;
    }

    public final long c() {
        return this.f43600e;
    }

    public final long d() {
        return this.f43599d;
    }

    public final au e() {
        return this.f43601f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap)) {
            return false;
        }
        ap apVar = (ap) obj;
        return this.f43596a == apVar.f43596a && this.f43597b == apVar.f43597b && h.g.b.x.n(this.f43598c, apVar.f43598c) && this.f43599d == apVar.f43599d && this.f43600e == apVar.f43600e && h.g.b.x.n(this.f43601f, apVar.f43601f);
    }

    public final bh f() {
        return this.f43597b;
    }

    public final int hashCode() {
        int iHashCode = (((this.f43596a * 31) + this.f43597b.hashCode()) * 31) + this.f43598c.hashCode();
        au auVar = this.f43601f;
        return (((((iHashCode * 31) + a.a.b(this.f43599d)) * 31) + a.a.b(this.f43600e)) * 31) + (auVar == null ? 0 : auVar.hashCode());
    }

    public final String toString() {
        return "Submenu(titleResId=" + this.f43596a + ", categoryType=" + this.f43597b + ", items=" + this.f43598c + ", timerStartEpochMillis=" + this.f43599d + ", timerDurationMillis=" + this.f43600e + ", selectedItem=" + this.f43601f + ")";
    }
}
