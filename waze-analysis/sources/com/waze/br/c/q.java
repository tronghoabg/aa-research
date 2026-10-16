package com.waze.br.c;

/* loaded from: classes7.dex */
public final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17403a;

    /* renamed from: b, reason: collision with root package name */
    int f17404b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r f17405c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, h.c.e eVar) {
        super(eVar);
        this.f17405c = rVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17403a = obj;
        this.f17404b |= Integer.MIN_VALUE;
        return this.f17405c.emit(null, this);
    }
}
