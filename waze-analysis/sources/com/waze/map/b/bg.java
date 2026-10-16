package com.waze.map.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bg {

    /* renamed from: a, reason: collision with root package name */
    private final ec f28069a;

    /* renamed from: b, reason: collision with root package name */
    private final Cdo f28070b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28071c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.destination_cell.b.e f28072d;

    public /* synthetic */ bg(ea eaVar, cr crVar, Cdo cdo, boolean z, int i2) {
        this((i2 & 1) != 0 ? new ea(false, null, 3) : eaVar, (i2 & 2) != 0 ? cr.f28163a : crVar, (i2 & 4) != 0 ? Cdo.f28213a : cdo, z & ((i2 & 8) == 0));
    }

    public static /* synthetic */ bg e(bg bgVar, com.waze.destination_cell.b.e eVar) {
        ec ecVar = bgVar.f28069a;
        Cdo cdo = bgVar.f28070b;
        boolean z = bgVar.f28071c;
        h.g.b.x.f(ecVar, "viewport");
        h.g.b.x.f(eVar, "fit");
        h.g.b.x.f(cdo, "northLockBehavior");
        return new bg(ecVar, eVar, cdo, z);
    }

    public final Cdo a() {
        return this.f28070b;
    }

    public final ec b() {
        return this.f28069a;
    }

    public final boolean c() {
        return this.f28071c;
    }

    public final com.waze.destination_cell.b.e d() {
        return this.f28072d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg)) {
            return false;
        }
        bg bgVar = (bg) obj;
        return h.g.b.x.n(this.f28069a, bgVar.f28069a) && h.g.b.x.n(this.f28072d, bgVar.f28072d) && this.f28070b == bgVar.f28070b && this.f28071c == bgVar.f28071c;
    }

    public final int hashCode() {
        return (((((this.f28069a.hashCode() * 31) + this.f28072d.hashCode()) * 31) + this.f28070b.hashCode()) * 31) + a.a.a(this.f28071c);
    }

    public final String toString() {
        return "MapBoundsRequest(viewport=" + this.f28069a + ", fit=" + this.f28072d + ", northLockBehavior=" + this.f28070b + ", animated=" + this.f28071c + ")";
    }

    public bg(ec ecVar, com.waze.destination_cell.b.e eVar, Cdo cdo, boolean z) {
        h.g.b.x.f(ecVar, "viewport");
        h.g.b.x.f(eVar, "fit");
        h.g.b.x.f(cdo, "northLockBehavior");
        this.f28069a = ecVar;
        this.f28072d = eVar;
        this.f28070b = cdo;
        this.f28071c = z;
    }

    public bg() {
        this(null, null, null, false, 15);
    }
}
