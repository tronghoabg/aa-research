package com.waze.car_lib;

/* loaded from: classes5.dex */
public final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19261a;

    /* renamed from: b, reason: collision with root package name */
    int f19262b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f19263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f19263c = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19261a = obj;
        this.f19262b |= Integer.MIN_VALUE;
        return this.f19263c.emit(null, this);
    }
}
