package com.waze.car_lib.b;

/* loaded from: classes5.dex */
public final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18937a;

    /* renamed from: b, reason: collision with root package name */
    int f18938b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ab f18939c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f18939c = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18937a = obj;
        this.f18938b |= Integer.MIN_VALUE;
        return this.f18939c.emit(null, this);
    }
}
