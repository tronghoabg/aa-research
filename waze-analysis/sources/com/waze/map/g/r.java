package com.waze.map.g;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class r extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f29088a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f29089b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ s f29090c;

    /* renamed from: d, reason: collision with root package name */
    int f29091d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    r(s sVar, h.c.e eVar) {
        super(eVar);
        this.f29090c = sVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29089b = obj;
        this.f29091d |= Integer.MIN_VALUE;
        return s.j(this.f29090c, false, this);
    }
}
