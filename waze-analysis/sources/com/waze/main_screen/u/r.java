package com.waze.main_screen.u;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27728a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w f27729b;

    /* renamed from: c, reason: collision with root package name */
    int f27730c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.ui.u.aj f27731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(w wVar, h.c.e eVar) {
        super(eVar);
        this.f27729b = wVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27728a = obj;
        this.f27730c |= Integer.MIN_VALUE;
        return this.f27729b.x(null, null, this);
    }
}
