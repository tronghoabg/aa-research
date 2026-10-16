package com.waze.main_screen.p;

/* loaded from: classes6.dex */
public final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27018a;

    /* renamed from: b, reason: collision with root package name */
    int f27019b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f27020c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f27020c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27018a = obj;
        this.f27019b |= Integer.MIN_VALUE;
        return this.f27020c.emit(null, this);
    }
}
