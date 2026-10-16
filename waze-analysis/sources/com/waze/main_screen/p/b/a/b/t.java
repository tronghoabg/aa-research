package com.waze.main_screen.p.b.a.b;

import com.waze.navigate.bv;
import com.waze.navigate.dg;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.e.ac;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class t implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final dg f27153a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.navigate.b.g f27154b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27155c;

    /* renamed from: d, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f27156d;

    /* renamed from: e, reason: collision with root package name */
    private final af f27157e;

    /* renamed from: f, reason: collision with root package name */
    private final bn f27158f;

    /* renamed from: g, reason: collision with root package name */
    private final bn f27159g;

    /* renamed from: h, reason: collision with root package name */
    private final ch f27160h;

    public t(dg dgVar, b bVar, com.waze.navigate.b.g gVar, a aVar, com.waze.shared_infra.i.e eVar) {
        x.f(dgVar, "navInfoProvider");
        x.f(bVar, "config");
        x.f(gVar, "statSender");
        x.f(aVar, "barClickedListener");
        x.f(eVar, "logger");
        this.f27153a = dgVar;
        this.f27154b = gVar;
        this.f27155c = aVar;
        this.f27156d = eVar;
        kotlinx.coroutines.s sVarQ = aj.Q();
        int i2 = av.f51370a;
        af afVarE = aj.e(sVarQ.plus(ac.f51860a.c()));
        this.f27157e = afVarE;
        bn bnVarB = ck.b(new n(new o(bv.f31146b, null, null), new g(null, null, null, null, false, new com.waze.main_screen.c.e.k(2))));
        this.f27158f = bnVarB;
        bn bnVarB2 = ck.b(new m(null));
        this.f27159g = bnVarB2;
        kotlinx.coroutines.b.k kVarQ = ai.q(bnVarB, bnVarB2, new s(this, null));
        int i3 = bz.f51630a;
        this.f27160h = ai.V(kVarQ, afVarE, by.b(), l.f27121a);
        eVar.a("init");
        ai.m(ai.K(ai.r(dgVar.K(), dgVar.R(), dgVar.Q(), new r(null)), new q(this, null)), afVarE);
    }

    public final ch b() {
        return this.f27160h;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f27156d.a("clear called canceling scope");
        aj.h(this.f27157e, null);
    }

    public final void d() {
        this.f27155c.a();
    }
}
