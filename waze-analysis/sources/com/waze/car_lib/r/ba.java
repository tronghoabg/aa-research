package com.waze.car_lib.r;

/* loaded from: classes5.dex */
public final class ba extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f21014a;

    /* renamed from: b, reason: collision with root package name */
    int f21015b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bf f21016c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(bf bfVar, h.c.e eVar) {
        super(eVar);
        this.f21016c = bfVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f21014a = obj;
        this.f21015b |= Integer.MIN_VALUE;
        return this.f21016c.emit(null, this);
    }
}
