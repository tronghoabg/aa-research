package com.waze.search.h;

/* loaded from: classes7.dex */
public final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35818a;

    /* renamed from: b, reason: collision with root package name */
    int f35819b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bk f35820c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bk bkVar, h.c.e eVar) {
        super(eVar);
        this.f35820c = bkVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35818a = obj;
        this.f35819b |= Integer.MIN_VALUE;
        return this.f35820c.emit(null, this);
    }
}
