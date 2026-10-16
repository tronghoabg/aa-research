package com.waze.br.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.d.k f17287a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17288b;

    public e(com.waze.av.d.k kVar, String str) {
        h.g.b.x.f(kVar, "venueExtendedData");
        this.f17287a = kVar;
        this.f17288b = str;
    }

    public final com.waze.av.d.k a() {
        return this.f17287a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return h.g.b.x.n(this.f17287a, eVar.f17287a) && h.g.b.x.n(this.f17288b, eVar.f17288b);
    }

    public final int hashCode() {
        int iHashCode = this.f17287a.hashCode() * 31;
        String str = this.f17288b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SearchResult(venueExtendedData=" + this.f17287a + ", entranceName=" + this.f17288b + ")";
    }
}
