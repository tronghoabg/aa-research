package com.waze.navigate;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class gv extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    int f31461a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.waze.search.b.a f31462b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f31463c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.waze.av.b.l f31464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    gv(com.waze.search.b.a aVar, String str, com.waze.av.b.l lVar, h.c.e eVar) {
        super(2, eVar);
        this.f31462b = aVar;
        this.f31463c = str;
        this.f31464d = lVar;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new gv(this.f31462b, this.f31463c, this.f31464d, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((gv) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        if (this.f31461a != 0) {
            e.b.c.b(obj);
            return obj;
        }
        e.b.c.b(obj);
        this.f31461a = 1;
        Object objA = this.f31462b.a(this.f31463c, this.f31464d.e().c().b(), this);
        return objA == aVar ? aVar : objA;
    }
}
