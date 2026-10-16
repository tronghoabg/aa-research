package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.bv;
import h.g.b.x;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final l f27121a = new l(k.f27118a, bv.f31145a, null, null, new g(null, null, null, null, false, new com.waze.main_screen.c.e.k(1)), null, e.f27098a, f.f27101a, false);

    /* renamed from: b, reason: collision with root package name */
    public final k f27122b;

    /* renamed from: c, reason: collision with root package name */
    public final bv f27123c;

    /* renamed from: d, reason: collision with root package name */
    public final i f27124d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27125e;

    /* renamed from: f, reason: collision with root package name */
    public final g f27126f;

    /* renamed from: g, reason: collision with root package name */
    public final j f27127g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f27128h;

    /* renamed from: i, reason: collision with root package name */
    public final e f27129i;

    /* renamed from: j, reason: collision with root package name */
    public final f f27130j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27131k;

    public l(k kVar, bv bvVar, i iVar, List list, g gVar, j jVar, e eVar, f fVar, boolean z) {
        x.f(kVar, "style");
        x.f(bvVar, "drivingSide");
        x.f(gVar, "currentInstruction");
        x.f(eVar, "bg");
        x.f(fVar, "bottomConnection");
        this.f27122b = kVar;
        this.f27123c = bvVar;
        this.f27124d = iVar;
        this.f27125e = list;
        this.f27126f = gVar;
        this.f27127g = jVar;
        this.f27128h = false;
        this.f27129i = eVar;
        this.f27130j = fVar;
        this.f27131k = z;
    }

    public static /* synthetic */ l a(l lVar, k kVar) {
        bv bvVar = lVar.f27123c;
        i iVar = lVar.f27124d;
        List list = lVar.f27125e;
        g gVar = lVar.f27126f;
        j jVar = lVar.f27127g;
        boolean z = lVar.f27128h;
        e eVar = lVar.f27129i;
        f fVar = lVar.f27130j;
        boolean z2 = lVar.f27131k;
        x.f(kVar, "style");
        x.f(bvVar, "drivingSide");
        x.f(gVar, "currentInstruction");
        x.f(eVar, "bg");
        x.f(fVar, "bottomConnection");
        return new l(kVar, bvVar, iVar, list, gVar, jVar, eVar, fVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f27122b != lVar.f27122b || this.f27123c != lVar.f27123c || !x.n(this.f27124d, lVar.f27124d) || !x.n(this.f27125e, lVar.f27125e) || !x.n(this.f27126f, lVar.f27126f) || !x.n(this.f27127g, lVar.f27127g)) {
            return false;
        }
        boolean z = lVar.f27128h;
        return this.f27129i == lVar.f27129i && this.f27130j == lVar.f27130j && this.f27131k == lVar.f27131k;
    }

    public final int hashCode() {
        int iHashCode = (this.f27122b.hashCode() * 31) + this.f27123c.hashCode();
        i iVar = this.f27124d;
        int iHashCode2 = ((iHashCode * 31) + (iVar == null ? 0 : iVar.hashCode())) * 31;
        List list = this.f27125e;
        int iHashCode3 = (((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + this.f27126f.hashCode()) * 31;
        j jVar = this.f27127g;
        return ((((((((iHashCode3 + (jVar == null ? 0 : jVar.hashCode())) * 31) + a.a.a(false)) * 31) + this.f27129i.hashCode()) * 31) + this.f27130j.hashCode()) * 31) + a.a.a(this.f27131k);
    }

    public final String toString() {
        return "State(style=" + this.f27122b + ", drivingSide=" + this.f27123c + ", hov=" + this.f27124d + ", laneGuidance=" + this.f27125e + ", currentInstruction=" + this.f27126f + ", nextInstruction=" + this.f27127g + ", navlistButtonVisible=false, bg=" + this.f27129i + ", bottomConnection=" + this.f27130j + ", useBGVariation=" + this.f27131k + ")";
    }
}
