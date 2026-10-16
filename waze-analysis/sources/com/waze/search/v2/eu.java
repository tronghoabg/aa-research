package com.waze.search.v2;

import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class eu extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36466a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f36467b;

    eu(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        eu euVar = new eu((h.c.e) obj3);
        euVar.f36466a = (List) obj;
        euVar.f36467b = (com.waze.map.b.dk) obj2;
        return euVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return new h.k((List) this.f36466a, (com.waze.map.b.dk) this.f36467b);
    }
}
