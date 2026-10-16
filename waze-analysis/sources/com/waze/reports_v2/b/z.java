package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class z extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34141a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f34142b;

    /* renamed from: c, reason: collision with root package name */
    int f34143c;

    /* renamed from: d, reason: collision with root package name */
    aa f34144d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z(aa aaVar, h.c.e eVar) {
        super(eVar);
        this.f34142b = aaVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34141a = obj;
        this.f34143c |= Integer.MIN_VALUE;
        return this.f34142b.e(null, null, this);
    }
}
