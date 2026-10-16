package com.waze.z.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.ac.n f46145a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.ui.ac.i f46146b;

    /* renamed from: c, reason: collision with root package name */
    private final n f46147c;

    /* renamed from: d, reason: collision with root package name */
    private final a f46148d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f46149e;

    public /* synthetic */ m(com.waze.ui.ac.n nVar, com.waze.ui.ac.i iVar, n nVar2, a aVar, boolean z, int i2) {
        nVar2 = (i2 & 4) != 0 ? n.f46150a : nVar2;
        iVar = (i2 & 2) != 0 ? null : iVar;
        aVar = (i2 & 8) != 0 ? null : aVar;
        boolean z2 = (i2 & 16) == 0;
        h.g.b.x.f(nVar, "content");
        h.g.b.x.f(nVar2, "secondaryDescriptionColor");
        this.f46145a = nVar;
        this.f46146b = iVar;
        this.f46147c = nVar2;
        this.f46148d = aVar;
        this.f46149e = z & z2;
    }

    public final a a() {
        return this.f46148d;
    }

    public final n b() {
        return this.f46147c;
    }

    public final com.waze.ui.ac.i c() {
        return this.f46146b;
    }

    public final com.waze.ui.ac.n d() {
        return this.f46145a;
    }

    public final boolean e() {
        return this.f46149e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return h.g.b.x.n(this.f46145a, mVar.f46145a) && h.g.b.x.n(this.f46146b, mVar.f46146b) && this.f46147c == mVar.f46147c && h.g.b.x.n(this.f46148d, mVar.f46148d) && this.f46149e == mVar.f46149e;
    }

    public final int hashCode() {
        int iHashCode = this.f46145a.hashCode() * 31;
        com.waze.ui.ac.i iVar = this.f46146b;
        int iHashCode2 = (((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f46147c.hashCode()) * 31;
        a aVar = this.f46148d;
        return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + a.a.a(this.f46149e);
    }

    public final String toString() {
        return "SecondaryDescription(content=" + this.f46145a + ", icon=" + this.f46146b + ", secondaryDescriptionColor=" + this.f46147c + ", badge=" + this.f46148d + ", extraPadding=" + this.f46149e + ")";
    }
}
