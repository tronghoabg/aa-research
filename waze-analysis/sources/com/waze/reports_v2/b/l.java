package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34106a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ m f34107b;

    /* renamed from: c, reason: collision with root package name */
    int f34108c;

    /* renamed from: d, reason: collision with root package name */
    m f34109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, h.c.e eVar) {
        super(eVar);
        this.f34107b = mVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34106a = obj;
        this.f34108c |= Integer.MIN_VALUE;
        return this.f34107b.b(this);
    }
}
