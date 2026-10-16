package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class y extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31832a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f31833b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.waze.av.d.k f31834c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(long j2, com.waze.av.d.k kVar, h.c.e eVar) {
        super(2, eVar);
        this.f31833b = j2;
        this.f31834c = kVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new y(this.f31833b, this.f31834c, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((y) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31832a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f31832a = 1;
        Object objI = kotlinx.coroutines.aj.I(this.f31833b, new av(this.f31834c, (h.c.e) null, 1), this);
        return objI == aVar ? aVar : objI;
    }
}
