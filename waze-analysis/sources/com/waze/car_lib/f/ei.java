package com.waze.car_lib.f;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ei extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    Object f19541a;

    /* renamed from: b, reason: collision with root package name */
    int f19542b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ej f19543c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ei(ej ejVar, h.c.e eVar) {
        super(2, eVar);
        this.f19543c = ejVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ei(this.f19543c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ei) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19542b != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            ej ejVar = this.f19543c;
            com.waze.navigate.a.f fVar = ejVar.n;
            fVar.g();
            as asVar = new as(fVar.d(), 6);
            ao aoVar = new ao(ejVar, 20);
            this.f19541a = fVar;
            this.f19542b = 1;
            if (asVar.collect(aoVar, this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
