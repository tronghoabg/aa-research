package com.waze.map.main;

/* loaded from: classes6.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29440a;

    /* renamed from: b, reason: collision with root package name */
    int f29441b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29442c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29440a = obj;
        this.f29441b |= Integer.MIN_VALUE;
        return this.f29442c.emit(null, this);
    }
}
