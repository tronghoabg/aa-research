package com.waze.map.canvas;

import com.waze.map.cz;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class aq extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f28543a;

    aq(h.c.e eVar) {
        super(2, eVar);
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aq aqVar = new aq(eVar);
        aqVar.f28543a = obj;
        return aqVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aq) create((m) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        m mVar = (m) this.f28543a;
        boolean z = false;
        if (mVar instanceof cz) {
            cz czVar = (cz) mVar;
            if (czVar.b() && czVar.c()) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
