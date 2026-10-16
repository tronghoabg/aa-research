package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ko extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kp f40387b;

    /* renamed from: c, reason: collision with root package name */
    int f40388c;

    /* renamed from: d, reason: collision with root package name */
    String f40389d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ko(kp kpVar, h.c.e eVar) {
        super(eVar);
        this.f40387b = kpVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40386a = obj;
        this.f40388c |= Integer.MIN_VALUE;
        return this.f40387b.b(null, this);
    }
}
