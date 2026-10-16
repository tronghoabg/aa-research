package com.waze.an.c.a;

/* loaded from: classes4.dex */
public final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14727a;

    /* renamed from: b, reason: collision with root package name */
    int f14728b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f14729c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f14729c = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14727a = obj;
        this.f14728b |= Integer.MIN_VALUE;
        return this.f14729c.emit(null, this);
    }
}
