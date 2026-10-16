package com.waze.car_lib.r;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fb {

    /* renamed from: a, reason: collision with root package name */
    private final String f21620a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21621b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21622c;

    /* renamed from: d, reason: collision with root package name */
    private final String f21623d;

    public fb(String str, String str2, String str3, String str4) {
        h.g.b.x.f(str3, "defaultTollStr");
        h.g.b.x.f(str4, "routeUUID");
        this.f21620a = str;
        this.f21621b = str2;
        this.f21622c = str3;
        this.f21623d = str4;
    }

    public final String a() {
        return this.f21622c;
    }

    public final String b() {
        return this.f21620a;
    }

    public final String c() {
        return this.f21623d;
    }

    public final String d() {
        return this.f21621b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return h.g.b.x.n(this.f21620a, fbVar.f21620a) && h.g.b.x.n(this.f21621b, fbVar.f21621b) && h.g.b.x.n(this.f21622c, fbVar.f21622c) && h.g.b.x.n(this.f21623d, fbVar.f21623d);
    }

    public final int hashCode() {
        String str = this.f21620a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f21621b;
        return (((((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f21622c.hashCode()) * 31) + this.f21623d.hashCode();
    }

    public final String toString() {
        return "TollInfoState(dynamicTollStr=" + this.f21620a + ", tollPriceStr=" + this.f21621b + ", defaultTollStr=" + this.f21622c + ", routeUUID=" + this.f21623d + ")";
    }
}
