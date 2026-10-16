package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f34763b;

    /* renamed from: c, reason: collision with root package name */
    int f34764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f34763b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34762a = obj;
        this.f34764c |= Integer.MIN_VALUE;
        return this.f34763b.b(this);
    }
}
