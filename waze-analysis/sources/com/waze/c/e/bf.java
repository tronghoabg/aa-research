package com.waze.c.e;

import com.waze.navigate.el;
import com.waze.navigate.em;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bf extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18581a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f18582b;

    bf(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        bf bfVar = new bf((h.c.e) obj3);
        bfVar.f18581a = (em) obj;
        bfVar.f18582b = (g) obj2;
        return bfVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        em emVar = (em) this.f18581a;
        g gVar = (g) this.f18582b;
        el elVar = emVar instanceof el ? (el) emVar : null;
        return new h.k(elVar != null ? elVar.a() : null, gVar);
    }
}
