package com.waze.network.b;

/* loaded from: classes6.dex */
public final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31926a;

    /* renamed from: b, reason: collision with root package name */
    int f31927b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f31928c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(ap apVar, h.c.e eVar) {
        super(eVar);
        this.f31928c = apVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31926a = obj;
        this.f31927b |= Integer.MIN_VALUE;
        return this.f31928c.emit(null, this);
    }
}
