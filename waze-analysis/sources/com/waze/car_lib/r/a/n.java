package com.waze.car_lib.r.a;

import com.waze.c.e.a.t;
import com.waze.car_lib.p.dh;
import h.ab;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class n extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f20907a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20908b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f20909c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ h.g.a.a f20910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(p pVar, h.g.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f20909c = pVar;
        this.f20910d = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        n nVar = new n(this.f20909c, this.f20910d, eVar);
        nVar.f20908b = obj;
        return nVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((n) create((dh) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f20907a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            dh dhVar = (dh) this.f20908b;
            if (x.n(dhVar, com.waze.car_lib.f.a.d.f19338a)) {
                this.f20907a = 1;
                if (this.f20909c.f20917c.k(this) == aVar) {
                    return aVar;
                }
            } else {
                if (!x.n(dhVar, com.waze.car_lib.f.a.e.f19339a)) {
                    throw new h.i();
                }
                t tVar = this.f20909c.f20925k;
                if (tVar != null) {
                    tVar.s();
                }
                this.f20910d.invoke();
            }
        }
        return ab.f48028a;
    }
}
