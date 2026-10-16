package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dd extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f34399a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f34400b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ de f34401c;

    /* renamed from: d, reason: collision with root package name */
    int f34402d;

    /* renamed from: e, reason: collision with root package name */
    com.waze.shared_infra.h.c f34403e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dd(de deVar, h.c.e eVar) {
        super(eVar);
        this.f34401c = deVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34400b = obj;
        this.f34402d |= Integer.MIN_VALUE;
        return this.f34401c.a(null, this);
    }
}
