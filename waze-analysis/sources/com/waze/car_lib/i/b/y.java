package com.waze.car_lib.i.b;

/* loaded from: classes5.dex */
public final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f20047a;

    /* renamed from: b, reason: collision with root package name */
    int f20048b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f20049c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(i iVar, h.c.e eVar) {
        super(eVar);
        this.f20049c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20047a = obj;
        this.f20048b |= Integer.MIN_VALUE;
        return this.f20049c.emit(null, this);
    }
}
