package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bm implements bn {

    /* renamed from: a, reason: collision with root package name */
    private final aa f42582a;

    /* renamed from: b, reason: collision with root package name */
    private final r f42583b;

    public bm(aa aaVar, r rVar) {
        h.g.b.x.f(aaVar, "miniFull");
        h.g.b.x.f(rVar, "compact");
        this.f42582a = aaVar;
        this.f42583b = rVar;
    }

    public final r a() {
        return this.f42583b;
    }

    public final aa b() {
        return this.f42582a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return h.g.b.x.n(this.f42582a, bmVar.f42582a) && h.g.b.x.n(this.f42583b, bmVar.f42583b);
    }

    public final int hashCode() {
        return (this.f42582a.hashCode() * 31) + this.f42583b.hashCode();
    }

    public final String toString() {
        return "Split(miniFull=" + this.f42582a + ", compact=" + this.f42583b + ")";
    }
}
