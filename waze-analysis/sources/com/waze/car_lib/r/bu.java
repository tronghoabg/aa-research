package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class bu extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21089a;

    /* renamed from: b, reason: collision with root package name */
    int f21090b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21091c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21089a = obj;
        this.f21090b |= Integer.MIN_VALUE;
        return this.f21091c.emit(null, this);
    }
}
