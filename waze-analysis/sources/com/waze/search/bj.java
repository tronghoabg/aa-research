package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35564a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl f35565b;

    /* renamed from: c, reason: collision with root package name */
    int f35566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bj(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35565b = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35564a = obj;
        this.f35566c |= Integer.MIN_VALUE;
        return this.f35565b.q(null, null, this);
    }
}
