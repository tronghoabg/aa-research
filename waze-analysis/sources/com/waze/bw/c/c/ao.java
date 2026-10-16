package com.waze.bw.c.c;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ao extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f17812a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ax f17813b;

    /* renamed from: c, reason: collision with root package name */
    int f17814c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ao(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f17813b = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17812a = obj;
        this.f17814c |= Integer.MIN_VALUE;
        return this.f17813b.m(null, null, this);
    }
}
