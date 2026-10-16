package com.waze.bp;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.ak;
import l.a.al;
import l.a.am;
import l.a.ao;
import l.a.aom;
import l.a.aon;
import l.a.aoo;
import l.a.aoq;
import l.a.awu;
import l.a.aww;
import l.a.brd;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    private final ax f17203a;

    public e(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f17203a = axVar;
    }

    private final void e(aww awwVar) {
        brd brdVarNewBuilder = brf.newBuilder();
        brdVarNewBuilder.L(awwVar);
        brf brfVarBuild = brdVarNewBuilder.build();
        x.e(brfVarBuild, "build(...)");
        o.e(this.f17203a, brfVarBuild);
    }

    @Override // com.waze.bp.d
    public final void a(b bVar) {
        ak akVar;
        al alVarNewBuilder = am.newBuilder();
        if (bVar != null) {
            c cVar = c.f17199a;
            int iOrdinal = bVar.ordinal();
            if (iOrdinal == 0) {
                akVar = ak.ADD_STOP;
            } else if (iOrdinal == 1) {
                akVar = ak.ADD_STOP_TIMEOUT;
            } else if (iOrdinal == 2) {
                akVar = ak.CANCEL;
            } else if (iOrdinal == 3) {
                akVar = ak.NEW_DRIVE;
            } else {
                if (iOrdinal != 4) {
                    throw new h.i();
                }
                akVar = ak.NEW_DRIVE_TIMEOUT;
            }
            alVarNewBuilder.a(akVar);
        }
        am amVarBuild = alVarNewBuilder.build();
        x.e(amVarBuild, "build(...)");
        awu awuVarNewBuilder = aww.newBuilder();
        awuVarNewBuilder.a(amVarBuild);
        aww awwVarBuild = awuVarNewBuilder.build();
        x.e(awwVarBuild, "build(...)");
        e(awwVarBuild);
    }

    @Override // com.waze.bp.d
    public final void b() {
        ao aoVarBuild = ao.newBuilder().build();
        x.e(aoVarBuild, "build(...)");
        awu awuVarNewBuilder = aww.newBuilder();
        awuVarNewBuilder.b(aoVarBuild);
        aww awwVarBuild = awuVarNewBuilder.build();
        x.e(awwVarBuild, "build(...)");
        e(awwVarBuild);
    }

    @Override // com.waze.bp.d
    public final void c(c cVar) {
        aom aomVar;
        aon aonVarNewBuilder = aoo.newBuilder();
        if (cVar != null) {
            b bVar = b.f17193a;
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                aomVar = aom.CANCEL;
            } else if (iOrdinal == 1) {
                aomVar = aom.NEW_DRIVE;
            } else {
                if (iOrdinal != 2) {
                    throw new h.i();
                }
                aomVar = aom.NEW_DRIVE_TIMEOUT;
            }
            aonVarNewBuilder.a(aomVar);
        }
        aoo aooVarBuild = aonVarNewBuilder.build();
        x.e(aooVarBuild, "build(...)");
        awu awuVarNewBuilder = aww.newBuilder();
        awuVarNewBuilder.c(aooVarBuild);
        aww awwVarBuild = awuVarNewBuilder.build();
        x.e(awwVarBuild, "build(...)");
        e(awwVarBuild);
    }

    @Override // com.waze.bp.d
    public final void d() {
        aoq aoqVarBuild = aoq.newBuilder().build();
        x.e(aoqVarBuild, "build(...)");
        awu awuVarNewBuilder = aww.newBuilder();
        awuVarNewBuilder.d(aoqVarBuild);
        aww awwVarBuild = awuVarNewBuilder.build();
        x.e(awwVarBuild, "build(...)");
        e(awwVarBuild);
    }
}
