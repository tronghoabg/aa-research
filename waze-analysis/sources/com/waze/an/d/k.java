package com.waze.an.d;

/* loaded from: classes4.dex */
public final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14846a;

    /* renamed from: b, reason: collision with root package name */
    int f14847b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ l f14848c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f14848c = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14846a = obj;
        this.f14847b |= Integer.MIN_VALUE;
        return this.f14848c.emit(null, this);
    }
}
