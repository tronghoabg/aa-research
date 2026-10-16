package com.waze.map.main;

/* loaded from: classes6.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29465a;

    /* renamed from: b, reason: collision with root package name */
    int f29466b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f29467c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f29467c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29465a = obj;
        this.f29466b |= Integer.MIN_VALUE;
        return this.f29467c.emit(null, this);
    }
}
