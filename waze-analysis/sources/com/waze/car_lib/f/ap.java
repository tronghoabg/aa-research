package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19379a;

    /* renamed from: b, reason: collision with root package name */
    int f19380b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19381c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19379a = obj;
        this.f19380b |= Integer.MIN_VALUE;
        return this.f19381c.emit(null, this);
    }
}
