package com.waze.car_lib.r.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class h extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f20890a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20891b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f20892c;

    /* renamed from: d, reason: collision with root package name */
    int f20893d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(i iVar, h.c.e eVar) {
        super(eVar);
        this.f20892c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20891b = obj;
        this.f20893d |= Integer.MIN_VALUE;
        return this.f20892c.emit(null, this);
    }
}
