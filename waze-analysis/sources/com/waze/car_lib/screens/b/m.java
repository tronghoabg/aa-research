package com.waze.car_lib.screens.b;

import h.ab;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class m extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.screens.core.n f21848a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f21849b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(j jVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21849b = i2;
        this.f21848a = jVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e create(Object obj, h.c.e eVar) {
        int i2 = this.f21849b;
        com.waze.car_lib.screens.core.n nVar = this.f21848a;
        return i2 != 0 ? new m((j) nVar, eVar, 1) : new m((o) nVar, eVar, 0);
    }

    @Override // h.g.a.p
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        return this.f21849b != 0 ? ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a) : ((m) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        if (this.f21849b != 0) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            e.b.c.b(obj);
            ((j) this.f21848a).f21842b.g();
            return ab.f48028a;
        }
        h.c.a.a aVar2 = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ((o) this.f21848a).f21852b.e();
        return ab.f48028a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(o oVar, h.c.e eVar, int i2) {
        super(2, eVar);
        this.f21849b = i2;
        this.f21848a = oVar;
    }
}
