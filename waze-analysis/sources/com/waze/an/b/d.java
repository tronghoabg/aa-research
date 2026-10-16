package com.waze.an.b;

import h.g.b.x;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.by;
import kotlinx.coroutines.b.bz;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.an.a.a f14624a;

    /* renamed from: b, reason: collision with root package name */
    private final af f14625b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f14626c;

    public d(com.waze.an.a.a aVar, h.c.j jVar) {
        x.f(aVar, "basicInsightRepository");
        x.f(jVar, "coroutineContext");
        this.f14624a = aVar;
        af afVarE = aj.e(jVar.plus(aj.Q()).plus(new ae("BasicInsightPolicy")));
        this.f14625b = afVarE;
        c cVar = new c(aVar.a());
        int i2 = bz.f51630a;
        this.f14626c = ai.V(cVar, afVarE, by.b(), f.f14629a);
    }

    @Override // com.waze.an.b.g
    public final ch a() {
        return this.f14626c;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f14624a.close();
    }
}
