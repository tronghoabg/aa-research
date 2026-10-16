package com.waze.sharedrive.g;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.z.d f38599a;

    /* renamed from: b, reason: collision with root package name */
    private final z f38600b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ui.z.f f38601c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.ui.z.at f38602d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f38603e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f38604f;

    public aa(com.waze.ui.z.d dVar, z zVar, com.waze.ui.z.f fVar, com.waze.ui.z.at atVar, boolean z, boolean z2) {
        h.g.b.x.f(fVar, "mapContent");
        this.f38599a = dVar;
        this.f38600b = zVar;
        this.f38601c = fVar;
        this.f38602d = atVar;
        this.f38603e = z;
        this.f38604f = z2;
    }

    public static /* synthetic */ aa g(aa aaVar, com.waze.ui.z.d dVar) {
        z zVar = aaVar.f38600b;
        com.waze.ui.z.f fVar = aaVar.f38601c;
        com.waze.ui.z.at atVar = aaVar.f38602d;
        boolean z = aaVar.f38603e;
        boolean z2 = aaVar.f38604f;
        h.g.b.x.f(fVar, "mapContent");
        return new aa(dVar, zVar, fVar, atVar, z, z2);
    }

    public final z a() {
        return this.f38600b;
    }

    public final com.waze.ui.z.d b() {
        return this.f38599a;
    }

    public final com.waze.ui.z.f c() {
        return this.f38601c;
    }

    public final com.waze.ui.z.at d() {
        return this.f38602d;
    }

    public final boolean e() {
        return this.f38604f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        return h.g.b.x.n(this.f38599a, aaVar.f38599a) && h.g.b.x.n(this.f38600b, aaVar.f38600b) && h.g.b.x.n(this.f38601c, aaVar.f38601c) && this.f38602d == aaVar.f38602d && this.f38603e == aaVar.f38603e && this.f38604f == aaVar.f38604f;
    }

    public final boolean f() {
        return this.f38603e;
    }

    public final int hashCode() {
        com.waze.ui.z.d dVar = this.f38599a;
        int iHashCode = dVar == null ? 0 : dVar.hashCode();
        z zVar = this.f38600b;
        int iHashCode2 = (((iHashCode * 31) + (zVar == null ? 0 : zVar.hashCode())) * 31) + this.f38601c.hashCode();
        com.waze.ui.z.at atVar = this.f38602d;
        return (((((iHashCode2 * 31) + (atVar != null ? atVar.hashCode() : 0)) * 31) + a.a.a(this.f38603e)) * 31) + a.a.a(this.f38604f);
    }

    public final String toString() {
        return "LiveShareScreenState(liveDriveSheetContent=" + this.f38599a + ", navigationBar=" + this.f38600b + ", mapContent=" + this.f38601c + ", error=" + this.f38602d + ", showSwitchConfirmation=" + this.f38603e + ", navigationStarted=" + this.f38604f + ")";
    }
}
