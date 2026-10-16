package com.waze.t;

import com.waze.location.a.ae;
import h.g.b.x;
import java.io.Closeable;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k implements Closeable, com.waze.t.a.m {

    /* renamed from: a, reason: collision with root package name */
    private final ae f40900a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f40901b;

    /* renamed from: c, reason: collision with root package name */
    private final af f40902c;

    /* renamed from: d, reason: collision with root package name */
    private String f40903d;

    public k(ae aeVar, ab abVar) {
        x.f(aeVar, "streetNameProvider");
        x.f(abVar, "coroutineDispatcher");
        this.f40900a = aeVar;
        this.f40901b = abVar;
        af afVarE = aj.e(abVar);
        this.f40902c = afVarE;
        aj.z(afVarE, null, null, new j(this, (h.c.e) null, 0), 3);
    }

    @Override // com.waze.t.a.j
    public final /* synthetic */ Object b() {
        return this.f40903d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f40902c, null);
    }
}
