package com.waze.main_screen.l.b;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f26627a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26628b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f26629c;

    /* renamed from: d, reason: collision with root package name */
    int f26630d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    o(p pVar, h.c.e eVar) {
        super(eVar);
        this.f26629c = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26628b = obj;
        this.f26630d |= Integer.MIN_VALUE;
        return this.f26629c.a(this);
    }
}
