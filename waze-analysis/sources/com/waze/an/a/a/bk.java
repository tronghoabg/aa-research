package com.waze.an.a.a;

/* loaded from: classes4.dex */
public final class bk extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f14453a;

    /* renamed from: b, reason: collision with root package name */
    int f14454b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ax f14455c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(ax axVar, h.c.e eVar) {
        super(eVar);
        this.f14455c = axVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f14453a = obj;
        this.f14454b |= Integer.MIN_VALUE;
        return this.f14455c.emit(null, this);
    }
}
