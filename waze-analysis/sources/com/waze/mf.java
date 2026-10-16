package com.waze;

/* loaded from: classes5.dex */
public final class mf extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29777a;

    /* renamed from: b, reason: collision with root package name */
    int f29778b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f29779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f29779c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29777a = obj;
        this.f29778b |= Integer.MIN_VALUE;
        return this.f29779c.emit(null, this);
    }
}
