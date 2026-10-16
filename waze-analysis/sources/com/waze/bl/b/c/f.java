package com.waze.bl.b.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f16936a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f16937b;

    /* renamed from: c, reason: collision with root package name */
    int f16938c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(g gVar, h.c.e eVar) {
        super(eVar);
        this.f16937b = gVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f16936a = obj;
        this.f16938c |= Integer.MIN_VALUE;
        return this.f16937b.a(0, this);
    }
}
