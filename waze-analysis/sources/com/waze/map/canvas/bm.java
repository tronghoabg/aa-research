package com.waze.map.canvas;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.map.b.bi f28613a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.map.b.bh f28614b;

    /* renamed from: c, reason: collision with root package name */
    private final bo f28615c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f28616d;

    /* renamed from: e, reason: collision with root package name */
    private final Integer f28617e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.shared_infra.l.a f28618f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f28619g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28620h;

    /* renamed from: i, reason: collision with root package name */
    private final com.waze.z.a.d.ai f28621i;

    public bm(com.waze.map.b.bi biVar, com.waze.map.b.bh bhVar, bo boVar, bn bnVar, com.waze.z.a.d.ai aiVar, Integer num, com.waze.shared_infra.l.a aVar, boolean z, boolean z2) {
        h.g.b.x.f(biVar, "baseContent");
        h.g.b.x.f(bhVar, "colorScheme");
        h.g.b.x.f(aiVar, "routingArrow");
        this.f28613a = biVar;
        this.f28614b = bhVar;
        this.f28615c = boVar;
        this.f28616d = bnVar;
        this.f28621i = aiVar;
        this.f28617e = num;
        this.f28618f = aVar;
        this.f28619g = z;
        this.f28620h = z2;
    }

    public static /* synthetic */ bm j(bm bmVar, com.waze.map.b.bi biVar, bo boVar, bn bnVar, com.waze.z.a.d.ai aiVar, Integer num, com.waze.shared_infra.l.a aVar, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            biVar = bmVar.f28613a;
        }
        com.waze.map.b.bi biVar2 = biVar;
        com.waze.map.b.bh bhVar = (i2 & 2) != 0 ? bmVar.f28614b : null;
        if ((i2 & 4) != 0) {
            boVar = bmVar.f28615c;
        }
        bo boVar2 = boVar;
        if ((i2 & 8) != 0) {
            bnVar = bmVar.f28616d;
        }
        bn bnVar2 = bnVar;
        if ((i2 & 16) != 0) {
            aiVar = bmVar.f28621i;
        }
        com.waze.z.a.d.ai aiVar2 = aiVar;
        if ((i2 & 32) != 0) {
            num = bmVar.f28617e;
        }
        Integer num2 = num;
        com.waze.shared_infra.l.a aVar2 = (i2 & 64) != 0 ? bmVar.f28618f : aVar;
        boolean z3 = (i2 & 128) != 0 ? bmVar.f28619g : z;
        boolean z4 = (i2 & 256) != 0 ? bmVar.f28620h : z2;
        h.g.b.x.f(biVar2, "baseContent");
        h.g.b.x.f(bhVar, "colorScheme");
        h.g.b.x.f(aiVar2, "routingArrow");
        return new bm(biVar2, bhVar, boVar2, bnVar2, aiVar2, num2, aVar2, z3, z4);
    }

    public final bn a() {
        return this.f28616d;
    }

    public final bo b() {
        return this.f28615c;
    }

    public final com.waze.map.b.bh c() {
        return this.f28614b;
    }

    public final com.waze.map.b.bi d() {
        return this.f28613a;
    }

    public final com.waze.shared_infra.l.a e() {
        return this.f28618f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        return h.g.b.x.n(this.f28613a, bmVar.f28613a) && this.f28614b == bmVar.f28614b && h.g.b.x.n(this.f28615c, bmVar.f28615c) && h.g.b.x.n(this.f28616d, bmVar.f28616d) && h.g.b.x.n(this.f28621i, bmVar.f28621i) && h.g.b.x.n(this.f28617e, bmVar.f28617e) && h.g.b.x.n(this.f28618f, bmVar.f28618f) && this.f28619g == bmVar.f28619g && this.f28620h == bmVar.f28620h;
    }

    public final Integer f() {
        return this.f28617e;
    }

    public final boolean g() {
        return this.f28619g;
    }

    public final boolean h() {
        return this.f28620h;
    }

    public final int hashCode() {
        int iHashCode = (this.f28613a.hashCode() * 31) + this.f28614b.hashCode();
        bo boVar = this.f28615c;
        int iHashCode2 = ((iHashCode * 31) + (boVar == null ? 0 : boVar.hashCode())) * 31;
        bn bnVar = this.f28616d;
        int iHashCode3 = (((iHashCode2 + (bnVar == null ? 0 : bnVar.hashCode())) * 31) + this.f28621i.hashCode()) * 31;
        Integer num = this.f28617e;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        com.waze.shared_infra.l.a aVar = this.f28618f;
        return ((((iHashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31) + a.a.a(this.f28619g)) * 31) + a.a.a(this.f28620h);
    }

    public final com.waze.z.a.d.ai i() {
        return this.f28621i;
    }

    public final String toString() {
        return "MainMapContent(baseContent=" + this.f28613a + ", colorScheme=" + this.f28614b + ", selectedLocation=" + this.f28615c + ", newVenuePin=" + this.f28616d + ", routingArrow=" + this.f28621i + ", mainCanvasArrowOnSegmentWithIndex=" + this.f28617e + ", closurePreviewSegment=" + this.f28618f + ", adsEnabled=" + this.f28619g + ", cyclistsEnabled=" + this.f28620h + ")";
    }
}
