package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22671a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f22672b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ac f22673c;

    /* renamed from: d, reason: collision with root package name */
    int f22674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f22673c = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22672b = obj;
        this.f22674d |= Integer.MIN_VALUE;
        Object objA = ac.a(this.f22673c, null, null, null, this);
        return objA == h.c.a.a.f48038a ? objA : h.m.d(objA);
    }
}
