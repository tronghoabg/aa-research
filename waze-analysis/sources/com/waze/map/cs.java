package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cs {

    /* renamed from: a, reason: collision with root package name */
    private final bc f28702a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28703b;

    private cs(bc bcVar, String str) {
        h.g.b.x.f(bcVar, "marker");
        this.f28702a = bcVar;
        this.f28703b = str;
    }

    public final bc a() {
        return this.f28702a;
    }

    public final String b() {
        return this.f28703b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs)) {
            return false;
        }
        cs csVar = (cs) obj;
        if (!h.g.b.x.n(this.f28702a, csVar.f28702a)) {
            return false;
        }
        String str = this.f28703b;
        String str2 = csVar.f28703b;
        return str != null ? !(str2 == null || !h.g.b.x.n(str, str2)) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f28702a.hashCode() * 31;
        String str = this.f28703b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f28703b;
        String strB = str == null ? "null" : ct.b(str);
        return "MapMarkerForPresenter(marker=" + this.f28702a + ", idForClicks=" + strB + ")";
    }

    public /* synthetic */ cs(bc bcVar, String str, byte[] bArr) {
        this(bcVar, str);
    }

    public /* synthetic */ cs(bc bcVar) {
        this(bcVar, null);
    }
}
