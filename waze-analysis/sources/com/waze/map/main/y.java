package com.waze.map.main;

/* loaded from: classes6.dex */
public final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29477a;

    /* renamed from: b, reason: collision with root package name */
    int f29478b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29479c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29479c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29477a = obj;
        this.f29478b |= Integer.MIN_VALUE;
        return this.f29479c.emit(null, this);
    }
}
