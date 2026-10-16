package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38366a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f38367b;

    /* renamed from: c, reason: collision with root package name */
    int f38368c;

    /* renamed from: d, reason: collision with root package name */
    bc f38369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f38367b = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38366a = obj;
        this.f38368c |= Integer.MIN_VALUE;
        return bc.f(this.f38367b, this);
    }
}
