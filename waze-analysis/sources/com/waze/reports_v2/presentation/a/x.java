package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class x extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34759a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f34760b;

    /* renamed from: c, reason: collision with root package name */
    int f34761c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f34760b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34759a = obj;
        this.f34761c |= Integer.MIN_VALUE;
        return this.f34760b.a(this);
    }
}
