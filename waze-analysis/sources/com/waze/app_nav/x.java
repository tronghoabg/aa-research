package com.waze.app_nav;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class x extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15442a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f15443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ag agVar, h.c.e eVar) {
        super(2, eVar);
        this.f15443b = agVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        x xVar = new x(this.f15443b, eVar);
        xVar.f15442a = obj;
        return xVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((x) create((aa) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        aa aaVar = (aa) this.f15442a;
        com.waze.shared_infra.i.e eVar = this.f15443b.f15179b;
        Objects.toString(aaVar);
        eVar.e("state changed: ".concat(String.valueOf(aaVar)));
        return h.ab.f48028a;
    }
}
