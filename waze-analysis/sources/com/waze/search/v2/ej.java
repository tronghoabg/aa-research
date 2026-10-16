package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ej extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ fi f36434a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f36435b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ej(fi fiVar, int i2, h.c.e eVar) {
        super(2, eVar);
        this.f36434a = fiVar;
        this.f36435b = i2;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        return new ej(this.f36434a, this.f36435b, eVar);
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((ej) create(bool, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        this.f36434a.aa(new bs(this.f36435b));
        return h.ab.f48028a;
    }
}
