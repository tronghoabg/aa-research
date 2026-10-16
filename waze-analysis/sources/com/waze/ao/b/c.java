package com.waze.ao.b;

/* loaded from: classes4.dex */
public final class c extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14898a;

    /* renamed from: b, reason: collision with root package name */
    int f14899b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f14900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, h.c.e eVar) {
        super(eVar);
        this.f14900c = dVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14898a = obj;
        this.f14899b |= Integer.MIN_VALUE;
        return this.f14900c.emit(null, this);
    }
}
