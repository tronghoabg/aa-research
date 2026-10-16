package com.waze.reports_v2.presentation.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34765a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f34766b;

    /* renamed from: c, reason: collision with root package name */
    int f34767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(ab abVar, h.c.e eVar) {
        super(eVar);
        this.f34766b = abVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34765a = obj;
        this.f34767c |= Integer.MIN_VALUE;
        return this.f34766b.c(this);
    }
}
