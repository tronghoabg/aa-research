package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class em extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    int f34467a;

    /* renamed from: b, reason: collision with root package name */
    boolean f34468b;

    /* renamed from: c, reason: collision with root package name */
    boolean f34469c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f34470d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ eo f34471e;

    /* renamed from: f, reason: collision with root package name */
    int f34472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    em(eo eoVar, h.c.e eVar) {
        super(eVar);
        this.f34471e = eoVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34470d = obj;
        this.f34472f |= Integer.MIN_VALUE;
        return this.f34471e.c(this);
    }
}
