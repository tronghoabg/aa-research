package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27804a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f27805b;

    /* renamed from: c, reason: collision with root package name */
    int f27806c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(l lVar, h.c.e eVar) {
        super(eVar);
        this.f27805b = lVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27804a = obj;
        this.f27806c |= Integer.MIN_VALUE;
        return this.f27805b.a(this);
    }
}
