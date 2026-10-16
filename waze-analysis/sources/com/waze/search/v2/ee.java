package com.waze.search.v2;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ee extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    Object f36417a;

    /* renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f36418b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ fi f36419c;

    /* renamed from: d, reason: collision with root package name */
    int f36420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ee(fi fiVar, h.c.e eVar) {
        super(eVar);
        this.f36419c = fiVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f36418b = obj;
        this.f36420d |= Integer.MIN_VALUE;
        return this.f36419c.ah(null, this);
    }
}
