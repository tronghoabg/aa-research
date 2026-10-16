package com.waze.favorites;

import com.waze.stats.ax;
import h.g.b.x;
import l.a.axa;
import l.a.axb;
import l.a.axc;
import l.a.axd;
import l.a.axe;
import l.a.wm;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    private final ax f23821a;

    public r(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f23821a = axVar;
    }

    @Override // com.waze.favorites.q
    public final void a(p pVar, boolean z, boolean z2) {
        axa axaVar;
        x.f(pVar, "action");
        com.waze.sharedui.d.a.b bVarF = e.b.c.f(wm.newBuilder());
        axb axbVarNewBuilder = axc.newBuilder();
        x.f(axbVarNewBuilder, "builder");
        p pVar2 = p.f23816a;
        int iOrdinal = pVar.ordinal();
        if (iOrdinal == 0) {
            axaVar = axa.SET_FAVORITE;
        } else if (iOrdinal == 1) {
            axaVar = axa.SET_HOME;
        } else if (iOrdinal == 2) {
            axaVar = axa.SET_WORK;
        } else {
            if (iOrdinal != 3) {
                throw new h.i();
            }
            axaVar = axa.CANCEL;
        }
        ax axVar = this.f23821a;
        x.f(axaVar, "value");
        axbVarNewBuilder.a(axaVar);
        axbVarNewBuilder.b(z);
        axbVarNewBuilder.c(z2);
        axc axcVarBuild = axbVarNewBuilder.build();
        x.e(axcVarBuild, "build(...)");
        bVarF.T(axcVarBuild);
        com.waze.sharedui.utils.o.o(axVar, bVarF.S());
    }

    @Override // com.waze.favorites.q
    public final void b(boolean z, boolean z2) {
        com.waze.sharedui.d.a.b bVarF = e.b.c.f(wm.newBuilder());
        axd axdVarNewBuilder = axe.newBuilder();
        x.f(axdVarNewBuilder, "builder");
        axdVarNewBuilder.a(z);
        axdVarNewBuilder.b(z2);
        axe axeVarBuild = axdVarNewBuilder.build();
        x.e(axeVarBuild, "build(...)");
        bVarF.U(axeVarBuild);
        com.waze.sharedui.utils.o.o(this.f23821a, bVarF.S());
    }
}
