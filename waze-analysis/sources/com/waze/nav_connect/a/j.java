package com.waze.nav_connect.a;

import h.ab;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class j extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f30730a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.b.k f30731b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.map.isolated.k f30732c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f30733d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(com.waze.map.isolated.k kVar, kotlinx.coroutines.b.k kVar2, h.c.e eVar) {
        super(2, eVar);
        this.f30732c = kVar;
        this.f30731b = kVar2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        j jVar = new j(this.f30732c, this.f30731b, eVar);
        jVar.f30733d = obj;
        return jVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((j) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f30730a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            kotlinx.coroutines.b.l lVar = (kotlinx.coroutines.b.l) this.f30733d;
            aq aqVar = new aq();
            aqVar.f48105a = this.f30732c;
            this.f30730a = 1;
            if (this.f30731b.collect(new i(lVar, aqVar), this) == aVar) {
                return aVar;
            }
        }
        return ab.f48028a;
    }
}
