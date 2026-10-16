package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fz extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    boolean f40061a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f40062b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ gb f40063c;

    /* renamed from: d, reason: collision with root package name */
    int f40064d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fz(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f40063c = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40062b = obj;
        this.f40064d |= Integer.MIN_VALUE;
        return gb.g(this.f40063c, false, this);
    }
}
