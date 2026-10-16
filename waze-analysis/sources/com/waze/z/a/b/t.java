package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class t extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f45776a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f45777b;

    /* renamed from: c, reason: collision with root package name */
    int f45778c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ x f45779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t(x xVar, h.c.e eVar) {
        super(eVar);
        this.f45779d = xVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45777b = obj;
        this.f45778c |= Integer.MIN_VALUE;
        return this.f45779d.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
