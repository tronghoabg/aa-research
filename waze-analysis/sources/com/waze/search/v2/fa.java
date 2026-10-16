package com.waze.search.v2;

/* loaded from: classes7.dex */
public final class fa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36491a;

    /* renamed from: b, reason: collision with root package name */
    int f36492b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cb f36493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fa(cb cbVar, h.c.e eVar) {
        super(eVar);
        this.f36493c = cbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36491a = obj;
        this.f36492b |= Integer.MIN_VALUE;
        return this.f36493c.emit(null, this);
    }
}
