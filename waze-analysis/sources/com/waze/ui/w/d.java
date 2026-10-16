package com.waze.ui.w;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f43719a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f43720b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ g f43721c;

    /* renamed from: d, reason: collision with root package name */
    int f43722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(g gVar, h.c.e eVar) {
        super(eVar);
        this.f43721c = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f43720b = obj;
        this.f43722d |= Integer.MIN_VALUE;
        return this.f43721c.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
