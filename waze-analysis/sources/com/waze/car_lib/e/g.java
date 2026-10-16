package com.waze.car_lib.e;

import android.content.Context;
import h.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19276a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f19277b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f19278c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.c.f f19279d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f19280e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(com.waze.car_lib.c.f fVar, Context context, com.waze.car_lib.i.a.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f19279d = fVar;
        this.f19277b = context;
        this.f19278c = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<ab> create(Object obj, h.c.e<?> eVar) {
        g gVar = new g(this.f19279d, this.f19277b, this.f19278c, eVar);
        gVar.f19280e = obj;
        return gVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((g) create((af) obj, (h.c.e) obj2)).invokeSuspend(ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19276a == 0) {
            e.b.c.b(obj);
            af afVar = (af) this.f19280e;
            com.waze.car_lib.c.f fVar = this.f19279d;
            com.waze.ad.c.b.a(afVar, new com.waze.b.g(fVar, 9));
            fVar.d().c(this.f19277b, afVar, this.f19278c);
            this.f19276a = 1;
            if (aj.p(this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
