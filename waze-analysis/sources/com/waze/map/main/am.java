package com.waze.map.main;

/* loaded from: classes6.dex */
public final class am extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29326a;

    /* renamed from: b, reason: collision with root package name */
    int f29327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29328c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29326a = obj;
        this.f29327b |= Integer.MIN_VALUE;
        return this.f29328c.emit(null, this);
    }
}
