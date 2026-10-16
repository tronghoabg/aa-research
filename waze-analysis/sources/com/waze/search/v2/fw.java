package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f36562a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fx f36563b;

    /* renamed from: c, reason: collision with root package name */
    int f36564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fw(fx fxVar, h.c.e eVar) {
        super(eVar);
        this.f36563b = fxVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36562a = obj;
        this.f36564c |= Integer.MIN_VALUE;
        return this.f36563b.f(null, this);
    }
}
