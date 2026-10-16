package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class fq extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f40032a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gb f40033b;

    /* renamed from: c, reason: collision with root package name */
    int f40034c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    fq(gb gbVar, h.c.e eVar) {
        super(eVar);
        this.f40033b = gbVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40032a = obj;
        this.f40034c |= Integer.MIN_VALUE;
        return this.f40033b.u(this);
    }
}
