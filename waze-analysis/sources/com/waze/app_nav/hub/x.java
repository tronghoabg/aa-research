package com.waze.app_nav.hub;

/* loaded from: classes5.dex */
public final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15408a;

    /* renamed from: b, reason: collision with root package name */
    int f15409b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ y f15410c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, h.c.e eVar) {
        super(eVar);
        this.f15410c = yVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15408a = obj;
        this.f15409b |= Integer.MIN_VALUE;
        return this.f15410c.emit(null, this);
    }
}
