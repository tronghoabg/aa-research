package com.waze.bl.d;

import h.ab;
import h.g.a.p;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17094a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f17095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f17095b = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        k kVar = new k(this.f17095b, eVar);
        kVar.f17094a = obj;
        return kVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((b) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        b bVar = (b) this.f17094a;
        com.waze.shared_infra.i.e eVar = this.f17095b.f17097b;
        Objects.toString(bVar);
        eVar.a("setStateTo : ".concat(String.valueOf(bVar)));
        return ab.f48028a;
    }
}
