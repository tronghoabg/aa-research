package com.waze.car_lib.c;

import com.waze.modules.navigation.at;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.agy;
import l.a.aw;
import l.a.az;
import l.a.bjz;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final ax f19216a;

    public b(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f19216a = axVar;
    }

    public final void a(c cVar, bjz bjzVar) {
        aw awVar;
        x.f(cVar, "action");
        x.f(bjzVar, "triggeringPlatform");
        l.a.ax axVarNewBuilder = az.newBuilder();
        at atVar = at.f30321a;
        c cVar2 = c.f19217a;
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            awVar = aw.ADD_STOP;
        } else if (iOrdinal == 1) {
            awVar = aw.NEW_DRIVE;
        } else if (iOrdinal == 2) {
            awVar = aw.GO;
        } else if (iOrdinal == 3) {
            awVar = aw.BACK;
        } else {
            if (iOrdinal != 4) {
                throw new h.i();
            }
            awVar = aw.X;
        }
        axVarNewBuilder.a(awVar);
        axVarNewBuilder.k(bjzVar);
        az azVarBuild = axVarNewBuilder.build();
        x.e(azVarBuild, "build(...)");
        ax axVar = this.f19216a;
        com.waze.cf.d.c cVarE = e.c.h.e(agy.newBuilder());
        cVarE.F(azVarBuild);
        o.v(axVar, cVarE.E());
    }
}
