package com.waze.br.a;

/* loaded from: classes7.dex */
public final class o extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17300a;

    /* renamed from: b, reason: collision with root package name */
    int f17301b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f17302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, h.c.e eVar) {
        super(eVar);
        this.f17302c = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17300a = obj;
        this.f17301b |= Integer.MIN_VALUE;
        return this.f17302c.emit(null, this);
    }
}
