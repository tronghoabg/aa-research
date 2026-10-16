package com.waze.an.c.a;

import com.waze.an.c.ac;
import com.waze.an.c.ae;
import com.waze.an.c.af;
import h.g.b.x;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements af {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.q f14732a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.af f14733b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14734c;

    /* renamed from: d, reason: collision with root package name */
    private final ae f14735d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.location.q f14736e;

    public t(com.waze.an.a.q qVar, com.waze.shared_infra.i.e eVar) {
        x.f(qVar, "descriptor");
        x.f(eVar, "logger");
        this.f14732a = qVar;
        kotlinx.coroutines.af afVarP = com.waze.ui.a.l.p(this, null);
        this.f14733b = afVarP;
        this.f14736e = qVar.m();
        s sVar = new s(qVar.a());
        int i2 = bz.f51630a;
        this.f14734c = ai.V(sVar, afVarP, by.b(), new ac(null, null, null, null, null, 255));
        this.f14735d = ae.f14750b;
    }

    @Override // com.waze.an.c.af
    public final ae a() {
        return this.f14735d;
    }

    @Override // com.waze.an.c.af
    public final ch b() {
        return this.f14734c;
    }

    @Override // com.waze.an.c.af
    public final com.waze.an.e.g c(com.waze.an.e.a aVar) {
        x.f(aVar, "<this>");
        return com.waze.an.e.f.f14865a;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f14733b, null);
    }

    @Override // com.waze.an.c.k
    public final void e() {
    }

    @Override // com.waze.an.c.k
    public final void g() {
    }

    @Override // com.waze.an.c.k
    public final com.waze.location.q h() {
        return this.f14736e;
    }
}
