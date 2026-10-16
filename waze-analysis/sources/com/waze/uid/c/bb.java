package com.waze.uid.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    private final bm f44241a;

    /* renamed from: b, reason: collision with root package name */
    private final bc f44242b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44243c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.tide.s f44244d;

    public bb(bm bmVar, bc bcVar, com.waze.tide.s sVar, boolean z) {
        h.g.b.x.f(bmVar, "viewType");
        h.g.b.x.f(bmVar, "viewType");
        this.f44241a = bmVar;
        this.f44242b = bcVar;
        this.f44244d = sVar;
        this.f44243c = z;
    }

    public final bb a(bc bcVar) {
        return new bb(this.f44241a, bcVar, this.f44244d, this.f44243c);
    }

    public final bc b() {
        return this.f44242b;
    }

    public final bm c() {
        return this.f44241a;
    }

    public final boolean d() {
        return this.f44243c;
    }

    public final com.waze.tide.s e() {
        return this.f44244d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.f44241a == bbVar.f44241a && this.f44242b == bbVar.f44242b && h.g.b.x.n(this.f44244d, bbVar.f44244d);
    }

    public final int hashCode() {
        int iHashCode = this.f44241a.hashCode() * 31;
        bc bcVar = this.f44242b;
        int iHashCode2 = (iHashCode + (bcVar == null ? 0 : bcVar.hashCode())) * 31;
        com.waze.tide.s sVar = this.f44244d;
        return iHashCode2 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "EmailControllerUiState(" + this.f44241a + ", " + this.f44242b + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bb(bm bmVar, com.waze.tide.s sVar, com.waze.uid.e.e eVar) {
        this(bmVar, null, sVar, eVar == com.waze.uid.e.e.f44482b);
        h.g.b.x.f(bmVar, "viewType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bb(bm bmVar) {
        this(bmVar, null, null, false);
        h.g.b.x.f(bmVar, "viewType");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bb(bm bmVar, com.waze.uid.e.e eVar) {
        this(bmVar, null, null, eVar == com.waze.uid.e.e.f44482b);
        h.g.b.x.f(bmVar, "viewType");
    }
}
