package com.waze.network;

import l.a.afw;
import l.a.afx;
import l.a.anf;
import l.a.ang;
import l.a.anh;
import l.a.ani;
import l.a.ank;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class an implements am {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f31888a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31889b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f31890c;

    public an(com.waze.stats.ax axVar, d dVar, h.g.a.a aVar) {
        h.g.b.x.f(axVar, "statsReporter");
        h.g.b.x.f(dVar, "cellNetworkQueries");
        h.g.b.x.f(aVar, "locationGetter");
        this.f31888a = axVar;
        this.f31889b = dVar;
        this.f31890c = aVar;
    }

    @Override // com.waze.network.am
    public final void a(com.waze.navigate.location_preview.ba baVar) {
        al alVar;
        ang angVar;
        h.g.b.x.f(baVar, "networkStatus");
        if (baVar instanceof aj) {
            alVar = al.f31886d;
        } else {
            if (!(baVar instanceof ah)) {
                throw new h.i();
            }
            ai aiVarJ = ((ah) baVar).j();
            al alVar2 = al.f31883a;
            ai aiVar = ai.f31877a;
            int iOrdinal = aiVarJ.ordinal();
            if (iOrdinal == 0) {
                alVar = al.f31883a;
            } else if (iOrdinal == 1) {
                alVar = al.f31884b;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                alVar = al.f31885c;
            }
        }
        h.g.a.a aVar = this.f31890c;
        Double dValueOf = ((com.waze.sharedui.e.c) aVar.invoke()) != null ? Double.valueOf(r4.c()) : null;
        com.waze.sharedui.e.c cVar = (com.waze.sharedui.e.c) aVar.invoke();
        com.waze.shared_infra.h.c cVarF = cVar != null ? cVar.f() : null;
        boolean z = baVar instanceof ah;
        Boolean boolValueOf = z ? Boolean.valueOf(((ah) baVar).k()) : null;
        Boolean boolValueOf2 = z ? Boolean.valueOf(((ah) baVar).l()) : null;
        d dVar = this.f31889b;
        Integer numValueOf = Integer.valueOf(dVar.a());
        Integer numValueOf2 = Integer.valueOf(dVar.b());
        anf anfVarNewBuilder = anh.newBuilder();
        h.g.b.x.e(anfVarNewBuilder, "newBuilder(...)");
        if (alVar != null) {
            ai aiVar2 = ai.f31877a;
            int iOrdinal2 = alVar.ordinal();
            if (iOrdinal2 == 0) {
                angVar = ang.WIFI;
            } else if (iOrdinal2 == 1) {
                angVar = ang.CELL;
            } else if (iOrdinal2 == 2) {
                angVar = ang.OTHER;
            } else {
                if (iOrdinal2 != 3) {
                    throw new h.i();
                }
                angVar = ang.NA;
            }
            anfVarNewBuilder.b(angVar);
        }
        if (dValueOf != null) {
            anfVarNewBuilder.a(dValueOf.doubleValue());
        }
        if (cVarF != null) {
            afw afwVarNewBuilder = afx.newBuilder();
            afwVarNewBuilder.a(cVarF.a());
            afwVarNewBuilder.b(cVarF.b());
            afx afxVarBuild = afwVarNewBuilder.build();
            h.g.b.x.e(afxVarBuild, "build(...)");
            anfVarNewBuilder.c(afxVarBuild);
        }
        if (boolValueOf != null) {
            anfVarNewBuilder.d(boolValueOf.booleanValue());
        }
        if (boolValueOf2 != null) {
            anfVarNewBuilder.e(boolValueOf2.booleanValue());
        }
        anfVarNewBuilder.f(numValueOf.intValue());
        anfVarNewBuilder.g(numValueOf2.intValue());
        anh anhVarBuild = anfVarNewBuilder.build();
        h.g.b.x.e(anhVarBuild, "build(...)");
        ani aniVarNewBuilder = ank.newBuilder();
        aniVarNewBuilder.b(anhVarBuild);
        ank ankVarBuild = aniVarNewBuilder.build();
        h.g.b.x.e(ankVarBuild, "build(...)");
        com.waze.sharedui.utils.o.z(this.f31888a, ankVarBuild);
    }
}
