package com.waze.nav_connect.b;

/* loaded from: classes6.dex */
public final class p extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30819a;

    /* renamed from: b, reason: collision with root package name */
    int f30820b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ q f30821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, h.c.e eVar) {
        super(eVar);
        this.f30821c = qVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30819a = obj;
        this.f30820b |= Integer.MIN_VALUE;
        return this.f30821c.emit(null, this);
    }
}
