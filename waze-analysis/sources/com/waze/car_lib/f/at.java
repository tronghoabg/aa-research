package com.waze.car_lib.f;

/* loaded from: classes5.dex */
public final class at extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f19389a;

    /* renamed from: b, reason: collision with root package name */
    int f19390b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ar f19391c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ar arVar, h.c.e eVar) {
        super(eVar);
        this.f19391c = arVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f19389a = obj;
        this.f19390b |= Integer.MIN_VALUE;
        return this.f19391c.emit(null, this);
    }
}
