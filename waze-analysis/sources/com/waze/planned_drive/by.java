package com.waze.planned_drive;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class by {

    /* renamed from: a, reason: collision with root package name */
    private final bs f33284a;

    /* renamed from: b, reason: collision with root package name */
    private final bs f33285b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f33286c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f33287d;

    /* renamed from: e, reason: collision with root package name */
    private final cf f33288e;

    /* renamed from: f, reason: collision with root package name */
    private final bu f33289f;

    /* renamed from: g, reason: collision with root package name */
    private final bt f33290g;

    /* renamed from: h, reason: collision with root package name */
    private final bw f33291h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f33292i;

    public by(bs bsVar, bs bsVar2, boolean z, boolean z2, cf cfVar, bu buVar, bt btVar, bw bwVar, boolean z3) {
        h.g.b.x.f(bsVar, "models");
        h.g.b.x.f(bsVar2, "days");
        h.g.b.x.f(cfVar, "state");
        h.g.b.x.f(buVar, "originData");
        h.g.b.x.f(btVar, "destination");
        this.f33284a = bsVar;
        this.f33285b = bsVar2;
        this.f33286c = z;
        this.f33287d = z2;
        this.f33288e = cfVar;
        this.f33289f = buVar;
        this.f33290g = btVar;
        this.f33291h = bwVar;
        this.f33292i = z3;
    }

    public static /* synthetic */ by j(by byVar, bs bsVar, bs bsVar2, boolean z, boolean z2, cf cfVar, bu buVar, bt btVar, bw bwVar, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            bsVar = byVar.f33284a;
        }
        bs bsVar3 = bsVar;
        if ((i2 & 2) != 0) {
            bsVar2 = byVar.f33285b;
        }
        bs bsVar4 = bsVar2;
        if ((i2 & 4) != 0) {
            z = byVar.f33286c;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = byVar.f33287d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            cfVar = byVar.f33288e;
        }
        cf cfVar2 = cfVar;
        bu buVar2 = (i2 & 32) != 0 ? byVar.f33289f : buVar;
        bt btVar2 = (i2 & 64) != 0 ? byVar.f33290g : btVar;
        bw bwVar2 = (i2 & 128) != 0 ? byVar.f33291h : bwVar;
        boolean z6 = (i2 & 256) != 0 ? byVar.f33292i : z3;
        h.g.b.x.f(bsVar3, "models");
        h.g.b.x.f(bsVar4, "days");
        h.g.b.x.f(cfVar2, "state");
        h.g.b.x.f(buVar2, "originData");
        h.g.b.x.f(btVar2, "destination");
        return new by(bsVar3, bsVar4, z4, z5, cfVar2, buVar2, btVar2, bwVar2, z6);
    }

    public final bs a() {
        return this.f33285b;
    }

    public final bs b() {
        return this.f33284a;
    }

    public final bt c() {
        return this.f33290g;
    }

    public final bu d() {
        return this.f33289f;
    }

    public final bw e() {
        return this.f33291h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by)) {
            return false;
        }
        by byVar = (by) obj;
        return h.g.b.x.n(this.f33284a, byVar.f33284a) && h.g.b.x.n(this.f33285b, byVar.f33285b) && this.f33286c == byVar.f33286c && this.f33287d == byVar.f33287d && h.g.b.x.n(this.f33288e, byVar.f33288e) && h.g.b.x.n(this.f33289f, byVar.f33289f) && h.g.b.x.n(this.f33290g, byVar.f33290g) && h.g.b.x.n(this.f33291h, byVar.f33291h) && this.f33292i == byVar.f33292i;
    }

    public final cf f() {
        return this.f33288e;
    }

    public final boolean g() {
        return this.f33287d;
    }

    public final boolean h() {
        return this.f33286c;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((this.f33284a.hashCode() * 31) + this.f33285b.hashCode()) * 31) + a.a.a(this.f33286c)) * 31) + a.a.a(this.f33287d)) * 31) + this.f33288e.hashCode()) * 31) + this.f33289f.hashCode()) * 31) + this.f33290g.hashCode();
        bw bwVar = this.f33291h;
        return (((iHashCode * 31) + (bwVar == null ? 0 : bwVar.hashCode())) * 31) + a.a.a(this.f33292i);
    }

    public final boolean i() {
        return this.f33292i;
    }

    public final String toString() {
        return "ScreenState(models=" + this.f33284a + ", days=" + this.f33285b + ", dayPickerVisible=" + this.f33286c + ", changedDayAutomatically=" + this.f33287d + ", state=" + this.f33288e + ", originData=" + this.f33289f + ", destination=" + this.f33290g + ", outerScreensRequest=" + this.f33291h + ", hasPlanDriveScreenShown=" + this.f33292i + ")";
    }
}
