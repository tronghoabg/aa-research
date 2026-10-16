package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bh extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f35556a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f35557b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bl f35558c;

    /* renamed from: d, reason: collision with root package name */
    int f35559d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35558c = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35557b = obj;
        this.f35559d |= Integer.MIN_VALUE;
        return this.f35558c.g(null, null, this);
    }
}
