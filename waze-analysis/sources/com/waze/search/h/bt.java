package com.waze.search.h;

/* loaded from: classes7.dex */
public final class bt extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35851a;

    /* renamed from: b, reason: collision with root package name */
    int f35852b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f35853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bt(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f35853c = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35851a = obj;
        this.f35852b |= Integer.MIN_VALUE;
        return this.f35853c.emit(null, this);
    }
}
