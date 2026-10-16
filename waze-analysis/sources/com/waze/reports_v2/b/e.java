package com.waze.reports_v2.b;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class e extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f34089a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f f34090b;

    /* renamed from: c, reason: collision with root package name */
    int f34091c;

    /* renamed from: d, reason: collision with root package name */
    f f34092d;

    /* renamed from: e, reason: collision with root package name */
    f f34093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(f fVar, h.c.e eVar) {
        super(eVar);
        this.f34090b = fVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34089a = obj;
        this.f34091c |= Integer.MIN_VALUE;
        return f.b(this.f34090b, null, this);
    }
}
