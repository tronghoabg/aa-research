package com.waze.map.main;

/* loaded from: classes6.dex */
public final class ae extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29309a;

    /* renamed from: b, reason: collision with root package name */
    int f29310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29311c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29309a = obj;
        this.f29310b |= Integer.MIN_VALUE;
        return this.f29311c.emit(null, this);
    }
}
