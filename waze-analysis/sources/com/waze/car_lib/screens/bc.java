package com.waze.car_lib.screens;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bc extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f21870a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.r.c.c.i f21871b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ be f21872c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bc(com.waze.car_lib.r.c.c.i iVar, be beVar, h.c.e eVar) {
        super(2, eVar);
        this.f21871b = iVar;
        this.f21872c = beVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new bc(this.f21871b, this.f21872c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((bc) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f21870a == 0) {
            e.b.c.b(obj);
            com.waze.car_lib.r.c.c.i iVar = this.f21871b;
            be beVar = this.f21872c;
            this.f21870a = 1;
            if (iVar.f().collect(new y(beVar, 2), this) == aVar) {
                return aVar;
            }
        } else {
            e.b.c.b(obj);
        }
        throw new h.e();
    }
}
