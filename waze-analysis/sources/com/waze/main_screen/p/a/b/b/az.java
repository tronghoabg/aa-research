package com.waze.main_screen.p.a.b.b;

import com.waze.navigate.cf;
import com.waze.navigate.cg;
import com.waze.navigate.eo;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.br;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class az implements am {

    /* renamed from: a, reason: collision with root package name */
    private final cg f26937a;

    /* renamed from: b, reason: collision with root package name */
    private final cf f26938b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.ev.n f26939c;

    /* renamed from: d, reason: collision with root package name */
    private final eo f26940d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlinx.coroutines.af f26941e;

    /* renamed from: f, reason: collision with root package name */
    private br f26942f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f26943g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f26944h;

    public az(cg cgVar, cf cfVar, com.waze.ev.n nVar, eo eoVar, com.waze.main_screen.p.a.a.a aVar) {
        h.g.b.x.f(cgVar, "etaNavResultDataProvider");
        h.g.b.x.f(cfVar, "etaCardDataProvider");
        h.g.b.x.f(nVar, "evRepository");
        h.g.b.x.f(eoVar, "navigationStatusProvider");
        h.g.b.x.f(aVar, "etaDrawerConfig");
        this.f26937a = cgVar;
        this.f26938b = cfVar;
        this.f26939c = nVar;
        this.f26940d = eoVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, "EtaMidSectionStateHolder");
        this.f26941e = afVarP;
        bn bnVarB = ck.b(al.f26912e);
        this.f26943g = bnVarB;
        int i2 = bz.f51630a;
        this.f26944h = kotlinx.coroutines.b.ai.V(bnVarB, afVarP, by.b(), al.f26912e);
        kotlinx.coroutines.aj.z(afVarP, null, null, new av(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new aq(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new as(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new ax(this, null), 3);
        kotlinx.coroutines.aj.z(afVarP, null, null, new ao(this, null), 3);
    }

    @Override // com.waze.main_screen.p.a.b.b.am
    public final ch a() {
        return this.f26944h;
    }

    @Override // com.waze.main_screen.p.a.b.b.am, com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        br brVar = this.f26942f;
        if (brVar != null) {
            brVar.s(null);
        }
        kotlinx.coroutines.aj.h(this.f26941e, null);
    }
}
