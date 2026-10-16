package com.waze.navigate;

/* loaded from: classes6.dex */
public final class ep extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31326a;

    /* renamed from: b, reason: collision with root package name */
    int f31327b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ eq f31328c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep(eq eqVar, h.c.e eVar) {
        super(eVar);
        this.f31328c = eqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31326a = obj;
        this.f31327b |= Integer.MIN_VALUE;
        return this.f31328c.emit(null, this);
    }
}
