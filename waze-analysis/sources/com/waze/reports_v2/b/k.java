package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34102a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f34103b;

    /* renamed from: c, reason: collision with root package name */
    int f34104c;

    /* renamed from: d, reason: collision with root package name */
    m f34105d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(m mVar, h.c.e eVar) {
        super(eVar);
        this.f34103b = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34102a = obj;
        this.f34104c |= Integer.MIN_VALUE;
        return this.f34103b.a(this);
    }
}
