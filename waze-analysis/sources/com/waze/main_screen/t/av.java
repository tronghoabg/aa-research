package com.waze.main_screen.t;

/* loaded from: classes6.dex */
public final class av extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27521a;

    /* renamed from: b, reason: collision with root package name */
    int f27522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ag f27523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f27523c = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27521a = obj;
        this.f27522b |= Integer.MIN_VALUE;
        return this.f27523c.emit(null, this);
    }
}
