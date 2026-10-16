package com.waze.car_lib.h;

import com.waze.install.r;
import com.waze.install.s;
import com.waze.install.w;
import h.ab;
import h.g.a.p;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.g implements p {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19827a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f19828b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(2, eVar);
        this.f19828b = iVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        h hVar = new h(this.f19828b, eVar);
        hVar.f19827a = obj;
        return hVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((h) create((w) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        w wVar = (w) this.f19827a;
        if (x.n(wVar, r.f24792a)) {
            this.f19828b.d();
        } else if (x.n(wVar, s.f24793a)) {
            i.a(this.f19828b);
        }
        return ab.f48028a;
    }
}
