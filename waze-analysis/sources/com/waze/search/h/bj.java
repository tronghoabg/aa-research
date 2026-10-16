package com.waze.search.h;

/* loaded from: classes7.dex */
public final class bj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35828a;

    /* renamed from: b, reason: collision with root package name */
    int f35829b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f35830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f35830c = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35828a = obj;
        this.f35829b |= Integer.MIN_VALUE;
        return this.f35830c.emit(null, this);
    }
}
