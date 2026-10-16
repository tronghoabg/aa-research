package com.waze.bq;

import com.waze.t.b.bu;
import com.waze.t.b.bw;
import com.waze.ui.a.l;
import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ck;
import kotlinx.coroutines.b.k;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class f implements com.waze.ui.r.a.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17248a;

    /* renamed from: b, reason: collision with root package name */
    private final af f17249b;

    /* renamed from: c, reason: collision with root package name */
    private final bn f17250c;

    public f(com.waze.shared_infra.i.e eVar, com.waze.bq.c.f fVar, com.waze.shared_infra.m.a aVar, com.waze.bq.c.d dVar) {
        x.f(eVar, "logger");
        x.f(fVar, "controllerStarter");
        x.f(aVar, "mediaVolumeRepository");
        x.f(dVar, "config");
        this.f17248a = eVar;
        dVar.a();
        af afVarP = l.p(this, null);
        this.f17249b = afVarP;
        bn bnVarB = ck.b(bu.f40761a);
        this.f17250c = bnVarB;
        k kVarK = ai.K(ai.y(new d(bnVarB)), new e(this, null));
        int i2 = bz.f51630a;
        ai.V(kVarK, afVarP, by.b(), com.waze.search.f.x.p((bw) bnVarB.d()));
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o.l(this.f17249b.getCoroutineContext());
    }
}
