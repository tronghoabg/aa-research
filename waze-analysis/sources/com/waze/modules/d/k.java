package com.waze.modules.d;

import h.ab;
import j$.time.Duration;
import j$.time.Instant;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.authentication.a.a f30230a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(com.waze.authentication.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f30230a = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        return new k(this.f30230a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        String str = n.f30234b;
        Instant instantPlus = Instant.now().plus(Duration.ofHours(24L));
        h.g.b.x.e(instantPlus, "plus(...)");
        this.f30230a.b(new com.waze.authentication.a(str, instantPlus));
        n.f30233a.g("Bad credential is stored");
        return ab.f48028a;
    }
}
