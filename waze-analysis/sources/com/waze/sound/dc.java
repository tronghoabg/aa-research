package com.waze.sound;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dc extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f39744a;

    /* renamed from: b, reason: collision with root package name */
    Object f39745b;

    /* renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f39746c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ dd f39747d;

    /* renamed from: e, reason: collision with root package name */
    int f39748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    dc(dd ddVar, h.c.e eVar) {
        super(eVar);
        this.f39747d = ddVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f39746c = obj;
        this.f39748e |= Integer.MIN_VALUE;
        return dd.p(this.f39747d, null, null, this);
    }
}
