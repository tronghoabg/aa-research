package com.waze.main_screen.b.a;

/* loaded from: classes6.dex */
public final class g extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f25873a;

    /* renamed from: b, reason: collision with root package name */
    int f25874b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f25875c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar, h.c.e eVar) {
        super(eVar);
        this.f25875c = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f25873a = obj;
        this.f25874b |= Integer.MIN_VALUE;
        return this.f25875c.emit(null, this);
    }
}
