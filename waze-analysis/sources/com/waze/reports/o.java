package com.waze.reports;

/* loaded from: classes7.dex */
public final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33957a;

    /* renamed from: b, reason: collision with root package name */
    int f33958b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f33959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, h.c.e eVar) {
        super(eVar);
        this.f33959c = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33957a = obj;
        this.f33958b |= Integer.MIN_VALUE;
        return this.f33959c.emit(null, this);
    }
}
