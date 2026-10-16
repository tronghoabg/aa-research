package com.waze.planned_drive;

/* loaded from: classes6.dex */
public final class bp extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f33267a;

    /* renamed from: b, reason: collision with root package name */
    int f33268b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bq f33269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp(bq bqVar, h.c.e eVar) {
        super(eVar);
        this.f33269c = bqVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f33267a = obj;
        this.f33268b |= Integer.MIN_VALUE;
        return this.f33269c.emit(null, this);
    }
}
