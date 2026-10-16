package com.waze.copilot.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class az extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f22744a;

    /* renamed from: b, reason: collision with root package name */
    Object f22745b;

    /* renamed from: c, reason: collision with root package name */
    Object f22746c;

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f22747d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ be f22748e;

    /* renamed from: f, reason: collision with root package name */
    int f22749f;

    /* renamed from: g, reason: collision with root package name */
    com.waze.copilot.data.y f22750g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    az(be beVar, h.c.e eVar) {
        super(eVar);
        this.f22748e = beVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22747d = obj;
        this.f22749f |= Integer.MIN_VALUE;
        Object objB = be.b(this.f22748e, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
