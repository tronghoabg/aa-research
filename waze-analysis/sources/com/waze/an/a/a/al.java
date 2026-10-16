package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14375a;

    /* renamed from: b, reason: collision with root package name */
    int f14376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f14377c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f14377c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14375a = obj;
        this.f14376b |= Integer.MIN_VALUE;
        return this.f14377c.emit(null, this);
    }
}
