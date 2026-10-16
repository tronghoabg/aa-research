package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ct extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f34979a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f34980b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cz f34981c;

    /* renamed from: d, reason: collision with root package name */
    int f34982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ct(cz czVar, h.c.e eVar) {
        super(eVar);
        this.f34981c = czVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34980b = obj;
        this.f34982d |= Integer.MIN_VALUE;
        return cz.k(this.f34981c, null, this);
    }
}
