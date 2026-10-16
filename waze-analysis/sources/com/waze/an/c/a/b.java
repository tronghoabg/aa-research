package com.waze.an.c.a;

import com.waze.an.c.ac;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14664a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f14665b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(d dVar, h.c.e eVar) {
        super(3, eVar);
        this.f14666c = dVar;
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        b bVar = new b(this.f14666c, (h.c.e) obj3);
        bVar.f14664a = (com.waze.j) obj;
        bVar.f14665b = zBooleanValue;
        return bVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.j jVar = (com.waze.j) this.f14664a;
        boolean z = this.f14665b;
        d dVar = this.f14666c;
        ac acVarV = dVar.v(jVar, dVar.f14673f, z);
        dVar.f14673f = acVarV;
        return acVarV;
    }
}
