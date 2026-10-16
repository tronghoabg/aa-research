package com.waze.modules.navigation;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30272a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f30273b;

    /* renamed from: c, reason: collision with root package name */
    int f30274c;

    /* renamed from: d, reason: collision with root package name */
    ao f30275d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f30273b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30272a = obj;
        this.f30274c |= Integer.MIN_VALUE;
        return this.f30273b.a(null, this);
    }
}
