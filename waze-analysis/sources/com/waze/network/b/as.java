package com.waze.network.b;

/* loaded from: classes6.dex */
public final class as extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f31958a;

    /* renamed from: b, reason: collision with root package name */
    int f31959b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ap f31960c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(ap apVar, h.c.e eVar) {
        super(eVar);
        this.f31960c = apVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f31958a = obj;
        this.f31959b |= Integer.MIN_VALUE;
        return this.f31960c.emit(null, this);
    }
}
