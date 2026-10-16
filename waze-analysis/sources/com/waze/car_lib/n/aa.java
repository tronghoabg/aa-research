package com.waze.car_lib.n;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f20341a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f20342b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f20343c;

    /* renamed from: d, reason: collision with root package name */
    int f20344d;

    /* renamed from: e, reason: collision with root package name */
    ac f20345e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f20343c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f20342b = obj;
        this.f20344d |= Integer.MIN_VALUE;
        return this.f20343c.a(null, null, this);
    }
}
