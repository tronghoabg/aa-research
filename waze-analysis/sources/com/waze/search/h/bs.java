package com.waze.search.h;

/* loaded from: classes7.dex */
public final class bs extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35848a;

    /* renamed from: b, reason: collision with root package name */
    int f35849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f35850c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f35850c = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35848a = obj;
        this.f35849b |= Integer.MIN_VALUE;
        return this.f35850c.emit(null, this);
    }
}
