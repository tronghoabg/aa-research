package com.waze.search.v2;

import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class et extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36465a;

    et(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        et etVar = new et(eVar);
        etVar.f36465a = obj;
        return etVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((et) create((com.waze.map.b.dk) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.map.b.dk dkVar = (com.waze.map.b.dk) this.f36465a;
        com.waze.shared_infra.i.e eVarA = bt.a();
        Objects.toString(dkVar);
        eVarA.a("Map movement state changed to ".concat(String.valueOf(dkVar)));
        return h.ab.f48028a;
    }
}
