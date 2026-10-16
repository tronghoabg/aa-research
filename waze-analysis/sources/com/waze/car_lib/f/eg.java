package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class eg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19535a;

    /* renamed from: b, reason: collision with root package name */
    int f19536b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19537c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19537c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19535a = obj;
        this.f19536b |= Integer.MIN_VALUE;
        return this.f19537c.emit(null, this);
    }
}
