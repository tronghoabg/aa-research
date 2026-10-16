package com.waze.reports_v2.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class bz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f34309a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f34310b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ca f34311c;

    /* renamed from: d, reason: collision with root package name */
    int f34312d;

    /* renamed from: e, reason: collision with root package name */
    String f34313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bz(ca caVar, h.c.e eVar) {
        super(eVar);
        this.f34311c = caVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f34310b = obj;
        this.f34312d |= Integer.MIN_VALUE;
        return this.f34311c.a(null, null, null, this);
    }
}
