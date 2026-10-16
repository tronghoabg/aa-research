package com.waze.an.a.a;

import java.util.List;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14495a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f14496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, h.c.e eVar) {
        super(2, eVar);
        this.f14496b = pVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        n nVar = new n(this.f14496b, eVar);
        nVar.f14495a = obj;
        return nVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((List) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        List list = (List) this.f14495a;
        com.waze.shared_infra.i.e eVar = this.f14496b.f14499b;
        Objects.toString(list);
        eVar.e("emitted list: ".concat(String.valueOf(list)));
        return h.ab.f48028a;
    }
}
