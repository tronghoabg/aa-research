package com.waze.navigate;

import l.a.agw;
import l.a.agy;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.stats.ax f31438a;

    public gm(com.waze.stats.ax axVar) {
        h.g.b.x.f(axVar, "wazeStatSender");
        this.f31438a = axVar;
    }

    public final void a(gl glVar) {
        l.a.ar arVar;
        h.g.b.x.f(glVar, "action");
        l.a.as asVarNewBuilder = l.a.at.newBuilder();
        gl glVar2 = gl.f31434a;
        int iOrdinal = glVar.ordinal();
        if (iOrdinal == 0) {
            arVar = l.a.ar.ACTION_UNSPECIFIED;
        } else if (iOrdinal == 1) {
            arVar = l.a.ar.VIEW_LOCATION;
        } else {
            if (iOrdinal != 2) {
                throw new h.i();
            }
            arVar = l.a.ar.CANCEL;
        }
        asVarNewBuilder.a(arVar);
        l.a.at atVarBuild = asVarNewBuilder.build();
        h.g.b.x.e(atVarBuild, "build(...)");
        agw agwVarNewBuilder = agy.newBuilder();
        agwVarNewBuilder.a(atVarBuild);
        agy agyVarBuild = agwVarNewBuilder.build();
        h.g.b.x.e(agyVarBuild, "build(...)");
        com.waze.sharedui.utils.o.v(this.f31438a, agyVarBuild);
    }

    public final void b(String str, boolean z) {
        h.g.b.x.f(str, "venueId");
        l.a.au auVarNewBuilder = l.a.av.newBuilder();
        auVarNewBuilder.b(str);
        auVarNewBuilder.a(z);
        l.a.av avVarBuild = auVarNewBuilder.build();
        h.g.b.x.e(avVarBuild, "build(...)");
        agw agwVarNewBuilder = agy.newBuilder();
        agwVarNewBuilder.b(avVarBuild);
        agy agyVarBuild = agwVarNewBuilder.build();
        h.g.b.x.e(agyVarBuild, "build(...)");
        com.waze.sharedui.utils.o.v(this.f31438a, agyVarBuild);
    }
}
