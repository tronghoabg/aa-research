package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class kn extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40383a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ kp f40384b;

    /* renamed from: c, reason: collision with root package name */
    int f40385c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    kn(kp kpVar, h.c.e eVar) {
        super(eVar);
        this.f40384b = kpVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40383a = obj;
        this.f40385c |= Integer.MIN_VALUE;
        return this.f40384b.a(null, this);
    }
}
