package com.waze.ai;

import com.waze.location.bf;
import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.c.a.h;
import h.g.b.x;
import h.i;
import l.a.aas;
import l.a.aat;
import l.a.aau;
import l.a.aax;
import l.a.brf;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ax f14066a;

    public b(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f14066a = axVar;
    }

    private static final aat b(bf bfVar) {
        bf bfVar2 = bf.f25343a;
        int iOrdinal = bfVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return aat.NONE;
        }
        if (iOrdinal == 2) {
            return aat.DEVICE;
        }
        if (iOrdinal == 3) {
            return aat.EXTERNAL_DEVICE;
        }
        throw new i();
    }

    @Override // com.waze.ai.a
    public final void a(bf bfVar, bf bfVar2) {
        x.f(bfVar, "oldSource");
        x.f(bfVar2, "newSource");
        com.waze.sharedui.d.a.b bVarQ = h.q(brf.newBuilder());
        com.waze.sharedui.d.a.b bVarC = e.c.b.c(aax.newBuilder());
        aas aasVarNewBuilder = aau.newBuilder();
        x.f(aasVarNewBuilder, "builder");
        aat aatVarB = b(bfVar);
        x.f(aatVarB, "value");
        aasVarNewBuilder.a(aatVarB);
        aat aatVarB2 = b(bfVar2);
        x.f(aatVarB2, "value");
        aasVarNewBuilder.b(aatVarB2);
        aau aauVarBuild = aasVarNewBuilder.build();
        x.e(aauVarBuild, "build(...)");
        bVarC.D(aauVarBuild);
        bVarQ.ag(bVarC.C());
        o.e(this.f14066a, bVarQ.ad());
    }
}
