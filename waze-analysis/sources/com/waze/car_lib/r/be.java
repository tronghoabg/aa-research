package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class be extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21031a;

    /* renamed from: b, reason: collision with root package name */
    int f21032b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21033c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21031a = obj;
        this.f21032b |= Integer.MIN_VALUE;
        return this.f21033c.emit(null, this);
    }
}
