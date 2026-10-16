package com.waze.install.a;

import com.waze.sharedui.utils.o;
import com.waze.stats.ax;
import h.g.b.x;
import l.a.boy;
import l.a.ww;
import l.a.wx;
import l.a.wy;
import l.a.wz;
import l.a.xa;
import l.a.xb;
import l.a.xc;
import l.a.xd;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final ax f24719a;

    public b(ax axVar) {
        x.f(axVar, "wazeStatsReporter");
        this.f24719a = axVar;
    }

    private static final xd d(boolean z) {
        return z ? xd.FORCE_UPGRADE_MESSAGE_TYPE_OS_NOT_SUPPORTED : xd.FORCE_UPGRADE_MESSAGE_TYPE_VERSION_UPGRADE;
    }

    @Override // com.waze.install.a.a
    public final void a(String str) {
        x.f(str, "ctaUrl");
        com.waze.sharedui.d.a.b bVarO = h.b.a.o(boy.newBuilder());
        wx wxVarNewBuilder = wy.newBuilder();
        x.f(wxVarNewBuilder, "builder");
        x.f(str, "value");
        wxVarNewBuilder.b(str);
        ww wwVar = ww.CTA;
        x.f(wwVar, "value");
        wxVarNewBuilder.a(wwVar);
        wy wyVarBuild = wxVarNewBuilder.build();
        x.e(wyVarBuild, "build(...)");
        bVarO.aH(wyVarBuild);
        o.L(this.f24719a, bVarO.aG());
    }

    @Override // com.waze.install.a.a
    public final void b(boolean z) {
        com.waze.sharedui.d.a.b bVarO = h.b.a.o(boy.newBuilder());
        wz wzVarNewBuilder = xa.newBuilder();
        x.f(wzVarNewBuilder, "builder");
        xd xdVarD = d(z);
        x.f(xdVarD, "value");
        wzVarNewBuilder.a(xdVarD);
        xa xaVarBuild = wzVarNewBuilder.build();
        x.e(xaVarBuild, "build(...)");
        bVarO.aI(xaVarBuild);
        o.L(this.f24719a, bVarO.aG());
    }

    @Override // com.waze.install.a.a
    public final void c(boolean z) {
        com.waze.sharedui.d.a.b bVarO = h.b.a.o(boy.newBuilder());
        xb xbVarNewBuilder = xc.newBuilder();
        x.f(xbVarNewBuilder, "builder");
        xd xdVarD = d(z);
        x.f(xdVarD, "value");
        xbVarNewBuilder.a(xdVarD);
        xc xcVarBuild = xbVarNewBuilder.build();
        x.e(xcVarBuild, "build(...)");
        bVarO.aJ(xcVarBuild);
        o.L(this.f24719a, bVarO.aG());
    }
}
