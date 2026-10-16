package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.aa f17285a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17286b;

    public d(com.waze.av.b.aa aaVar, String str) {
        h.g.b.x.f(aaVar, "wazePlace");
        this.f17285a = aaVar;
        this.f17286b = str;
    }

    public final com.waze.av.b.aa a() {
        return this.f17285a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return h.g.b.x.n(this.f17285a, dVar.f17285a) && h.g.b.x.n(this.f17286b, dVar.f17286b);
    }

    public final int hashCode() {
        int iHashCode = this.f17285a.hashCode() * 31;
        String str = this.f17286b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Favorite(wazePlace=" + this.f17285a + ", entranceName=" + this.f17286b + ")";
    }
}
