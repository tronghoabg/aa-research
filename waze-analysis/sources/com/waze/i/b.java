package com.waze.i;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class b extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f24425a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f24426b;

    /* renamed from: c, reason: collision with root package name */
    int f24427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(c cVar, h.c.e eVar) {
        super(eVar);
        this.f24426b = cVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f24425a = obj;
        this.f24427c |= Integer.MIN_VALUE;
        return this.f24426b.a(null, null, this);
    }
}
