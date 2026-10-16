package com.waze.car_lib.e;

import com.waze.stats.ax;
import h.g.b.x;
import l.a.kz;
import l.a.ld;
import l.a.lf;
import l.a.lj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private final ax f19317a;

    public r(ax axVar) {
        x.f(axVar, "statsReporter");
        this.f19317a = axVar;
    }

    public final void a() {
        ld ldVarNewBuilder = lf.newBuilder();
        ldVarNewBuilder.a(kz.newBuilder().build());
        lf lfVarBuild = ldVarNewBuilder.build();
        x.e(lfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.j(this.f19317a, lfVarBuild);
    }

    public final void b() {
        ld ldVarNewBuilder = lf.newBuilder();
        ldVarNewBuilder.b(lj.newBuilder().build());
        lf lfVarBuild = ldVarNewBuilder.build();
        x.e(lfVarBuild, "build(...)");
        com.waze.sharedui.utils.o.j(this.f19317a, lfVarBuild);
    }
}
