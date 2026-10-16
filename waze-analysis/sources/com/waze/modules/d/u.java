package com.waze.modules.d;

/* loaded from: classes6.dex */
public final class u extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30254a;

    /* renamed from: b, reason: collision with root package name */
    int f30255b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v f30256c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, h.c.e eVar) {
        super(eVar);
        this.f30256c = vVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30254a = obj;
        this.f30255b |= Integer.MIN_VALUE;
        return this.f30256c.emit(null, this);
    }
}
