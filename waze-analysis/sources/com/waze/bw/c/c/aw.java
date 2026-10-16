package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17836a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17837b;

    /* renamed from: c, reason: collision with root package name */
    int f17838c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aw(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17837b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17836a = obj;
        this.f17838c |= Integer.MIN_VALUE;
        return this.f17837b.u(null, 0L, null, this);
    }
}
