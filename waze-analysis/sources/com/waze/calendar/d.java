package com.waze.calendar;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f18762a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f18763b;

    /* renamed from: c, reason: collision with root package name */
    int f18764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f18763b = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18762a = obj;
        this.f18764c |= Integer.MIN_VALUE;
        return e.c(this.f18763b, null, null, null, null, null, this);
    }
}
