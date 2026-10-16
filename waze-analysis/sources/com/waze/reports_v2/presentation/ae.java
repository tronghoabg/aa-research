package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ae implements kotlinx.coroutines.b.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f34771a;

    ae(ah ahVar) {
        this.f34771a = ahVar;
    }

    @Override // kotlinx.coroutines.b.l
    public final /* bridge */ /* synthetic */ Object emit(Object obj, h.c.e eVar) {
        com.waze.ui.w.b.bg bgVar;
        com.waze.ui.w.b.ab abVar;
        com.waze.reports_v2.c.bf bfVar = (com.waze.reports_v2.c.bf) obj;
        if (h.g.b.x.n(bfVar, com.waze.reports_v2.c.bc.f34232a)) {
            this.f34771a.q(new com.waze.ui.w.b.w(null));
        } else if (bfVar instanceof com.waze.reports_v2.c.az) {
            ah ahVar = this.f34771a;
            com.waze.reports_v2.c.ar arVarA = ((com.waze.reports_v2.c.az) bfVar).a();
            com.waze.ui.w.b.be beVar = com.waze.ui.w.b.be.f43645a;
            com.waze.speech.n nVar = com.waze.speech.n.f40462a;
            com.waze.reports_v2.c.ar arVar = com.waze.reports_v2.c.ar.f34210a;
            com.waze.ui.w.b.ab abVar2 = com.waze.ui.w.b.ab.f43566a;
            com.waze.ui.w.b.bg bgVar2 = com.waze.ui.w.b.bg.f43652a;
            com.waze.reports_v2.c.aq aqVar = com.waze.reports_v2.c.aq.f34202a;
            switch (arVarA.ordinal()) {
                case 0:
                    abVar = com.waze.ui.w.b.ab.f43569d;
                    break;
                case 1:
                    abVar = com.waze.ui.w.b.ab.f43570e;
                    break;
                case 2:
                    abVar = com.waze.ui.w.b.ab.f43576k;
                    break;
                case 3:
                    abVar = com.waze.ui.w.b.ab.f43574i;
                    break;
                case 4:
                    abVar = com.waze.ui.w.b.ab.f43566a;
                    break;
                case 5:
                    abVar = com.waze.ui.w.b.ab.f43567b;
                    break;
                case 6:
                    abVar = com.waze.ui.w.b.ab.f43568c;
                    break;
                case 7:
                    abVar = com.waze.ui.w.b.ab.f43571f;
                    break;
                case 8:
                    abVar = com.waze.ui.w.b.ab.f43572g;
                    break;
                case 9:
                    abVar = com.waze.ui.w.b.ab.f43573h;
                    break;
                case 10:
                    abVar = com.waze.ui.w.b.ab.f43575j;
                    break;
                case 11:
                    abVar = com.waze.ui.w.b.ab.f43577l;
                    break;
                default:
                    throw new h.i();
            }
            ah.h(ahVar, abVar);
        } else if (bfVar instanceof com.waze.reports_v2.c.ba) {
            ah.i(this.f34771a, ((com.waze.reports_v2.c.ba) bfVar).a());
        } else if (h.g.b.x.n(bfVar, com.waze.reports_v2.c.bb.f34231a)) {
            ah.m(this.f34771a);
        } else if (h.g.b.x.n(bfVar, com.waze.reports_v2.c.bd.f34233a)) {
            this.f34771a.q(com.waze.ui.w.b.y.f43715a);
        } else if (bfVar instanceof com.waze.reports_v2.c.be) {
            com.waze.reports_v2.c.be beVar2 = (com.waze.reports_v2.c.be) bfVar;
            ah.k(this.f34771a, beVar2.b(), beVar2.a());
        } else {
            if (!(bfVar instanceof com.waze.reports_v2.c.ay)) {
                throw new h.i();
            }
            ah ahVar2 = this.f34771a;
            com.waze.reports_v2.c.aq aqVarA = ((com.waze.reports_v2.c.ay) bfVar).a();
            com.waze.ui.w.b.be beVar3 = com.waze.ui.w.b.be.f43645a;
            com.waze.speech.n nVar2 = com.waze.speech.n.f40462a;
            com.waze.reports_v2.c.ar arVar2 = com.waze.reports_v2.c.ar.f34210a;
            com.waze.ui.w.b.ab abVar3 = com.waze.ui.w.b.ab.f43566a;
            com.waze.ui.w.b.bg bgVar3 = com.waze.ui.w.b.bg.f43652a;
            com.waze.reports_v2.c.aq aqVar2 = com.waze.reports_v2.c.aq.f34202a;
            switch (aqVarA.ordinal()) {
                case 0:
                    bgVar = com.waze.ui.w.b.bg.f43652a;
                    break;
                case 1:
                    bgVar = com.waze.ui.w.b.bg.f43653b;
                    break;
                case 2:
                    bgVar = com.waze.ui.w.b.bg.f43654c;
                    break;
                case 3:
                    bgVar = com.waze.ui.w.b.bg.f43655d;
                    break;
                case 4:
                    bgVar = com.waze.ui.w.b.bg.f43656e;
                    break;
                case 5:
                    bgVar = com.waze.ui.w.b.bg.f43657f;
                    break;
                case 6:
                    bgVar = com.waze.ui.w.b.bg.f43658g;
                    break;
                default:
                    throw new h.i();
            }
            ah.g(ahVar2, bgVar);
        }
        return h.ab.f48028a;
    }
}
