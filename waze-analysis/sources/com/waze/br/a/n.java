package com.waze.br.a;

/* loaded from: classes7.dex */
public final class n extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17297a;

    /* renamed from: b, reason: collision with root package name */
    int f17298b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ p f17299c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, h.c.e eVar) {
        super(eVar);
        this.f17299c = pVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17297a = obj;
        this.f17298b |= Integer.MIN_VALUE;
        return this.f17299c.emit(null, this);
    }
}
