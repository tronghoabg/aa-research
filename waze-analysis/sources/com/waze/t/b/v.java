package com.waze.t.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class v extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40818a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ag f40819b;

    /* renamed from: c, reason: collision with root package name */
    int f40820c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.t.a.t f40821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v(ag agVar, h.c.e eVar) {
        super(eVar);
        this.f40819b = agVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40818a = obj;
        this.f40820c |= Integer.MIN_VALUE;
        return this.f40819b.K(null, 0, this);
    }
}
