package com.waze.map.main;

/* loaded from: classes6.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29304a;

    /* renamed from: b, reason: collision with root package name */
    int f29305b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29306c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29304a = obj;
        this.f29305b |= Integer.MIN_VALUE;
        return this.f29306c.emit(null, this);
    }
}
