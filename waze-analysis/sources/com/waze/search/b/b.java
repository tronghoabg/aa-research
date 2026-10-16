package com.waze.search.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35529a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f35530b;

    /* renamed from: c, reason: collision with root package name */
    int f35531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f35530b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35529a = obj;
        this.f35531c |= Integer.MIN_VALUE;
        return this.f35530b.a(null, null, this);
    }
}
