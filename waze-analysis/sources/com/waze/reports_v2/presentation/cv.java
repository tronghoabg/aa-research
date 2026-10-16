package com.waze.reports_v2.presentation;

/* loaded from: classes7.dex */
public final class cv extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34987a;

    /* renamed from: b, reason: collision with root package name */
    int f34988b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cr f34989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f34989c = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34987a = obj;
        this.f34988b |= Integer.MIN_VALUE;
        return this.f34989c.emit(null, this);
    }
}
