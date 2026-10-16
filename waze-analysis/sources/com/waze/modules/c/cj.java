package com.waze.modules.c;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class cj extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29959a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ cl f29960b;

    /* renamed from: c, reason: collision with root package name */
    int f29961c;

    /* renamed from: d, reason: collision with root package name */
    dq f29962d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cj(cl clVar, h.c.e eVar) {
        super(eVar);
        this.f29960b = clVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29959a = obj;
        this.f29961c |= Integer.MIN_VALUE;
        return this.f29960b.e(null, this);
    }
}
