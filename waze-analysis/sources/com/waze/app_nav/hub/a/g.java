package com.waze.app_nav.hub.a;

import h.ab;
import h.g.a.p;
import h.g.b.aq;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    Object f15223a;

    /* renamed from: b, reason: collision with root package name */
    Object f15224b;

    /* renamed from: c, reason: collision with root package name */
    Object f15225c;

    /* renamed from: d, reason: collision with root package name */
    int f15226d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f15227e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ h f15228f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ aq f15229g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(h hVar, aq aqVar, h.c.e eVar) {
        super(2, eVar);
        this.f15228f = hVar;
        this.f15229g = aqVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f15228f, this.f15229g, eVar);
        gVar.f15227e = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((c) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        h hVar;
        aq aqVar;
        kotlinx.coroutines.h.a aVar;
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        if (this.f15226d != 0) {
            hVar = (h) this.f15225c;
            aqVar = (aq) this.f15224b;
            aVar = (kotlinx.coroutines.h.a) this.f15223a;
            cVar = (c) this.f15227e;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            c cVar2 = (c) this.f15227e;
            h hVar2 = this.f15228f;
            aq aqVar2 = this.f15229g;
            kotlinx.coroutines.h.a aVar3 = hVar2.f15234e;
            this.f15227e = cVar2;
            this.f15223a = aVar3;
            this.f15224b = aqVar2;
            this.f15225c = hVar2;
            this.f15226d = 1;
            if (aVar3.lock(null, this) == aVar2) {
                return aVar2;
            }
            cVar = cVar2;
            hVar = hVar2;
            aqVar = aqVar2;
            aVar = aVar3;
        }
        try {
            c cVar3 = (c) aqVar.f48105a;
            if (cVar3 != null) {
                hVar.f15232c.e("removing rule: " + cVar3.c());
                hVar.f15235f.remove(cVar3);
            }
            aqVar.f48105a = cVar;
            if (cVar != null) {
                hVar.f15232c.e("adding rule: " + cVar.c());
                hVar.f15235f.add(cVar);
            }
            h.f(hVar);
            aVar.unlock(null);
            return ab.f48028a;
        } catch (Throwable th) {
            aVar.unlock(null);
            throw th;
        }
    }
}
