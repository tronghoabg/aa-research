package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class dg extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f30059a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ dh f30060b;

    /* renamed from: c, reason: collision with root package name */
    int f30061c;

    /* renamed from: d, reason: collision with root package name */
    aj f30062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dg(dh dhVar, h.c.e eVar) {
        super(eVar);
        this.f30060b = dhVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f30059a = obj;
        this.f30061c |= Integer.MIN_VALUE;
        return this.f30060b.a(null, this);
    }
}
