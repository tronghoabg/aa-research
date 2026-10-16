package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class fc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21624a;

    /* renamed from: b, reason: collision with root package name */
    int f21625b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fd f21626c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(fd fdVar, h.c.e eVar) {
        super(eVar);
        this.f21626c = fdVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21624a = obj;
        this.f21625b |= Integer.MIN_VALUE;
        return this.f21626c.emit(null, this);
    }
}
