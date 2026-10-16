package com.waze.main_screen.p.a.b.b;

/* loaded from: classes6.dex */
public final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26961a;

    /* renamed from: b, reason: collision with root package name */
    int f26962b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f26963c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f26963c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26961a = obj;
        this.f26962b |= Integer.MIN_VALUE;
        return this.f26963c.emit(null, this);
    }
}
