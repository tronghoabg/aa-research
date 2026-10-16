package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class es extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36462a;

    /* renamed from: b, reason: collision with root package name */
    int f36463b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36464c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36464c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36462a = obj;
        this.f36463b |= Integer.MIN_VALUE;
        return this.f36464c.emit(null, this);
    }
}
