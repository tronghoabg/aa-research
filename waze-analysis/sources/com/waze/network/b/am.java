package com.waze.network.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class am extends h.c.b.a.g implements h.g.a.r {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ boolean f31942a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ boolean f31943b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ boolean f31944c;

    am(h.c.e eVar) {
        super(4, eVar);
    }

    @Override // h.g.a.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        am amVar = new am((h.c.e) obj4);
        amVar.f31942a = zBooleanValue;
        amVar.f31943b = zBooleanValue2;
        amVar.f31944c = zBooleanValue3;
        return amVar.invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        return !this.f31942a ? aj.f31940a : (!this.f31944c || this.f31943b) ? ai.f31939a : ak.f31941a;
    }
}
