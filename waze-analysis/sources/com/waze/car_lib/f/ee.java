package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class ee extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19529a;

    /* renamed from: b, reason: collision with root package name */
    int f19530b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19531c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19529a = obj;
        this.f19530b |= Integer.MIN_VALUE;
        return this.f19531c.emit(null, this);
    }
}
