package com.waze.navigate;

/* loaded from: classes6.dex */
public final class fp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31372a;

    /* renamed from: b, reason: collision with root package name */
    int f31373b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eq f31374c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp(eq eqVar, h.c.e eVar) {
        super(eVar);
        this.f31374c = eqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31372a = obj;
        this.f31373b |= Integer.MIN_VALUE;
        return this.f31374c.emit(null, this);
    }
}
