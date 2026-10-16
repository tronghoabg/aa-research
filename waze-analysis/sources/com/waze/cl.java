package com.waze;

/* loaded from: classes5.dex */
public final class cl extends h.c.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    /* synthetic */ Object f22438a;

    /* renamed from: b, reason: collision with root package name */
    int f22439b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ cm f22440c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cl(cm cmVar, h.c.e eVar) {
        super(eVar);
        this.f22440c = cmVar;
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) {
        this.f22438a = obj;
        this.f22439b |= Integer.MIN_VALUE;
        return this.f22440c.emit(null, this);
    }
}
