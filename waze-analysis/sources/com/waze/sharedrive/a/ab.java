package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ab extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38015a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38016b;

    /* renamed from: c, reason: collision with root package name */
    int f38017c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ab(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38016b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38015a = obj;
        this.f38017c |= Integer.MIN_VALUE;
        return this.f38016b.i(null, null, this);
    }
}
