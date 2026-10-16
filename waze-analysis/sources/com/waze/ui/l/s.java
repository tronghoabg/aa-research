package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f42722a;

    /* renamed from: b, reason: collision with root package name */
    private final h.g.a.a f42723b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f42724c;

    /* renamed from: d, reason: collision with root package name */
    private final ac f42725d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.design_components.b.d f42726e;

    public s(String str, h.g.a.a aVar, boolean z, ac acVar, com.waze.design_components.b.d dVar) {
        h.g.b.x.f(str, "label");
        h.g.b.x.f(aVar, "onClick");
        this.f42722a = str;
        this.f42723b = aVar;
        this.f42724c = z;
        this.f42725d = acVar;
        this.f42726e = dVar;
    }

    public final com.waze.design_components.b.d a() {
        return this.f42726e;
    }

    public final ac b() {
        return this.f42725d;
    }

    public final String c() {
        return this.f42722a;
    }

    public final h.g.a.a d() {
        return this.f42723b;
    }

    public final boolean e() {
        return this.f42724c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return h.g.b.x.n(this.f42722a, sVar.f42722a) && h.g.b.x.n(this.f42723b, sVar.f42723b) && this.f42724c == sVar.f42724c && h.g.b.x.n(this.f42725d, sVar.f42725d) && this.f42726e == sVar.f42726e;
    }

    public final int hashCode() {
        int iHashCode = (this.f42722a.hashCode() * 31) + this.f42723b.hashCode();
        ac acVar = this.f42725d;
        int iA = ((((iHashCode * 31) + a.a.a(this.f42724c)) * 31) + (acVar == null ? 0 : acVar.hashCode())) * 31;
        com.waze.design_components.b.d dVar = this.f42726e;
        return iA + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "Button(label=" + this.f42722a + ", onClick=" + this.f42723b + ", isPrimaryColor=" + this.f42724c + ", timeout=" + this.f42725d + ", icon=" + this.f42726e + ")";
    }
}
