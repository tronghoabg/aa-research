package com.waze.map.main;

/* loaded from: classes6.dex */
public final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29323a;

    /* renamed from: b, reason: collision with root package name */
    int f29324b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29325c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29325c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29323a = obj;
        this.f29324b |= Integer.MIN_VALUE;
        return this.f29325c.emit(null, this);
    }
}
