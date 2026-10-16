package com.waze.c.e;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class ap extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f18530a;

    /* renamed from: b, reason: collision with root package name */
    Object f18531b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f18532c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ aq f18533d;

    /* renamed from: e, reason: collision with root package name */
    int f18534e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ap(aq aqVar, h.c.e eVar) {
        super(eVar);
        this.f18533d = aqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f18532c = obj;
        this.f18534e |= Integer.MIN_VALUE;
        return this.f18533d.a(null, null, this);
    }
}
