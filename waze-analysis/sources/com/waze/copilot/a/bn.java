package com.waze.copilot.a;

/* loaded from: classes5.dex */
public final class bn extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22803a;

    /* renamed from: b, reason: collision with root package name */
    int f22804b;

    /* renamed from: c, reason: collision with root package name */
    Object f22805c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bo f22806d;

    /* renamed from: e, reason: collision with root package name */
    bq f22807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn(bo boVar, h.c.e eVar) {
        super(eVar);
        this.f22806d = boVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22803a = obj;
        this.f22804b |= Integer.MIN_VALUE;
        return this.f22806d.emit(null, this);
    }
}
