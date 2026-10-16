package com.waze.br.a;

/* loaded from: classes7.dex */
public final class ac extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17258a;

    /* renamed from: b, reason: collision with root package name */
    int f17259b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ad f17260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(ad adVar, h.c.e eVar) {
        super(eVar);
        this.f17260c = adVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17258a = obj;
        this.f17259b |= Integer.MIN_VALUE;
        return this.f17260c.emit(null, this);
    }
}
