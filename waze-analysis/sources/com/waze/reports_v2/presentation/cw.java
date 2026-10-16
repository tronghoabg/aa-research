package com.waze.reports_v2.presentation;

/* loaded from: classes7.dex */
public final class cw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34990a;

    /* renamed from: b, reason: collision with root package name */
    int f34991b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cr f34992c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f34992c = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34990a = obj;
        this.f34991b |= Integer.MIN_VALUE;
        return this.f34992c.emit(null, this);
    }
}
