package com.waze.car_lib;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ba extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f19157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f19158b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.car_lib.i.a.a f19159c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(com.waze.car_lib.i.a.a aVar, bd bdVar, h.c.e eVar) {
        super(2, eVar);
        this.f19159c = aVar;
        this.f19158b = bdVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ba(this.f19159c, this.f19158b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ba) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f19157a != 0) {
            e.b.c.b(obj);
        } else {
            e.b.c.b(obj);
            com.waze.car_lib.i.a.a aVar2 = this.f19159c;
            bd bdVar = this.f19158b;
            this.f19157a = 1;
            if (aVar2.d().collect(new az(bdVar), this) == aVar) {
                return aVar;
            }
        }
        return h.ab.f48028a;
    }
}
