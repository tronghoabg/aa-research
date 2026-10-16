package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class o implements q {

    /* renamed from: a, reason: collision with root package name */
    private final h.g.a.a f42714a;

    /* renamed from: b, reason: collision with root package name */
    private final ac f42715b;

    public o(h.g.a.a aVar, ac acVar) {
        h.g.b.x.f(aVar, "onClick");
        this.f42714a = aVar;
        this.f42715b = acVar;
    }

    @Override // com.waze.ui.l.q
    public final ac a() {
        return this.f42715b;
    }

    public final h.g.a.a b() {
        return this.f42714a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return h.g.b.x.n(this.f42714a, oVar.f42714a) && h.g.b.x.n(this.f42715b, oVar.f42715b);
    }

    public final int hashCode() {
        return (this.f42714a.hashCode() * 31) + this.f42715b.hashCode();
    }

    public final String toString() {
        return "Button(onClick=" + this.f42714a + ", timeout=" + this.f42715b + ")";
    }
}
