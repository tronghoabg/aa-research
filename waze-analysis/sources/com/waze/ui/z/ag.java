package com.waze.ui.z;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ag extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.ab f43900a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ float f43901b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.z.a.b.a f43902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.waze.z.a.b.ab abVar, float f2, com.waze.z.a.b.a aVar, h.c.e eVar) {
        super(2, eVar);
        this.f43900a = abVar;
        this.f43901b = f2;
        this.f43902c = aVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ag(this.f43900a, this.f43901b, this.f43902c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ag) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        com.waze.z.a.b.ab abVar = this.f43900a;
        abVar.s(com.waze.z.a.b.m.c(abVar.f(), new com.waze.z.a.b.e(this.f43901b), this.f43902c), null);
        return h.ab.f48028a;
    }
}
