package com.waze;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class mc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f29618a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ mg f29619b;

    /* renamed from: c, reason: collision with root package name */
    int f29620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    mc(mg mgVar, h.c.e eVar) {
        super(eVar);
        this.f29619b = mgVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f29618a = obj;
        this.f29620c |= Integer.MIN_VALUE;
        return mg.c(this.f29619b, this);
    }
}
