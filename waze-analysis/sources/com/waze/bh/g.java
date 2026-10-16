package com.waze.bh;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import h.i;
import l.a.acd;
import l.a.ace;
import l.a.acf;
import l.a.acg;
import l.a.ach;
import l.a.aci;
import l.a.acj;
import l.a.bow;
import l.a.boy;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    private final ax f16799a;

    public g(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f16799a = axVar;
    }

    @Override // com.waze.bh.f
    public final void a() {
        acd acdVarNewBuilder = ace.newBuilder();
        x.e(acdVarNewBuilder, "newBuilder(...)");
        bow bowVarNewBuilder = boy.newBuilder();
        bowVarNewBuilder.d(acdVarNewBuilder);
        boy boyVarBuild = bowVarNewBuilder.build();
        x.e(boyVarBuild, "build(...)");
        o.L(this.f16799a, boyVarBuild);
    }

    @Override // com.waze.bh.f
    public final void b(e eVar) {
        acf acfVar;
        acg acgVarNewBuilder = ach.newBuilder();
        if (eVar != null) {
            int iOrdinal = eVar.ordinal();
            if (iOrdinal == 0) {
                acfVar = acf.CONFIRM;
            } else if (iOrdinal == 1) {
                acfVar = acf.CANCEL;
            } else if (iOrdinal == 2) {
                acfVar = acf.BACK;
            } else if (iOrdinal == 3) {
                acfVar = acf.MORE_DETAILS;
            } else {
                if (iOrdinal != 4) {
                    throw new i();
                }
                acfVar = acf.CLOSE;
            }
            acgVarNewBuilder.a(acfVar);
        }
        x.e(acgVarNewBuilder, "apply(...)");
        bow bowVarNewBuilder = boy.newBuilder();
        bowVarNewBuilder.e(acgVarNewBuilder);
        boy boyVarBuild = bowVarNewBuilder.build();
        x.e(boyVarBuild, "build(...)");
        o.L(this.f16799a, boyVarBuild);
    }

    @Override // com.waze.bh.f
    public final void c() {
        aci aciVarNewBuilder = acj.newBuilder();
        x.e(aciVarNewBuilder, "newBuilder(...)");
        bow bowVarNewBuilder = boy.newBuilder();
        bowVarNewBuilder.f(aciVarNewBuilder);
        boy boyVarBuild = bowVarNewBuilder.build();
        x.e(boyVarBuild, "build(...)");
        o.L(this.f16799a, boyVarBuild);
    }
}
