package com.waze.map.g;

/* loaded from: classes6.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29082a;

    /* renamed from: b, reason: collision with root package name */
    int f29083b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ n f29084c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, h.c.e eVar) {
        super(eVar);
        this.f29084c = nVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29082a = obj;
        this.f29083b |= Integer.MIN_VALUE;
        return this.f29084c.emit(null, this);
    }
}
