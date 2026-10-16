package com.waze.cf.c;

import h.ab;
import h.g.a.p;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l f22213a;

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f22214b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f22213a = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        k kVar = new k(this.f22213a, eVar);
        kVar.f22214b = obj;
        return kVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((k) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        af afVar = (af) this.f22214b;
        l lVar = this.f22213a;
        aj.z(afVar, null, null, new j(lVar, (h.c.e) null, 1, (byte[]) null), 3);
        aj.z(afVar, null, null, new j(lVar, null, 0), 3);
        return aj.z(afVar, null, null, new j(lVar, (h.c.e) null, 2, (char[]) null), 3);
    }
}
