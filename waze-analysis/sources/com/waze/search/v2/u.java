package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36632a;

    /* renamed from: b, reason: collision with root package name */
    int f36633b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36634c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36634c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36632a = obj;
        this.f36633b |= Integer.MIN_VALUE;
        return this.f36634c.emit(null, this);
    }
}
