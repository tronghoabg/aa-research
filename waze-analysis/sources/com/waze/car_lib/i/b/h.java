package com.waze.car_lib.i.b;

/* loaded from: classes5.dex */
public final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19992a;

    /* renamed from: b, reason: collision with root package name */
    int f19993b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f19994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f19994c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19992a = obj;
        this.f19993b |= Integer.MIN_VALUE;
        return this.f19994c.emit(null, this);
    }
}
