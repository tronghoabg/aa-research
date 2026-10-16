package com.waze.main_screen.c;

/* loaded from: classes6.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26084a;

    /* renamed from: b, reason: collision with root package name */
    int f26085b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f26086c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f26086c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26084a = obj;
        this.f26085b |= Integer.MIN_VALUE;
        return this.f26086c.emit(null, this);
    }
}
