package com.waze.an.c.a;

/* loaded from: classes4.dex */
public final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14677a;

    /* renamed from: b, reason: collision with root package name */
    int f14678b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f14679c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, h.c.e eVar) {
        super(eVar);
        this.f14679c = jVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14677a = obj;
        this.f14678b |= Integer.MIN_VALUE;
        return this.f14679c.emit(null, this);
    }
}
