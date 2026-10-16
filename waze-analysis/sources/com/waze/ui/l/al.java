package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class al extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42495a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f42496b;

    /* renamed from: c, reason: collision with root package name */
    int f42497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    al(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f42496b = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42495a = obj;
        this.f42497c |= Integer.MIN_VALUE;
        return this.f42496b.L(0.0f, this);
    }
}
