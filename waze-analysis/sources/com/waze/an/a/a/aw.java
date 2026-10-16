package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class aw extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14405a;

    /* renamed from: b, reason: collision with root package name */
    int f14406b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f14407c;

    /* renamed from: d, reason: collision with root package name */
    Object f14408d;

    /* renamed from: e, reason: collision with root package name */
    Object f14409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f14407c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14405a = obj;
        this.f14406b |= Integer.MIN_VALUE;
        return this.f14407c.emit(null, this);
    }
}
