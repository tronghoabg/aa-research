package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ga {

    /* renamed from: a, reason: collision with root package name */
    private final Double f31403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31404b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31405c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31406d;

    public ga(Double d2, String str, boolean z, String str2) {
        h.g.b.x.f(str2, "routeUUID");
        this.f31403a = d2;
        this.f31404b = str;
        this.f31405c = z;
        this.f31406d = str2;
    }

    public final Double a() {
        return this.f31403a;
    }

    public final String b() {
        return this.f31404b;
    }

    public final String c() {
        return this.f31406d;
    }

    public final boolean d() {
        return this.f31405c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga)) {
            return false;
        }
        ga gaVar = (ga) obj;
        return h.g.b.x.n(this.f31403a, gaVar.f31403a) && h.g.b.x.n(this.f31404b, gaVar.f31404b) && this.f31405c == gaVar.f31405c && h.g.b.x.n(this.f31406d, gaVar.f31406d);
    }

    public final int hashCode() {
        Double d2 = this.f31403a;
        int iHashCode = d2 == null ? 0 : d2.hashCode();
        String str = this.f31404b;
        return (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + a.a.a(this.f31405c)) * 31) + this.f31406d.hashCode();
    }

    public final String toString() {
        return "TollInfoState(price=" + this.f31403a + ", currencyCode=" + this.f31404b + ", isDynamicPrice=" + this.f31405c + ", routeUUID=" + this.f31406d + ")";
    }
}
