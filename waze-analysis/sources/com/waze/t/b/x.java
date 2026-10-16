package com.waze.t.b;

import com.waze.c.e.cl;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f40825a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ h.g.b.am f40827c;

    x(h.g.b.am amVar, ag agVar, h.g.b.am amVar2) {
        this.f40825a = amVar;
        this.f40826b = agVar;
        this.f40827c = amVar2;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        cl clVar = (cl) obj;
        boolean z = clVar instanceof com.waze.h.h;
        boolean z2 = z && !this.f40825a.f48101a;
        if (z2) {
            this.f40826b.f40679l.o();
        }
        this.f40825a.f48101a = z;
        boolean z3 = clVar instanceof com.waze.h.g;
        boolean z4 = z3 && !this.f40827c.f48101a;
        if (z4) {
            this.f40826b.f40679l.b();
        }
        this.f40827c.f48101a = z3;
        if (h.g.b.x.n(clVar, com.waze.h.c.f24335a)) {
            ag agVar = this.f40826b;
            bw bwVar = (bw) agVar.b().d();
            if (bwVar instanceof bq) {
                agVar.P(bq.e((bq) bwVar, null, false, null, null, 14), true);
            }
        } else if (h.g.b.x.n(clVar, com.waze.h.b.f24318a)) {
            ag.u(this.f40826b);
        } else if (clVar instanceof com.waze.h.f) {
            ag agVar2 = this.f40826b;
            agVar2.P(bq.e(ag.W(agVar2.b()), new cc(null), false, null, null, 14), true);
        } else if (clVar instanceof com.waze.h.d) {
            ag agVar3 = this.f40826b;
            agVar3.P(bq.e(ag.W(agVar3.b()), new cc(null), false, null, null, 14), true);
        } else if (clVar instanceof com.waze.h.e) {
            ag agVar4 = this.f40826b;
            agVar4.P(bq.e(ag.W(agVar4.b()), new cc(((com.waze.h.e) clVar).H()), false, null, null, 14), z4);
        } else {
            if (!z) {
                throw new h.i();
            }
            this.f40826b.P(new br(((com.waze.h.h) clVar).H()), z2);
        }
        return h.ab.f48028a;
    }
}
