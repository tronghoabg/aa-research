package com.waze;

/* loaded from: classes5.dex */
public final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14910a;

    /* renamed from: b, reason: collision with root package name */
    int f14911b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dm f14912c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(dm dmVar, h.c.e eVar) {
        super(eVar);
        this.f14912c = dmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14910a = obj;
        this.f14911b |= Integer.MIN_VALUE;
        return this.f14912c.emit(null, this);
    }
}
