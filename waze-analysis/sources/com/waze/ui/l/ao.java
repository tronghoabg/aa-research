package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f42509a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ba f42510b;

    /* renamed from: c, reason: collision with root package name */
    int f42511c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f42510b = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42509a = obj;
        this.f42511c |= Integer.MIN_VALUE;
        return this.f42510b.M(0.0f, this);
    }
}
