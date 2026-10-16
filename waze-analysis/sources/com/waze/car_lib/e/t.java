package com.waze.car_lib.e;

import com.waze.car_lib.r.cg;
import com.waze.navigate.ej;
import com.waze.navigate.em;
import h.ab;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.g implements h.g.a.q {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19321a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f19322b;

    t(h.c.e eVar) {
        super(3, eVar);
    }

    @Override // h.g.a.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = new t((h.c.e) obj3);
        tVar.f19321a = (cg) obj;
        tVar.f19322b = (em) obj2;
        return tVar.invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        cg cgVar = (cg) this.f19321a;
        return new s(((em) this.f19322b) instanceof ej, cgVar != null ? cgVar.a() : null, cgVar != null ? cgVar.b() : null);
    }
}
