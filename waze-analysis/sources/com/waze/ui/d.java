package com.waze.ui;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d extends f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42127a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42128b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f42129c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.p f42130d;

    public d(com.waze.ui.ac.n nVar, boolean z, com.waze.ui.ac.i iVar, h.g.a.p pVar) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(pVar, "onSelect");
        this.f42127a = nVar;
        this.f42128b = z;
        this.f42129c = iVar;
        this.f42130d = pVar;
    }

    public final com.waze.ui.ac.i a() {
        return this.f42129c;
    }

    public final com.waze.ui.ac.n b() {
        return this.f42127a;
    }

    public final h.g.a.p c() {
        return this.f42130d;
    }

    public final boolean d() {
        return this.f42128b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f42127a, dVar.f42127a) && this.f42128b == dVar.f42128b && h.g.b.x.n(this.f42129c, dVar.f42129c) && h.g.b.x.n(this.f42130d, dVar.f42130d);
    }

    public final int hashCode() {
        int iHashCode = this.f42127a.hashCode() * 31;
        com.waze.ui.ac.i iVar = this.f42129c;
        return ((((iHashCode + a.a.a(this.f42128b)) * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f42130d.hashCode();
    }

    public final String toString() {
        return "MultiChoiceMode(label=" + this.f42127a + ", selected=" + this.f42128b + ", icon=" + this.f42129c + ", onSelect=" + this.f42130d + ")";
    }

    public /* synthetic */ d(com.waze.ui.ac.n nVar, boolean z, h.g.a.p pVar) {
        this(nVar, z, null, pVar);
    }
}
