package com.waze.c.e;

import androidx.lifecycle.ViewModelKt;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bh extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f18585a;

    /* renamed from: b, reason: collision with root package name */
    int f18586b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f18587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bk bkVar, h.c.e eVar) {
        super(2, eVar);
        this.f18587c = bkVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bh(this.f18587c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bh) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        bk bkVar;
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f18586b != 0) {
            bkVar = (bk) this.f18585a;
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            bk bkVar2 = this.f18587c;
            aq aqVar = bkVar2.f18596b;
            com.waze.map.b.ai aiVar = bkVar2.f18595a;
            this.f18585a = bkVar2;
            this.f18586b = 1;
            Object objA = aqVar.a(ViewModelKt.getViewModelScope(bkVar2).getCoroutineContext().plus(kotlinx.coroutines.aj.Q()).plus(new kotlinx.coroutines.ae("AltRoutesStateHolder")), aiVar, this);
            if (objA == aVar) {
                return aVar;
            }
            bkVar = bkVar2;
            obj = objA;
        }
        bkVar.f18605k = (bc) obj;
        bk bkVar3 = this.f18587c;
        bc bcVar = bkVar3.f18605k;
        if (bcVar != null) {
            bcVar.r(bkVar3.c().a());
            kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(kotlinx.coroutines.b.ai.q(bkVar3.f18602h.ag(), bcVar.j(), new bf(null)), new bg(bkVar3, null)), ViewModelKt.getViewModelScope(bkVar3));
        } else {
            bkVar3.f18601g.g("Corrupted view model initialization, alternateRoutesStateHolder == null");
        }
        return h.ab.f48028a;
    }
}
