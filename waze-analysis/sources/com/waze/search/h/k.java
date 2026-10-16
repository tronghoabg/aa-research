package com.waze.search.h;

/* loaded from: classes7.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35934a;

    /* renamed from: b, reason: collision with root package name */
    int f35935b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f35936c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f35936c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35934a = obj;
        this.f35935b |= Integer.MIN_VALUE;
        return this.f35936c.emit(null, this);
    }
}
