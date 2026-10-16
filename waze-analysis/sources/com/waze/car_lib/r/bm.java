package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class bm extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21069a;

    /* renamed from: b, reason: collision with root package name */
    int f21070b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21071c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21069a = obj;
        this.f21070b |= Integer.MIN_VALUE;
        return this.f21071c.emit(null, this);
    }
}
