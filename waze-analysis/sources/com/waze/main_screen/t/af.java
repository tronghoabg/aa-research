package com.waze.main_screen.t;

/* loaded from: classes6.dex */
public final class af extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27464a;

    /* renamed from: b, reason: collision with root package name */
    int f27465b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f27466c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f27466c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27464a = obj;
        this.f27465b |= Integer.MIN_VALUE;
        return this.f27466c.emit(null, this);
    }
}
