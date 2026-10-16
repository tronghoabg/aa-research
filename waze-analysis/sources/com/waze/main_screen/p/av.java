package com.waze.main_screen.p;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class av extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f27061a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bf f27062b;

    /* renamed from: c, reason: collision with root package name */
    int f27063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    av(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f27062b = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f27061a = obj;
        this.f27063c |= Integer.MIN_VALUE;
        return this.f27062b.x(null, null, 0, null, this);
    }
}
