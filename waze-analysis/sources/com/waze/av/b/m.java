package com.waze.av.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class m extends n {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.a.p f15987a;

    public m(com.waze.av.a.p pVar) {
        h.g.b.x.f(pVar, "wazeAddress");
        this.f15987a = pVar;
    }

    @Override // com.waze.av.b.n
    public final com.waze.av.a.p e() {
        return this.f15987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && h.g.b.x.n(this.f15987a, ((m) obj).f15987a);
    }

    public final int hashCode() {
        return this.f15987a.hashCode();
    }

    public final String toString() {
        return "StandardPlace(wazeAddress=" + this.f15987a + ")";
    }
}
