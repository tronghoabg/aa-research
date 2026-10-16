package com.waze.map.main;

/* loaded from: classes6.dex */
public final class an extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29329a;

    /* renamed from: b, reason: collision with root package name */
    int f29330b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29331c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29331c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29329a = obj;
        this.f29330b |= Integer.MIN_VALUE;
        return this.f29331c.emit(null, this);
    }
}
