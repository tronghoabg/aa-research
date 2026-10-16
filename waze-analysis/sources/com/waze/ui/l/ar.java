package com.waze.ui.l;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ar extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f42521a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f42522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ba f42523c;

    /* renamed from: d, reason: collision with root package name */
    int f42524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ar(ba baVar, h.c.e eVar) {
        super(eVar);
        this.f42523c = baVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f42522b = obj;
        this.f42524d |= Integer.MIN_VALUE;
        return this.f42523c.G(null, null, 0.0f, this);
    }
}
