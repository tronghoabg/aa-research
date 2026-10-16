package com.waze.sharedrive.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class y extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f38042a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ac f38043b;

    /* renamed from: c, reason: collision with root package name */
    int f38044c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y(ac acVar, h.c.e eVar) {
        super(eVar);
        this.f38043b = acVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f38042a = obj;
        this.f38044c |= Integer.MIN_VALUE;
        return this.f38043b.f(null, null, this);
    }
}
