package com.waze.an.c.a;

/* loaded from: classes4.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14692a;

    /* renamed from: b, reason: collision with root package name */
    int f14693b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f14694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f14694c = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14692a = obj;
        this.f14693b |= Integer.MIN_VALUE;
        return this.f14694c.emit(null, this);
    }
}
