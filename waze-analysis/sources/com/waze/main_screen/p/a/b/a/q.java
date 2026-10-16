package com.waze.main_screen.p.a.b.a;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class q extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f26814a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t f26815b;

    /* renamed from: c, reason: collision with root package name */
    int f26816c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q(t tVar, h.c.e eVar) {
        super(eVar);
        this.f26815b = tVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f26814a = obj;
        this.f26816c |= Integer.MIN_VALUE;
        return this.f26815b.s(false, this);
    }
}
