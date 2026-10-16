package com.waze.map.main;

/* loaded from: classes6.dex */
public final class ai extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29314a;

    /* renamed from: b, reason: collision with root package name */
    int f29315b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29316c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29316c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29314a = obj;
        this.f29315b |= Integer.MIN_VALUE;
        return this.f29316c.emit(null, this);
    }
}
