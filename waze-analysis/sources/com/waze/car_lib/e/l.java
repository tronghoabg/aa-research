package com.waze.car_lib.e;

/* loaded from: classes5.dex */
public final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19293a;

    /* renamed from: b, reason: collision with root package name */
    int f19294b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ m f19295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f19295c = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19293a = obj;
        this.f19294b |= Integer.MIN_VALUE;
        return this.f19295c.emit(null, this);
    }
}
