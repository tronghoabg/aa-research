package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class cz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f39730a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f39731b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dd f39732c;

    /* renamed from: d, reason: collision with root package name */
    int f39733d;

    /* renamed from: e, reason: collision with root package name */
    String f39734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    cz(dd ddVar, h.c.e eVar) {
        super(eVar);
        this.f39732c = ddVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39731b = obj;
        this.f39733d |= Integer.MIN_VALUE;
        return this.f39732c.q(null, false, this);
    }
}
