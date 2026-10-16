package com.waze.ui.u;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ah {

    /* renamed from: a, reason: collision with root package name */
    private final u f43433a;

    /* renamed from: b, reason: collision with root package name */
    private final v f43434b;

    /* renamed from: c, reason: collision with root package name */
    private final z f43435c;

    public ah(u uVar, v vVar, z zVar) {
        h.g.b.x.f(uVar, "address");
        h.g.b.x.f(vVar, "coordinates");
        this.f43433a = uVar;
        this.f43434b = vVar;
        this.f43435c = zVar;
    }

    public final u a() {
        return this.f43433a;
    }

    public final v b() {
        return this.f43434b;
    }

    public final z c() {
        return this.f43435c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah)) {
            return false;
        }
        ah ahVar = (ah) obj;
        return h.g.b.x.n(this.f43433a, ahVar.f43433a) && h.g.b.x.n(this.f43434b, ahVar.f43434b) && h.g.b.x.n(this.f43435c, ahVar.f43435c);
    }

    public final int hashCode() {
        int iHashCode = (this.f43433a.hashCode() * 31) + this.f43434b.hashCode();
        z zVar = this.f43435c;
        return (iHashCode * 31) + (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        return "UiDestination(address=" + this.f43433a + ", coordinates=" + this.f43434b + ", favoriteInfo=" + this.f43435c + ")";
    }
}
