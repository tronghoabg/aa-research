package com.waze.search.h;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class x extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.av.b.n f35966a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.j.n f35967b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f35968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.waze.av.b.n nVar, com.waze.j.n nVar2, boolean z) {
        super(null);
        h.g.b.x.f(nVar, "genericPlace");
        this.f35966a = nVar;
        this.f35967b = nVar2;
        this.f35968c = z;
    }

    public final com.waze.j.n a() {
        return this.f35967b;
    }

    public final com.waze.av.b.n b() {
        return this.f35966a;
    }

    public final boolean c() {
        return this.f35968c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return h.g.b.x.n(this.f35966a, xVar.f35966a) && h.g.b.x.n(this.f35967b, xVar.f35967b) && this.f35968c == xVar.f35968c;
    }

    public final int hashCode() {
        int iHashCode = this.f35966a.hashCode() * 31;
        com.waze.j.n nVar = this.f35967b;
        return ((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + a.a.a(this.f35968c);
    }

    public final String toString() {
        return "OpenLocationPreview(genericPlace=" + this.f35966a + ", serverProvidedDistance=" + this.f35967b + ", addStopMode=" + this.f35968c + ")";
    }
}
