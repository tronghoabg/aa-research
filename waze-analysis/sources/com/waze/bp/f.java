package com.waze.bp;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class f extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f17204a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f17205b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f17206c;

    /* renamed from: d, reason: collision with root package name */
    int f17207d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(i iVar, h.c.e eVar) {
        super(eVar);
        this.f17206c = iVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f17205b = obj;
        this.f17207d |= Integer.MIN_VALUE;
        return i.b(this.f17206c, this);
    }
}
