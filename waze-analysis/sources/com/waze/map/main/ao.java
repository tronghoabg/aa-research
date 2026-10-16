package com.waze.map.main;

/* loaded from: classes6.dex */
public final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29332a;

    /* renamed from: b, reason: collision with root package name */
    int f29333b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29334c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29334c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29332a = obj;
        this.f29333b |= Integer.MIN_VALUE;
        return this.f29334c.emit(null, this);
    }
}
