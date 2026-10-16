package com.waze.main_screen.k.a;

/* loaded from: classes6.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26528a;

    /* renamed from: b, reason: collision with root package name */
    int f26529b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f26530c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, h.c.e eVar) {
        super(eVar);
        this.f26530c = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26528a = obj;
        this.f26529b |= Integer.MIN_VALUE;
        return this.f26530c.emit(null, this);
    }
}
