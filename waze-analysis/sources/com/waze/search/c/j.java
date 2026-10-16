package com.waze.search.c;

/* loaded from: classes7.dex */
public final class j extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35590a;

    /* renamed from: b, reason: collision with root package name */
    int f35591b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f35592c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, h.c.e eVar) {
        super(eVar);
        this.f35592c = kVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35590a = obj;
        this.f35591b |= Integer.MIN_VALUE;
        return this.f35592c.emit(null, this);
    }
}
