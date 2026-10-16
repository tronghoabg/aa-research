package com.waze.nav_connect.b;

/* loaded from: classes6.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30803a;

    /* renamed from: b, reason: collision with root package name */
    int f30804b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f30805c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f30805c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30803a = obj;
        this.f30804b |= Integer.MIN_VALUE;
        return this.f30805c.emit(null, this);
    }
}
