package com.waze.bw.c.c;

/* loaded from: classes7.dex */
public final class ag extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17784a;

    /* renamed from: b, reason: collision with root package name */
    int f17785b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ah f17786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(ah ahVar, h.c.e eVar) {
        super(eVar);
        this.f17786c = ahVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17784a = obj;
        this.f17785b |= Integer.MIN_VALUE;
        return this.f17786c.emit(null, this);
    }
}
