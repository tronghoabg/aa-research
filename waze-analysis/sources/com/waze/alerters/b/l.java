package com.waze.alerters.b;

/* loaded from: classes5.dex */
public final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14252a;

    /* renamed from: b, reason: collision with root package name */
    int f14253b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f14254c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f14254c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14252a = obj;
        this.f14253b |= Integer.MIN_VALUE;
        return this.f14254c.emit(null, this);
    }
}
