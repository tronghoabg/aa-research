package com.waze.alerters;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.atp;
import l.a.bfs;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    private final ax f14303a;

    public m(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f14303a = axVar;
    }

    @Override // com.waze.alerters.l
    public final void a() {
        e.a.f.a.e eVarA = e.c.d.a.A(atp.newBuilder());
        bfs bfsVarBuild = bfs.newBuilder().build();
        x.e(bfsVarBuild, "build(...)");
        eVarA.ae(bfsVarBuild);
        o.B(this.f14303a, eVarA.ac());
    }
}
