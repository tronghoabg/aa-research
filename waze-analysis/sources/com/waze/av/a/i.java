package com.waze.av.a;

/* loaded from: classes6.dex */
public final class i extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f15806a;

    /* renamed from: b, reason: collision with root package name */
    int f15807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f15808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, h.c.e eVar) {
        super(eVar);
        this.f15808c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f15806a = obj;
        this.f15807b |= Integer.MIN_VALUE;
        return this.f15808c.emit(null, this);
    }
}
