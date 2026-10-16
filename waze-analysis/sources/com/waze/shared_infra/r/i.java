package com.waze.shared_infra.r;

/* loaded from: classes7.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f37969a;

    /* renamed from: b, reason: collision with root package name */
    int f37970b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f37971c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, h.c.e eVar) {
        super(eVar);
        this.f37971c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f37969a = obj;
        this.f37970b |= Integer.MIN_VALUE;
        return this.f37971c.emit(null, this);
    }
}
