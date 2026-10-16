package com.waze.ui;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e extends f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f42170a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42171b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.ac.i f42172c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.l f42173d;

    public /* synthetic */ e(com.waze.ui.ac.n nVar, boolean z, h.g.a.l lVar, int i2) {
        h.g.b.x.f(nVar, "label");
        h.g.b.x.f(lVar, "onSelect");
        this.f42170a = nVar;
        this.f42171b = ((i2 & 2) == 0) & z;
        this.f42172c = null;
        this.f42173d = lVar;
    }

    public final com.waze.ui.ac.n a() {
        return this.f42170a;
    }

    public final h.g.a.l b() {
        return this.f42173d;
    }

    public final boolean c() {
        return this.f42171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!h.g.b.x.n(this.f42170a, eVar.f42170a) || this.f42171b != eVar.f42171b) {
            return false;
        }
        com.waze.ui.ac.i iVar = eVar.f42172c;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f42173d, eVar.f42173d);
    }

    public final int hashCode() {
        return (((this.f42170a.hashCode() * 31) + a.a.a(this.f42171b)) * 961) + this.f42173d.hashCode();
    }

    public final String toString() {
        return "SingleChoiceMode(label=" + this.f42170a + ", selected=" + this.f42171b + ", icon=null, onSelect=" + this.f42173d + ")";
    }
}
