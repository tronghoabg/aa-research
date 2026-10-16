package com.waze.alerters.b;

import h.g.b.x;
import kotlinx.coroutines.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.alerters.a.d f14234a;

    /* renamed from: b, reason: collision with root package name */
    private final ab f14235b;

    /* renamed from: c, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f14236c;

    /* renamed from: d, reason: collision with root package name */
    private final h.f f14237d;

    /* renamed from: e, reason: collision with root package name */
    private final com.waze.asks.ab f14238e;

    public g(com.waze.alerters.a.d dVar, ab abVar, com.waze.asks.ab abVar2, com.waze.shared_infra.i.e eVar) {
        x.f(dVar, "collection");
        x.f(abVar, "dispatcher");
        x.f(abVar2, "config");
        x.f(eVar, "logger");
        this.f14234a = dVar;
        this.f14235b = abVar;
        this.f14238e = abVar2;
        this.f14236c = eVar;
        this.f14237d = h.g.a(new f(this, 0));
    }

    static final e b(g gVar) {
        return new e(gVar.f14234a, gVar.f14235b, gVar.f14238e, gVar.f14236c);
    }

    @Override // com.waze.alerters.b.a
    public final b a() {
        return (b) this.f14237d.getValue();
    }
}
