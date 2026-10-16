package com.waze.an.a.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ap extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f14385a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(ar arVar, h.c.e eVar) {
        super(2, eVar);
        this.f14385a = arVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ap(this.f14385a, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ap) create((kotlinx.coroutines.b.l) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ar arVar = this.f14385a;
        kotlinx.coroutines.aj.z(arVar.f14391c, null, null, new bl(arVar, (h.c.e) null, 1), 3);
        return h.ab.f48028a;
    }
}
