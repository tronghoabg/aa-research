package com.waze.main_screen.v;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27784a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f27785b;

    /* renamed from: c, reason: collision with root package name */
    int f27786c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(f fVar, h.c.e eVar) {
        super(eVar);
        this.f27785b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27784a = obj;
        this.f27786c |= Integer.MIN_VALUE;
        Object objA = this.f27785b.a(this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
