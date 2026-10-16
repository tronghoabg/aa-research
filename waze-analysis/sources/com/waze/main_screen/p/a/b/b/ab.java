package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.cg;
import com.waze.navigate.eo;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab implements t {

    /* renamed from: a, reason: collision with root package name */
    private final cg f26878a;

    /* renamed from: b, reason: collision with root package name */
    private final eo f26879b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.af f26880c;

    /* renamed from: d, reason: collision with root package name */
    private final bn f26881d;

    /* renamed from: e, reason: collision with root package name */
    private final ch f26882e;

    /* renamed from: f, reason: collision with root package name */
    private final com.waze.sharedrive.e.n f26883f;

    public ab(cg cgVar, eo eoVar, com.waze.sharedrive.e.n nVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(eoVar, "navigationStatusProvider");
        this.f26878a = cgVar;
        this.f26879b = eoVar;
        this.f26883f = nVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "EtaControlPanelStateHolder");
        this.f26880c = afVarP;
        bn bnVarB = ck.b(new s(null, true, false, false, nVar));
        this.f26881d = bnVarB;
        int i2 = bz.f51630a;
        this.f26882e = kotlinx.coroutines.b.ai.V(bnVarB, afVarP, by.b(), bnVarB.d());
        kotlinx.coroutines.aj.z(afVarP, null, null, new y(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new v(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new aa(this, null), 3);
    }

    @Override // com.waze.main_screen.p.a.b.b.t
    public final ch a() {
        return this.f26882e;
    }

    @Override // com.waze.main_screen.p.a.b.b.t, com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        com.waze.sharedrive.e.n nVar = ((s) this.f26881d.d()).f26993e;
        if (nVar != null) {
            nVar.close();
        }
        kotlinx.coroutines.aj.h(this.f26880c, null);
    }
}
