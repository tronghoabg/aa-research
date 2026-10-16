package com.waze.reports_v2.presentation;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cj extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cz f34951a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(cz czVar, h.c.e eVar) {
        super(2, eVar);
        this.f34951a = czVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new cj(this.f34951a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((cj) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        CompletableDeferred completableDeferred = this.f34951a.t;
        h.ab abVar = h.ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }
}
