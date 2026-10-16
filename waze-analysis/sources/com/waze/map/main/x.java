package com.waze.map.main;

/* loaded from: classes6.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29474a;

    /* renamed from: b, reason: collision with root package name */
    int f29475b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29476c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29474a = obj;
        this.f29475b |= Integer.MIN_VALUE;
        return this.f29476c.emit(null, this);
    }
}
