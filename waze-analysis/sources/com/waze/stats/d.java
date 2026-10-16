package com.waze.stats;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class d extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f40582a;

    /* renamed from: b, reason: collision with root package name */
    Object f40583b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f40584c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f40585d;

    /* renamed from: e, reason: collision with root package name */
    int f40586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(e eVar, h.c.e eVar2) {
        super(eVar2);
        this.f40585d = eVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f40584c = obj;
        this.f40586e |= Integer.MIN_VALUE;
        Object objB = e.b(this.f40585d, null, this);
        return objB == h.c.a.a.f48038a ? objB : h.m.d(objB);
    }
}
