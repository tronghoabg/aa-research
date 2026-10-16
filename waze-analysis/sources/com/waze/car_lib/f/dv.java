package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class dv extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19506a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.b.ap f19507b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dw f19508c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.shared_infra.i.e f19509d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dv(com.waze.car_lib.b.ap apVar, dw dwVar, com.waze.shared_infra.i.e eVar, h.c.e eVar2) {
        super(2, eVar2);
        this.f19507b = apVar;
        this.f19508c = dwVar;
        this.f19509d = eVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new dv(this.f19507b, this.f19508c, this.f19509d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((dv) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19506a == 0) {
            e.b.c.b(obj);
            com.waze.car_lib.b.ap apVar = this.f19507b;
            dw dwVar = this.f19508c;
            com.waze.shared_infra.i.e eVar = this.f19509d;
            this.f19506a = 1;
            if (apVar.D().collect(new du(dwVar, eVar, apVar), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
