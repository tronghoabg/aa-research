package com.waze.map.main;

/* loaded from: classes6.dex */
public final class aj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29317a;

    /* renamed from: b, reason: collision with root package name */
    int f29318b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29319c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29317a = obj;
        this.f29318b |= Integer.MIN_VALUE;
        return this.f29319c.emit(null, this);
    }
}
