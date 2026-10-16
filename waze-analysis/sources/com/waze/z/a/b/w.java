package com.waze.z.a.b;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class w extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    long f45787a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f45788b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f45789c;

    /* renamed from: d, reason: collision with root package name */
    int f45790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(x xVar, h.c.e eVar) {
        super(eVar);
        this.f45789c = xVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f45788b = obj;
        this.f45790d |= Integer.MIN_VALUE;
        return this.f45789c.mo2299onPreFlingQWom1Mo(0L, this);
    }
}
