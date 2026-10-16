package com.waze.map;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cu {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.fi f28705a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28706b;

    private cu(com.waze.map.b.fi fiVar, String str) {
        h.g.b.x.f(fiVar, "polyline");
        this.f28705a = fiVar;
        this.f28706b = str;
    }

    public final com.waze.map.b.fi a() {
        return this.f28705a;
    }

    public final String b() {
        return this.f28706b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return false;
        }
        cu cuVar = (cu) obj;
        if (!h.g.b.x.n(this.f28705a, cuVar.f28705a)) {
            return false;
        }
        String str = this.f28706b;
        String str2 = cuVar.f28706b;
        return str != null ? !(str2 == null || !h.g.b.x.n(str, str2)) : str2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f28705a.hashCode() * 31;
        String str = this.f28706b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.f28706b;
        String strB = str == null ? "null" : ct.b(str);
        return "MapPolylineForPresenter(polyline=" + this.f28705a + ", idForClicks=" + strB + ")";
    }

    public /* synthetic */ cu(com.waze.map.b.fi fiVar, String str, byte[] bArr) {
        this(fiVar, str);
    }

    public /* synthetic */ cu(com.waze.map.b.fi fiVar) {
        this(fiVar, null);
    }
}
