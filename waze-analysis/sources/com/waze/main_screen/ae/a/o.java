package com.waze.main_screen.ae.a;

import com.waze.stats.ax;
import h.g.b.x;
import l.a.aja;
import l.a.ajc;
import l.a.bjx;
import l.a.bjy;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25748a;

    public o() {
        this.f25748a = h.g.a(new com.waze.native_managers.n(17));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.waze.stats.ax, java.lang.Object] */
    public final void a(String str) {
        aja ajaVarNewBuilder = ajc.newBuilder();
        bjx bjxVarNewBuilder = bjy.newBuilder();
        if (str != null) {
            bjxVarNewBuilder.a(str);
        }
        ?? r2 = this.f25748a;
        ajaVarNewBuilder.j(bjxVarNewBuilder.build());
        ajc ajcVarBuild = ajaVarNewBuilder.build();
        x.e(ajcVarBuild, "build(...)");
        com.waze.sharedui.utils.o.w(r2, ajcVarBuild);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [h.f, java.lang.Object] */
    public final boolean b() {
        Object value = this.f25748a.getValue();
        x.e(value, "getValue(...)");
        return ((Boolean) value).booleanValue();
    }

    public o(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f25748a = axVar;
    }
}
