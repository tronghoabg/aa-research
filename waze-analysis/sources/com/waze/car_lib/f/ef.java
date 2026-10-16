package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class ef extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19532a;

    /* renamed from: b, reason: collision with root package name */
    int f19533b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19534c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19534c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19532a = obj;
        this.f19533b |= Integer.MIN_VALUE;
        return this.f19534c.emit(null, this);
    }
}
