package com.waze.map.main;

/* loaded from: classes6.dex */
public final class ak extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29320a;

    /* renamed from: b, reason: collision with root package name */
    int f29321b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29322c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29322c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29320a = obj;
        this.f29321b |= Integer.MIN_VALUE;
        return this.f29322c.emit(null, this);
    }
}
