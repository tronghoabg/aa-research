package com.waze.alerters.a;

/* loaded from: classes5.dex */
public final class s extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14194a;

    /* renamed from: b, reason: collision with root package name */
    int f14195b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ t f14196c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar, h.c.e eVar) {
        super(eVar);
        this.f14196c = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14194a = obj;
        this.f14195b |= Integer.MIN_VALUE;
        return this.f14196c.emit(null, this);
    }
}
