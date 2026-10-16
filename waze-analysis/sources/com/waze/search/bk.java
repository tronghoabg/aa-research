package com.waze.search;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bk extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f35567a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bl f35568b;

    /* renamed from: c, reason: collision with root package name */
    int f35569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(bl blVar, h.c.e eVar) {
        super(eVar);
        this.f35568b = blVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f35567a = obj;
        this.f35569c |= Integer.MIN_VALUE;
        return this.f35568b.r(null, this);
    }
}
