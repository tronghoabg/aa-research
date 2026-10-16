package com.waze.map.g;

/* loaded from: classes6.dex */
public final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29085a;

    /* renamed from: b, reason: collision with root package name */
    int f29086b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f29087c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, h.c.e eVar) {
        super(eVar);
        this.f29087c = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29085a = obj;
        this.f29086b |= Integer.MIN_VALUE;
        return this.f29087c.emit(null, this);
    }
}
