package com.waze.places;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33124a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f33125b;

    /* renamed from: c, reason: collision with root package name */
    int f33126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f33125b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33124a = obj;
        this.f33126c |= Integer.MIN_VALUE;
        return this.f33125b.e(null, this);
    }
}
