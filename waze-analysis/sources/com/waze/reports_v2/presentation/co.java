package com.waze.reports_v2.presentation;

/* loaded from: classes7.dex */
public final class co extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34966a;

    /* renamed from: b, reason: collision with root package name */
    int f34967b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cr f34968c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co(cr crVar, h.c.e eVar) {
        super(eVar);
        this.f34968c = crVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34966a = obj;
        this.f34967b |= Integer.MIN_VALUE;
        return this.f34968c.emit(null, this);
    }
}
