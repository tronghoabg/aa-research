package com.waze.map;

import android.graphics.Point;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bc {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.h.c f28383a;

    /* renamed from: b, reason: collision with root package name */
    private final as f28384b;

    /* renamed from: c, reason: collision with root package name */
    private final aw f28385c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.map.b.fk f28386d;

    /* renamed from: e, reason: collision with root package name */
    private final float f28387e;

    /* renamed from: f, reason: collision with root package name */
    private final Point f28388f;

    /* renamed from: g, reason: collision with root package name */
    private final ba f28389g;

    /* renamed from: h, reason: collision with root package name */
    private final at f28390h;

    /* renamed from: i, reason: collision with root package name */
    private final av f28391i;

    /* renamed from: j, reason: collision with root package name */
    private final com.waze.gas.a f28392j;

    public /* synthetic */ bc(com.waze.shared_infra.h.c cVar, com.waze.gas.a aVar, as asVar, aw awVar, com.waze.map.b.fk fkVar, float f2, ba baVar, int i2) {
        this(cVar, aVar, (i2 & 4) != 0 ? as.f27963e : asVar, (i2 & 8) != 0 ? aw.f27971a : awVar, (i2 & 16) != 0 ? new com.waze.map.b.fk(null) : fkVar, (i2 & 32) != 0 ? 1.0f : f2, null, (i2 & 128) != 0 ? null : baVar, null);
    }

    public static /* synthetic */ bc i(bc bcVar, as asVar, float f2, Point point, av avVar, int i2) {
        com.waze.shared_infra.h.c cVar = (i2 & 1) != 0 ? bcVar.f28383a : null;
        com.waze.gas.a aVar = (i2 & 2) != 0 ? bcVar.f28392j : null;
        if ((i2 & 4) != 0) {
            asVar = bcVar.f28384b;
        }
        as asVar2 = asVar;
        aw awVar = (i2 & 8) != 0 ? bcVar.f28385c : null;
        com.waze.map.b.fk fkVar = (i2 & 16) != 0 ? bcVar.f28386d : null;
        float f3 = (i2 & 32) != 0 ? bcVar.f28387e : f2;
        Point point2 = (i2 & 64) != 0 ? bcVar.f28388f : point;
        ba baVar = (i2 & 128) != 0 ? bcVar.f28389g : null;
        av avVar2 = (i2 & 512) != 0 ? bcVar.f28391i : avVar;
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(aVar, "renderable");
        h.g.b.x.f(asVar2, "alignment");
        h.g.b.x.f(awVar, "priority");
        h.g.b.x.f(fkVar, "zoomRange");
        return new bc(cVar, aVar, asVar2, awVar, fkVar, f3, point2, baVar, avVar2);
    }

    public final float a() {
        return this.f28387e;
    }

    public final Point b() {
        return this.f28388f;
    }

    public final as c() {
        return this.f28384b;
    }

    public final av d() {
        return this.f28391i;
    }

    public final aw e() {
        return this.f28385c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc)) {
            return false;
        }
        bc bcVar = (bc) obj;
        if (!h.g.b.x.n(this.f28383a, bcVar.f28383a) || !h.g.b.x.n(this.f28392j, bcVar.f28392j) || this.f28384b != bcVar.f28384b || this.f28385c != bcVar.f28385c || !h.g.b.x.n(this.f28386d, bcVar.f28386d) || Float.compare(this.f28387e, bcVar.f28387e) != 0 || !h.g.b.x.n(this.f28388f, bcVar.f28388f) || !h.g.b.x.n(this.f28389g, bcVar.f28389g)) {
            return false;
        }
        at atVar = bcVar.f28390h;
        return h.g.b.x.n(null, null) && h.g.b.x.n(this.f28391i, bcVar.f28391i);
    }

    public final ba f() {
        return this.f28389g;
    }

    public final com.waze.map.b.fk g() {
        return this.f28386d;
    }

    public final com.waze.shared_infra.h.c h() {
        return this.f28383a;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f28383a.hashCode() * 31) + this.f28392j.hashCode()) * 31) + this.f28384b.hashCode()) * 31) + this.f28385c.hashCode()) * 31) + this.f28386d.hashCode()) * 31) + Float.floatToIntBits(this.f28387e);
        Point point = this.f28388f;
        int iHashCode2 = ((iHashCode * 31) + (point == null ? 0 : point.hashCode())) * 31;
        ba baVar = this.f28389g;
        int iHashCode3 = iHashCode2 + (baVar == null ? 0 : baVar.hashCode());
        av avVar = this.f28391i;
        return (iHashCode3 * 961) + (avVar != null ? avVar.hashCode() : 0);
    }

    public final com.waze.gas.a j() {
        return this.f28392j;
    }

    public final String toString() {
        return "MapMarkerView(coordinate=" + this.f28383a + ", renderable=" + this.f28392j + ", alignment=" + this.f28384b + ", priority=" + this.f28385c + ", zoomRange=" + this.f28386d + ", scale=" + this.f28387e + ", anchorOffsetPixels=" + this.f28388f + ", showAnimation=" + this.f28389g + ", hideAnimation=null, hitBoxInset=" + this.f28391i + ")";
    }

    public bc(com.waze.shared_infra.h.c cVar, com.waze.gas.a aVar, as asVar, aw awVar, com.waze.map.b.fk fkVar, float f2, Point point, ba baVar, av avVar) {
        h.g.b.x.f(cVar, "coordinate");
        h.g.b.x.f(aVar, "renderable");
        h.g.b.x.f(asVar, "alignment");
        h.g.b.x.f(awVar, "priority");
        h.g.b.x.f(fkVar, "zoomRange");
        this.f28383a = cVar;
        this.f28392j = aVar;
        this.f28384b = asVar;
        this.f28385c = awVar;
        this.f28386d = fkVar;
        this.f28387e = f2;
        this.f28388f = point;
        this.f28389g = baVar;
        this.f28390h = null;
        this.f28391i = avVar;
    }
}
