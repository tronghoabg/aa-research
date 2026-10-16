package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fb extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36494a;

    /* renamed from: b, reason: collision with root package name */
    int f36495b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36496c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36496c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36494a = obj;
        this.f36495b |= Integer.MIN_VALUE;
        return this.f36496c.emit(null, this);
    }
}
