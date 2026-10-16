package com.waze.sharedrive.e;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38391a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bc f38392b;

    /* renamed from: c, reason: collision with root package name */
    int f38393c;

    /* renamed from: d, reason: collision with root package name */
    com.waze.sharedrive.c.a.d f38394d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ba(bc bcVar, h.c.e eVar) {
        super(eVar);
        this.f38392b = bcVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38391a = obj;
        this.f38393c |= Integer.MIN_VALUE;
        return this.f38392b.l(null, this);
    }
}
