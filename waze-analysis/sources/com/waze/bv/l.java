package com.waze.bv;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    private static final h f17529a = new h(-1, "", false, -1, false, false, false, false);

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.location.o f17530b;

    /* renamed from: c, reason: collision with root package name */
    private final q f17531c;

    /* renamed from: d, reason: collision with root package name */
    private final h.g.a.a f17532d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f17533e;

    /* renamed from: f, reason: collision with root package name */
    private final af f17534f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f17535g;

    /* renamed from: h, reason: collision with root package name */
    private final bn f17536h;

    public l(com.waze.location.o oVar, q qVar, com.waze.sharedui.utils.o oVar2, h.g.a.a aVar, com.waze.shared_infra.i.e eVar, ab abVar) {
        h.g.b.x.f(oVar, "locationProvider");
        h.g.b.x.f(qVar, "speedometerSoundAlertUseCase");
        h.g.b.x.f(oVar2, "configsFlow");
        h.g.b.x.f(aVar, "inWalkingMode");
        h.g.b.x.f(eVar, "logger");
        h.g.b.x.f(abVar, "dispatcher");
        this.f17530b = oVar;
        this.f17531c = qVar;
        this.f17532d = aVar;
        this.f17533e = eVar;
        this.f17534f = aj.e(abVar.plus(aj.Q()));
        this.f17535g = new AtomicBoolean(false);
        this.f17536h = ck.b(f17529a);
    }

    @Override // com.waze.bv.i
    public final ch a() {
        return ai.U(this.f17536h);
    }

    @Override // com.waze.bv.i
    public final void b() {
        if (this.f17535g.compareAndSet(false, true)) {
            af afVar = this.f17534f;
            aj.z(afVar, null, null, new k(this, null, 1, null), 3);
            aj.z(afVar, null, null, new k(this, null, 0), 3);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f17534f, null);
    }
}
