package com.waze.reports_v2.presentation;

/* loaded from: classes7.dex */
public final class cq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34972a;

    /* renamed from: b, reason: collision with root package name */
    int f34973b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cr f34974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f34974c = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34972a = obj;
        this.f34973b |= Integer.MIN_VALUE;
        return this.f34974c.emit(null, this);
    }
}
